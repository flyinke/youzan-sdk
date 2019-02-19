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

public class YouzanRetailStockStockreturnGetResult implements APIResult {

    @JsonProperty(value = "stock_return_complex_vo")
    /**
     * 退货入库详情
     */
    private StockReturnComplexVO stockReturnComplexVo;

    public void setStockReturnComplexVo(StockReturnComplexVO stockReturnComplexVo) {
        this.stockReturnComplexVo = stockReturnComplexVo;
    }

    public StockReturnComplexVO getStockReturnComplexVo() {
        return this.stockReturnComplexVo;
    }

    public static class StockReturnOrderItemVO {
            @JsonProperty(value = "source_no")
        /**
        * 关联退货单编号
        */
        private String sourceNo;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 业务单据单号
        */
        private String bizBillNo;
            @JsonProperty(value = "amount")
        /**
        * 实际入库数量（千倍）
        */
        private Long amount;
            @JsonProperty(value = "return_amount")
        /**
        * 退货数量（千倍）  returnAmount= amount + ossAmount
        */
        private Long returnAmount;
            @JsonProperty(value = "total_cost")
        /**
        * 成本价小计
        */
        private Long totalCost;
            @JsonProperty(value = "sku_id")
        /**
        * 商品id
        */
        private Long skuId;
            @JsonProperty(value = "type")
        /**
        * 业务类型
        */
        private Long type;
            @JsonProperty(value = "specifications")
        /**
        * 规格信息
        */
        private String specifications;
            @JsonProperty(value = "product_name")
        /**
        * 商品名称
        */
        private String productName;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
            @JsonProperty(value = "sku_no")
        /**
        * 商品条码
        */
        private String skuNo;
            @JsonProperty(value = "loss_amount")
        /**
        * 破损数量（千倍）
        */
        private Long lossAmount;
            @JsonProperty(value = "admin_id")
        /**
        * 操作者id
        */
        private Long adminId;
            @JsonProperty(value = "unit_cost")
        /**
        * 成本单价
        */
        private Long unitCost;
    
            public void setSourceNo(String sourceNo) {
            this.sourceNo = sourceNo;
        }

        public String getSourceNo() {
            return this.sourceNo;
        }

            public void setBizBillNo(String bizBillNo) {
            this.bizBillNo = bizBillNo;
        }

        public String getBizBillNo() {
            return this.bizBillNo;
        }

            public void setAmount(Long amount) {
            this.amount = amount;
        }

        public Long getAmount() {
            return this.amount;
        }

            public void setReturnAmount(Long returnAmount) {
            this.returnAmount = returnAmount;
        }

        public Long getReturnAmount() {
            return this.returnAmount;
        }

            public void setTotalCost(Long totalCost) {
            this.totalCost = totalCost;
        }

        public Long getTotalCost() {
            return this.totalCost;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setSpecifications(String specifications) {
            this.specifications = specifications;
        }

        public String getSpecifications() {
            return this.specifications;
        }

            public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductName() {
            return this.productName;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getUnit() {
            return this.unit;
        }

            public void setSkuNo(String skuNo) {
            this.skuNo = skuNo;
        }

        public String getSkuNo() {
            return this.skuNo;
        }

            public void setLossAmount(Long lossAmount) {
            this.lossAmount = lossAmount;
        }

        public Long getLossAmount() {
            return this.lossAmount;
        }

            public void setAdminId(Long adminId) {
            this.adminId = adminId;
        }

        public Long getAdminId() {
            return this.adminId;
        }

            public void setUnitCost(Long unitCost) {
            this.unitCost = unitCost;
        }

        public Long getUnitCost() {
            return this.unitCost;
        }

        }

    public static class StockReturnComplexVO {
            @JsonProperty(value = "operator_name")
        /**
        * 操作员工名称
        */
        private String operatorName;
            @JsonProperty(value = "created_at")
        /**
        * 创建时间
        */
        private Long createdAt;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 业务单据单号
        */
        private String bizBillNo;
            @JsonProperty(value = "idempotent_no")
        /**
        * 幂等单号
        */
        private String idempotentNo;
            @JsonProperty(value = "business_time")
        /**
        * 业务时间
        */
        private Long businessTime;
            @JsonProperty(value = "stock_return_order_items")
        /**
        * 退货入库单明细
        */
        private StockReturnOrderItemVO[] stockReturnOrderItems;
            @JsonProperty(value = "type")
        /**
        * 业务类型（STOCK_CHECK(1, "库存盘点单"),
  STOCK_IN(2, "采购入库单"),
  STOCK_RETURN(3, "退货入库单"),
  STOCK_OUT(4, "出库单")）
        */
        private Long type;
            @JsonProperty(value = "source_order_no")
        /**
        * 原单号--记录订单数据（其他单据为业务单号）
        */
        private String sourceOrderNo;
            @JsonProperty(value = "kdt_id")
        /**
        * 商家id
        */
        private Long kdtId;
            @JsonProperty(value = "updated_at")
        /**
        * 更新时间
        */
        private Long updatedAt;
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
            @JsonProperty(value = "warehouse_name")
        /**
        * 仓库名称
        */
        private String warehouseName;
    
            public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getOperatorName() {
            return this.operatorName;
        }

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setBizBillNo(String bizBillNo) {
            this.bizBillNo = bizBillNo;
        }

        public String getBizBillNo() {
            return this.bizBillNo;
        }

            public void setIdempotentNo(String idempotentNo) {
            this.idempotentNo = idempotentNo;
        }

        public String getIdempotentNo() {
            return this.idempotentNo;
        }

            public void setBusinessTime(Long businessTime) {
            this.businessTime = businessTime;
        }

        public Long getBusinessTime() {
            return this.businessTime;
        }

            public void setStockReturnOrderItems(StockReturnOrderItemVO[] stockReturnOrderItems) {
            this.stockReturnOrderItems = stockReturnOrderItems;
        }

        public StockReturnOrderItemVO[] getStockReturnOrderItems() {
            return this.stockReturnOrderItems;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setSourceOrderNo(String sourceOrderNo) {
            this.sourceOrderNo = sourceOrderNo;
        }

        public String getSourceOrderNo() {
            return this.sourceOrderNo;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Long getUpdatedAt() {
            return this.updatedAt;
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

            public void setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
        }

        public String getWarehouseName() {
            return this.warehouseName;
        }

        }


}