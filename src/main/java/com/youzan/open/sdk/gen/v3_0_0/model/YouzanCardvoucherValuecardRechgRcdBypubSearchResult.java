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

public class YouzanCardvoucherValuecardRechgRcdBypubSearchResult implements APIResult {

    @JsonProperty(value = "items")
    /**
     * 实体信息
     */
    private PageQueryRechargeLogByPublishKdtIdDTO[] items;
    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private LongPaginator paginator;

    public void setItems(PageQueryRechargeLogByPublishKdtIdDTO[] items) {
        this.items = items;
    }

    public PageQueryRechargeLogByPublishKdtIdDTO[] getItems() {
        return this.items;
    }
    public void setPaginator(LongPaginator paginator) {
        this.paginator = paginator;
    }

    public LongPaginator getPaginator() {
        return this.paginator;
    }

    public static class PageQueryRechargeLogByPublishKdtIdDTO {
            @JsonProperty(value = "kdt_id")
        /**
        * 发卡机构的店铺Id
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
            @JsonProperty(value = "recharge_no")
        /**
        * 充值单号
        */
        private String rechargeNo;
            @JsonProperty(value = "recharge_time")
        /**
        * 充值时间，格式yyyy-MM-dd HH:mm:ss
        */
        private String rechargeTime;
            @JsonProperty(value = "recharge_amount")
        /**
        * 充值金额
        */
        private Long rechargeAmount;
            @JsonProperty(value = "recharge_channel")
        /**
        * 充值方式(wx：微信 alipay：支付宝 card：银行卡 cash：现金 tag：标记支付 other：其他)
        */
        private String rechargeChannel;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "moblie")
        /**
        * 手机号码
        */
        private String moblie;
    
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

            public void setRechargeNo(String rechargeNo) {
            this.rechargeNo = rechargeNo;
        }

        public String getRechargeNo() {
            return this.rechargeNo;
        }

            public void setRechargeTime(String rechargeTime) {
            this.rechargeTime = rechargeTime;
        }

        public String getRechargeTime() {
            return this.rechargeTime;
        }

            public void setRechargeAmount(Long rechargeAmount) {
            this.rechargeAmount = rechargeAmount;
        }

        public Long getRechargeAmount() {
            return this.rechargeAmount;
        }

            public void setRechargeChannel(String rechargeChannel) {
            this.rechargeChannel = rechargeChannel;
        }

        public String getRechargeChannel() {
            return this.rechargeChannel;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setMoblie(String moblie) {
            this.moblie = moblie;
        }

        public String getMoblie() {
            return this.moblie;
        }

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


}