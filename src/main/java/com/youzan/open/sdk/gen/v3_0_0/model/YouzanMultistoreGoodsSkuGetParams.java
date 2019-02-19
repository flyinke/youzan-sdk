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

public class YouzanMultistoreGoodsSkuGetParams implements APIParams, FileParams  {

    /**
     * 商品id
     */
    private Long numIid;
    /**
     * 网点id
     */
    private Long offlineId;

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setOfflineId(Long offlineId) {
        this.offlineId = offlineId;
    }

    public Long getOfflineId() {
        return this.offlineId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (numIid != null) {
            params.put("num_iid", numIid);
        }
        if (offlineId != null) {
            params.put("offline_id", offlineId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}