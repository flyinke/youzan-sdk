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

public class YouzanRetailProductUnitsDeleteParams implements APIParams, FileParams  {

    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;
    /**
     * 待删除商品单位列表
     */
    private String unitIds;

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setUnitIds(String unitIds) {
        this.unitIds = unitIds;
    }

    public String getUnitIds() {
        return this.unitIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (source != null) {
            params.put("source", source);
        }
        if (unitIds != null) {
            params.put("unit_ids", unitIds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}