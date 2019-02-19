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

public class YouzanTradesSoldGetResult implements APIResult {

    @JsonProperty(value = "total_results")
    /**
     * 搜索到的交易总数
     */
    private Long totalResults;
    @JsonProperty(value = "trades")
    /**
     * 搜索到的交易列表

     */
    private TradeDetailV2[] trades;
    @JsonProperty(value = "has_next")
    /**
     * 是否存在下一页

     */
    private Boolean hasNext;

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
    public void setTrades(TradeDetailV2[] trades) {
        this.trades = trades;
    }

    public TradeDetailV2[] getTrades() {
        return this.trades;
    }
    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Boolean getHasNext() {
        return this.hasNext;
    }

    public static class HotelInfo {
            @JsonProperty(value = "check_in_time")
        /**
        * 入住时间
        */
        private String checkInTime;
            @JsonProperty(value = "check_out_time")
        /**
        * 退房时间
        */
        private String checkOutTime;
            @JsonProperty(value = "accommodates")
        /**
        * 入住人信息
        */
        private String[] accommodates;
    
            public void setCheckInTime(String checkInTime) {
            this.checkInTime = checkInTime;
        }

        public String getCheckInTime() {
            return this.checkInTime;
        }

            public void setCheckOutTime(String checkOutTime) {
            this.checkOutTime = checkOutTime;
        }

        public String getCheckOutTime() {
            return this.checkOutTime;
        }

            public void setAccommodates(String[] accommodates) {
            this.accommodates = accommodates;
        }

        public String[] getAccommodates() {
            return this.accommodates;
        }

        }

