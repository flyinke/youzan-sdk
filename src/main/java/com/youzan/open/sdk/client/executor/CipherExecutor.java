package com.youzan.open.sdk.client.executor;

import com.youzan.open.sdk.api.API;
import com.youzan.open.sdk.client.auth.Cipher;
import com.youzan.open.sdk.exception.KDTException;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.util.cipher.CipherUtil;
import com.youzan.open.sdk.util.http.HttpClient;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.Map;


public class CipherExecutor extends AbstractExecutor implements Executor {

    private Cipher cipher;

    public CipherExecutor(HttpClient httpClient, Cipher cipher) {
        this.cipher = cipher;
        this.httpClient = httpClient;
    }

    @Override
    protected void prepare(ExecutionContext context) {
        API api = context.getApi();
        APIParams apiParams = api.getAPIParams();
        Map<String, Object> params = apiParams.toParams();
        Map<String, String> finalParams = transfer(params);
        Map<String, String> signParams = transfer(params);

        signParams.remove("identify");
        signParams.remove("client_private_key");
        signParams.remove("youzan_public_key");
        signParams.put("identify", cipher.getIdentify());

        finalParams.put("identify", cipher.getIdentify());
        finalParams.put("cipher", generateSign(signParams));

        context.setParams(finalParams);
        context.setUrl(api.getHttpUrl() + "/cipher");
    }

    @Override
    protected String dealWith(HttpResponse httpResponse) {
        String response;
        try {
            response = EntityUtils.toString(httpResponse.getEntity());

            // check sign
            Header[] sign = httpResponse.getHeaders("sign");
            if (sign != null && sign.length > 0) {
                String signValue = sign[0].getValue();
                if (StringUtils.isNotBlank(signValue) && StringUtils.isNotBlank(response)) {
                    byte[] dataByte = response.getBytes();
                    byte[] signByte = signValue.getBytes();
                    String youzanPublicKey = cipher.getYouzanPublicKey();
                    if (!CipherUtil.verify(dataByte, signByte, youzanPublicKey)) {
                        throw new KDTException(String.format(
                                "dealWith response of high Security Level Service happened error! data=%s,sign=%s", dataByte.toString(), sign.toString()));
                    }
                }
            }
        } catch (Exception e) {
            throw new KDTException(e.getMessage());
        }

        return response;
    }

    /**
     * 计算sign
     *
     * @param params 请求参数
     */
    private String generateSign(Map<String, String> params) {
        String sign;
        String dataStr = CipherUtil.params2str(params);
        byte[] dataBuffer = dataStr.getBytes();
        String clientPrivateKey = cipher.getClientPrivateKey();
        try {
            sign = CipherUtil.sign(dataBuffer, clientPrivateKey);
        } catch (Exception e) {
            throw new KDTException(e.toString());
        }
        return sign;
    }
}
