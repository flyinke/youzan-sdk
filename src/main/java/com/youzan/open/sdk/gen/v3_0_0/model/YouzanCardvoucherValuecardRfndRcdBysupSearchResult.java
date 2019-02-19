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

public class YouzanCardvoucherValuecardRfndRcdBysupSearchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private LongPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 实体信息
     */
    private PageQueryRefundLogBySupportKdtIdDTO[] items;

    public void setPaginator(LongPaginator paginator) {
        this.paginator = paginator;
    }

    public LongPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(PageQueryRefundLogBySupportKdtIdDTO[] items) {
        this.items = items;
    }

    public PageQueryRefundLogBySupportKdtIdDTO[] getItems() {
        return this.items;
    }

    public static class LongPaginator {
            @JsonProperty(value = "page")
        /**
        * 查询第几页
        */
        private Long page;
            @JsonProperty(value = "page_size")
        /**
        * 分页大小
        */
        private Long pageSize;
            @JsonProperty(value = "total_count")
        /**
        * 查询获得数据总条数
        */
        private Long totalCount;
    
            public void setPage(Long page) {
            this.page = page;
        }

        public Long getPage() {
            return this.page;
        }

            public void setPageSize(Long pageSize) {
            this.pageSize = pageSize;
        }

        public Long getPageSize() {
            return this.pageSize;
        }

            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
        }

        }

    public static class PageQueryRefundLogBySupportKdtIdDTO {
            @JsonProperty(value = "kdt_id")
        /**
        * 特约商户的店铺Id
        */
        private Long kdtId;
            @JsonProperty(value = "buyer_id")
        /**
        * 客户Id
        */
        private Long buyerId;
            @JsonProperty(value = "card_no")
        /**
        * 卡号
        */
        private String cardNo;
            @JsonProperty(value = "refund_time")
        /**
        * 退款时间，格式yyyy-MM-dd HH:mm:ss
        */
        private String refundTime;
            @JsonProperty(value = "refund_amount")
        /**
        * 退款总金额
        */
        private Long refundAmount;
            @JsonProperty(value = "principal_refund_amount")
        /**
        * 退款本金金额
        */
        private Long principalRefundAmount;
            @JsonProperty(value = "bonus_refund_amount")
        /**
        * 退款赠送金金额
        */
        private Long bonusRefundAmount;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "mobile")
        /**
        * 手机号码
        */
        private String mobile;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
        }

        public Long getBuyerId() {
            return this.buyerId;
        }

            public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public String getCardNo() {
            return this.cardNo;
        }

            public void setRefundTime(String refundTime) {
            this.refundTime = refundTime;
        }

        public String getRefundTime() {
            return this.refundTime;
        }

            public void setRefundAmount(Long refundAmount) {
            this.refundAmount = refundAmount;
        }

        public Long getRefundAmount() {
            return this.refundAmount;
        }

            public void setPrincipalRefundAmount(Long principalRefundAmount) {
            this.principalRefundAmount = principalRefundAmount;
        }

        public Long getPrincipalRefundAmount() {
            return this.principalRefundAmount;
        }

            public void setBonusRefundAmount(Long bonusRefundAmount) {
            this.bonusRefundAmount = bonusRefundAmount;
        }

        public Long getBonusRefundAmount() {
            return this.bonusRefundAmount;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

        }


}