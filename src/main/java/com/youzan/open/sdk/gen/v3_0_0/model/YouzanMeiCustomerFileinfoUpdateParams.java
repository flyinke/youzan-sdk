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

public class YouzanMeiCustomerFileinfoUpdateParams implements APIParams, FileParams  {

    /**
     * 基础档案信息
     */
    private String fileInfos;
    /**
     * 没有token
     */
    private String mToken;
    /**
     * 会员id
     */
    private Long yzUid;

    public void setFileInfos(String fileInfos) {
        this.fileInfos = fileInfos;
    }

    public String getFileInfos() {
        return this.fileInfos;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (fileInfos != null) {
            params.put("file_infos", fileInfos);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
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