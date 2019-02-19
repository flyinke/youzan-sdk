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

public class YouzanRetailOpenDeliveryorderGetResult implements APIResult {

    @JsonProperty(value = "delivery_order_no")
    /**
     * 发货单号
     */
    private String deliveryOrderNo;
    @JsonProperty(value = "warehouse_code")
    /**
     * 仓库编码
     */
    private String warehouseCode;
    @JsonProperty(value = "create_time")
    /**
     * 创建日期
     */
    private String createTime;
    @JsonProperty(value = "remark")
    /**
     * 备注
     */
    private String remark;
    @JsonProperty(value = "status")
    /**
     * 发货单状态：
WAIT_DELIVER=待发货或待核销
DELIVERED=已发货或已核销
NO_NEED_TO_DELIVER=无需发货
     */
    private String status;
    @JsonProperty(value = "sale_way")
    /**
     * 销售渠道：
ALL_SALE_WAY=所有销售渠道
ONLINE=网店
OFFLINE=门店
     */
    private String saleWay;
    @JsonProperty(value = "dist_type")
    /**
     * 物流方式：
EXPRESS=快递
LOCAL_DELIVERY=同城送
SELF_FETCH=自提
     */
    private String distType;
    @JsonProperty(value = "sales_amount")
    /**
     * 货单整单金额，未计任何优惠，未计邮费
     */
    private String salesAmount;
    @JsonProperty(value = "postage")
    /**
     * 发货单实付邮费
     */
    private String postage;
    @JsonProperty(value = "real_sales_amount")
    /**
     * 发货单实付金额 ，包含邮费
     */
    private String realSalesAmount;
    @JsonProperty(value = "receiver_info")
    /**
     * 收件人信息
     */
    private OpenReceiverInfoDTO receiverInfo;
    @JsonProperty(value = "refund_infos")
    /**
     * 退款信息
     */
    private OpenRefundInfoDTO[] refundInfos;
    @JsonProperty(value = "order_items")
    /**
     * 商品明细
     */
    private OpenOrderItemDTO[] orderItems;
    @JsonProperty(value = "order_no")
    /**
     * 订单号
     */
    private String orderNo;
    @JsonProperty(value = "pay_type")
    /**
     * 支付方式:
0=老的方式,支付方式与支付渠道组合在一起
1=无需支付
2=现付
3=部分支付
4=货到付款
5=线下收银
6=单次支付
7=阶段支付
     */
    private Long payType;
    @JsonProperty(value = "buyer_info")
    /**
     * 买家信息
     */
    private OpenBuyerInfoDTO buyerInfo;
    @JsonProperty(value = "warehouse_name")
    /**
     * 仓库名称
     */
    private String warehouseName;
    @JsonProperty(value = "cashier_info")
    /**
     * 收银员信息
     */
    private OpenCashierInfoDTO cashierInfo;

    public void setDeliveryOrderNo(String deliveryOrderNo) {
        this.deliveryOrderNo = deliveryOrderNo;
    }

    public String getDeliveryOrderNo() {
        return this.deliveryOrderNo;
    }
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseCode() {
        return this.warehouseCode;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
    public void setSaleWay(String saleWay) {
        this.saleWay = saleWay;
    }

    public String getSaleWay() {
        return this.saleWay;
    }
    public void setDistType(String distType) {
        this.distType = distType;
    }

    public String getDistType() {
        return this.distType;
    }
    public void setSalesAmount(String salesAmount) {
        this.salesAmount = salesAmount;
    }

    public String getSalesAmount() {
        return this.salesAmount;
    }
    public void setPostage(String postage) {
        this.postage = postage;
    }

    public String getPostage() {
        return this.postage;
    }
    public void setRealSalesAmount(String realSalesAmount) {
        this.realSalesAmount = realSalesAmount;
    }

    public String getRealSalesAmount() {
        return this.realSalesAmount;
    }
    public void setReceiverInfo(OpenReceiverInfoDTO receiverInfo) {
        this.receiverInfo = receiverInfo;
    }

    public OpenReceiverInfoDTO getReceiverInfo() {
        return this.receiverInfo;
    }
    public void setRefundInfos(OpenRefundInfoDTO[] refundInfos) {
        this.refundInfos = refundInfos;
    }

    public OpenRefundInfoDTO[] getRefundInfos() {
        return this.refundInfos;
    }
    public void setOrderItems(OpenOrderItemDTO[] orderItems) {
        this.orderItems = orderItems;
    }

    public OpenOrderItemDTO[] getOrderItems() {
        return this.orderItems;
    }
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }
    public void setPayType(Long payType) {
        this.payType = payType;
    }

    public Long getPayType() {
        return this.payType;
    }
    public void setBuyerInfo(OpenBuyerInfoDTO buyerInfo) {
        this.buyerInfo = buyerInfo;
    }

