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

public class YouzanTradeCartListResult implements APIResult {

    @JsonProperty(value = "is_success")
    /**
     * 操作是否成功，true为成功，false为失败
     */
    private Boolean isSuccess;
    @JsonProperty(value = "data")
    /**
     * 购物车中商品列表信息
     */
    private CartFormat[] data;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }
    public void setData(CartFormat[] data) {
        this.data = data;
    }

    public CartFormat[] getData() {
        return this.data;
    }

    public static class CartFormat {
            @JsonProperty(value = "kdt_id")
        /**
        * 门店id
        */
        private Long kdtId;
            @JsonProperty(value = "unavailable_goods_list")
        /**
        * 购物车显示商品信息列表中的goodsList
        */
        private CartGoodsListFormat[] unavailableGoodsList;
            @JsonProperty(value = "goods_list")
        /**
        * 购物车显示商品信息列表中的goodsList
        */
        private CartGoodsListFormat[] goodsList;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setUnavailableGoodsList(CartGoodsListFormat[] unavailableGoodsList) {
            this.unavailableGoodsList = unavailableGoodsList;
        }

        public CartGoodsListFormat[] getUnavailableGoodsList() {
            return this.unavailableGoodsList;
        }

            public void setGoodsList(CartGoodsListFormat[] goodsList) {
            this.goodsList = goodsList;
        }

        public CartGoodsListFormat[] getGoodsList() {
            return this.goodsList;
        }

        }

    public static class CartGoodsListFormat {
            @JsonProperty(value = "attachment_url")
        /**
        * 附件url
        */
        private String attachmentUrl;
            @JsonProperty(value = "sku_id")
        /**
        * 商品sku id
        */
        private Long skuId;
            @JsonProperty(value = "store_id")
        /**
        * 门店id
        */
        private Long storeId;
            @JsonProperty(value = "discount_price")
        /**
        * 折扣名称
        */
        private Long discountPrice;
            @JsonProperty(value = "num")
        /**
        * 商品购买数量
        */
        private Long num;
            @JsonProperty(value = "message")
        /**
        * 买家购买附言
        */
        private String message;
            @JsonProperty(value = "pay_price")
        /**
        * 商品支付价格
        */
        private Long payPrice;
            @JsonProperty(value = "goods_type")
        /**
        * 商品类型
        */
        private Long goodsType;
            @JsonProperty(value = "sku")
        /**
        * 商品sku信息
        */
        private String sku;
            @JsonProperty(value = "stock_num")
        /**
        * 库存数量
        */
        private Long stockNum;
            @JsonProperty(value = "goods_id")
        /**
        * 商品id
        */
        private Long goodsId;
            @JsonProperty(value = "alias")
        /**
        * 商品别名
        */
        private String alias;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "ext")
        /**
        * 商品优惠信息
        */
        private String ext;
            @JsonProperty(value = "error_msg")
        /**
        * 错误信息
        */
        private String errorMsg;
            @JsonProperty(value = "platform")
        /**
        * 商品来源
        */
        private String platform;
            @JsonProperty(value = "service_type")
        /**
        * 服务类型
        */
        private Long serviceType;
            @JsonProperty(value = "updated")
        /**
        * 商品在购物车中的更新时间
        */
        private Long updated;
            @JsonProperty(value = "activity_alias")
        /**
        * 商品优惠活动名称
        */
        private String activityAlias;
            @JsonProperty(value = "nobody")
        /**
        * 会话key
        */
        private String nobody;
            @JsonProperty(value = "support_express_type")
        /**
        * 支持的快递类型
        */
        private String supportExpressType;
            @JsonProperty(value = "discount")
        /**
        * 商品折扣
        */
        private Long discount;
            @JsonProperty(value = "thumb_url")
        /**
        * 
        */
        private String thumbUrl;
            @JsonProperty(value = "sub_type")
        /**
        * 
        */
        private Long subType;
            @JsonProperty(value = "limit_num")
        /**
        * 限购数量
        */
        private Long limitNum;
            @JsonProperty(value = "title")
        /**
        * 商品名
        */
        private String title;
            @JsonProperty(value = "channel_id")
        /**
        * 
        */
        private Long channelId;
            @JsonProperty(value = "direct_seller")
        /**
        * 
        */
        private Long directSeller;
            @JsonProperty(value = "create_time")
        /**
        * 商品放入购物车时间
        */
        private Long createTime;
    
            public void setAttachmentUrl(String attachmentUrl) {
            this.attachmentUrl = attachmentUrl;
        }

        public String getAttachmentUrl() {
            return this.attachmentUrl;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setStoreId(Long storeId) {
            this.storeId = storeId;
        }

        public Long getStoreId() {
            return this.storeId;
        }

            public void setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
        }

        public Long getDiscountPrice() {
            return this.discountPrice;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }

            public void setPayPrice(Long payPrice) {
            this.payPrice = payPrice;
        }

        public Long getPayPrice() {
            return this.payPrice;
        }

            public void setGoodsType(Long goodsType) {
            this.goodsType = goodsType;
        }

        public Long getGoodsType() {
            return this.goodsType;
        }

            public void setSku(String sku) {
            this.sku = sku;
        }

        public String getSku() {
            return this.sku;
        }

            public void setStockNum(Long stockNum) {
            this.stockNum = stockNum;
        }

        public Long getStockNum() {
            return this.stockNum;
        }

            public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public Long getGoodsId() {
            return this.goodsId;
        }

            public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getAlias() {
            return this.alias;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setExt(String ext) {
            this.ext = ext;
        }

        public String getExt() {
            return this.ext;
        }

            public void setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public String getErrorMsg() {
            return this.errorMsg;
        }

            public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getPlatform() {
            return this.platform;
        }

            public void setServiceType(Long serviceType) {
            this.serviceType = serviceType;
        }

        public Long getServiceType() {
            return this.serviceType;
        }

            public void setUpdated(Long updated) {
            this.updated = updated;
        }

        public Long getUpdated() {
            return this.updated;
        }

            public void setActivityAlias(String activityAlias) {
            this.activityAlias = activityAlias;
        }

        public String getActivityAlias() {
            return this.activityAlias;
        }

            public void setNobody(String nobody) {
            this.nobody = nobody;
        }

        public String getNobody() {
            return this.nobody;
        }

            public void setSupportExpressType(String supportExpressType) {
            this.supportExpressType = supportExpressType;
        }

        public String getSupportExpressType() {
            return this.supportExpressType;
        }

            public void setDiscount(Long discount) {
            this.discount = discount;
        }

        public Long getDiscount() {
            return this.discount;
        }

            public void setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
        }

        public String getThumbUrl() {
            return this.thumbUrl;
        }

            public void setSubType(Long subType) {
            this.subType = subType;
        }

        public Long getSubType() {
            return this.subType;
        }

            public void setLimitNum(Long limitNum) {
            this.limitNum = limitNum;
        }

        public Long getLimitNum() {
            return this.limitNum;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setChannelId(Long channelId) {
            this.channelId = channelId;
        }

        public Long getChannelId() {
            return this.channelId;
        }

            public void setDirectSeller(Long directSeller) {
            this.directSeller = directSeller;
        }

        public Long getDirectSeller() {
            return this.directSeller;
        }

            public void setCreateTime(Long createTime) {
            this.createTime = createTime;
        }

        public Long getCreateTime() {
            return this.createTime;
        }

        }


}