    public static class TradeDetailV2 {
            @JsonProperty(value = "tid")
        /**
        * 交易编号
        */
        private String tid;
            @JsonProperty(value = "num")
        /**
        * 商品购买数量。当一个trade对应多个order的时候，值为所有商品购买数量之和
        */
        private Long num;
            @JsonProperty(value = "item_id")
        /**
        * 商品数字编号。当一个trade对应多个order的时候，值为第一个交易明细中的商品的编号
        */
        private Long itemId;
            @JsonProperty(value = "price")
        /**
        * 商品价格。精确到2位小数；单位：元。当一个trade对应多个order的时候，值为第一个交易明细中的商品的价格
        */
        private Float price;
            @JsonProperty(value = "pic_path")
        /**
        * 商品主图片地址。当一个trade对应多个order的时候，值为第一个交易明细中的商品的图片地址
        */
        private String picPath;
            @JsonProperty(value = "pic_thumb_path")
        /**
        * 商品主图片缩略图地址
        */
        private String picThumbPath;
            @JsonProperty(value = "title")
        /**
        * 交易标题，以首个商品标题作为此标题的值
        */
        private String title;
            @JsonProperty(value = "type")
        /**
        * 交易类型。取值范围：<br>
FIXED （一口价）<br>
GIFT （送礼）<br>
BULK_PURCHASE（来自分销商的采购）<br>
PRESENT （赠品领取）<br>
GROUP （拼团订单）<br>
PIFA （批发订单）<br>
COD （货到付款）<br>
PEER （代付）<br>
QRCODE（扫码商家二维码直接支付的交易）<br>
QRCODE_3RD（线下收银台二维码交易)
        */
        private String type;
            @JsonProperty(value = "buyer_message")
        /**
        * 买家购买附言
        */
        private String buyerMessage;
            @JsonProperty(value = "seller_flag")
        /**
        * 卖家备注星标，取值范围 1、2、3、4、5；<br>如果为0，表示没有备注星标
        */
        private Long sellerFlag;
            @JsonProperty(value = "trade_memo")
        /**
        * 卖家对该交易的备注
        */
        private String tradeMemo;
            @JsonProperty(value = "receiver_city")
        /**
        * 收货人的所在城市。<br>
PS：如果订单类型是送礼订单，收货地址在sub_trades字段中；如果物流方式是到店自提，收货地址在fetch_detail字段中
        */
        private String receiverCity;
            @JsonProperty(value = "receiver_district")
        /**
        * 收货人的所在地区
        */
        private String receiverDistrict;
            @JsonProperty(value = "receiver_name")
        /**
        * 收货人的姓名
        */
        private String receiverName;
            @JsonProperty(value = "receiver_state")
        /**
        * 收货人的所在省份
        */
        private String receiverState;
            @JsonProperty(value = "receiver_address")
        /**
        * 收货人的详细地址
        */
        private String receiverAddress;
            @JsonProperty(value = "receiver_zip")
        /**
        * 收货人的邮编
        */
        private String receiverZip;
            @JsonProperty(value = "receiver_mobile")
        /**
        * 收货人的手机号码
        */
        private String receiverMobile;
            @JsonProperty(value = "feedback")
        /**
        * 交易维权状态。<br>
				0 无维权，1 顾客发起维权，2 顾客拒绝商家的处理结果，3 顾客接受商家的处理结果，9 商家正在处理,101 维权处理中,110 维权结束。<br>
		        备注：1到10的状态码是微信维权状态码，100以上的状态码是有赞维权状态码
        */
        private Long feedback;
            @JsonProperty(value = "refund_state")
        /**
        * 退款状态。取值范围：<br>
NO_REFUND（无退款）<br>
PARTIAL_REFUNDING（部分退款中）<br>
PARTIAL_REFUNDED（已部分退款）<br>
PARTIAL_REFUND_FAILED（部分退款失败）<br>
FULL_REFUNDING（全额退款中）<br>
FULL_REFUNDED（已全额退款）<br>
FULL_REFUND_FAILED（全额退款失败）<br>
        */
        private String refundState;
            @JsonProperty(value = "outer_tid")
        /**
        * 外部交易编号。比如，如果支付方式是微信支付，就是财付通的交易单号
        */
        private String outerTid;
            @JsonProperty(value = "transaction_tid")
        /**
        * 支付流水号
        */
        private String transactionTid;
            @JsonProperty(value = "status")
        /**
        * 交易状态。取值范围：<br>
TRADE_NO_CREATE_PAY (没有创建支付交易) <br>
WAIT_BUYER_PAY (等待买家付款) <br>
WAIT_PAY_RETURN (等待支付确认) <br>
WAIT_GROUP（等待成团，即：买家已付款，等待成团）<br>
WAIT_SELLER_SEND_GOODS (等待卖家发货，即：买家已付款) <br>
WAIT_BUYER_CONFIRM_GOODS (等待买家确认收货，即：卖家已发货) <br>
TRADE_BUYER_SIGNED (买家已签收) <br>
TRADE_CLOSED (付款以后用户退款成功，交易自动关
        */
        private String status;
            @JsonProperty(value = "shipping_type")
        /**
        * 创建交易时的物流方式。取值范围：express（快递），fetch（到店自提），local（同城配送）
        */
        private String shippingType;
            @JsonProperty(value = "post_fee")
        /**
        * 运费。单位：元，精确到分
        */
        private Float postFee;
            @JsonProperty(value = "total_fee")
        /**
        * 商品总价（商品价格乘以数量的总金额）。单位：元，精确到分
        */
        private Float totalFee;
            @JsonProperty(value = "refunded_fee")
        /**
        * 交易完成后退款的金额。单位：元，精确到分
        */
        private Float refundedFee;
            @JsonProperty(value = "discount_fee")
        /**
        * 交易优惠金额（不包含交易明细中的优惠金额）。单位：元，精确到分
        */
        private Float discountFee;
            @JsonProperty(value = "payment")
        /**
        * 实付金额。单位：元，精确到分
        */
        private Float payment;
            @JsonProperty(value = "created")
        /**
        * 交易创建时间
        */
        private Date created;
            @JsonProperty(value = "update_time")
        /**
        * 交易更新时间。当交易的：状态改变、备注更改、星标更改 等情况下都会刷新更新时间
        */
        private Date updateTime;
            @JsonProperty(value = "pay_time")
        /**
        * 买家付款时间
        */
        private Date payTime;
            @JsonProperty(value = "pay_type")
        /**
        * 支付类型。取值范围：
WEIXIN (微信自有支付)
WEIXIN_DAIXIAO (微信代销支付)
ALIPAY (支付宝支付)
BANKCARDPAY (银行卡支付)
PEERPAY (代付)
CODPAY (货到付款)
BAIDUPAY (百度钱包支付)
PRESENTTAKE (直接领取赠品)
COUPONPAY(优惠券/码全额抵扣)
BULKPURCHASE(来自分销商的采购)
MERGEDPAY(合并付货款)
ECARD(有赞E卡支付)
PURCHASE_PAY (采购单支付)
MARKPAY (标记收款)
OFCASH (现金支付)
PREPAIDCARD (储值卡余额支付)
        */
        private String payType;
            @JsonProperty(value = "consign_time")
        /**
        * 卖家发货时间
        */
        private Date consignTime;
            @JsonProperty(value = "sign_time")
        /**
        * 买家签收时间
        */
        private Date signTime;
            @JsonProperty(value = "buyer_area")
        /**
        * 买家下单的地区
        */
        private String buyerArea;
            @JsonProperty(value = "orders")
        /**
        * 交易明细数据结构
        */
        private TradeOrderV2[] orders;
            @JsonProperty(value = "fetch_detail")
        /**
        * 到店自提详情
        */
        private TradeFetch fetchDetail;
            @JsonProperty(value = "coupon_details")
        /**
        * 订单中使用到的卡券的数据结构
        */
        private UmpTradeCoupon[] couponDetails;
            @JsonProperty(value = "fans_info")
        /**
        * 用户信息
        */
        private FansInfo fansInfo;
            @JsonProperty(value = "hotel_info")
        /**
        * 酒店入住信息
        */
        private HotelInfo hotelInfo;
            @JsonProperty(value = "promotion_details")
        /**
        * 订单中使用到的优惠活动的数据结构
        */
        private TradePromotion[] promotionDetails;
            @JsonProperty(value = "adjust_fee")
        /**
        * 改价信息
        */
        private AdjustFee adjustFee;
            @JsonProperty(value = "sub_trades")
        /**
        * 交易中包含的子交易，目前：仅在送礼订单中会有子交易
        */
        private TradeDetailV2[] subTrades;
            @JsonProperty(value = "relation_type")
        /**
        * 分销/采购单:source:采购单;fenxiao:分销单 空串则为非分销/采购单
        */
        private String relationType;
            @JsonProperty(value = "relations")
        /**
        * relation_type返回source时,为分销订单号列表<br>
返回fenxiao时,为供应商订单号列表<br>
返回空时,列表返回空
        */
        private String[] relations;
            @JsonProperty(value = "out_trade_no")
        /**
        * 代付订单外部交易号列表,非代付订单类型返回空
        */
        private String[] outTradeNo;
            @JsonProperty(value = "profit")
        /**
        * 利润（分销订单特有）。格式：5.20；单位：元；精确到：分
        */
        private Float profit;
            @JsonProperty(value = "handled")
        /**
        * 结算状态（分销订单特有）。1：已结算，0：未结算
        */
        private Long handled;
            @JsonProperty(value = "outer_user_id")
        /**
        * 三方APP用户id
        */
        private String outerUserId;
            @JsonProperty(value = "shop_id")
        /**
        * 多门店订单的门店id 非多门店订单则默认为0
        */
        private Long shopId;
            @JsonProperty(value = "offline_id")
        /**
        * 表示线下网点id，包含自提点和门店
        */
        private Long offlineId;
            @JsonProperty(value = "points_price")
        /**
        * 积分兑换订单，数值代表消耗的积分 非积分兑换订单默认为0
        */
        private Long pointsPrice;
            @JsonProperty(value = "tuan_no")
        /**
        * 拼团订单对应的团编号
        */
        private String tuanNo;
            @JsonProperty(value = "is_tuan_head")
        /**
        * 是否为团长订单 1 团长订单 0 非拼团订单 或 非团长订单
        */
        private Long isTuanHead;
            @JsonProperty(value = "qr_id")
        /**
        * 收银台订单的二维码id号
        */
        private Long qrId;
            @JsonProperty(value = "delivery_time_display")
        /**
        * 同城送订单送达时间
        */
        private String deliveryTimeDisplay;
            @JsonProperty(value = "id_card_number")
        /**
        * 海淘订单身份证信息
        */
        private String idCardNumber;
            @JsonProperty(value = "period_order_detail")
        /**
        * 周期购信息
        */
        private TradePeriodBuy periodOrderDetail;
            @JsonProperty(value = "lat")
        /**
        * 纬度
        */
        private String lat;
            @JsonProperty(value = "lng")
        /**
        * 经度
        */
        private String lng;
            @JsonProperty(value = "box_price")
        /**
        * 餐盒费
        */
        private Float boxPrice;
            @JsonProperty(value = "invoice_title")
        /**
        * 发票抬头
        */
        private String invoiceTitle;
            @JsonProperty(value = "status_str")
        /**
        * 订单状态描述:
待付款,待发货,待成团,待接单,已接单,已发货,已完成,已关闭
        */
        private String statusStr;
    
