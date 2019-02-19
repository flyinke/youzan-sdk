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

public class YouzanRetailOpenReturnorderQueryResult implements APIResult {

    @JsonProperty(value = "return_orders")
    /**
     * 退货单列表
     */
    private OpenReturnOrderDTO[] returnOrders;
    @JsonProperty(value = "paginator")
    /**
     * 记录总数
     */
    private Paginator paginator;

    public void setReturnOrders(OpenReturnOrderDTO[] returnOrders) {
        this.returnOrders = returnOrders;
    }

    public OpenReturnOrderDTO[] getReturnOrders() {
        return this.returnOrders;
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

    public static class OpenLogisticsDTO {
            @JsonProperty(value = "logistics_no")
        /**
        * 物流单号
        */
        private String logisticsNo;
            @JsonProperty(value = "company_code")
        /**
        * 物流公司编号
        */
        private String companyCode;
            @JsonProperty(value = "receiver")
        /**
        * 收件人
        */
        private String receiver;
            @JsonProperty(value = "mobile")
        /**
        * 收件人电话
        */
        private String mobile;
            @JsonProperty(value = "area_code")
        /**
        * 区号
        */
        private String areaCode;
            @JsonProperty(value = "telephone")
        /**
        * 座机
        */
        private String telephone;
            @JsonProperty(value = "extension_number")
        /**
        * 分机号
        */
        private String extensionNumber;
            @JsonProperty(value = "address")
        /**
        * 收件人地址
        */
        private String address;
            @JsonProperty(value = "postcode")
        /**
        * 邮编
        */
        private String postcode;
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
            @JsonProperty(value = "region")
        /**
        * 区
        */
        private String region;
            @JsonProperty(value = "create_time")
        /**
        * 详细地址
        */
        private String createTime;
            @JsonProperty(value = "update_time")
        /**
        * 移动电话
        */
        private String updateTime;
    
            public void setLogisticsNo(String logisticsNo) {
            this.logisticsNo = logisticsNo;
        }

        public String getLogisticsNo() {
            return this.logisticsNo;
        }

            public void setCompanyCode(String companyCode) {
            this.companyCode = companyCode;
        }

        public String getCompanyCode() {
            return this.companyCode;
        }

            public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public String getReceiver() {
            return this.receiver;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

            public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getAreaCode() {
            return this.areaCode;
        }

            public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getTelephone() {
            return this.telephone;
        }

            public void setExtensionNumber(String extensionNumber) {
            this.extensionNumber = extensionNumber;
        }

        public String getExtensionNumber() {
            return this.extensionNumber;
        }

            public void setAddress(String address) {
            this.address = address;
        }

        public String getAddress() {
            return this.address;
        }

            public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getPostcode() {
            return this.postcode;
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

            public void setRegion(String region) {
            this.region = region;
        }

        public String getRegion() {
            return this.region;
        }

            public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateTime() {
            return this.createTime;
        }

            public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getUpdateTime() {
            return this.updateTime;
        }

        }

    public static class OpenReturnOrderDTO {
            @JsonProperty(value = "return_order_no")
        /**
        * 退货单号
        */
        private String returnOrderNo;
            @JsonProperty(value = "sale_way")
        /**
        * 销售渠道:
ONLINE=网店
OFFLINE=门店
        */
        private String saleWay;
            @JsonProperty(value = "warehouse_code")
        /**
        * 退货仓库编码
        */
        private String warehouseCode;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "status")
        /**
        * 退货单状态:
WAIT_RECEIVED=卖家待收货
RECEIVED=卖家已收货
SELLER_REFUSE=卖家未收到货，拒绝退款
RETURN_STOCK_SUCCESS=已入库
        */
        private String status;
            @JsonProperty(value = "create_time")
        /**
        * 退款申请时间
        */
        private String createTime;
            @JsonProperty(value = "refund_amount")
        /**
        * 退款金额
        */
        private String refundAmount;
            @JsonProperty(value = "reason")
        /**
        * 退货原因
        */
        private String reason;
            @JsonProperty(value = "version")
        /**
        * 退货单版本
        */
        private Long version;
            @JsonProperty(value = "return_items")
        /**
        * 订单明细数据结构
        */
        private OpenOrderItemDTO[] returnItems;
            @JsonProperty(value = "logistics_info")
        /**
        * 物流信息数据结构
        */
        private OpenLogisticsDTO logisticsInfo;
    
            public void setReturnOrderNo(String returnOrderNo) {
            this.returnOrderNo = returnOrderNo;
        }

        public String getReturnOrderNo() {
            return this.returnOrderNo;
        }

            public void setSaleWay(String saleWay) {
            this.saleWay = saleWay;
        }

        public String getSaleWay() {
            return this.saleWay;
        }

            public void setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
        }

        public String getWarehouseCode() {
            return this.warehouseCode;
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

            public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateTime() {
            return this.createTime;
        }

            public void setRefundAmount(String refundAmount) {
            this.refundAmount = refundAmount;
        }

        public String getRefundAmount() {
            return this.refundAmount;
        }

            public void setReason(String reason) {
            this.reason = reason;
        }

        public String getReason() {
            return this.reason;
        }

            public void setVersion(Long version) {
            this.version = version;
        }

        public Long getVersion() {
            return this.version;
        }

            public void setReturnItems(OpenOrderItemDTO[] returnItems) {
            this.returnItems = returnItems;
        }

        public OpenOrderItemDTO[] getReturnItems() {
            return this.returnItems;
        }

            public void setLogisticsInfo(OpenLogisticsDTO logisticsInfo) {
            this.logisticsInfo = logisticsInfo;
        }

        public OpenLogisticsDTO getLogisticsInfo() {
            return this.logisticsInfo;
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