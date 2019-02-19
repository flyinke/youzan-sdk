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

public class YouzanMeiCardUpdateParams implements APIParams, FileParams  {

    /**
     * 卡片背景图
     */
    private String backgroundImg;
    /**
     * 要更新的会员卡标识
     */
    private String cardAlias;
    /**
     * 会员卡售价，单位是分
     */
    private Long cardPrice;
    /**
     * 会员卡权益列表
     */
    private String cardRights;
    /**
     * 卡片描述信息
     */
    private String description;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 是否显示在网店
0 不显示 
1 显示
     */
    private Long wapShow;

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public String getBackgroundImg() {
        return this.backgroundImg;
    }

    public void setCardAlias(String cardAlias) {
        this.cardAlias = cardAlias;
    }

    public String getCardAlias() {
        return this.cardAlias;
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

    public void setWapShow(Long wapShow) {
        this.wapShow = wapShow;
    }

    public Long getWapShow() {
        return this.wapShow;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (backgroundImg != null) {
            params.put("background_img", backgroundImg);
        }
        if (cardAlias != null) {
            params.put("card_alias", cardAlias);
        }
        if (cardPrice != null) {
            params.put("card_price", cardPrice);
        }
        if (cardRights != null) {
            params.put("card_rights", cardRights);
        }
        if (description != null) {
            params.put("description", description);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
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