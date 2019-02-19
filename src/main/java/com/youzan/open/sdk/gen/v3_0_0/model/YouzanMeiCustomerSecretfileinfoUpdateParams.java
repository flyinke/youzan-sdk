package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanMeiCustomerSecretfileinfoUpdateParams implements APIParams, FileParams  {

    /**
     * 安全码，如果开启了则需要填写，如果没有开启则不用填写
     */
    private String code;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 更新的档案信息
     */
    private String secretFileInfos;
    /**
     * 会员的id
     */
    private Long yzUid;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setSecretFileInfos(String secretFileInfos) {
        this.secretFileInfos = secretFileInfos;
    }

    public String getSecretFileInfos() {
        return this.secretFileInfos;
    }

    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (code != null) {
            params.put("code", code);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (secretFileInfos != null) {
            params.put("secret_file_infos", secretFileInfos);
        }
        if (yzUid != null) {
            params.put("yz_uid", yzUid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}