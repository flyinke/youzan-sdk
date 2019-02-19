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

public class YouzanMeiCardListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 卡列表项
     */
    private MeiCardListInfo[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiCardListInfo[] items) {
        this.items = items;
    }

    public MeiCardListInfo[] getItems() {
        return this.items;
    }

    public static class MeiCardListInfo {
            @JsonProperty(value = "wap_show")
        /**
        * 是否在网店展示
0 否
1 是
        */
        private Long wapShow;
            @JsonProperty(value = "backgroud_img")
        /**
        * 背景图片url
        */
        private String backgroudImg;
            @JsonProperty(value = "on_shelve")
        /**
        * 上否上架销售
0 否
1 是
        */
        private Long onShelve;
            @JsonProperty(value = "created_at")
        /**
        * 创建时间
        */
        private Long createdAt;
            @JsonProperty(value = "card_type")
        /**
        * 卡类型
1 折扣卡
2 次卡
3 储值卡
        */
        private Long cardType;
            @JsonProperty(value = "card_alias")
        /**
        * 卡标识
        */
        private String cardAlias;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "deleted")
        /**
        * 是否删除
0 删除
1 未删除
        */
        private Long deleted;
            @JsonProperty(value = "updated_at")
        /**
        * 更新时间
        */
        private Long updatedAt;
            @JsonProperty(value = "card_name")
        /**
        * 卡名称
        */
        private String cardName;
            @JsonProperty(value = "prepaid_gift_price")
        /**
        * 赠送储值金额
        */
        private Long prepaidGiftPrice;
            @JsonProperty(value = "card_price")
        /**
        * 卡售价
        */
        private Long cardPrice;
    
            public void setWapShow(Long wapShow) {
            this.wapShow = wapShow;
        }

        public Long getWapShow() {
            return this.wapShow;
        }

            public void setBackgroudImg(String backgroudImg) {
            this.backgroudImg = backgroudImg;
        }

        public String getBackgroudImg() {
            return this.backgroudImg;
        }

            public void setOnShelve(Long onShelve) {
            this.onShelve = onShelve;
        }

        public Long getOnShelve() {
            return this.onShelve;
        }

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setCardType(Long cardType) {
            this.cardType = cardType;
        }

        public Long getCardType() {
            return this.cardType;
        }

            public void setCardAlias(String cardAlias) {
            this.cardAlias = cardAlias;
        }

        public String getCardAlias() {
            return this.cardAlias;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setDeleted(Long deleted) {
            this.deleted = deleted;
        }

        public Long getDeleted() {
            return this.deleted;
        }

            public void setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Long getUpdatedAt() {
            return this.updatedAt;
        }

            public void setCardName(String cardName) {
            this.cardName = cardName;
        }

        public String getCardName() {
            return this.cardName;
        }

            public void setPrepaidGiftPrice(Long prepaidGiftPrice) {
            this.prepaidGiftPrice = prepaidGiftPrice;
        }

        public Long getPrepaidGiftPrice() {
            return this.prepaidGiftPrice;
        }

            public void setCardPrice(Long cardPrice) {
            this.cardPrice = cardPrice;
        }

        public Long getCardPrice() {
            return this.cardPrice;
        }

        }

    public static class MeiPaginator {
            @JsonProperty(value = "total_count")
        /**
        * 总记录数
        */
        private Long totalCount;
            @JsonProperty(value = "page")
        /**
        * 第几页
        */
        private Long page;
            @JsonProperty(value = "page_size")
        /**
        * 每页显示的记录数
        */
        private Long pageSize;
    
            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
        }

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

        }


}