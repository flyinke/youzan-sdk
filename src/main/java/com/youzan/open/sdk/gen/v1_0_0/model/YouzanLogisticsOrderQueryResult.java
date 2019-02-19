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

public class YouzanLogisticsOrderQueryResult implements APIResult {

    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "delivery_order")
    /**
     * 物流平台运单号
     */
    private String deliveryOrder;
    @JsonProperty(value = "order_id")
    /**
     * 订单Id
     */
    private String orderId;
    @JsonProperty(value = "pack_id")
    /**
     * 包裹订单
     */
    private String packId;
    @JsonProperty(value = "delivery_yype")
    /**
     * 快递方式
     */
    private Long deliveryYype;
    @JsonProperty(value = "send_type")
    /**
     * 配送方式
     */
    private Long sendType;
    @JsonProperty(value = "express_detail_model")
    /**
     * 物流快递订单详情
     */
    private ExpressDetailModel expressDetailModel;
    @JsonProperty(value = "takeout_detail_model")
    /**
     * 同城送订单详情
     */
    private TakeoutDetailModel takeoutDetailModel;

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setDeliveryOrder(String deliveryOrder) {
        this.deliveryOrder = deliveryOrder;
    }

    public String getDeliveryOrder() {
        return this.deliveryOrder;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return this.orderId;
    }
    public void setPackId(String packId) {
        this.packId = packId;
    }

    public String getPackId() {
        return this.packId;
    }
    public void setDeliveryYype(Long deliveryYype) {
        this.deliveryYype = deliveryYype;
    }

    public Long getDeliveryYype() {
        return this.deliveryYype;
    }
    public void setSendType(Long sendType) {
        this.sendType = sendType;
    }

    public Long getSendType() {
        return this.sendType;
    }
    public void setExpressDetailModel(ExpressDetailModel expressDetailModel) {
        this.expressDetailModel = expressDetailModel;
    }

    public ExpressDetailModel getExpressDetailModel() {
        return this.expressDetailModel;
    }
    public void setTakeoutDetailModel(TakeoutDetailModel takeoutDetailModel) {
        this.takeoutDetailModel = takeoutDetailModel;
    }

    public TakeoutDetailModel getTakeoutDetailModel() {
        return this.takeoutDetailModel;
    }

    public static class ExpressDetailModel {
            @JsonProperty(value = "waybill_state")
        /**
        * 电子面单状态
        */
        private Long waybillState;
            @JsonProperty(value = "waybill_fail_msg")
        /**
        * 面单状态99失败时返回
        */
        private String waybillFailMsg;
            @JsonProperty(value = "express_state")
        /**
        * 物流状态
        */
        private Long expressState;
            @JsonProperty(value = "buyer_name")
        /**
        * 收货人姓名
        */
        private String buyerName;
            @JsonProperty(value = "buyer_phone")
        /**
        * 收货人手机号码
        */
        private String buyerPhone;
            @JsonProperty(value = "buyer_detail_address")
        /**
        * 收货人详细地址
        */
        private String buyerDetailAddress;
            @JsonProperty(value = "seller_name")
        /**
        * 发货人姓名
        */
        private String sellerName;
            @JsonProperty(value = "seller_phone")
        /**
        * 发货人联系方式
        */
        private String sellerPhone;
            @JsonProperty(value = "seller_detail_address")
        /**
        * 发货人详细地址
        */
        private String sellerDetailAddress;
            @JsonProperty(value = "order_date")
        /**
        * 下单时间
        */
        private String orderDate;
            @JsonProperty(value = "pre_pay_amount")
        /**
        * 预扣运费
        */
        private Long prePayAmount;
            @JsonProperty(value = "weight")
        /**
        * 商家输入重量
        */
        private Long weight;
            @JsonProperty(value = "third_weight")
        /**
        * 第三方重量
        */
        private Long thirdWeight;
            @JsonProperty(value = "actual_amount")
        /**
        * 实际运费
        */
        private Long actualAmount;
            @JsonProperty(value = "pay_state")
        /**
        * 支付状态
        */
        private Long payState;
            @JsonProperty(value = "type")
        /**
        * 发货类型  1：电子面单  2：电子面单+上门取件
        */
        private Long type;
            @JsonProperty(value = "lattice_point_name")
        /**
        * 网点名称
        */
        private String latticePointName;
            @JsonProperty(value = "appointment_date")
        /**
        * 预约时间
        */
        private Date appointmentDate;
            @JsonProperty(value = "way_bill_user")
        /**
        * 客户号
        */
        private String wayBillUser;
            @JsonProperty(value = "delivery_no")
        /**
        * 物流平台内部订单号
        */
        private String deliveryNo;
            @JsonProperty(value = "express_no")
        /**
        * 物流单号
        */
        private String expressNo;
            @JsonProperty(value = "express_id")
        /**
        * 物流公司id
        */
        private Long expressId;
            @JsonProperty(value = "source_id")
        /**
        * 系统来源id， 1001有赞餐饮，1002有赞微商城
        */
        private Long sourceId;
            @JsonProperty(value = "state")
        /**
        * 0：在途 1：揽件 2：疑难 3：签收 4：退签 5：派件 6：退回
        */
        private Long state;
            @JsonProperty(value = "message")
        /**
        * 物流信息
        */
        private String message;
            @JsonProperty(value = "express_name")
        /**
        * 物流公司名称
        */
        private String expressName;
            @JsonProperty(value = "com")
        /**
        * 物流公司编号
        */
        private String com;
            @JsonProperty(value = "data")
        /**
        * 物流详情信息，返回json字符串，例如：[
    {
        "context": "已签收,签收人是:【邮件签收章】", 
        "time": "2018-11-21 10:25:48", 
        "status": "签收"
    }, 
    {
        "context": "【浙江杭州康桥公司】的【xxx 手机(13811112222)】正在派件,扫描员是【xxx】", 
        "time": "2018-11-21 01:43:00", 
        "status": "派送"
    }
]
        */
        private String data;
    
            public void setWaybillState(Long waybillState) {
            this.waybillState = waybillState;
        }

        public Long getWaybillState() {
            return this.waybillState;
        }

            public void setWaybillFailMsg(String waybillFailMsg) {
            this.waybillFailMsg = waybillFailMsg;
        }

        public String getWaybillFailMsg() {
            return this.waybillFailMsg;
        }

            public void setExpressState(Long expressState) {
            this.expressState = expressState;
        }

        public Long getExpressState() {
            return this.expressState;
        }

            public void setBuyerName(String buyerName) {
            this.buyerName = buyerName;
        }

        public String getBuyerName() {
            return this.buyerName;
        }

            public void setBuyerPhone(String buyerPhone) {
            this.buyerPhone = buyerPhone;
        }

        public String getBuyerPhone() {
            return this.buyerPhone;
        }

            public void setBuyerDetailAddress(String buyerDetailAddress) {
            this.buyerDetailAddress = buyerDetailAddress;
        }

        public String getBuyerDetailAddress() {
            return this.buyerDetailAddress;
        }

            public void setSellerName(String sellerName) {
            this.sellerName = sellerName;
        }

        public String getSellerName() {
            return this.sellerName;
        }

            public void setSellerPhone(String sellerPhone) {
            this.sellerPhone = sellerPhone;
        }

        public String getSellerPhone() {
            return this.sellerPhone;
        }

            public void setSellerDetailAddress(String sellerDetailAddress) {
            this.sellerDetailAddress = sellerDetailAddress;
        }

        public String getSellerDetailAddress() {
            return this.sellerDetailAddress;
        }

            public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }

        public String getOrderDate() {
            return this.orderDate;
        }

            public void setPrePayAmount(Long prePayAmount) {
            this.prePayAmount = prePayAmount;
        }

        public Long getPrePayAmount() {
            return this.prePayAmount;
        }

            public void setWeight(Long weight) {
            this.weight = weight;
        }

        public Long getWeight() {
            return this.weight;
        }

            public void setThirdWeight(Long thirdWeight) {
            this.thirdWeight = thirdWeight;
        }

        public Long getThirdWeight() {
            return this.thirdWeight;
        }

            public void setActualAmount(Long actualAmount) {
            this.actualAmount = actualAmount;
        }

        public Long getActualAmount() {
            return this.actualAmount;
        }

            public void setPayState(Long payState) {
            this.payState = payState;
        }

        public Long getPayState() {
            return this.payState;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setLatticePointName(String latticePointName) {
            this.latticePointName = latticePointName;
        }

        public String getLatticePointName() {
            return this.latticePointName;
        }

            public void setAppointmentDate(Date appointmentDate) {
            this.appointmentDate = appointmentDate;
        }

        public Date getAppointmentDate() {
            return this.appointmentDate;
        }

            public void setWayBillUser(String wayBillUser) {
            this.wayBillUser = wayBillUser;
        }

        public String getWayBillUser() {
            return this.wayBillUser;
        }

            public void setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        public String getDeliveryNo() {
            return this.deliveryNo;
        }

            public void setExpressNo(String expressNo) {
            this.expressNo = expressNo;
        }

        public String getExpressNo() {
            return this.expressNo;
        }

            public void setExpressId(Long expressId) {
            this.expressId = expressId;
        }

        public Long getExpressId() {
            return this.expressId;
        }

            public void setSourceId(Long sourceId) {
            this.sourceId = sourceId;
        }

        public Long getSourceId() {
            return this.sourceId;
        }

            public void setState(Long state) {
            this.state = state;
        }

        public Long getState() {
            return this.state;
        }

            public void setMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }

            public void setExpressName(String expressName) {
            this.expressName = expressName;
        }

        public String getExpressName() {
            return this.expressName;
        }

            public void setCom(String com) {
            this.com = com;
        }

        public String getCom() {
            return this.com;
        }

            public void setData(String data) {
            this.data = data;
        }

        public String getData() {
            return this.data;
        }

        }

    public static class TakeoutDetailModel {
            @JsonProperty(value = "delivery_no")
        /**
        * 物流平台包裹单
        */
        private String deliveryNo;
            @JsonProperty(value = "status_code")
        /**
        * 状态编码
        */
        private Long statusCode;
            @JsonProperty(value = "status_msg")
        /**
        * 订单状态
        */
        private Long statusMsg;
            @JsonProperty(value = "delivery_channel")
        /**
        * 第三方 1：达达 2：蜂鸟
        */
        private Long deliveryChannel;
            @JsonProperty(value = "cancel_reason")
        /**
        * 订单取消原因
        */
        private String cancelReason;
            @JsonProperty(value = "transporter_name")
        /**
        * 骑手姓名
        */
        private String transporterName;
            @JsonProperty(value = "transporter_phone")
        /**
        * 骑手电话
        */
        private String transporterPhone;
            @JsonProperty(value = "transporter_lng")
        /**
        * 骑手经度
        */
        private String transporterLng;
            @JsonProperty(value = "transporter_lat")
        /**
        * 骑手纬度
        */
        private String transporterLat;
            @JsonProperty(value = "tip_fee")
        /**
        * 小费,单位为分
        */
        private Long tipFee;
            @JsonProperty(value = "delivery_fee")
        /**
        * 配送费,单位为分
        */
        private Long deliveryFee;
            @JsonProperty(value = "distance")
        /**
        * 配送距离,单位为米
        */
        private Long distance;
            @JsonProperty(value = "create_time")
        /**
        * 发单时间
        */
        private String createTime;
            @JsonProperty(value = "accept_time")
        /**
        * 接单时间,若未接单,则为空
        */
        private String acceptTime;
            @JsonProperty(value = "fetch_time")
        /**
        * 取货时间,若未取货,则为空
        */
        private String fetchTime;
            @JsonProperty(value = "finish_time")
        /**
        * 送达时间,若未送达,则为空
        */
        private String finishTime;
            @JsonProperty(value = "cancel_time")
        /**
        * 取消时间,若未取消,则为空
        */
        private String cancelTime;
            @JsonProperty(value = "expire_time")
        /**
        * 过期时间,若未过期,则为空
        */
        private String expireTime;
            @JsonProperty(value = "deduct_fee")
        /**
        * 退款违约金，单位为分
        */
        private Long deductFee;
    
            public void setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        public String getDeliveryNo() {
            return this.deliveryNo;
        }

            public void setStatusCode(Long statusCode) {
            this.statusCode = statusCode;
        }

        public Long getStatusCode() {
            return this.statusCode;
        }

            public void setStatusMsg(Long statusMsg) {
            this.statusMsg = statusMsg;
        }

        public Long getStatusMsg() {
            return this.statusMsg;
        }

            public void setDeliveryChannel(Long deliveryChannel) {
            this.deliveryChannel = deliveryChannel;
        }

        public Long getDeliveryChannel() {
            return this.deliveryChannel;
        }

            public void setCancelReason(String cancelReason) {
            this.cancelReason = cancelReason;
        }

        public String getCancelReason() {
            return this.cancelReason;
        }

            public void setTransporterName(String transporterName) {
            this.transporterName = transporterName;
        }

        public String getTransporterName() {
            return this.transporterName;
        }

            public void setTransporterPhone(String transporterPhone) {
            this.transporterPhone = transporterPhone;
        }

        public String getTransporterPhone() {
            return this.transporterPhone;
        }

            public void setTransporterLng(String transporterLng) {
            this.transporterLng = transporterLng;
        }

        public String getTransporterLng() {
            return this.transporterLng;
        }

            public void setTransporterLat(String transporterLat) {
            this.transporterLat = transporterLat;
        }

        public String getTransporterLat() {
            return this.transporterLat;
        }

            public void setTipFee(Long tipFee) {
            this.tipFee = tipFee;
        }

        public Long getTipFee() {
            return this.tipFee;
        }

            public void setDeliveryFee(Long deliveryFee) {
            this.deliveryFee = deliveryFee;
        }

        public Long getDeliveryFee() {
            return this.deliveryFee;
        }

            public void setDistance(Long distance) {
            this.distance = distance;
        }

        public Long getDistance() {
            return this.distance;
        }

            public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateTime() {
            return this.createTime;
        }

            public void setAcceptTime(String acceptTime) {
            this.acceptTime = acceptTime;
        }

        public String getAcceptTime() {
            return this.acceptTime;
        }

            public void setFetchTime(String fetchTime) {
            this.fetchTime = fetchTime;
        }

        public String getFetchTime() {
            return this.fetchTime;
        }

            public void setFinishTime(String finishTime) {
            this.finishTime = finishTime;
        }

        public String getFinishTime() {
            return this.finishTime;
        }

            public void setCancelTime(String cancelTime) {
            this.cancelTime = cancelTime;
        }

        public String getCancelTime() {
            return this.cancelTime;
        }

            public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }

        public String getExpireTime() {
            return this.expireTime;
        }

            public void setDeductFee(Long deductFee) {
            this.deductFee = deductFee;
        }

        public Long getDeductFee() {
            return this.deductFee;
        }

        }


}