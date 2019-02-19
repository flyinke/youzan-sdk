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

public class YouzanMeiCardCreateParams implements APIParams, FileParams  {

    /**
     * 是否启用全店折扣。
0 不启用
1 启用
     */
    private Long allDiscount;
    /**
     * 全店折扣值，当时启用全店折扣时才生效。
例如9折，则写90
     */
    private Long allDiscountValue;
    /**
     * 卡片背景图
     */
    private String backgroundImg;
    /**
     * 会员卡名称
     */
    private String cardName;
    /**
     * 会员卡售价，单位是分
     */
    private Long cardPrice;
    /**
     * 会员卡权益列表
     */
    private String cardRights;
    /**
     * 会员卡类型。
1 次卡
2 折扣卡
3 充值卡
     */
    private Long cardType;
    /**
     * 卡片描述信息
     */
    private String description;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 充值赠送金额，单位是分。只有充值卡的时候才有效。
     */
    private Long prepaidGiftPrice;
    /**
     * 是否同步微信卡包
0 不同步
1 同步
     */
    private Long syncWx;
    /**
     * 有效期。
0 表示永久有效
其他数字表示有效天数
     */
    private Long termDays;
    /**
     * 是否显示在网店
0 不显示 
1 显示
     */
    private Long wapShow;

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

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public String getBackgroundImg() {
        return this.backgroundImg;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return this.cardName;
    }

    public void setCardPrice(Long cardPrice) {
        this.cardPrice = cardPrice;
    }

    public Long getCardPrice() {
        return this.cardPrice;
    }

    public void setCardRights(String cardRights) {
        this.cardRights = cardRights;
    }

    public String getCardRights() {
        return this.cardRights;
    }

    public void setCardType(Long cardType) {
        this.cardType = cardType;
    }

    public Long getCardType() {
        return this.cardType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setPrepaidGiftPrice(Long prepaidGiftPrice) {
        this.prepaidGiftPrice = prepaidGiftPrice;
    }

    public Long getPrepaidGiftPrice() {
        return this.prepaidGiftPrice;
    }

    public void setSyncWx(Long syncWx) {
        this.syncWx = syncWx;
    }

    public Long getSyncWx() {
        return this.syncWx;
    }

    public void setTermDays(Long termDays) {
        this.termDays = termDays;
    }

    public Long getTermDays() {
        return this.termDays;
    }

    public void setWapShow(Long wapShow) {
        this.wapShow = wapShow;
    }

    public Long getWapShow() {
        return this.wapShow;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (allDiscount != null) {
            params.put("all_discount", allDiscount);
        }
        if (allDiscountValue != null) {
            params.put("all_discount_value", allDiscountValue);
        }
        if (backgroundImg != null) {
            params.put("background_img", backgroundImg);
        }
        if (cardName != null) {
            params.put("card_name", cardName);
        }
        if (cardPrice != null) {
            params.put("card_price", cardPrice);
        }
        if (cardRights != null) {
            params.put("card_rights", cardRights);
        }
        if (cardType != null) {
            params.put("card_type", cardType);
        }
        if (description != null) {
            params.put("description", description);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (prepaidGiftPrice != null) {
            params.put("prepaid_gift_price", prepaidGiftPrice);
        }
        if (syncWx != null) {
            params.put("sync_wx", syncWx);
        }
        if (termDays != null) {
            params.put("term_days", termDays);
        }
        if (wapShow != null) {
            params.put("wap_show", wapShow);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }

    public static class MeiCardRight {
            private Long gift;
            private Long rightsId;
            private Long rightsType;
            private Long goodsId;
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