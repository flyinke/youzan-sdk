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

public class YouzanRetailOpenRefundorderQueryResult implements APIResult {

    @JsonProperty(value = "refund_orders")
    /**
     * 退款单列表
     */
    private OpenRefundOrderDTO[] refundOrders;
    @JsonProperty(value = "paginator")
    /**
     * 记录总数
     */
    private Paginator paginator;

    public void setRefundOrders(OpenRefundOrderDTO[] refundOrders) {
        this.refundOrders = refundOrders;
    }

    public OpenRefundOrderDTO[] getRefundOrders() {
        return this.refundOrders;
    }
    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
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

    public static class OpenRefundOrderDTO {
            @JsonProperty(value = "refund_no")
        /**
        * 退款单号
        */
        private String refundNo;
            @JsonProperty(value = "sale_way")
        /**
        * 销售渠道
ONLINE：网店
OFFLINE：门店
        */
        private String saleWay;
            @JsonProperty(value = "create_time")
        /**
        * 退款申请时间
        */
        private String createTime;
            @JsonProperty(value = "refund_type")
        /**
        * 退款类型
BUYER_APPLY_REFUND：买家申请退款
SELLER_REFUND：商家主动退款
SYSTEM_REFUND：一键退款，特殊类型退款
        */
        private String refundType;
            @JsonProperty(value = "refund_demand")
        /**
        * 退货诉求
REFUND_ONLY：仅退款
REFUND_RETURN_GOODS：退货退款
        */
        private String refundDemand;
            @JsonProperty(value = "refund_fee")
        /**
        * 退款金额
        */
        private String refundFee;
            @JsonProperty(value = "refund_status")
        /**
        * 退款状态
REFUND_WAIT_SELLER_AGREE：买家已经申请退款，等待卖家同意
REFUND_SELLER_REFUSE_BUYER：卖家拒绝退款
REFUND_WAIT_BUYER_RETURN_GOODS：卖家已经同意退货，等待买家退货
REFUND_WAIT_SELLER_CONFIRM_GOODS：买家已经退货，等待卖家确认收货
REFUND_SELLER_REFUSE_RETURN_GOODS：卖家未收到货,拒绝退款
REFUND_CLOSED：退款关闭
REFUND_SUCCESS：退款成功
        */
        private String refundStatus;
            @JsonProperty(value = "refund_items")
        /**
        * 订单明细数据结构
        */
        private OpenOrderItemDTO[] refundItems;
            @JsonProperty(value = "version")
        /**
        * 退款单版本号
        */
        private Long version;
    
            public void setRefundNo(String refundNo) {
            this.refundNo = refundNo;
        }

        public String getRefundNo() {
            return this.refundNo;
        }

            public void setSaleWay(String saleWay) {
            this.saleWay = saleWay;
        }

        public String getSaleWay() {
            return this.saleWay;
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

            public void setRefundItems(OpenOrderItemDTO[] refundItems) {
            this.refundItems = refundItems;
        }

        public OpenOrderItemDTO[] getRefundItems() {
            return this.refundItems;
        }

            public void setVersion(Long version) {
            this.version = version;
        }

        public Long getVersion() {
            return this.version;
        }

        }

    public static class Paginator {
            @JsonProperty(value = "page")
        /**
        * 当前页码
        */
        private Long page;
            @JsonProperty(value = "pageSize")
        /**
        * 每页数量
        */
        private Long pageSize;
            @JsonProperty(value = "totalCount")
        /**
        * 总数
        */
        private Long totalCount;
    
            public void setPage(Long page) {
            this.page = page;
        }

        public Long getPage() {
            return this.page;
        }

            public void setPageSize(Long pageSize) {
            this.pageSize = pageSize;
        }

        public Long getPageSize() {
            return this.pageSize;
        }

            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
        }

        }


}