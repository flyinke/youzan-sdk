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

public class YouzanTradeRefundSellerActiveParams implements APIParams, FileParams  {

    /**
     * 退款原因
     */
    private String desc;
    /**
     * 订单商品id
     */
    private Long oid;
    /**
     * 退款金额
     */
    private Float refundFee;
    /**
     * 订单号
     */
    private String tid;

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setRefundFee(Float refundFee) {
        this.refundFee = refundFee;
    }

    public Float getRefundFee() {
        return this.refundFee;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (desc != null) {
            params.put("desc", desc);
        }
        if (oid != null) {
            params.put("oid", oid);
        }
        if (refundFee != null) {
            params.put("refund_fee", refundFee);
        }
        if (tid != null) {
            params.put("tid", tid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}