    public OpenBuyerInfoDTO getBuyerInfo() {
        return this.buyerInfo;
    }
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseName() {
        return this.warehouseName;
    }
    public void setCashierInfo(OpenCashierInfoDTO cashierInfo) {
        this.cashierInfo = cashierInfo;
    }

    public OpenCashierInfoDTO getCashierInfo() {
        return this.cashierInfo;
    }

    public static class OpenOrderItemDTO {
            @JsonProperty(value = "delivery_order_no")
        /**
        * 发货单号
        */
        private String deliveryOrderNo;
            @JsonProperty(value = "order_item_no")
        /**
        * 商品明细ID
        */
        private String orderItemNo;
            @JsonProperty(value = "sku_code")
        /**
        * 商品编码
        */
        private String skuCode;
            @JsonProperty(value = "product_name")
        /**
        * 商品名称
        */
        private String productName;
            @JsonProperty(value = "sku_no")
        /**
        * 商品条码
        */
        private String skuNo;
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
            @JsonProperty(value = "quantity")
        /**
        * 出库数量
        */
        private String quantity;
            @JsonProperty(value = "output_tax_rate")
        /**
        * 销项税率
        */
        private String outputTaxRate;
            @JsonProperty(value = "sales_price")
        /**
        * 含税销售单价（定价，直接销售的价格）
        */
        private String salesPrice;
            @JsonProperty(value = "real_sales_price")
        /**
        * 单个商品实付金额，已减去均摊的订单优惠
        */
        private String realSalesPrice;
            @JsonProperty(value = "item_type")
        /**
        * 商品类型  
0:普通类型商品; 1:拍卖商品; 5:餐饮商品; 10:分销商品; 20:会员卡商品; 21:礼品卡商品; 23:有赞会议商品; 24:周期购; 30:收银台商品; 31:知识付费商品; 35:酒店商品; 40:普通服务类商品; 182:普通虚拟商品; 183:电子卡券商品; 201:外部会员卡商品; 202:外部直接收款商品; 203:外部普通商品; 205:mock不存在商品; 206:小程序二维码
        */
        private Long itemType;
    
            public void setDeliveryOrderNo(String deliveryOrderNo) {
            this.deliveryOrderNo = deliveryOrderNo;
        }

        public String getDeliveryOrderNo() {
            return this.deliveryOrderNo;
        }

            public void setOrderItemNo(String orderItemNo) {
            this.orderItemNo = orderItemNo;
        }

        public String getOrderItemNo() {
            return this.orderItemNo;
        }

            public void setSkuCode(String skuCode) {
            this.skuCode = skuCode;
        }

        public String getSkuCode() {
            return this.skuCode;
        }

            public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductName() {
            return this.productName;
        }

            public void setSkuNo(String skuNo) {
            this.skuNo = skuNo;
        }

        public String getSkuNo() {
            return this.skuNo;
        }

            public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getUnit() {
            return this.unit;
        }

            public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getQuantity() {
            return this.quantity;
        }

            public void setOutputTaxRate(String outputTaxRate) {
            this.outputTaxRate = outputTaxRate;
        }

        public String getOutputTaxRate() {
            return this.outputTaxRate;
        }

            public void setSalesPrice(String salesPrice) {
            this.salesPrice = salesPrice;
        }

        public String getSalesPrice() {
            return this.salesPrice;
        }

            public void setRealSalesPrice(String realSalesPrice) {
            this.realSalesPrice = realSalesPrice;
        }

        public String getRealSalesPrice() {
            return this.realSalesPrice;
        }

            public void setItemType(Long itemType) {
            this.itemType = itemType;
        }

        public Long getItemType() {
            return this.itemType;
        }

        }

    public static class OpenBuyerInfoDTO {
            @JsonProperty(value = "buyer_phone")
        /**
        * 买家手机号
        */
        private String buyerPhone;
            @JsonProperty(value = "fans_nickname")
        /**
        * 粉丝名称
        */
        private String fansNickname;
            @JsonProperty(value = "buyer_remark")
        /**
        * 买家留言
        */
        private String buyerRemark;
            @JsonProperty(value = "buyer_id")
        /**
        * 买家Id
        */
        private Long buyerId;
            @JsonProperty(value = "buyer_name")
        /**
        * 买家名字
        */
        private String buyerName;
            @JsonProperty(value = "is_member")
        /**
        * 是否是会员
        */
        private Boolean isMember;
    
            public void setBuyerPhone(String buyerPhone) {
            this.buyerPhone = buyerPhone;
        }

        public String getBuyerPhone() {
            return this.buyerPhone;
        }

            public void setFansNickname(String fansNickname) {
            this.fansNickname = fansNickname;
        }

        public String getFansNickname() {
            return this.fansNickname;
        }

