package com.youzan.open.sdk.gen.v1_0_0.model;

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

public class YouzanFenxiaoSupportOrderDeliveritemGetResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 发货商品信息
     */
    private SptDeliverItemDTO response;

    public void setResponse(SptDeliverItemDTO response) {
        this.response = response;
    }

    public SptDeliverItemDTO getResponse() {
        return this.response;
    }

    public static class ReceiverDTO {
            @JsonProperty(value = "receiver_phone")
        /**
        * 收货人手机号
        */
        private String receiverPhone;
            @JsonProperty(value = "receiver_name")
        /**
        * 收货人姓名
        */
        private String receiverName;
            @JsonProperty(value = "receiver_address")
        /**
        * 收货人地址信息
        */
        private AddressDTO receiverAddress;
    
            public void setReceiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
        }

        public String getReceiverPhone() {
            return this.receiverPhone;
        }

            public void setReceiverName(String receiverName) {
            this.receiverName = receiverName;
        }

        public String getReceiverName() {
            return this.receiverName;
        }

            public void setReceiverAddress(AddressDTO receiverAddress) {
            this.receiverAddress = receiverAddress;
        }

        public AddressDTO getReceiverAddress() {
            return this.receiverAddress;
        }

        }

    public static class SptItemDTO {
            @JsonProperty(value = "title")
        /**
        * 商品标题
        */
        private String title;
            @JsonProperty(value = "sku")
        /**
        * 商品sku详情
        */
        private String sku;
            @JsonProperty(value = "url")
        /**
        * 商品url
        */
        private String url;
            @JsonProperty(value = "picture")
        /**
        * 商品图片详情
        */
        private String picture;
            @JsonProperty(value = "num")
        /**
        * 商品数量
        */
        private Long num;
            @JsonProperty(value = "delivery_status")
        /**
        * 发货状态，0：未发货，1：已发货
        */
        private Long deliveryStatus;
            @JsonProperty(value = "code")
        /**
        * 商品编码
        */
        private String code;
            @JsonProperty(value = "order_item_id")
        /**
        * 订单商品id
        */
        private Long orderItemId;
            @JsonProperty(value = "express_info")
        /**
        * 商品运单号信息
        */
        private String expressInfo;
            @JsonProperty(value = "feedback_status")
        /**
        * 商品维权状态
        */
        private Long feedbackStatus;
    
            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setSku(String sku) {
            this.sku = sku;
        }

        public String getSku() {
            return this.sku;
        }

            public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return this.url;
        }

            public void setPicture(String picture) {
            this.picture = picture;
        }

        public String getPicture() {
            return this.picture;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setDeliveryStatus(Long deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
        }

        public Long getDeliveryStatus() {
            return this.deliveryStatus;
        }

            public void setCode(String code) {
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }

            public void setOrderItemId(Long orderItemId) {
            this.orderItemId = orderItemId;
        }

        public Long getOrderItemId() {
            return this.orderItemId;
        }

            public void setExpressInfo(String expressInfo) {
            this.expressInfo = expressInfo;
        }

        public String getExpressInfo() {
            return this.expressInfo;
        }

            public void setFeedbackStatus(Long feedbackStatus) {
            this.feedbackStatus = feedbackStatus;
        }

        public Long getFeedbackStatus() {
            return this.feedbackStatus;
        }

        }

    public static class AddressDTO {
            @JsonProperty(value = "country")
        /**
        * 国家
        */
        private String country;
            @JsonProperty(value = "province")
        /**
        * 省
        */
        private String province;
            @JsonProperty(value = "city")
        /**
        * 城市
        */
        private String city;
            @JsonProperty(value = "district")
        /**
        * 区县
        */
        private String district;
            @JsonProperty(value = "street")
        /**
        * 街道
        */
        private String street;
            @JsonProperty(value = "detail")
        /**
        * 详细地址
        */
        private String detail;
            @JsonProperty(value = "postal_code")
        /**
        * 邮编
        */
        private String postalCode;
    
            public void setCountry(String country) {
            this.country = country;
        }

        public String getCountry() {
            return this.country;
        }

            public void setProvince(String province) {
            this.province = province;
        }

        public String getProvince() {
            return this.province;
        }

            public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return this.city;
        }

            public void setDistrict(String district) {
            this.district = district;
        }

        public String getDistrict() {
            return this.district;
        }

            public void setStreet(String street) {
            this.street = street;
        }

        public String getStreet() {
            return this.street;
        }

            public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getDetail() {
            return this.detail;
        }

            public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getPostalCode() {
            return this.postalCode;
        }

        }

    public static class SptDeliverItemDTO {
            @JsonProperty(value = "delivered_num")
        /**
        * 已发货商品数
        */
        private Long deliveredNum;
            @JsonProperty(value = "undelivered_num")
        /**
        * 未发货商品数
        */
        private Long undeliveredNum;
            @JsonProperty(value = "order_no")
        /**
        * 订单号
        */
        private String orderNo;
            @JsonProperty(value = "receiver_d_t_o")
        /**
        * 收货人信息
        */
        private ReceiverDTO receiverDTO;
            @JsonProperty(value = "item_list")
        /**
        * 发货商品信息
        */
        private SptItemDTO[] itemList;
    
            public void setDeliveredNum(Long deliveredNum) {
            this.deliveredNum = deliveredNum;
        }

        public Long getDeliveredNum() {
            return this.deliveredNum;
        }

            public void setUndeliveredNum(Long undeliveredNum) {
            this.undeliveredNum = undeliveredNum;
        }

        public Long getUndeliveredNum() {
            return this.undeliveredNum;
        }

            public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderNo() {
            return this.orderNo;
        }

            public void setReceiverDTO(ReceiverDTO receiverDTO) {
            this.receiverDTO = receiverDTO;
        }

        public ReceiverDTO getReceiverDTO() {
            return this.receiverDTO;
        }

            public void setItemList(SptItemDTO[] itemList) {
            this.itemList = itemList;
        }

        public SptItemDTO[] getItemList() {
            return this.itemList;
        }

        }


}