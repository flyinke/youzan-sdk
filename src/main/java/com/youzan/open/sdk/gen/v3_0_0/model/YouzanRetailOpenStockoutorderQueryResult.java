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

public class YouzanRetailOpenStockoutorderQueryResult implements APIResult {

    @JsonProperty(value = "orders")
    /**
     * 单据信息
     */
    private OpenStockOutOrderDTO[] orders;
    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private OpenPaginatorDTO paginator;

    public void setOrders(OpenStockOutOrderDTO[] orders) {
        this.orders = orders;
    }

    public OpenStockOutOrderDTO[] getOrders() {
        return this.orders;
    }
    public void setPaginator(OpenPaginatorDTO paginator) {
        this.paginator = paginator;
    }

    public OpenPaginatorDTO getPaginator() {
        return this.paginator;
    }

    public static class OpenStockOrderItemDTO {
            @JsonProperty(value = "sku_code")
        /**
        * 商品编码
        */
        private String skuCode;
            @JsonProperty(value = "sku_no")
        /**
        * 商品条码
        */
        private String skuNo;
            @JsonProperty(value = "product_name")
        /**
        * 商品名称
        */
        private String productName;
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
            @JsonProperty(value = "with_tax_cost")
        /**
        * 含税成本单价（元）
        */
        private String withTaxCost;
            @JsonProperty(value = "with_tax_amount")
        /**
        * 税总金额（含税成本单价*数量）
        */
        private String withTaxAmount;
            @JsonProperty(value = "without_tax_cost")
        /**
        * 不含税成本单价（元）
        */
        private String withoutTaxCost;
            @JsonProperty(value = "without_tax_amount")
        /**
        * 不含税总金额（不含税成本单价*数量）
        */
        private String withoutTaxAmount;
            @JsonProperty(value = "output_tax_rate")
        /**
        * 销项税率
        */
        private String outputTaxRate;
            @JsonProperty(value = "input_tax_rate")
        /**
        * 进项税率
        */
        private String inputTaxRate;
            @JsonProperty(value = "real_sales_price")
        /**
        * 成交单价（单个商品的实付单价，销售出库单中才存在）（元）
        */
        private String realSalesPrice;
            @JsonProperty(value = "with_tax_income")
        /**
        * 成交单价（单个商品的实付单价，销售出库单中才存在）（元）
        */
        private String withTaxIncome;
    
            public void setSkuCode(String skuCode) {
            this.skuCode = skuCode;
        }

        public String getSkuCode() {
            return this.skuCode;
        }

            public void setSkuNo(String skuNo) {
            this.skuNo = skuNo;
        }

        public String getSkuNo() {
            return this.skuNo;
        }

            public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductName() {
            return this.productName;
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

            public void setWithTaxCost(String withTaxCost) {
            this.withTaxCost = withTaxCost;
        }

        public String getWithTaxCost() {
            return this.withTaxCost;
        }

            public void setWithTaxAmount(String withTaxAmount) {
            this.withTaxAmount = withTaxAmount;
        }

        public String getWithTaxAmount() {
            return this.withTaxAmount;
        }

            public void setWithoutTaxCost(String withoutTaxCost) {
            this.withoutTaxCost = withoutTaxCost;
        }

        public String getWithoutTaxCost() {
            return this.withoutTaxCost;
        }

            public void setWithoutTaxAmount(String withoutTaxAmount) {
            this.withoutTaxAmount = withoutTaxAmount;
        }

        public String getWithoutTaxAmount() {
            return this.withoutTaxAmount;
        }

            public void setOutputTaxRate(String outputTaxRate) {
            this.outputTaxRate = outputTaxRate;
        }

        public String getOutputTaxRate() {
            return this.outputTaxRate;
        }

            public void setInputTaxRate(String inputTaxRate) {
            this.inputTaxRate = inputTaxRate;
        }

        public String getInputTaxRate() {
            return this.inputTaxRate;
        }

            public void setRealSalesPrice(String realSalesPrice) {
            this.realSalesPrice = realSalesPrice;
        }

        public String getRealSalesPrice() {
            return this.realSalesPrice;
        }

            public void setWithTaxIncome(String withTaxIncome) {
            this.withTaxIncome = withTaxIncome;
        }

        public String getWithTaxIncome() {
            return this.withTaxIncome;
        }

        }

    public static class OpenPaginatorDTO {
            @JsonProperty(value = "page")
        /**
        * 页码
        */
        private Long page;
            @JsonProperty(value = "page_size")
        /**
        * 分页大小
        */
        private Long pageSize;
            @JsonProperty(value = "total_count")
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

    public static class OpenStockOutOrderDTO {
            @JsonProperty(value = "biz_bill_no")
        /**
        * 单据编号
        */
        private String bizBillNo;
            @JsonProperty(value = "warehouse_code")
        /**
        * 仓库编码
        */
        private String warehouseCode;
            @JsonProperty(value = "create_time")
        /**
        * 单据日期(YYYY-MM-DD HH:MM:SS)
        */
        private String createTime;
            @JsonProperty(value = "order_type")
        /**
        * 出库单类型(BSCK=报损出库;PKCK=盘亏出库;
CGTC=采购退厂; XSCK=销售出库;DBCK=调拨出库;)
        */
        private String orderType;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "creator")
        /**
        * 制单人
        */
        private String creator;
            @JsonProperty(value = "source_order_no")
        /**
        * 关联单据号，如交易出库关联的订单号
        */
        private String sourceOrderNo;
            @JsonProperty(value = "order_items")
        /**
        * 订单明细
        */
        private OpenStockOrderItemDTO[] orderItems;
    
            public void setBizBillNo(String bizBillNo) {
            this.bizBillNo = bizBillNo;
        }

        public String getBizBillNo() {
            return this.bizBillNo;
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

            public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getOrderType() {
            return this.orderType;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getCreator() {
            return this.creator;
        }

            public void setSourceOrderNo(String sourceOrderNo) {
            this.sourceOrderNo = sourceOrderNo;
        }

        public String getSourceOrderNo() {
            return this.sourceOrderNo;
        }

            public void setOrderItems(OpenStockOrderItemDTO[] orderItems) {
            this.orderItems = orderItems;
        }

        public OpenStockOrderItemDTO[] getOrderItems() {
            return this.orderItems;
        }

        }


}