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

public class YouzanFenxiaoSupportOrderDetailGetResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 订单详情
     */
    private OrderResponseDTO response;

    public void setResponse(OrderResponseDTO response) {
        this.response = response;
    }

    public OrderResponseDTO getResponse() {
        return this.response;
    }

    public static class OrderResponseDTO {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "order_no")
        /**
        * 订单号
        */
        private String orderNo;
            @JsonProperty(value = "postage")
        /**
        * 邮费（分)
        */
        private Long postage;
            @JsonProperty(value = "buyer_id")
        /**
        * 买家id
        */
        private Long buyerId;
            @JsonProperty(value = "status")
        /**
        * 订单状态(10：待支付，50：待发货，60：已发货，80：已收货，99：已关闭，100：已完成）
        */
        private Long status;
            @JsonProperty(value = "refund_status")
        /**
        * 退款状态（0：没有维权，1：维权中，2：维权中-等待精选供货商收货，3：退货退款维权完成，4：仅退款维权完成）
        */
        private Long refundStatus;
            @JsonProperty(value = "origin_price")
        /**
        * 订单原价
        */
        private Long originPrice;
            @JsonProperty(value = "current_price")
        /**
        * 订单现价
        */
        private Long currentPrice;
            @JsonProperty(value = "item_total_price")
        /**
        * 商品总价（不包括邮费）
        */
        private Long itemTotalPrice;
            @JsonProperty(value = "real_price")
        /**
        * 实付价格
        */
        private Long realPrice;
            @JsonProperty(value = "book_time")
        /**
        * 下单时间
        */
        private Date bookTime;
            @JsonProperty(value = "pay_time")
        /**
        * 支付时间
        */
        private Date payTime;
            @JsonProperty(value = "ship_time")
        /**
        * 发货时间
        */
        private Date shipTime;
            @JsonProperty(value = "receive_time")
        /**
        * 收货时间
        */
        private Date receiveTime;
            @JsonProperty(value = "success_time")
        /**
        * 完成时间
        */
        private Date successTime;
            @JsonProperty(value = "close_time")
        /**
        * 关闭时间
        */
        private Date closeTime;
            @JsonProperty(value = "close_type")
        /**
        * 订单关闭原因类型
        */
        private Long closeType;
            @JsonProperty(value = "close_reason")
        /**
        * 订单关闭原因
        */
        private String closeReason;
            @JsonProperty(value = "source")
        /**
        * 订单来源
        */
        private String source;
            @JsonProperty(value = "memo")
        /**
        * 买家留言
        */
        private String memo;
            @JsonProperty(value = "star")
        /**
        * 订单加星数
        */
        private Long star;
            @JsonProperty(value = "seller_memo")
        /**
        * 商家留言
        */
        private String sellerMemo;
            @JsonProperty(value = "item_list")
        /**
        * 订单商品信息
        */
        private ItemDTO[] itemList;
            @JsonProperty(value = "receiver")
        /**
        * 收货人信息
        */
        private ReceiverDTO receiver;
            @JsonProperty(value = "package_list")
        /**
        * 物流包裹信息
        */
        private PackageInfo[] packageList;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderNo() {
            return this.orderNo;
        }

            public void setPostage(Long postage) {
            this.postage = postage;
        }

        public Long getPostage() {
            return this.postage;
        }

            public void setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
        }

        public Long getBuyerId() {
            return this.buyerId;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setRefundStatus(Long refundStatus) {
            this.refundStatus = refundStatus;
        }

        public Long getRefundStatus() {
            return this.refundStatus;
        }

            public void setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
        }

        public Long getOriginPrice() {
            return this.originPrice;
        }

            public void setCurrentPrice(Long currentPrice) {
            this.currentPrice = currentPrice;
        }

        public Long getCurrentPrice() {
            return this.currentPrice;
        }

            public void setItemTotalPrice(Long itemTotalPrice) {
            this.itemTotalPrice = itemTotalPrice;
        }

        public Long getItemTotalPrice() {
            return this.itemTotalPrice;
        }

            public void setRealPrice(Long realPrice) {
            this.realPrice = realPrice;
        }

        public Long getRealPrice() {
            return this.realPrice;
        }

            public void setBookTime(Date bookTime) {
            this.bookTime = bookTime;
        }

        public Date getBookTime() {
            return this.bookTime;
        }

            public void setPayTime(Date payTime) {
            this.payTime = payTime;
        }

        public Date getPayTime() {
            return this.payTime;
        }

            public void setShipTime(Date shipTime) {
            this.shipTime = shipTime;
        }

        public Date getShipTime() {
            return this.shipTime;
        }

            public void setReceiveTime(Date receiveTime) {
            this.receiveTime = receiveTime;
        }

        public Date getReceiveTime() {
            return this.receiveTime;
        }

            public void setSuccessTime(Date successTime) {
            this.successTime = successTime;
        }

        public Date getSuccessTime() {
            return this.successTime;
        }

            public void setCloseTime(Date closeTime) {
            this.closeTime = closeTime;
        }

        public Date getCloseTime() {
            return this.closeTime;
        }

            public void setCloseType(Long closeType) {
            this.closeType = closeType;
        }

        public Long getCloseType() {
            return this.closeType;
        }

            public void setCloseReason(String closeReason) {
            this.closeReason = closeReason;
        }

        public String getCloseReason() {
            return this.closeReason;
        }

            public void setSource(String source) {
            this.source = source;
        }

        public String getSource() {
            return this.source;
        }

            public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getMemo() {
            return this.memo;
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

            public void setItemList(ItemDTO[] itemList) {
            this.itemList = itemList;
        }

        public ItemDTO[] getItemList() {
            return this.itemList;
        }

            public void setReceiver(ReceiverDTO receiver) {
            this.receiver = receiver;
        }

        public ReceiverDTO getReceiver() {
            return this.receiver;
        }

            public void setPackageList(PackageInfo[] packageList) {
            this.packageList = packageList;
        }

        public PackageInfo[] getPackageList() {
            return this.packageList;
        }

        }

    public static class ItemDTO {
            @JsonProperty(value = "order_item_id")
        /**
        * 订单商品id
        */
        private Long orderItemId;
            @JsonProperty(value = "title")
        /**
        * 商品标题
        */
        private String title;
            @JsonProperty(value = "sku")
        /**
        * sku信息
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
            @JsonProperty(value = "num")
        /**
        * 商品数量
        */
        private Long num;
            @JsonProperty(value = "code")
        /**
        * 商品code
        */
        private String code;
            @JsonProperty(value = "memo")
        /**
        * 买家留言
        */
        private String memo;
            @JsonProperty(value = "price")
        /**
        * 商品价格
        */
        private Long price;
            @JsonProperty(value = "delivery_status")
        /**
        * 发货状态（0：已发货，1：已发货）
        */
        private Long deliveryStatus;
            @JsonProperty(value = "refund_status")
        /**
        * 商品退款状态（0：没有维权，1：维权中，2：维权中-等待精选供货商收货，3：退货退款维权完成，4：仅退款维权完成）
        */
        private Long refundStatus;
            @JsonProperty(value = "refund_package_info")
        /**
        * 退款包裹信息
        */
        private RefundPackageInfo refundPackageInfo;
    
            public void setOrderItemId(Long orderItemId) {
            this.orderItemId = orderItemId;
        }

        public Long getOrderItemId() {
            return this.orderItemId;
        }

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

            public void setCode(String code) {
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }

            public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getMemo() {
            return this.memo;
        }

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setDeliveryStatus(Long deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
        }

        public Long getDeliveryStatus() {
            return this.deliveryStatus;
        }

            public void setRefundStatus(Long refundStatus) {
            this.refundStatus = refundStatus;
        }

        public Long getRefundStatus() {
            return this.refundStatus;
        }

            public void setRefundPackageInfo(RefundPackageInfo refundPackageInfo) {
            this.refundPackageInfo = refundPackageInfo;
        }

        public RefundPackageInfo getRefundPackageInfo() {
            return this.refundPackageInfo;
        }

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

    public static class PackageInfo {
            @JsonProperty(value = "package_id")
        /**
        * 包裹号
        */
        private Long packageId;
            @JsonProperty(value = "delivery_type")
        /**
        * 发货类型（默认为快递）
        */
        private String deliveryType;
            @JsonProperty(value = "express_time")
        /**
        * 发货时间
        */
        private Date expressTime;
            @JsonProperty(value = "express_name")
        /**
        * 物流公司
        */
        private String expressName;
            @JsonProperty(value = "express_no")
        /**
        * 物流单号
        */
        private String expressNo;
            @JsonProperty(value = "operator_name")
        /**
        * 发货人
        */
        private String operatorName;
            @JsonProperty(value = "package_item_list")
        /**
        * 包裹商品信息
        */
        private PackageItem[] packageItemList;
            @JsonProperty(value = "express_info")
        /**
        * 物流信息
        */
        private SptExpressInfo expressInfo;
    
            public void setPackageId(Long packageId) {
            this.packageId = packageId;
        }

        public Long getPackageId() {
            return this.packageId;
        }

            public void setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
        }

        public String getDeliveryType() {
            return this.deliveryType;
        }

            public void setExpressTime(Date expressTime) {
            this.expressTime = expressTime;
        }

        public Date getExpressTime() {
            return this.expressTime;
        }

            public void setExpressName(String expressName) {
            this.expressName = expressName;
        }

        public String getExpressName() {
            return this.expressName;
        }

            public void setExpressNo(String expressNo) {
            this.expressNo = expressNo;
        }

        public String getExpressNo() {
            return this.expressNo;
        }

            public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getOperatorName() {
            return this.operatorName;
        }

            public void setPackageItemList(PackageItem[] packageItemList) {
            this.packageItemList = packageItemList;
        }

        public PackageItem[] getPackageItemList() {
            return this.packageItemList;
        }

            public void setExpressInfo(SptExpressInfo expressInfo) {
            this.expressInfo = expressInfo;
        }

        public SptExpressInfo getExpressInfo() {
            return this.expressInfo;
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

    public static class PackageItem {
            @JsonProperty(value = "title")
        /**
        * 商品标题
        */
        private String title;
            @JsonProperty(value = "picture")
        /**
        * 商品图片信息
        */
        private String picture;
            @JsonProperty(value = "num")
        /**
        * 商品数量
        */
        private Long num;
    
            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
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

        }

    public static class SptExpressInfo {
            @JsonProperty(value = "state")
        /**
        * 状态：0：在途 1：揽件 2：疑难 3：签收 4：退签 5：派件 6：退回
        */
        private Long state;
            @JsonProperty(value = "data")
        /**
        * 物流详情json
        */
        private String data;
    
            public void setState(Long state) {
            this.state = state;
        }

        public Long getState() {
            return this.state;
        }

            public void setData(String data) {
            this.data = data;
        }

        public String getData() {
            return this.data;
        }

        }

    public static class RefundPackageInfo {
            @JsonProperty(value = "express_name")
        /**
        * 物流公司
        */
        private String expressName;
            @JsonProperty(value = "express_no")
        /**
        * 物流单号
        */
        private String expressNo;
    
            public void setExpressName(String expressName) {
            this.expressName = expressName;
        }

        public String getExpressName() {
            return this.expressName;
        }

            public void setExpressNo(String expressNo) {
            this.expressNo = expressNo;
        }

        public String getExpressNo() {
            return this.expressNo;
        }

        }


}