            public void setBuyerRemark(String buyerRemark) {
            this.buyerRemark = buyerRemark;
        }

        public String getBuyerRemark() {
            return this.buyerRemark;
        }

            public void setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
        }

        public Long getBuyerId() {
            return this.buyerId;
        }

            public void setBuyerName(String buyerName) {
            this.buyerName = buyerName;
        }

        public String getBuyerName() {
            return this.buyerName;
        }

            public void setIsMember(Boolean isMember) {
            this.isMember = isMember;
        }

        public Boolean getIsMember() {
            return this.isMember;
        }

        }

    public static class OpenReceiverInfoDTO {
            @JsonProperty(value = "province")
        /**
        * 省
        */
        private String province;
            @JsonProperty(value = "city")
        /**
        * 市
        */
        private String city;
            @JsonProperty(value = "area")
        /**
        * 区
        */
        private String area;
            @JsonProperty(value = "detail_address")
        /**
        * 详细地址
        */
        private String detailAddress;
            @JsonProperty(value = "mobile")
        /**
        * 移动电话
        */
        private String mobile;
            @JsonProperty(value = "tel")
        /**
        * 固定电话
        */
        private String tel;
            @JsonProperty(value = "name")
        /**
        * 姓名
        */
        private String name;
    
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

            public void setArea(String area) {
            this.area = area;
        }

        public String getArea() {
            return this.area;
        }

            public void setDetailAddress(String detailAddress) {
            this.detailAddress = detailAddress;
        }

        public String getDetailAddress() {
            return this.detailAddress;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

            public void setTel(String tel) {
            this.tel = tel;
        }

        public String getTel() {
            return this.tel;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        }

    public static class OpenCashierInfoDTO {
            @JsonProperty(value = "cashier_id")
        /**
        * 收银员id
        */
        private String cashierId;
            @JsonProperty(value = "cashier_name")
        /**
        * 收银员名字
        */
        private String cashierName;
    
            public void setCashierId(String cashierId) {
            this.cashierId = cashierId;
        }

        public String getCashierId() {
            return this.cashierId;
        }

            public void setCashierName(String cashierName) {
            this.cashierName = cashierName;
        }

        public String getCashierName() {
            return this.cashierName;
        }

        }

    public static class OpenRefundInfoDTO {
            @JsonProperty(value = "refund_no")
        /**
        * 退款单号
        */
        private String refundNo;
            @JsonProperty(value = "create_time")
        /**
        * 退款申请时间
        */
        private String createTime;
            @JsonProperty(value = "refund_type")
        /**
        * 退款类型:
BUYER_APPLY_REFUND=买家申请退款
SELLER_REFUND=商家主动退款 
SYSTEM_REFUND=一键退款，特殊类型退款
        */
        private String refundType;
            @JsonProperty(value = "refund_demand")
        /**
        * 退货诉求:
REFUND_ONLY=仅退款 
REFUND_RETURN_GOODS=退货退款
        */
        private String refundDemand;
            @JsonProperty(value = "refund_fee")
        /**
        * 退款金额
        */
        private String refundFee;
            @JsonProperty(value = "refund_status")
        /**
        * 退款状态:
REFUND_WAIT_SELLER_AGREE=买家已经申请退款，等待卖家同意 
REFUND_SELLER_REFUSE_BUYER=卖家拒绝退款 
REFUND_WAIT_BUYER_RETURN_GOODS=卖家已经同意退货，等待买家退货 
REFUND_WAIT_SELLER_CONFIRM_GOODS=买家已经退货，等待卖家确认收货 
REFUND_SELLER_REFUSE_RETURN_GOODS=卖家未收到货,拒绝退款 
REFUND_CLOSED=退款关闭 REFUND_SUCCESS=退款成功
        */
        private String refundStatus;
            @JsonProperty(value = "order_item_nos")
        /**
        * 退款明细ID
        */
        private String[] orderItemNos;
    
            public void setRefundNo(String refundNo) {
            this.refundNo = refundNo;
        }

        public String getRefundNo() {
            return this.refundNo;
        }

            public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateTime() {
            return this.createTime;
        }

            public void setRefundType(String refundType) {
            this.refundType = refundType;
        }

        public String getRefundType() {
            return this.refundType;
        }

            public void setRefundDemand(String refundDemand) {
            this.refundDemand = refundDemand;
        }

        public String getRefundDemand() {
            return this.refundDemand;
        }

            public void setRefundFee(String refundFee) {
            this.refundFee = refundFee;
        }

        public String getRefundFee() {
            return this.refundFee;
        }

            public void setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
        }

        public String getRefundStatus() {
            return this.refundStatus;
        }

            public void setOrderItemNos(String[] orderItemNos) {
            this.orderItemNos = orderItemNos;
        }

        public String[] getOrderItemNos() {
            return this.orderItemNos;
        }

        }


}