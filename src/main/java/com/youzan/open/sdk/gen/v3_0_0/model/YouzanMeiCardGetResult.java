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

public class YouzanMeiCardGetResult implements APIResult {

    @JsonProperty(value = "wap_show")
    /**
     * 是否在网店销售
     */
    private Long wapShow;
    @JsonProperty(value = "backgroud_img")
    /**
     * 背景图片url
     */
    private String backgroudImg;
    @JsonProperty(value = "card_rights")
    /**
     * 权益列表
     */
    private MeiCardRight[] cardRights;
    @JsonProperty(value = "term_days")
    /**
     * 有效期
     */
    private Long termDays;
    @JsonProperty(value = "select_dept_ids")
    /**
     * 上架门店列表
     */
    private Number[] selectDeptIds;
    @JsonProperty(value = "sync_wx")
    /**
     * 是否同步微信
     */
    private Long syncWx;
    @JsonProperty(value = "on_shelve")
    /**
     * 是否上架销售
     */
    private Long onShelve;
    @JsonProperty(value = "description")
    /**
     * 描述
     */
    private String description;
    @JsonProperty(value = "all_discount")
    /**
     * 是否开启了全店折扣
     */
    private Long allDiscount;
    @JsonProperty(value = "card_type")
    /**
     * 卡类型
     */
    private Long cardType;
    @JsonProperty(value = "card_alias")
    /**
     * 卡标识
     */
    private String cardAlias;
    @JsonProperty(value = "all_discount_value")
    /**
     * 全店折扣的折扣值
     */
    private Long allDiscountValue;
    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "deleted")
    /**
     * 是否删除
     */
    private Long deleted;
    @JsonProperty(value = "card_name")
    /**
     * 卡名称
     */
    private String cardName;
    @JsonProperty(value = "prepaid_gift_price")
    /**
     * 赠送金额
     */
    private Long prepaidGiftPrice;
    @JsonProperty(value = "card_price")
    /**
     * 卡售价
     */
    private Long cardPrice;
    @JsonProperty(value = "sync_wx_status")
    /**
     * 同步微信状态
     */
    private Long syncWxStatus;
    @JsonProperty(value = "created_at")
    /**
     * 创建时间
     */
    private Long createdAt;
    @JsonProperty(value = "updated_at")
    /**
     * 更新时间
     */
    private Long updatedAt;
    @JsonProperty(value = "dept_id")
    /**
     * 分店id
     */
    private Long deptId;

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
    public void setCardRights(MeiCardRight[] cardRights) {
        this.cardRights = cardRights;
    }

    public MeiCardRight[] getCardRights() {
        return this.cardRights;
    }
    public void setTermDays(Long termDays) {
        this.termDays = termDays;
    }

    public Long getTermDays() {
        return this.termDays;
    }
    public void setSelectDeptIds(Number[] selectDeptIds) {
        this.selectDeptIds = selectDeptIds;
    }

    public Number[] getSelectDeptIds() {
        return this.selectDeptIds;
    }
    public void setSyncWx(Long syncWx) {
        this.syncWx = syncWx;
    }

    public Long getSyncWx() {
        return this.syncWx;
    }
    public void setOnShelve(Long onShelve) {
        this.onShelve = onShelve;
    }

    public Long getOnShelve() {
        return this.onShelve;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    public void setAllDiscount(Long allDiscount) {
        this.allDiscount = allDiscount;
    }

    public Long getAllDiscount() {
        return this.allDiscount;
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
    public void setAllDiscountValue(Long allDiscountValue) {
        this.allDiscountValue = allDiscountValue;
    }

    public Long getAllDiscountValue() {
        return this.allDiscountValue;
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
    public void setSyncWxStatus(Long syncWxStatus) {
        this.syncWxStatus = syncWxStatus;
    }

    public Long getSyncWxStatus() {
        return this.syncWxStatus;
    }
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getUpdatedAt() {
        return this.updatedAt;
    }
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptId() {
        return this.deptId;
    }

    public static class MeiCardRight {
            @JsonProperty(value = "gift")
        /**
        * 是否是赠送的权益
        */
        private Long gift;
            @JsonProperty(value = "rights_id")
        /**
        * 权益Id
        */
        private Long rightsId;
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

            public void setRightsId(Long rightsId) {
            this.rightsId = rightsId;
        }

        public Long getRightsId() {
            return this.rightsId;
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


}