            public void setTid(String tid) {
            this.tid = tid;
        }

        public String getTid() {
            return this.tid;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setPrice(Float price) {
            this.price = price;
        }

        public Float getPrice() {
            return this.price;
        }

            public void setPicPath(String picPath) {
            this.picPath = picPath;
        }

        public String getPicPath() {
            return this.picPath;
        }

            public void setPicThumbPath(String picThumbPath) {
            this.picThumbPath = picThumbPath;
        }

        public String getPicThumbPath() {
            return this.picThumbPath;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

            public void setBuyerMessage(String buyerMessage) {
            this.buyerMessage = buyerMessage;
        }

        public String getBuyerMessage() {
            return this.buyerMessage;
        }

            public void setSellerFlag(Long sellerFlag) {
            this.sellerFlag = sellerFlag;
        }

        public Long getSellerFlag() {
            return this.sellerFlag;
        }

            public void setTradeMemo(String tradeMemo) {
            this.tradeMemo = tradeMemo;
        }

        public String getTradeMemo() {
            return this.tradeMemo;
        }

            public void setReceiverCity(String receiverCity) {
            this.receiverCity = receiverCity;
        }

        public String getReceiverCity() {
            return this.receiverCity;
        }

            public void setReceiverDistrict(String receiverDistrict) {
            this.receiverDistrict = receiverDistrict;
        }

        public String getReceiverDistrict() {
            return this.receiverDistrict;
        }

            public void setReceiverName(String receiverName) {
            this.receiverName = receiverName;
        }

        public String getReceiverName() {
            return this.receiverName;
        }

            public void setReceiverState(String receiverState) {
            this.receiverState = receiverState;
        }

        public String getReceiverState() {
            return this.receiverState;
        }

            public void setReceiverAddress(String receiverAddress) {
            this.receiverAddress = receiverAddress;
        }

        public String getReceiverAddress() {
            return this.receiverAddress;
        }

            public void setReceiverZip(String receiverZip) {
            this.receiverZip = receiverZip;
        }

        public String getReceiverZip() {
            return this.receiverZip;
        }

            public void setReceiverMobile(String receiverMobile) {
            this.receiverMobile = receiverMobile;
        }

        public String getReceiverMobile() {
            return this.receiverMobile;
        }

            public void setFeedback(Long feedback) {
            this.feedback = feedback;
        }

        public Long getFeedback() {
            return this.feedback;
        }

            public void setRefundState(String refundState) {
            this.refundState = refundState;
        }

        public String getRefundState() {
            return this.refundState;
        }

            public void setOuterTid(String outerTid) {
            this.outerTid = outerTid;
        }

        public String getOuterTid() {
            return this.outerTid;
        }

            public void setTransactionTid(String transactionTid) {
            this.transactionTid = transactionTid;
        }

        public String getTransactionTid() {
            return this.transactionTid;
        }

            public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }

            public void setShippingType(String shippingType) {
            this.shippingType = shippingType;
        }

        public String getShippingType() {
            return this.shippingType;
        }

            public void setPostFee(Float postFee) {
            this.postFee = postFee;
        }

        public Float getPostFee() {
            return this.postFee;
        }

            public void setTotalFee(Float totalFee) {
            this.totalFee = totalFee;
        }

        public Float getTotalFee() {
            return this.totalFee;
        }

            public void setRefundedFee(Float refundedFee) {
            this.refundedFee = refundedFee;
        }

        public Float getRefundedFee() {
            return this.refundedFee;
        }

            public void setDiscountFee(Float discountFee) {
            this.discountFee = discountFee;
        }

        public Float getDiscountFee() {
            return this.discountFee;
        }

            public void setPayment(Float payment) {
            this.payment = payment;
        }

        public Float getPayment() {
            return this.payment;
        }

            public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }

