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

public class YouzanMeiReservationTechnicianListParams implements APIParams, FileParams  {

    /**
     * 分店id
     */
    private Long deptId;
    /**
     * 要查询的服务id
     */
    private Long goodsId;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 要查询的服务的skuid
     */
    private Long skuId;
    /**
     * 要查询的日期
     */
    private Long time;

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptId() {
        return this.deptId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() {
        return this.goodsId;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getTime() {
        return this.time;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (deptId != null) {
            params.put("dept_id", deptId);
        }
        if (goodsId != null) {
            params.put("goods_id", goodsId);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        if (time != null) {
            params.put("time", time);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}