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

public class YouzanMeiOrderQueryResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 订单详情
     */
    private OrderDetailResp response;

    public void setResponse(OrderDetailResp response) {
        this.response = response;
    }

    public OrderDetailResp getResponse() {
        return this.response;
    }

    public static class Salesman {
            @JsonProperty(value = "id")
        /**
        * 销售人员id
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 销售人员名字
        */
        private String name;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        }

    public static class OrderItemDetailEntity {
            @JsonProperty(value = "item_alias")
        /**
        * 订单项别名
        */
        private String itemAlias;
            @JsonProperty(value = "item_id")
        /**
        * 订单项ID
        */
        private Long itemId;
            @JsonProperty(value = "goods_id")
        /**
        * 商品id
        */
        private Long goodsId;
            @JsonProperty(value = "index")
        /**
        * 订单项位置，更新订单项时需传入
        */
        private Long index;
            @JsonProperty(value = "is_pay")
        /**
        * 是否已支付
        */
        private Long isPay;
            @JsonProperty(value = "item_type")
        /**
        * 订单项类型。1, "服务" 2, "次卡" 3, "折扣卡" 4, "充值卡" 5, "充值" 6, "台卡二维码收款" 7, "直接收款" 8, "实物商品" 9, "余额充值"
        */
        private Long itemType;
            @JsonProperty(value = "num")
        /**
        * 数量
        */
        private Long num;
            @JsonProperty(value = "origin_price")
        /**
        * 原始价格
        */
        private Long originPrice;
            @JsonProperty(value = "promotion_card_no")
        /**
        * 优惠卡号
        */
        private String promotionCardNo;
            @JsonProperty(value = "promotion_id")
        /**
        * 优惠id
        */
        private Long promotionId;
            @JsonProperty(value = "promotion_name")
        /**
        * 优惠名称
        */
        private String promotionName;
            @JsonProperty(value = "promotion_price")
        /**
        * 优惠的价格
        */
        private Long promotionPrice;
            @JsonProperty(value = "promotion_type")
        /**
        * 0, "无优惠" 1, "次卡" 2, "折扣值" 3, "预付已付款" 5, "导入权益次数" 6, "赠送权益次数" 7, "导入权益折扣" 8, "赠送权益折扣" 11, "产品折扣（会员特权）" 21, "服务折扣（会员特权）" 30, "包邮", "等级权益包邮" 31, "抹零", "抹零" 40, "手动减价", "手动减价" 51, "减价优惠券", "优惠券" 52, "折扣优惠券", "优惠券" 100, "体验价", "体验价优惠" 101, "拼团", "拼团" 103, "同行打折", "同行优惠" 104, "同行免单", "同行优惠"
        */
        private Long promotionType;
            @JsonProperty(value = "promotion_value")
        /**
        * 优惠卡面值
        */
        private Long promotionValue;
            @JsonProperty(value = "real_pay")
        /**
        * 实际支付价格
        */
        private Long realPay;
            @JsonProperty(value = "salesmen")
        /**
        * 销售人员
        */
        private Salesman[] salesmen;
            @JsonProperty(value = "sku_id")
        /**
        * sku id
        */
        private Long skuId;
            @JsonProperty(value = "stage")
        /**
        * 0 预约，1 订单
        */
        private Long stage;
            @JsonProperty(value = "technicians")
        /**
        * 技师信息
        */
        private Technician[] technicians;
    
            public void setItemAlias(String itemAlias) {
            this.itemAlias = itemAlias;
        }

        public String getItemAlias() {
            return this.itemAlias;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public Long getGoodsId() {
            return this.goodsId;
        }

            public void setIndex(Long index) {
            this.index = index;
        }

        public Long getIndex() {
            return this.index;
        }

            public void setIsPay(Long isPay) {
            this.isPay = isPay;
        }

        public Long getIsPay() {
            return this.isPay;
        }

            public void setItemType(Long itemType) {
            this.itemType = itemType;
        }

        public Long getItemType() {
            return this.itemType;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
        }

        public Long getOriginPrice() {
            return this.originPrice;
        }

            public void setPromotionCardNo(String promotionCardNo) {
            this.promotionCardNo = promotionCardNo;
        }

        public String getPromotionCardNo() {
            return this.promotionCardNo;
        }

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

            public void setPromotionPrice(Long promotionPrice) {
            this.promotionPrice = promotionPrice;
        }

        public Long getPromotionPrice() {
            return this.promotionPrice;
        }

            public void setPromotionType(Long promotionType) {
            this.promotionType = promotionType;
        }

        public Long getPromotionType() {
            return this.promotionType;
        }

            public void setPromotionValue(Long promotionValue) {
            this.promotionValue = promotionValue;
        }

        public Long getPromotionValue() {
            return this.promotionValue;
        }

            public void setRealPay(Long realPay) {
            this.realPay = realPay;
        }

        public Long getRealPay() {
            return this.realPay;
        }

            public void setSalesmen(Salesman[] salesmen) {
            this.salesmen = salesmen;
        }

        public Salesman[] getSalesmen() {
            return this.salesmen;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setStage(Long stage) {
            this.stage = stage;
        }

        public Long getStage() {
            return this.stage;
        }

            public void setTechnicians(Technician[] technicians) {
            this.technicians = technicians;
        }

        public Technician[] getTechnicians() {
            return this.technicians;
        }

        }

    public static class Technician {
            @JsonProperty(value = "id")
        /**
        * 技师id
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 技师名字
        */
        private String name;
            @JsonProperty(value = "tag")
        /**
        * 技师标签
        */
        private String tag;
            @JsonProperty(value = "assigned")
        /**
        * 是不是客户指定
        */
        private Long assigned;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setTag(String tag) {
            this.tag = tag;
        }

        public String getTag() {
            return this.tag;
        }

            public void setAssigned(Long assigned) {
            this.assigned = assigned;
        }

        public Long getAssigned() {
            return this.assigned;
        }

        }

    public static class MeiOrderBuyerInfo {
            @JsonProperty(value = "gender")
        /**
        * 性别 0无，1男，2女
        */
        private Long gender;
            @JsonProperty(value = "is_member")
        /**
        * 是否是会员
        */
        private Long isMember;
            @JsonProperty(value = "level")
        /**
        * 会员等级
        */
        private Long level;
            @JsonProperty(value = "member_no")
        /**
        * 会员编号
        */
        private Long memberNo;
            @JsonProperty(value = "level_alias")
        /**
        * 等级别名
        */
        private String levelAlias;
            @JsonProperty(value = "mobile")
        /**
        * 手机号
        */
        private String mobile;
            @JsonProperty(value = "memo_name")
        /**
        * 备注名
        */
        private String memoName;
            @JsonProperty(value = "gift_balance")
        /**
        * 赠送余额
        */
        private Long giftBalance;
            @JsonProperty(value = "avatar")
        /**
        * 会员头像
        */
        private String avatar;
            @JsonProperty(value = "member_name")
        /**
        * 会员名称
        */
        private String memberName;
            @JsonProperty(value = "yz_uid")
        /**
        * 员工ID
        */
        private Long yzUid;
            @JsonProperty(value = "uic_avatar")
        /**
        * UIC头像
        */
        private String uicAvatar;
            @JsonProperty(value = "level_name")
        /**
        * 等级名称
        */
        private String levelName;
            @JsonProperty(value = "balance")
        /**
        * 余额
        */
        private Long balance;
            @JsonProperty(value = "name")
        /**
        * 名称
        */
        private String name;
            @JsonProperty(value = "capital_balance")
        /**
        * 主余额
        */
        private Long capitalBalance;
    
            public void setGender(Long gender) {
            this.gender = gender;
        }

        public Long getGender() {
            return this.gender;
        }

            public void setIsMember(Long isMember) {
            this.isMember = isMember;
        }

        public Long getIsMember() {
            return this.isMember;
        }

            public void setLevel(Long level) {
            this.level = level;
        }

        public Long getLevel() {
            return this.level;
        }

            public void setMemberNo(Long memberNo) {
            this.memberNo = memberNo;
        }

        public Long getMemberNo() {
            return this.memberNo;
        }

            public void setLevelAlias(String levelAlias) {
            this.levelAlias = levelAlias;
        }

        public String getLevelAlias() {
            return this.levelAlias;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

            public void setMemoName(String memoName) {
            this.memoName = memoName;
        }

        public String getMemoName() {
            return this.memoName;
        }

            public void setGiftBalance(Long giftBalance) {
            this.giftBalance = giftBalance;
        }

        public Long getGiftBalance() {
            return this.giftBalance;
        }

            public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getAvatar() {
            return this.avatar;
        }

            public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public String getMemberName() {
            return this.memberName;
        }

            public void setYzUid(Long yzUid) {
            this.yzUid = yzUid;
        }

        public Long getYzUid() {
            return this.yzUid;
        }

            public void setUicAvatar(String uicAvatar) {
            this.uicAvatar = uicAvatar;
        }

        public String getUicAvatar() {
            return this.uicAvatar;
        }

            public void setLevelName(String levelName) {
            this.levelName = levelName;
        }

        public String getLevelName() {
            return this.levelName;
        }

            public void setBalance(Long balance) {
            this.balance = balance;
        }

        public Long getBalance() {
            return this.balance;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setCapitalBalance(Long capitalBalance) {
            this.capitalBalance = capitalBalance;
        }

        public Long getCapitalBalance() {
            return this.capitalBalance;
        }

        }

    public static class OrderGiftItem {
            @JsonProperty(value = "gift_item_term_time")
        /**
        * 权益有效期时间（giftItemTermTime，xxxx前有效），0-永久有效, 单位毫秒
        */
        private Long giftItemTermTime;
            @JsonProperty(value = "gift_item_unique")
        /**
        * 赠送项目唯一值, 如：商品id
        */
        private String giftItemUnique;
            @JsonProperty(value = "gift_item_value")
        /**
        * 赠送权益值（giftItemValue, 赠送次数/数量）
        */
        private Long giftItemValue;
            @JsonProperty(value = "gift_type")
        /**
        * 赠送类型（giftType,1-次数/2-折扣/3-余额/4-积分/5-券/6-会员卡/7-服务/8-产品）
        */
        private Long giftType;
    
            public void setGiftItemTermTime(Long giftItemTermTime) {
            this.giftItemTermTime = giftItemTermTime;
        }

        public Long getGiftItemTermTime() {
            return this.giftItemTermTime;
        }

            public void setGiftItemUnique(String giftItemUnique) {
            this.giftItemUnique = giftItemUnique;
        }

        public String getGiftItemUnique() {
            return this.giftItemUnique;
        }

            public void setGiftItemValue(Long giftItemValue) {
            this.giftItemValue = giftItemValue;
        }

        public Long getGiftItemValue() {
            return this.giftItemValue;
        }

            public void setGiftType(Long giftType) {
            this.giftType = giftType;
        }

        public Long getGiftType() {
            return this.giftType;
        }

        }

    public static class MeiOrderDetailPaymentInfo {
            @JsonProperty(value = "channel_name")
        /**
        * 支付渠道
        */
        private String channelName;
            @JsonProperty(value = "from_source")
        /**
        * 订单来源
        */
        private String fromSource;
            @JsonProperty(value = "amount")
        /**
        * 订单数量
        */
        private Long amount;
            @JsonProperty(value = "stage")
        /**
        * 订单阶段 0 预约，1订单
        */
        private Long stage;
            @JsonProperty(value = "out_flow_no")
        /**
        * 外部交易单号
        */
        private String outFlowNo;
            @JsonProperty(value = "flow_no")
        /**
        * 交易单号
        */
        private String flowNo;
            @JsonProperty(value = "receive_pay")
        /**
        * 实际收款额
        */
        private Long receivePay;
            @JsonProperty(value = "channel_type")
        /**
        * 支付渠道 1, "微信"  2, "微信" 3, "支付宝" 4, "支付宝" 5, "条码支付" 10, "默认渠道" 11, "外部导入" 12, "组合支付" 13, "无需支付" 14, "其它" 28, "有赞E卡" 120, "会员余额" 130, "刷卡" 201, "现金" 202, "小程序" 203, "预支付" 204, "刷卡"
        */
        private Long channelType;
            @JsonProperty(value = "status")
        /**
        * 支付状态:10:待支付, 20:支付中, 30:已支付, 40:退款中, 50:已退款, 98:支付失败
        */
        private Long status;
    
            public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public String getChannelName() {
            return this.channelName;
        }

            public void setFromSource(String fromSource) {
            this.fromSource = fromSource;
        }

        public String getFromSource() {
            return this.fromSource;
        }

            public void setAmount(Long amount) {
            this.amount = amount;
        }

        public Long getAmount() {
            return this.amount;
        }

            public void setStage(Long stage) {
            this.stage = stage;
        }

        public Long getStage() {
            return this.stage;
        }

            public void setOutFlowNo(String outFlowNo) {
            this.outFlowNo = outFlowNo;
        }

        public String getOutFlowNo() {
            return this.outFlowNo;
        }

            public void setFlowNo(String flowNo) {
            this.flowNo = flowNo;
        }

        public String getFlowNo() {
            return this.flowNo;
        }

            public void setReceivePay(Long receivePay) {
            this.receivePay = receivePay;
        }

        public Long getReceivePay() {
            return this.receivePay;
        }

            public void setChannelType(Long channelType) {
            this.channelType = channelType;
        }

        public Long getChannelType() {
            return this.channelType;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

        }

    public static class OrderDetailResp {
            @JsonProperty(value = "type")
        /**
        * 订单类型。0:"普通",1,:"开卡购卡",2,:"充值",3,:"直接收款",4:"台卡",8:"产品订单"。默认是0.
        */
        private Long type;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "order_no")
        /**
        * 订单编号，修改订单时填写
        */
        private String orderNo;
            @JsonProperty(value = "order_items")
        /**
        * 订单项详情
        */
        private OrderItemDetailEntity[] orderItems;
            @JsonProperty(value = "order_gift_items")
        /**
        * 订单赠送项
        */
        private OrderGiftItem[] orderGiftItems;
            @JsonProperty(value = "dept_id")
        /**
        * 门店ID
        */
        private Long deptId;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "reserve_no")
        /**
        * 预约单号
        */
        private String reserveNo;
            @JsonProperty(value = "real_pay")
        /**
        * 实付金额
        */
        private Long realPay;
            @JsonProperty(value = "cashier_name")
        /**
        * 收银员名称
        */
        private String cashierName;
            @JsonProperty(value = "buyer_memo")
        /**
        * 买家备注
        */
        private String buyerMemo;
            @JsonProperty(value = "cashier_id")
        /**
        * 收银员ID
        */
        private Long cashierId;
            @JsonProperty(value = "create_time")
        /**
        * 创建时间
        */
        private Long createTime;
            @JsonProperty(value = "dept_name")
        /**
        * 部门名称
        */
        private String deptName;
            @JsonProperty(value = "pay_time")
        /**
        * 支付时间
        */
        private Long payTime;
            @JsonProperty(value = "total_pay")
        /**
        * 总额
        */
        private Long totalPay;
            @JsonProperty(value = "origin_price")
        /**
        * 原价
        */
        private Long originPrice;
            @JsonProperty(value = "order_state")
        /**
        * 订单状态 10, "未支付" 20, "取消" 30, "待付款" 32, "待发货" 34, "待收货" 40, "已完成" 99, "取消"
        */
        private Long orderState;
            @JsonProperty(value = "ship_time")
        /**
        * 发货时间
        */
        private Long shipTime;
            @JsonProperty(value = "payments")
        /**
        * 订单支付信息
        */
        private MeiOrderDetailPaymentInfo[] payments;
            @JsonProperty(value = "buyer")
        /**
        * 美业买家信息
        */
        private MeiOrderBuyerInfo buyer;
    
            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderNo() {
            return this.orderNo;
        }

            public void setOrderItems(OrderItemDetailEntity[] orderItems) {
            this.orderItems = orderItems;
        }

        public OrderItemDetailEntity[] getOrderItems() {
            return this.orderItems;
        }

            public void setOrderGiftItems(OrderGiftItem[] orderGiftItems) {
            this.orderGiftItems = orderGiftItems;
        }

        public OrderGiftItem[] getOrderGiftItems() {
            return this.orderGiftItems;
        }

            public void setDeptId(Long deptId) {
            this.deptId = deptId;
        }

        public Long getDeptId() {
            return this.deptId;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setReserveNo(String reserveNo) {
            this.reserveNo = reserveNo;
        }

        public String getReserveNo() {
            return this.reserveNo;
        }

            public void setRealPay(Long realPay) {
            this.realPay = realPay;
        }

        public Long getRealPay() {
            return this.realPay;
        }

            public void setCashierName(String cashierName) {
            this.cashierName = cashierName;
        }

        public String getCashierName() {
            return this.cashierName;
        }

            public void setBuyerMemo(String buyerMemo) {
            this.buyerMemo = buyerMemo;
        }

        public String getBuyerMemo() {
            return this.buyerMemo;
        }

            public void setCashierId(Long cashierId) {
            this.cashierId = cashierId;
        }

        public Long getCashierId() {
            return this.cashierId;
        }

            public void setCreateTime(Long createTime) {
            this.createTime = createTime;
        }

        public Long getCreateTime() {
            return this.createTime;
        }

            public void setDeptName(String deptName) {
            this.deptName = deptName;
        }

        public String getDeptName() {
            return this.deptName;
        }

            public void setPayTime(Long payTime) {
            this.payTime = payTime;
        }

        public Long getPayTime() {
            return this.payTime;
        }

            public void setTotalPay(Long totalPay) {
            this.totalPay = totalPay;
        }

        public Long getTotalPay() {
            return this.totalPay;
        }

            public void setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
        }

        public Long getOriginPrice() {
            return this.originPrice;
        }

            public void setOrderState(Long orderState) {
            this.orderState = orderState;
        }

        public Long getOrderState() {
            return this.orderState;
        }

            public void setShipTime(Long shipTime) {
            this.shipTime = shipTime;
        }

        public Long getShipTime() {
            return this.shipTime;
        }

            public void setPayments(MeiOrderDetailPaymentInfo[] payments) {
            this.payments = payments;
        }

        public MeiOrderDetailPaymentInfo[] getPayments() {
            return this.payments;
        }

            public void setBuyer(MeiOrderBuyerInfo buyer) {
            this.buyer = buyer;
        }

        public MeiOrderBuyerInfo getBuyer() {
            return this.buyer;
        }

        }


}