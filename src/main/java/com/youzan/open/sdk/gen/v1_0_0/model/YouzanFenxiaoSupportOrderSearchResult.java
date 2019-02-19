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

public class YouzanFenxiaoSupportOrderSearchResult implements APIResult {

    @JsonProperty(value = "total")
    /**
     * 订单总数
     */
    private Long total;
    @JsonProperty(value = "page_size")
    /**
     * 10
     */
    private Long pageSize;
    @JsonProperty(value = "page")
    /**
     * 2
     */
    private Long page;
    @JsonProperty(value = "data_list")
    /**
     * 订单列表
     */
    private OrderSimpleResponseDTO[] dataList;

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotal() {
        return this.total;
    }
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }
    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPage() {
        return this.page;
    }
    public void setDataList(OrderSimpleResponseDTO[] dataList) {
        this.dataList = dataList;
    }

    public OrderSimpleResponseDTO[] getDataList() {
        return this.dataList;
    }

    public static class ItemSimpleDTO {
            @JsonProperty(value = "title")
        /**
        * 商品标题
        */
        private String title;
            @JsonProperty(value = "sku")
        /**
        * 商品sku json信息
        */
        private String sku;
            @JsonProperty(value = "url")
        /**
        * 商品url
        */
        private String url;
            @JsonProperty(value = "picture")
        /**
        * 商品图片信息
        */
        private String picture;
            @JsonProperty(value = "price")
        /**
        * 商品价格（分）
        */
        private Long price;
            @JsonProperty(value = "num")
        /**
        * 商品数量
        */
        private Long num;
            @JsonProperty(value = "code")
        /**
        * 商品编码
        */
        private String code;
    
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

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setCode(String code) {
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }

        }

    public static class OrderSimpleResponseDTO {
            @JsonProperty(value = "order_no")
        /**
        * 订单号
        */
        private String orderNo;
            @JsonProperty(value = "book_time")
        /**
        * 下单时间
        */
        private Date bookTime;
            @JsonProperty(value = "postage")
        /**
        * 邮费（分）
        */
        private Long postage;
            @JsonProperty(value = "status")
        /**
        * 订单状态(10：待支付，50：待发货，60：已发货，80：已收货，99：已关闭，100：已完成）
        */
        private Long status;
            @JsonProperty(value = "real_price")
        /**
        * 实付金额（分）
        */
        private Long realPrice;
            @JsonProperty(value = "current_price")
        /**
        * 订单价格（分）
        */
        private Long currentPrice;
            @JsonProperty(value = "refund_status")
        /**
        * 退款状态（0：没有维权，1：维权中，2：维权中-等待精选供货商收货，3：退货退款维权完成，4：仅退款维权完成）
        */
        private Long refundStatus;
            @JsonProperty(value = "star")
        /**
        * 订单加星（0-5）
        */
        private Long star;
            @JsonProperty(value = "seller_memo")
        /**
        * 卖家留言
        */
        private String sellerMemo;
            @JsonProperty(value = "receiver")
        /**
        * 收货人基本信息
        */
        private ReceiverSimpleDTO receiver;
            @JsonProperty(value = "item_list")
        /**
        * 商品基本信息
        */
        private ItemSimpleDTO[] itemList;
    
            public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderNo() {
            return this.orderNo;
        }

            public void setBookTime(Date bookTime) {
            this.bookTime = bookTime;
        }

        public Date getBookTime() {
            return this.bookTime;
        }

            public void setPostage(Long postage) {
            this.postage = postage;
        }

        public Long getPostage() {
            return this.postage;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setRealPrice(Long realPrice) {
            this.realPrice = realPrice;
        }

        public Long getRealPrice() {
            return this.realPrice;
        }

            public void setCurrentPrice(Long currentPrice) {
            this.currentPrice = currentPrice;
        }

        public Long getCurrentPrice() {
            return this.currentPrice;
        }

            public void setRefundStatus(Long refundStatus) {
            this.refundStatus = refundStatus;
        }

        public Long getRefundStatus() {
            return this.refundStatus;
        }

            public void setStar(Long star) {
            this.star = star;
        }

        public Long getStar() {
            return this.star;
        }

            public void setSellerMemo(String sellerMemo) {
            this.sellerMemo = sellerMemo;
        }

        public String getSellerMemo() {
            return this.sellerMemo;
        }

            public void setReceiver(ReceiverSimpleDTO receiver) {
            this.receiver = receiver;
        }

        public ReceiverSimpleDTO getReceiver() {
            return this.receiver;
        }

            public void setItemList(ItemSimpleDTO[] itemList) {
            this.itemList = itemList;
        }

        public ItemSimpleDTO[] getItemList() {
            return this.itemList;
        }

        }

    public static class ReceiverSimpleDTO {
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

        }


}