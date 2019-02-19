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

public class YouzanTradeRefundApplyParams implements APIParams, FileParams  {

    /**
     * 退款说明，备注
     */
    private String desc;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 交易的商品明细编号。
     */
    private Long oid;
    /**
     * 退款原因，原因列表地址：https://www.youzanyun.com/docs/guide/faq/699
     */
    private Long reason;
    /**
     * 退款金额
     */
    private Float refundFee;
    /**
     * 是否退货 false(仅退款) true(退货退款)
     */
    private Boolean returnGoods;
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

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getOid() {
        return this.oid;
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

    public void setReturnGoods(Boolean returnGoods) {
        this.returnGoods = returnGoods;
    }

    public Boolean getReturnGoods() {
        return this.returnGoods;
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
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        if (oid != null) {
            params.put("oid", oid);
        }
        if (reason != null) {
            params.put("reason", reason);
        }
        if (refundFee != null) {
            params.put("refund_fee", refundFee);
        }
        if (returnGoods != null) {
            params.put("return_goods", returnGoods);
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