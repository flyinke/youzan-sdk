package com.youzan.open.sdk.client.auth;

import com.google.common.base.Preconditions;
import com.youzan.open.sdk.model.AuthType;
import org.apache.commons.lang3.StringUtils;

public class Cipher implements Auth {

    /**
     * 身份凭证，
     */
    private String identify;

    /**
     * 应用私钥
     */
    private String clientPrivateKey;

    /**
     * youzan公钥
     */
    private String youzanPublicKey;

    public Cipher(String identify, String clientPrivateKey, String youzanPublicKey) {
        Preconditions.checkArgument(StringUtils.isNoneBlank(identify), "identify can not be null!");
        Preconditions.checkArgument(StringUtils.isNoneBlank(clientPrivateKey), "clientPrivateKey can not be null!");
        Preconditions.checkArgument(StringUtils.isNoneBlank(youzanPublicKey), "youzanPublicKey can not be null!");
        this.identify = identify;
        this.clientPrivateKey = clientPrivateKey;
        this.youzanPublicKey = youzanPublicKey;
    }

    public String getIdentify() {
        return identify;
    }

    public String getClientPrivateKey() {
        return clientPrivateKey;
    }

    public String getYouzanPublicKey() {
        return youzanPublicKey;
    }

    @Override
    public AuthType getType() {
        return AuthType.CIPHER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cipher cipher = (Cipher) o;
        return identify.equals(cipher.identify) && clientPrivateKey.equals(cipher.clientPrivateKey) && youzanPublicKey.equals(cipher.youzanPublicKey);
    }

    @Override
    public int hashCode() {
        Object[] arr = {identify, clientPrivateKey, youzanPublicKey};
        if (arr == null) {
            return 0;
        }
        int result = 1;
        for (Object element : arr)
            result = 31 * result + (element == null ? 0 : element.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "cipher{" +
                "identify='" + identify + '\'' +
                ",clientPrivateKey='" + clientPrivateKey + '\'' +
                ",youzanPublicKey='" + youzanPublicKey + '\'' +
                '}';
    }
}
