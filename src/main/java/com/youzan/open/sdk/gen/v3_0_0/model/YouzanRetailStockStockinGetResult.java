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

public class YouzanRetailStockStockinGetResult implements APIResult {

    @JsonProperty(value = "stock_in_order_vo")
    /**
     * 入库单实体信息
     */
    private StockInOrderVO stockInOrderVo;

    public void setStockInOrderVo(StockInOrderVO stockInOrderVo) {
        this.stockInOrderVo = stockInOrderVo;
    }

    public StockInOrderVO getStockInOrderVo() {
        return this.stockInOrderVo;
    }

    public static class StockInOrderVO {
            @JsonProperty(value = "operato_name")
        /**
        * 操作人
        */
        private String operatoName;
            @JsonProperty(value = "vendor_id")
        /**
        * 供应商ID
        */
        private Long vendorId;
            @JsonProperty(value = "vendor_name")
        /**
        * 供应商名称
        */
        private String vendorName;
            @JsonProperty(value = "real_payment")
        /**
        * 实付金额(单位分)
        */
        private Long realPayment;
            @JsonProperty(value = "remark")
        /**
        * 入库备注
        */
        private String remark;
            @JsonProperty(value = "stock_in_order_items")
        /**
        * 入库单明细
        */
        private StockInOrderItemVO[] stockInOrderItems;
            @JsonProperty(value = "kdt_id")
        /**
        * 商家id
        */
        private Long kdtId;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 业务单据单号
        */
        private String bizBillNo;
            @JsonProperty(value = "type")
        /**
        * 业务类型
        */
        private Long type;
            @JsonProperty(value = "admin_id")
        /**
        * 操作者id
        */
        private Long adminId;
            @JsonProperty(value = "status")
        /**
        * 状态
        */
        private Long status;
            @JsonProperty(value = "business_time")
        /**
        * 业务时间
        */
        private Date businessTime;
            @JsonProperty(value = "idempotent_no")
        /**
        * 幂等单号
        */
        private String idempotentNo;
            @JsonProperty(value = "source_order_no")
        /**
        * 原单号--记录订单数据（其他单据为业务单号）
        */
        private String sourceOrderNo;
            @JsonProperty(value = "version")
        /**
        * 版本号
        */
        private Long version;
            @JsonProperty(value = "warehouse_name")
        /**
        * 仓库名称
        */
        private String warehouseName;
    
            public void setOperatoName(String operatoName) {
            this.operatoName = operatoName;
        }

        public String getOperatoName() {
            return this.operatoName;
        }

            public void setVendorId(Long vendorId) {
            this.vendorId = vendorId;
        }

        public Long getVendorId() {
            return this.vendorId;
        }

            public void setVendorName(String vendorName) {
            this.vendorName = vendorName;
        }

        public String getVendorName() {
            return this.vendorName;
        }

            public void setRealPayment(Long realPayment) {
            this.realPayment = realPayment;
        }

        public Long getRealPayment() {
            return this.realPayment;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setStockInOrderItems(StockInOrderItemVO[] stockInOrderItems) {
            this.stockInOrderItems = stockInOrderItems;
        }

        public StockInOrderItemVO[] getStockInOrderItems() {
            return this.stockInOrderItems;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setBizBillNo(String bizBillNo) {
            this.bizBillNo = bizBillNo;
        }

        public String getBizBillNo() {
            return this.bizBillNo;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setAdminId(Long adminId) {
            this.adminId = adminId;
        }

        public Long getAdminId() {
            return this.adminId;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setBusinessTime(Date businessTime) {
            this.businessTime = businessTime;
        }

        public Date getBusinessTime() {
            return this.businessTime;
        }

            public void setIdempotentNo(String idempotentNo) {
            this.idempotentNo = idempotentNo;
        }

        public String getIdempotentNo() {
            return this.idempotentNo;
        }

            public void setSourceOrderNo(String sourceOrderNo) {
            this.sourceOrderNo = sourceOrderNo;
        }

        public String getSourceOrderNo() {
            return this.sourceOrderNo;
        }

            public void setVersion(Long version) {
            this.version = version;
        }

        public Long getVersion() {
            return this.version;
        }

            public void setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
        }

        public String getWarehouseName() {
            return this.warehouseName;
        }

        }

    public static class StockInOrderItemVO {
            @JsonProperty(value = "product_name")
        /**
        * 商品名称
        */
        private String productName;
            @JsonProperty(value = "specifications")
        /**
        * 规格描述
        */
        private String specifications;
            @JsonProperty(value = "sku_no")
        /**
        * 条码
        */
        private String skuNo;
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
            @JsonProperty(value = "amount")
        /**
        * 数量（一千倍）
        */
        private Long amount;
            @JsonProperty(value = "sku_id")
        /**
        * skuId
        */
        private Long skuId;
            @JsonProperty(value = "unit_cost")
        /**
        * 成本单价（单位：分）
        */
        private Long unitCost;
            @JsonProperty(value = "total_cost")
        /**
        * 成本价小计
        */
        private Long totalCost;
            @JsonProperty(value = "admin_id")
        /**
        * 操作者id
        */
        private Long adminId;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 业务单据单号
        */
        private String bizBillNo;
            @JsonProperty(value = "kdt_id")
        /**
        * 商家id
        */
        private Long kdtId;
            @JsonProperty(value = "type")
        /**
        * 业务类型
        */
        private Long type;
    
            public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductName() {
            return this.productName;
        }

            public void setSpecifications(String specifications) {
            this.specifications = specifications;
        }

        public String getSpecifications() {
            return this.specifications;
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

            public void setAmount(Long amount) {
            this.amount = amount;
        }

        public Long getAmount() {
            return this.amount;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setUnitCost(Long unitCost) {
            this.unitCost = unitCost;
        }

        public Long getUnitCost() {
            return this.unitCost;
        }

            public void setTotalCost(Long totalCost) {
            this.totalCost = totalCost;
        }

        public Long getTotalCost() {
            return this.totalCost;
        }

            public void setAdminId(Long adminId) {
            this.adminId = adminId;
        }

        public Long getAdminId() {
            return this.adminId;
        }

            public void setBizBillNo(String bizBillNo) {
            this.bizBillNo = bizBillNo;
        }

        public String getBizBillNo() {
            return this.bizBillNo;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

        }


}