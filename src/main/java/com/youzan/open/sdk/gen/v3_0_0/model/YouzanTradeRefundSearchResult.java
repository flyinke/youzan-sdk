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

public class YouzanTradeRefundSearchResult implements APIResult {

    @JsonProperty(value = "total")
    /**
     * 总数
     */
    private Long total;
    @JsonProperty(value = "refunds")
    /**
     * 退款列表
     */
    private OpenSafeEsDTO[] refunds;

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotal() {
        return this.total;
    }
    public void setRefunds(OpenSafeEsDTO[] refunds) {
        this.refunds = refunds;
    }

    public OpenSafeEsDTO[] getRefunds() {
        return this.refunds;
    }

    public static class OpenSafeEsDTO {
            @JsonProperty(value = "refund_id")
        /**
        * 退款ID
        */
        private String refundId;
            @JsonProperty(value = "status")
        /**
        * 退款状态:
WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意)，
WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货)，
WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货)，
SELLER_REFUSE_BUYER(卖家拒绝退款)，
CLOSED(退款关闭)，
SUCCESS(退款成功)。
        */
        private String status;
            @JsonProperty(value = "tid")
        /**
        * 订单号
        */
        private String tid;
            @JsonProperty(value = "return_goods")
        /**
        * 是否退货:
false（仅退款），true（退货退款）。
        */
        private Boolean returnGoods;
            @JsonProperty(value = "reason")
        /**
        * 退款原因，
仅退款-未收到货申请原因:11(质量问题), 12(拍错/多拍/不喜欢), 13(商品描述不符), 14(假货), 15(商家发错货), 16(商品破损/少件), 17(其他); 仅退款-已收到货申请原因:51(多买/买错/不想要), 52(快递无记录), 53(少货/空包裹), 54(未按约定时间发货), 55(快递一直未送达), 56(其他); 退货退款-申请原因:101(商品破损/少件), 102(商家发错货), 103(商品描述不符), 104(拍错/多拍/不喜欢), 105(质量问题), 107(其他);
        */
        private Long reason;
            @JsonProperty(value = "refund_fee")
        /**
        * 申请退款的金额 如:0.01元
        */
        private Float refundFee;
            @JsonProperty(value = "created")
        /**
        * 退款申请时间 如 2017-01-01 00:00:01
        */
        private Date created;
            @JsonProperty(value = "modified")
        /**
        * 退款申请修改时间 如 2017-01-01 00:00:01
        */
        private Date modified;
            @JsonProperty(value = "cs_status")
        /**
        * 客满介入状态：
1（客满未介入），2（客满介入中）。
        */
        private Long csStatus;
    
            public void setRefundId(String refundId) {
            this.refundId = refundId;
        }

        public String getRefundId() {
            return this.refundId;
        }

            public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }

            public void setTid(String tid) {
            this.tid = tid;
        }

        public String getTid() {
            return this.tid;
        }

            public void setReturnGoods(Boolean returnGoods) {
            this.returnGoods = returnGoods;
        }

        public Boolean getReturnGoods() {
            return this.returnGoods;
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

            public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }

            public void setModified(Date modified) {
            this.modified = modified;
        }

        public Date getModified() {
            return this.modified;
        }

            public void setCsStatus(Long csStatus) {
            this.csStatus = csStatus;
        }

        public Long getCsStatus() {
            return this.csStatus;
        }

        }


}