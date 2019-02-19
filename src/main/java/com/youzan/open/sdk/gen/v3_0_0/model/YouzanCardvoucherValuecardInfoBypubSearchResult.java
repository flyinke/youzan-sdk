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

public class YouzanCardvoucherValuecardInfoBypubSearchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private LongPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 实体信息
     */
    private PageQueryValueCardInfoByPublishKdtIdDTO[] items;

    public void setPaginator(LongPaginator paginator) {
        this.paginator = paginator;
    }

    public LongPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(PageQueryValueCardInfoByPublishKdtIdDTO[] items) {
        this.items = items;
    }

    public PageQueryValueCardInfoByPublishKdtIdDTO[] getItems() {
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

    public static class PageQueryValueCardInfoByPublishKdtIdDTO {
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
            @JsonProperty(value = "denomination")
        /**
        * 总金额
        */
        private Long denomination;
            @JsonProperty(value = "principal_denomination")
        /**
        * 本金金额
        */
        private Long principalDenomination;
            @JsonProperty(value = "bonus_denomination")
        /**
        * 赠送金金额
        */
        private Long bonusDenomination;
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

            public void setDenomination(Long denomination) {
            this.denomination = denomination;
        }

        public Long getDenomination() {
            return this.denomination;
        }

            public void setPrincipalDenomination(Long principalDenomination) {
            this.principalDenomination = principalDenomination;
        }

        public Long getPrincipalDenomination() {
            return this.principalDenomination;
        }

            public void setBonusDenomination(Long bonusDenomination) {
            this.bonusDenomination = bonusDenomination;
        }

        public Long getBonusDenomination() {
            return this.bonusDenomination;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

        }


}