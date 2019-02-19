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

public class YouzanTradeRefundModifyParams implements APIParams, FileParams  {

    /**
     * 退款说明，备注
     */
    private String desc;
    /**
     * 退款原因，原因列表地址：https://www.youzanyun.com/docs/guide/faq/699
     */
    private Long reason;
    /**
     * 退款金额
     */
    private Float refundFee;
    /**
     * 退款ID
     */
    private String refundId;
    /**
     * false(仅退款) true(退货退款)
     */
    private Boolean returnGoods;
    /**
     * 
     */
    private Long version;

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setReason(Long reason) {
        this.reason = reason;
    }

    public Long getReason() {
        return this.reason;
    }

    public void setRefundFee(Float refundFee) {
        this.refundFee = refundFee;
    }

    public Float getRefundFee() {
        return this.refundFee;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getRefundId() {
        return this.refundId;
    }

    public void setReturnGoods(Boolean returnGoods) {
        this.returnGoods = returnGoods;
    }

    public Boolean getReturnGoods() {
        return this.returnGoods;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getVersion() {
        return this.version;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (desc != null) {
            params.put("desc", desc);
        }
        if (reason != null) {
            params.put("reason", reason);
        }
        if (refundFee != null) {
            params.put("refund_fee", refundFee);
        }
        if (refundId != null) {
            params.put("refund_id", refundId);
        }
        if (returnGoods != null) {
            params.put("return_goods", returnGoods);
        }
        if (version != null) {
            params.put("version", version);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}