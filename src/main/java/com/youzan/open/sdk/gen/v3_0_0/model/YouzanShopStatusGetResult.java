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

public class YouzanShopStatusGetResult implements APIResult {

    @JsonProperty(value = "status")
    /**
     * 店铺状态信息
     */
    private AccountShopStatus status;

    public void setStatus(AccountShopStatus status) {
        this.status = status;
    }

    public AccountShopStatus getStatus() {
        return this.status;
    }

    public static class AccountShopStatus {
            @JsonProperty(value = "is_bind_weixin")
        /**
        * 是否绑定了微信
        */
        private Boolean isBindWeixin;
            @JsonProperty(value = "is_weixin_service")
        /**
        * 是否是微信认证服务号
        */
        private Boolean isWeixinService;
            @JsonProperty(value = "is_weixin_unauthorized_service")
        /**
        * 是否是微信未认证服务号
        */
        private Boolean isWeixinUnauthorizedService;
            @JsonProperty(value = "is_weixin_publisher")
        /**
        * 是否是微信认证订阅号
        */
        private Boolean isWeixinPublisher;
            @JsonProperty(value = "is_weixin_unauthorized_publisher")
        /**
        * 是否是微信未认证订阅号
        */
        private Boolean isWeixinUnauthorizedPublisher;
            @JsonProperty(value = "is_secured_transactions")
        /**
        * 是否是担保交易
        */
        private Boolean isSecuredTransactions;
            @JsonProperty(value = "is_set_shopping_cart")
        /**
        * 是否设置购物车
        */
        private Boolean isSetShoppingCart;
            @JsonProperty(value = "is_set_buy_record")
        /**
        * 是否设置购买记录
        */
        private Boolean isSetBuyRecord;
            @JsonProperty(value = "is_set_customer_reviews")
        /**
        * 是否设置商品评价
        */
        private Boolean isSetCustomerReviews;
            @JsonProperty(value = "is_set_fans_only")
        /**
        * 是否设置仅粉丝购买
        */
        private Boolean isSetFansOnly;
    
            public void setIsBindWeixin(Boolean isBindWeixin) {
            this.isBindWeixin = isBindWeixin;
        }

        public Boolean getIsBindWeixin() {
            return this.isBindWeixin;
        }

            public void setIsWeixinService(Boolean isWeixinService) {
            this.isWeixinService = isWeixinService;
        }

        public Boolean getIsWeixinService() {
            return this.isWeixinService;
        }

            public void setIsWeixinUnauthorizedService(Boolean isWeixinUnauthorizedService) {
            this.isWeixinUnauthorizedService = isWeixinUnauthorizedService;
        }

        public Boolean getIsWeixinUnauthorizedService() {
            return this.isWeixinUnauthorizedService;
        }

            public void setIsWeixinPublisher(Boolean isWeixinPublisher) {
            this.isWeixinPublisher = isWeixinPublisher;
        }

        public Boolean getIsWeixinPublisher() {
            return this.isWeixinPublisher;
        }

            public void setIsWeixinUnauthorizedPublisher(Boolean isWeixinUnauthorizedPublisher) {
            this.isWeixinUnauthorizedPublisher = isWeixinUnauthorizedPublisher;
        }

        public Boolean getIsWeixinUnauthorizedPublisher() {
            return this.isWeixinUnauthorizedPublisher;
        }

            public void setIsSecuredTransactions(Boolean isSecuredTransactions) {
            this.isSecuredTransactions = isSecuredTransactions;
        }

        public Boolean getIsSecuredTransactions() {
            return this.isSecuredTransactions;
        }

            public void setIsSetShoppingCart(Boolean isSetShoppingCart) {
            this.isSetShoppingCart = isSetShoppingCart;
        }

        public Boolean getIsSetShoppingCart() {
            return this.isSetShoppingCart;
        }

            public void setIsSetBuyRecord(Boolean isSetBuyRecord) {
            this.isSetBuyRecord = isSetBuyRecord;
        }

        public Boolean getIsSetBuyRecord() {
            return this.isSetBuyRecord;
        }

            public void setIsSetCustomerReviews(Boolean isSetCustomerReviews) {
            this.isSetCustomerReviews = isSetCustomerReviews;
        }

        public Boolean getIsSetCustomerReviews() {
            return this.isSetCustomerReviews;
        }

            public void setIsSetFansOnly(Boolean isSetFansOnly) {
            this.isSetFansOnly = isSetFansOnly;
        }

        public Boolean getIsSetFansOnly() {
            return this.isSetFansOnly;
        }

        }


}