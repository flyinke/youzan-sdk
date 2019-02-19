package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.api.FileParams;
import com.youzan.open.sdk.api.APIResult;
import com.youzan.open.sdk.model.ByteWrapper;
import java.util.List;
import java.util.Map;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class YouzanTradeRefundConditionGetResult implements APIResult {

    @JsonProperty(value = "is_full_refund")
    /**
     * 是否只能申请全额退款，是为true，否为false
     */
    private Boolean isFullRefund;
    @JsonProperty(value = "has_retrun_goods")
    /**
     * 是否可以申请退货退款，是为true，否为false
     */
    private Boolean hasRetrunGoods;
    @JsonProperty(value = "refund_fee")
    /**
     * 最大可退金额
     */
    private Float refundFee;

    public void setIsFullRefund(Boolean isFullRefund) {
        this.isFullRefund = isFullRefund;
    }

    public Boolean getIsFullRefund() {
        return this.isFullRefund;
    }
    public void setHasRetrunGoods(Boolean hasRetrunGoods) {
        this.hasRetrunGoods = hasRetrunGoods;
    }

    public Boolean getHasRetrunGoods() {
        return this.hasRetrunGoods;
    }
    public void setRefundFee(Float refundFee) {
        this.refundFee = refundFee;
    }

    public Float getRefundFee() {
        return this.refundFee;
    }


}