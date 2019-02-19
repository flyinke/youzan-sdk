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

public class YouzanLogisticsGoodsexpressGetParams implements APIParams, FileParams  {

    /**
     * 快递公司id
     */
    private Long expressId;
    /**
     * 物流单号
     */
    private String expressNo;

    public void setExpressId(Long expressId) {
        this.expressId = expressId;
    }

    public Long getExpressId() {
        return this.expressId;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getExpressNo() {
        return this.expressNo;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (expressId != null) {
            params.put("express_id", expressId);
        }
        if (expressNo != null) {
            params.put("express_no", expressNo);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}