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

public class YouzanMeiCardCustomerListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 会员卡列表信息
     */
    private MeiPersonCardInfo[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiPersonCardInfo[] items) {
        this.items = items;
    }

    public MeiPersonCardInfo[] getItems() {
        return this.items;
    }

    public static class MeiPersonCardRight {
            @JsonProperty(value = "gift")
        /**
        * 是否是赠送的权益
        */
        private Long gift;
            @JsonProperty(value = "term_end_at")
        /**
        * 有效期结束时间（0：无限）
        */
        private Long termEndAt;
            @JsonProperty(value = "term_begin_at")
        /**
        * 有效期开始时间
        */
        private Long termBeginAt;
            @JsonProperty(value = "rights_id")
        /**
        * 权益Id
        */
        private Long rightsId;
            @JsonProperty(value = "card_no")
        /**
        * 卡号
        */
        private String cardNo;
            @JsonProperty(value = "remain_value")
        /**
        * 剩余权益值
        */
        private Long remainValue;
            @JsonProperty(value = "rights_type")
        /**
        * 权益类型：
1 折扣；
2 次数
        */
        private Long rightsType;
            @JsonProperty(value = "goods_id")
        /**
        * 商品id
        */
        private Long goodsId;
            @JsonProperty(value = "value")
        /**
        * 权益值
        */
        private Long value;
    
            public void setGift(Long gift) {
            this.gift = gift;
        }

        public Long getGift() {
            return this.gift;
        }

            public void setTermEndAt(Long termEndAt) {
            this.termEndAt = termEndAt;
        }

        public Long getTermEndAt() {
            return this.termEndAt;
        }

            public void setTermBeginAt(Long termBeginAt) {
            this.termBeginAt = termBeginAt;
        }

        public Long getTermBeginAt() {
            return this.termBeginAt;
        }

            public void setRightsId(Long rightsId) {
            this.rightsId = rightsId;
        }

        public Long getRightsId() {
            return this.rightsId;
        }

            public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public String getCardNo() {
            return this.cardNo;
        }

            public void setRemainValue(Long remainValue) {
            this.remainValue = remainValue;
        }

        public Long getRemainValue() {
            return this.remainValue;
        }

            public void setRightsType(Long rightsType) {
            this.rightsType = rightsType;
        }

        public Long getRightsType() {
            return this.rightsType;
        }

            public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public Long getGoodsId() {
            return this.goodsId;
        }

            public void setValue(Long value) {
            this.value = value;
        }

        public Long getValue() {
            return this.value;
        }

        }

    public static class MeiPersonCardInfo {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "card_alias")
        /**
        * 卡别名
        */
        private String cardAlias;
            @JsonProperty(value = "card_name")
        /**
        * 卡名称
        */
        private String cardName;
            @JsonProperty(value = "card_no")
        /**
        * 卡号
        */
        private String cardNo;
            @JsonProperty(value = "card_type")
        /**
        * 卡类型
1 折扣
2 次数
        */
        private Long cardType;
            @JsonProperty(value = "card_price")
        /**
        * 价格
        */
        private Long cardPrice;
            @JsonProperty(value = "term_begin_at")
        /**
        * 有效期开始时间
        */
        private Long termBeginAt;
            @JsonProperty(value = "term_end_at")
        /**
        * 有效期结束时间（0：无限）
        */
        private Long termEndAt;
            @JsonProperty(value = "all_discount")
        /**
        * 是否全店折扣
        */
        private Long allDiscount;
            @JsonProperty(value = "all_discount_value")
        /**
        * 全店折扣值
        */
        private Long allDiscountValue;
            @JsonProperty(value = "all_discount_rights_id")
        /**
        * 全店折扣权益值
        */
        private Long allDiscountRightsId;
            @JsonProperty(value = "description")
        /**
        * 描述
        */
        private String description;
            @JsonProperty(value = "card_rights")
        /**
        * 卡权限--分配到会员后的权限信息
        */
        private MeiPersonCardRight[] cardRights;
            @JsonProperty(value = "level")
        /**
        * 等级信息
        */
        private Long level;
            @JsonProperty(value = "create_at")
        /**
        * 创建时间
        */
        private Long createAt;
            @JsonProperty(value = "active_at")
        /**
        * 更新时间
        */
        private Long activeAt;
            @JsonProperty(value = "prepaid_gift_price")
        /**
        * 赠送金额
        */
        private Long prepaidGiftPrice;
            @JsonProperty(value = "bgImg")
        /**
        * 背景图片
        */
        private String bgImg;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setCardAlias(String cardAlias) {
            this.cardAlias = cardAlias;
        }

        public String getCardAlias() {
            return this.cardAlias;
        }

            public void setCardName(String cardName) {
            this.cardName = cardName;
        }

        public String getCardName() {
            return this.cardName;
        }

            public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public String getCardNo() {
            return this.cardNo;
        }

            public void setCardType(Long cardType) {
            this.cardType = cardType;
        }

        public Long getCardType() {
            return this.cardType;
        }

            public void setCardPrice(Long cardPrice) {
            this.cardPrice = cardPrice;
        }

        public Long getCardPrice() {
            return this.cardPrice;
        }

            public void setTermBeginAt(Long termBeginAt) {
            this.termBeginAt = termBeginAt;
        }

        public Long getTermBeginAt() {
            return this.termBeginAt;
        }

            public void setTermEndAt(Long termEndAt) {
            this.termEndAt = termEndAt;
        }

        public Long getTermEndAt() {
            return this.termEndAt;
        }

            public void setAllDiscount(Long allDiscount) {
            this.allDiscount = allDiscount;
        }

        public Long getAllDiscount() {
            return this.allDiscount;
        }

            public void setAllDiscountValue(Long allDiscountValue) {
            this.allDiscountValue = allDiscountValue;
        }

        public Long getAllDiscountValue() {
            return this.allDiscountValue;
        }

            public void setAllDiscountRightsId(Long allDiscountRightsId) {
            this.allDiscountRightsId = allDiscountRightsId;
        }

        public Long getAllDiscountRightsId() {
            return this.allDiscountRightsId;
        }

            public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

            public void setCardRights(MeiPersonCardRight[] cardRights) {
            this.cardRights = cardRights;
        }

        public MeiPersonCardRight[] getCardRights() {
            return this.cardRights;
        }

            public void setLevel(Long level) {
            this.level = level;
        }

        public Long getLevel() {
            return this.level;
        }

            public void setCreateAt(Long createAt) {
            this.createAt = createAt;
        }

        public Long getCreateAt() {
            return this.createAt;
        }

            public void setActiveAt(Long activeAt) {
            this.activeAt = activeAt;
        }

        public Long getActiveAt() {
            return this.activeAt;
        }

            public void setPrepaidGiftPrice(Long prepaidGiftPrice) {
            this.prepaidGiftPrice = prepaidGiftPrice;
        }

        public Long getPrepaidGiftPrice() {
            return this.prepaidGiftPrice;
        }

            public void setBgImg(String bgImg) {
            this.bgImg = bgImg;
        }

        public String getBgImg() {
            return this.bgImg;
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