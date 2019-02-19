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

public class YouzanRetailOpenPurchaseorderGetResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 采购单
     */
    private OpenPurchaseOrderDTO response;

    public void setResponse(OpenPurchaseOrderDTO response) {
        this.response = response;
    }

    public OpenPurchaseOrderDTO getResponse() {
        return this.response;
    }

    public static class OpenPurchaseOrderDTO {
            @JsonProperty(value = "purchase_order_no")
        /**
        * 采购单号
        */
        private String purchaseOrderNo;
            @JsonProperty(value = "warehouse_code")
        /**
        * 仓库编码
        */
        private String warehouseCode;
            @JsonProperty(value = "warehouse_name")
        /**
        * 仓库名称
        */
        private String warehouseName;
            @JsonProperty(value = "supplier_code")
        /**
        * 供应商编码
        */
        private String supplierCode;
            @JsonProperty(value = "supplier_name")
        /**
        * 供应商名称
        */
        private String supplierName;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "with_tax_total_cost")
        /**
        * 含税成本价总价
        */
        private String withTaxTotalCost;
            @JsonProperty(value = "without_tax_total_cost")
        /**
        * 不含税成本价总价
        */
        private String withoutTaxTotalCost;
            @JsonProperty(value = "order_items")
        /**
        * 采购申请单明细
        */
        private OpenPurchaseOrderItemDTO[] orderItems;
    
            public void setPurchaseOrderNo(String purchaseOrderNo) {
            this.purchaseOrderNo = purchaseOrderNo;
        }

        public String getPurchaseOrderNo() {
            return this.purchaseOrderNo;
        }

            public void setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
        }

        public String getWarehouseCode() {
            return this.warehouseCode;
        }

            public void setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
        }

        public String getWarehouseName() {
            return this.warehouseName;
        }

            public void setSupplierCode(String supplierCode) {
            this.supplierCode = supplierCode;
        }

        public String getSupplierCode() {
            return this.supplierCode;
        }

            public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

        public String getSupplierName() {
            return this.supplierName;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setWithTaxTotalCost(String withTaxTotalCost) {
            this.withTaxTotalCost = withTaxTotalCost;
        }

        public String getWithTaxTotalCost() {
            return this.withTaxTotalCost;
        }

            public void setWithoutTaxTotalCost(String withoutTaxTotalCost) {
            this.withoutTaxTotalCost = withoutTaxTotalCost;
        }

        public String getWithoutTaxTotalCost() {
            return this.withoutTaxTotalCost;
        }

            public void setOrderItems(OpenPurchaseOrderItemDTO[] orderItems) {
            this.orderItems = orderItems;
        }

        public OpenPurchaseOrderItemDTO[] getOrderItems() {
            return this.orderItems;
        }

        }

    public static class OpenPurchaseOrderItemDTO {
            @JsonProperty(value = "sku_code")
        /**
        * sku编码
        */
        private String skuCode;
            @JsonProperty(value = "sku_no")
        /**
        * sku条码
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
            @JsonProperty(value = "apply_num")
        /**
        * 申请数量
        */
        private String applyNum;
            @JsonProperty(value = "actual_in_num")
        /**
        * 实际入库数量
        */
        private String actualInNum;
            @JsonProperty(value = "with_tax_unit_cost")
        /**
        * 含税成本价
        */
        private String withTaxUnitCost;
            @JsonProperty(value = "with_tax_total_cost")
        /**
        * 含税成本价总价
        */
        private String withTaxTotalCost;
            @JsonProperty(value = "without_tax_unit_cost")
        /**
        * 不含税成本价
        */
        private String withoutTaxUnitCost;
            @JsonProperty(value = "without_tax_total_cost")
        /**
        * 不含税成本价总价
        */
        private String withoutTaxTotalCost;
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

            public void setApplyNum(String applyNum) {
            this.applyNum = applyNum;
        }

        public String getApplyNum() {
            return this.applyNum;
        }

            public void setActualInNum(String actualInNum) {
            this.actualInNum = actualInNum;
        }

        public String getActualInNum() {
            return this.actualInNum;
        }

            public void setWithTaxUnitCost(String withTaxUnitCost) {
            this.withTaxUnitCost = withTaxUnitCost;
        }

        public String getWithTaxUnitCost() {
            return this.withTaxUnitCost;
        }

            public void setWithTaxTotalCost(String withTaxTotalCost) {
            this.withTaxTotalCost = withTaxTotalCost;
        }

        public String getWithTaxTotalCost() {
            return this.withTaxTotalCost;
        }

            public void setWithoutTaxUnitCost(String withoutTaxUnitCost) {
            this.withoutTaxUnitCost = withoutTaxUnitCost;
        }

        public String getWithoutTaxUnitCost() {
            return this.withoutTaxUnitCost;
        }

            public void setWithoutTaxTotalCost(String withoutTaxTotalCost) {
            this.withoutTaxTotalCost = withoutTaxTotalCost;
        }

        public String getWithoutTaxTotalCost() {
            return this.withoutTaxTotalCost;
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

        }


}