            public void setUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
        }

        public Date getUpdateTime() {
            return this.updateTime;
        }

            public void setPayTime(Date payTime) {
            this.payTime = payTime;
        }

        public Date getPayTime() {
            return this.payTime;
        }

            public void setPayType(String payType) {
            this.payType = payType;
        }

        public String getPayType() {
            return this.payType;
        }

            public void setConsignTime(Date consignTime) {
            this.consignTime = consignTime;
        }

        public Date getConsignTime() {
            return this.consignTime;
        }

            public void setSignTime(Date signTime) {
            this.signTime = signTime;
        }

        public Date getSignTime() {
            return this.signTime;
        }

            public void setBuyerArea(String buyerArea) {
            this.buyerArea = buyerArea;
        }

        public String getBuyerArea() {
            return this.buyerArea;
        }

            public void setOrders(TradeOrderV2[] orders) {
            this.orders = orders;
        }

        public TradeOrderV2[] getOrders() {
            return this.orders;
        }

            public void setFetchDetail(TradeFetch fetchDetail) {
            this.fetchDetail = fetchDetail;
        }

        public TradeFetch getFetchDetail() {
            return this.fetchDetail;
        }

            public void setCouponDetails(UmpTradeCoupon[] couponDetails) {
            this.couponDetails = couponDetails;
        }

        public UmpTradeCoupon[] getCouponDetails() {
            return this.couponDetails;
        }

            public void setFansInfo(FansInfo fansInfo) {
            this.fansInfo = fansInfo;
        }

        public FansInfo getFansInfo() {
            return this.fansInfo;
        }

            public void setHotelInfo(HotelInfo hotelInfo) {
            this.hotelInfo = hotelInfo;
        }

        public HotelInfo getHotelInfo() {
            return this.hotelInfo;
        }

            public void setPromotionDetails(TradePromotion[] promotionDetails) {
            this.promotionDetails = promotionDetails;
        }

        public TradePromotion[] getPromotionDetails() {
            return this.promotionDetails;
        }

            public void setAdjustFee(AdjustFee adjustFee) {
            this.adjustFee = adjustFee;
        }

        public AdjustFee getAdjustFee() {
            return this.adjustFee;
        }

            public void setSubTrades(TradeDetailV2[] subTrades) {
            this.subTrades = subTrades;
        }

        public TradeDetailV2[] getSubTrades() {
            return this.subTrades;
        }

            public void setRelationType(String relationType) {
            this.relationType = relationType;
        }

        public String getRelationType() {
            return this.relationType;
        }

            public void setRelations(String[] relations) {
            this.relations = relations;
        }

        public String[] getRelations() {
            return this.relations;
        }

            public void setOutTradeNo(String[] outTradeNo) {
            this.outTradeNo = outTradeNo;
        }

        public String[] getOutTradeNo() {
            return this.outTradeNo;
        }

            public void setProfit(Float profit) {
            this.profit = profit;
        }

        public Float getProfit() {
            return this.profit;
        }

            public void setHandled(Long handled) {
            this.handled = handled;
        }

        public Long getHandled() {
            return this.handled;
        }

            public void setOuterUserId(String outerUserId) {
            this.outerUserId = outerUserId;
        }

        public String getOuterUserId() {
            return this.outerUserId;
        }

            public void setShopId(Long shopId) {
            this.shopId = shopId;
        }

        public Long getShopId() {
            return this.shopId;
        }

            public void setOfflineId(Long offlineId) {
            this.offlineId = offlineId;
        }

        public Long getOfflineId() {
            return this.offlineId;
        }

            public void setPointsPrice(Long pointsPrice) {
            this.pointsPrice = pointsPrice;
        }

        public Long getPointsPrice() {
            return this.pointsPrice;
        }

            public void setTuanNo(String tuanNo) {
            this.tuanNo = tuanNo;
        }

        public String getTuanNo() {
            return this.tuanNo;
        }

            public void setIsTuanHead(Long isTuanHead) {
            this.isTuanHead = isTuanHead;
        }

        public Long getIsTuanHead() {
            return this.isTuanHead;
        }

            public void setQrId(Long qrId) {
            this.qrId = qrId;
        }

        public Long getQrId() {
            return this.qrId;
        }

            public void setDeliveryTimeDisplay(String deliveryTimeDisplay) {
            this.deliveryTimeDisplay = deliveryTimeDisplay;
        }

        public String getDeliveryTimeDisplay() {
            return this.deliveryTimeDisplay;
        }

            public void setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
        }

        public String getIdCardNumber() {
            return this.idCardNumber;
        }

            public void setPeriodOrderDetail(TradePeriodBuy periodOrderDetail) {
            this.periodOrderDetail = periodOrderDetail;
        }

        public TradePeriodBuy getPeriodOrderDetail() {
            return this.periodOrderDetail;
        }

            public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLat() {
            return this.lat;
        }

            public void setLng(String lng) {
            this.lng = lng;
        }

        public String getLng() {
            return this.lng;
        }

            public void setBoxPrice(Float boxPrice) {
            this.boxPrice = boxPrice;
        }

        public Float getBoxPrice() {
            return this.boxPrice;
        }

            public void setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
        }

        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

            public void setStatusStr(String statusStr) {
            this.statusStr = statusStr;
        }

        public String getStatusStr() {
            return this.statusStr;
        }

        }

    public static class TradeFetch {
            @JsonProperty(value = "fetcher_name")
        /**
        * 领取人（即：预约人）的姓名
        */
        private String fetcherName;
            @JsonProperty(value = "fetcher_mobile")
        /**
        * 领取人的手机号
        */
        private String fetcherMobile;
            @JsonProperty(value = "fetch_time")
        /**
        * 预约的领取时间。新版到店自提的数据格式:<br>
1: 2016-04-18 17:00-17:15<br>
2: 尽快到店提货
        */
        private String fetchTime;
            @JsonProperty(value = "shop_id")
        /**
        * 自提点id
        */
        private Long shopId;
            @JsonProperty(value = "shop_name")
        /**
        * 自提点名称
        */
        private String shopName;
            @JsonProperty(value = "shop_mobile")
        /**
        * 自提点联系方式
        */
        private String shopMobile;
            @JsonProperty(value = "shop_state")
        /**
        * 自提点所在省份
        */
        private String shopState;
            @JsonProperty(value = "shop_city")
        /**
        * 自提点所在城市
        */
        private String shopCity;
            @JsonProperty(value = "shop_district")
        /**
        * 自提点所在地区
        */
        private String shopDistrict;
            @JsonProperty(value = "shop_address")
        /**
        * 自提点详细地址
        */
        private String shopAddress;
    
            public void setFetcherName(String fetcherName) {
            this.fetcherName = fetcherName;
        }

        public String getFetcherName() {
            return this.fetcherName;
        }

            public void setFetcherMobile(String fetcherMobile) {
            this.fetcherMobile = fetcherMobile;
        }

        public String getFetcherMobile() {
            return this.fetcherMobile;
        }

            public void setFetchTime(String fetchTime) {
            this.fetchTime = fetchTime;
        }

        public String getFetchTime() {
            return this.fetchTime;
        }

            public void setShopId(Long shopId) {
            this.shopId = shopId;
        }

        public Long getShopId() {
            return this.shopId;
        }

            public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getShopName() {
            return this.shopName;
        }

            public void setShopMobile(String shopMobile) {
            this.shopMobile = shopMobile;
        }

        public String getShopMobile() {
            return this.shopMobile;
        }

            public void setShopState(String shopState) {
            this.shopState = shopState;
        }

        public String getShopState() {
            return this.shopState;
        }

            public void setShopCity(String shopCity) {
            this.shopCity = shopCity;
        }

        public String getShopCity() {
            return this.shopCity;
        }

            public void setShopDistrict(String shopDistrict) {
            this.shopDistrict = shopDistrict;
        }

        public String getShopDistrict() {
            return this.shopDistrict;
        }

            public void setShopAddress(String shopAddress) {
            this.shopAddress = shopAddress;
        }

        public String getShopAddress() {
            return this.shopAddress;
        }

        }

    public static class TradePromotion {
            @JsonProperty(value = "promotion_id")
        /**
        * 该优惠活动的ID
        */
        private Long promotionId;
            @JsonProperty(value = "promotion_name")
        /**
        * 该优惠活动的名称
        */
        private String promotionName;
            @JsonProperty(value = "promotion_type")
        /**
        * 优惠的类型。可选值：<br> FULLREDUCE（满减满送）<br> ORDERCASHBACK（订单返现）<br> GROUPBUYING（商品团购）<br> GROUPON（多人拼团）<br> SECKILL（秒杀）<br> AUCTION（降价拍）
        */
        private String promotionType;
            @JsonProperty(value = "promotion_condition")
        /**
        * 优惠使用条件说明
        */
        private String promotionCondition;
            @JsonProperty(value = "used_at")
        /**
        * 使用时间
        */
        private Date usedAt;
            @JsonProperty(value = "discount_fee")
        /**
        * 优惠的金额，单位：元，精确到小数点后两位
        */
        private Float discountFee;
    
            public void setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
        }

        public Long getPromotionId() {
            return this.promotionId;
        }

            public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public String getPromotionName() {
            return this.promotionName;
        }

            public void setPromotionType(String promotionType) {
            this.promotionType = promotionType;
        }

        public String getPromotionType() {
            return this.promotionType;
        }

            public void setPromotionCondition(String promotionCondition) {
            this.promotionCondition = promotionCondition;
        }

        public String getPromotionCondition() {
            return this.promotionCondition;
        }

            public void setUsedAt(Date usedAt) {
            this.usedAt = usedAt;
        }

        public Date getUsedAt() {
            return this.usedAt;
        }

            public void setDiscountFee(Float discountFee) {
            this.discountFee = discountFee;
        }

        public Float getDiscountFee() {
            return this.discountFee;
        }

        }

    public static class TradeBuyerMessage {
            @JsonProperty(value = "title")
        /**
        * 留言的标题
        */
        private String title;
            @JsonProperty(value = "content")
        /**
        * 留言的内容
        */
        private String content;
    
            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setContent(String content) {
            this.content = content;
        }

        public String getContent() {
            return this.content;
        }

        }

    public static class TradePeriodBuy {
            @JsonProperty(value = "issue")
        /**
        * 当前待配送期次
        */
        private Long issue;
            @JsonProperty(value = "plan_time")
        /**
        * 当前待配送期次的具体配送日期
        */
        private Date planTime;
    
            public void setIssue(Long issue) {
            this.issue = issue;
        }

        public Long getIssue() {
            return this.issue;
        }

            public void setPlanTime(Date planTime) {
            this.planTime = planTime;
        }

        public Date getPlanTime() {
            return this.planTime;
        }

        }

    public static class FansInfo {
            @JsonProperty(value = "fans_nickname")
        /**
        * 粉丝昵称 订单信息中存在三方(例如微信)粉丝昵称则取粉丝昵称;取不到粉丝昵称时则使用买家手机号;以上两点未满足时取买家收货人信息;无收货人信息时返回[匿名]
        */
        private String fansNickname;
            @JsonProperty(value = "fans_id")
        /**
        * 粉丝id
        */
        private Long fansId;
            @JsonProperty(value = "buyer_id")
        /**
        * 有赞买家ID
        */
        private Long buyerId;
            @JsonProperty(value = "fans_type")
        /**
        * 0:未知、1:微信自有粉丝
        */
        private Long fansType;
            @JsonProperty(value = "fans_weixin_openid")
        /**
        * 微信openid
        */
        private String fansWeixinOpenid;
    
            public void setFansNickname(String fansNickname) {
            this.fansNickname = fansNickname;
        }

        public String getFansNickname() {
            return this.fansNickname;
        }

            public void setFansId(Long fansId) {
            this.fansId = fansId;
        }

        public Long getFansId() {
            return this.fansId;
        }

            public void setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
        }

        public Long getBuyerId() {
            return this.buyerId;
        }

            public void setFansType(Long fansType) {
            this.fansType = fansType;
        }

        public Long getFansType() {
            return this.fansType;
        }

            public void setFansWeixinOpenid(String fansWeixinOpenid) {
            this.fansWeixinOpenid = fansWeixinOpenid;
        }

        public String getFansWeixinOpenid() {
            return this.fansWeixinOpenid;
        }

        }

    public static class UmpTradeCoupon {
            @JsonProperty(value = "coupon_id")
        /**
        * 该组卡券的ID
        */
        private Long couponId;
            @JsonProperty(value = "coupon_name")
        /**
        * 该组卡券的名称
        */
        private String couponName;
            @JsonProperty(value = "coupon_type")
        /**
        * 卡券的类型。可选值：PROMOCARD（优惠券）、PROMOCODE（优惠码）
        */
        private String couponType;
            @JsonProperty(value = "coupon_content")
        /**
        * 卡券内容。当卡券类型为优惠码时，值为优惠码字符串
        */
        private String couponContent;
            @JsonProperty(value = "coupon_description")
        /**
        * 卡券的说明
        */
        private String couponDescription;
            @JsonProperty(value = "coupon_condition")
        /**
        * 卡券使用条件说明
        */
        private String couponCondition;
            @JsonProperty(value = "used_at")
        /**
        * 使用时间
        */
        private Date usedAt;
            @JsonProperty(value = "discount_fee")
        /**
        * 优惠的金额，单位：元，精确到小数点后两位
        */
        private Float discountFee;
    
            public void setCouponId(Long couponId) {
            this.couponId = couponId;
        }

        public Long getCouponId() {
            return this.couponId;
        }

            public void setCouponName(String couponName) {
            this.couponName = couponName;
        }

        public String getCouponName() {
            return this.couponName;
        }

            public void setCouponType(String couponType) {
            this.couponType = couponType;
        }

        public String getCouponType() {
            return this.couponType;
        }

            public void setCouponContent(String couponContent) {
            this.couponContent = couponContent;
        }

        public String getCouponContent() {
            return this.couponContent;
        }

            public void setCouponDescription(String couponDescription) {
            this.couponDescription = couponDescription;
        }

        public String getCouponDescription() {
            return this.couponDescription;
        }

            public void setCouponCondition(String couponCondition) {
            this.couponCondition = couponCondition;
        }

        public String getCouponCondition() {
            return this.couponCondition;
        }

            public void setUsedAt(Date usedAt) {
            this.usedAt = usedAt;
        }

        public Date getUsedAt() {
            return this.usedAt;
        }

            public void setDiscountFee(Float discountFee) {
            this.discountFee = discountFee;
        }

        public Float getDiscountFee() {
            return this.discountFee;
        }

        }

    public static class TradeOrderV2 {
            @JsonProperty(value = "oid")
        /**
        * 交易明细编号。该编号并不唯一，只用于区分交易内的多条明细记录
        */
        private Long oid;
            @JsonProperty(value = "item_id")
        /**
        * 商品数字编号
        */
        private Long itemId;
            @JsonProperty(value = "sku_id")
        /**
        * Sku的ID，sku_id 在系统里<span style="color: #ff0000;">并不是唯一的</span>，结合商品ID一起使用才是唯一的。
        */
        private Long skuId;
            @JsonProperty(value = "sku_unique_code")
        /**
        * Sku在系统中的唯一编号，可以在开发者的系统中用作 Sku 的唯一ID，但不能用于调用接口
        */
        private String skuUniqueCode;
            @JsonProperty(value = "num")
        /**
        * 商品购买数量
        */
        private Long num;
            @JsonProperty(value = "outer_sku_id")
        /**
        * 商家编码（商家为Sku设置的外部编号）
        */
        private String outerSkuId;
            @JsonProperty(value = "outer_item_id")
        /**
        * 商品货号（商家为商品设置的外部编号）
        */
        private String outerItemId;
            @JsonProperty(value = "title")
        /**
        * 商品标题
        */
        private String title;
            @JsonProperty(value = "seller_nick")
        /**
        * 卖家昵称
        */
        private String sellerNick;
            @JsonProperty(value = "fenxiao_price")
        /**
        * 商品在分销商那边的出售价格。精确到2位小数；单位：元。如果是采购单才有值，否则值为 0
        */
        private Float fenxiaoPrice;
            @JsonProperty(value = "fenxiao_payment")
        /**
        * 商品在分销商那边的实付金额。精确到2位小数；单位：元。如果是采购单才有值，否则值为 0
        */
        private Float fenxiaoPayment;
            @JsonProperty(value = "price")
        /**
        * 商品价格。精确到2位小数；单位：元
        */
        private Float price;
            @JsonProperty(value = "total_fee")
        /**
        * 应付金额（商品价格乘以数量的总金额）
        */
        private Float totalFee;
            @JsonProperty(value = "discount_fee")
        /**
        * 交易明细内的优惠金额。精确到2位小数，单位：元
        */
        private Float discountFee;
            @JsonProperty(value = "payment")
        /**
        * 实付金额。精确到2位小数，单位：元
        */
        private Float payment;
            @JsonProperty(value = "sku_properties_name")
        /**
        * SKU的值，即：商品的规格。如：机身颜色:黑色;手机套餐:官方标配
        */
        private String skuPropertiesName;
            @JsonProperty(value = "pic_path")
        /**
        * 商品主图片地址
        */
        private String picPath;
            @JsonProperty(value = "pic_thumb_path")
        /**
        * 商品主图片缩略图地址
        */
        private String picThumbPath;
            @JsonProperty(value = "item_type")
        /**
        * 商品类型。<br>0：普通商品；<br>10：分销商品;
        */
        private Long itemType;
            @JsonProperty(value = "buyer_messages")
        /**
        * 交易明细中买家留言的数据结构
        */
        private TradeBuyerMessage[] buyerMessages;
            @JsonProperty(value = "order_promotion_details")
        /**
        * 交易明细中的优惠信息的数据结构
        */
        private TradeOrderPromotion[] orderPromotionDetails;
            @JsonProperty(value = "state_str")
        /**
        * 商品状态
        */
        private String stateStr;
            @JsonProperty(value = "item_refund_state")
        /**
        * 商品退款状态
        */
        private String itemRefundState;
            @JsonProperty(value = "is_virtual")
        /**
        * 1 虚拟商品 0 非虚拟商品
        */
        private Long isVirtual;
            @JsonProperty(value = "is_present")
        /**
        * 1 赠品商品 0 普通商品
        */
        private Long isPresent;
            @JsonProperty(value = "refunded_fee")
        /**
        * 退款金额
        */
        private Float refundedFee;
            @JsonProperty(value = "allow_send")
        /**
        * 是否允许发货  1 可以发货 0 不能发货
        */
        private Long allowSend;
            @JsonProperty(value = "is_send")
        /**
        * 是否发货 1 已发货 0 未发货
        */
        private String isSend;
    
            public void setOid(Long oid) {
            this.oid = oid;
        }

        public Long getOid() {
            return this.oid;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setSkuUniqueCode(String skuUniqueCode) {
            this.skuUniqueCode = skuUniqueCode;
        }

        public String getSkuUniqueCode() {
            return this.skuUniqueCode;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setOuterSkuId(String outerSkuId) {
            this.outerSkuId = outerSkuId;
        }

        public String getOuterSkuId() {
            return this.outerSkuId;
        }

            public void setOuterItemId(String outerItemId) {
            this.outerItemId = outerItemId;
        }

        public String getOuterItemId() {
            return this.outerItemId;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
        }

        public String getSellerNick() {
            return this.sellerNick;
        }

            public void setFenxiaoPrice(Float fenxiaoPrice) {
            this.fenxiaoPrice = fenxiaoPrice;
        }

        public Float getFenxiaoPrice() {
            return this.fenxiaoPrice;
        }

            public void setFenxiaoPayment(Float fenxiaoPayment) {
            this.fenxiaoPayment = fenxiaoPayment;
        }

        public Float getFenxiaoPayment() {
            return this.fenxiaoPayment;
        }

            public void setPrice(Float price) {
            this.price = price;
        }

        public Float getPrice() {
            return this.price;
        }

            public void setTotalFee(Float totalFee) {
            this.totalFee = totalFee;
        }

        public Float getTotalFee() {
            return this.totalFee;
        }

            public void setDiscountFee(Float discountFee) {
            this.discountFee = discountFee;
        }

        public Float getDiscountFee() {
            return this.discountFee;
        }

            public void setPayment(Float payment) {
            this.payment = payment;
        }

        public Float getPayment() {
            return this.payment;
        }

            public void setSkuPropertiesName(String skuPropertiesName) {
            this.skuPropertiesName = skuPropertiesName;
        }

        public String getSkuPropertiesName() {
            return this.skuPropertiesName;
        }

            public void setPicPath(String picPath) {
            this.picPath = picPath;
        }

        public String getPicPath() {
            return this.picPath;
        }

            public void setPicThumbPath(String picThumbPath) {
            this.picThumbPath = picThumbPath;
        }

        public String getPicThumbPath() {
            return this.picThumbPath;
        }

            public void setItemType(Long itemType) {
            this.itemType = itemType;
        }

        public Long getItemType() {
            return this.itemType;
        }

            public void setBuyerMessages(TradeBuyerMessage[] buyerMessages) {
            this.buyerMessages = buyerMessages;
        }

        public TradeBuyerMessage[] getBuyerMessages() {
            return this.buyerMessages;
        }

            public void setOrderPromotionDetails(TradeOrderPromotion[] orderPromotionDetails) {
            this.orderPromotionDetails = orderPromotionDetails;
        }

        public TradeOrderPromotion[] getOrderPromotionDetails() {
            return this.orderPromotionDetails;
        }

            public void setStateStr(String stateStr) {
            this.stateStr = stateStr;
        }

        public String getStateStr() {
            return this.stateStr;
        }

            public void setItemRefundState(String itemRefundState) {
            this.itemRefundState = itemRefundState;
        }

        public String getItemRefundState() {
            return this.itemRefundState;
        }

            public void setIsVirtual(Long isVirtual) {
            this.isVirtual = isVirtual;
        }

        public Long getIsVirtual() {
            return this.isVirtual;
        }

            public void setIsPresent(Long isPresent) {
            this.isPresent = isPresent;
        }

        public Long getIsPresent() {
            return this.isPresent;
        }

            public void setRefundedFee(Float refundedFee) {
            this.refundedFee = refundedFee;
        }

        public Float getRefundedFee() {
            return this.refundedFee;
        }

            public void setAllowSend(Long allowSend) {
            this.allowSend = allowSend;
        }

        public Long getAllowSend() {
            return this.allowSend;
        }

            public void setIsSend(String isSend) {
            this.isSend = isSend;
        }

        public String getIsSend() {
            return this.isSend;
        }

        }

    public static class AdjustFee {
            @JsonProperty(value = "change")
        /**
        * 总改价金额
        */
        private Float change;
            @JsonProperty(value = "pay_change")
        /**
        * 订单改价
        */
        private Float payChange;
            @JsonProperty(value = "post_change")
        /**
        * 邮费改价
        */
        private Float postChange;
    
            public void setChange(Float change) {
            this.change = change;
        }

        public Float getChange() {
            return this.change;
        }

            public void setPayChange(Float payChange) {
            this.payChange = payChange;
        }

        public Float getPayChange() {
            return this.payChange;
        }

            public void setPostChange(Float postChange) {
            this.postChange = postChange;
        }

        public Float getPostChange() {
            return this.postChange;
        }

        }

    public static class TradeOrderPromotion {
            @JsonProperty(value = "promotion_name")
        /**
        * 优惠的名称
        */
        private String promotionName;
            @JsonProperty(value = "promotion_type")
        /**
        * 优惠的类型。可选值：<br>MEMBER_CARD_DISCOUNT（会员卡折扣）
						<br>SCAN_DISCOUNT（扫码折扣）
						<br>SCAN_DECREASE（扫码减额优惠）
						<br>TIMELIMITED_DISCOUNT（限时折扣）
        */
        private String promotionType;
            @JsonProperty(value = "apply_at")
        /**
        * 应用优惠的时间
        */
        private Date applyAt;
            @JsonProperty(value = "discount_fee")
        /**
        * 优惠的金额，单位：元，精确到小数点后两位
        */
        private Float discountFee;
    
            public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public String getPromotionName() {
            return this.promotionName;
        }

            public void setPromotionType(String promotionType) {
            this.promotionType = promotionType;
        }

        public String getPromotionType() {
            return this.promotionType;
        }

            public void setApplyAt(Date applyAt) {
            this.applyAt = applyAt;
        }

        public Date getApplyAt() {
            return this.applyAt;
        }

            public void setDiscountFee(Float discountFee) {
            this.discountFee = discountFee;
        }

        public Float getDiscountFee() {
            return this.discountFee;
        }

        }


}