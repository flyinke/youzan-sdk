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

public class YouzanRetailStockStockcheckGetResult implements APIResult {

    @JsonProperty(value = "stock_check_vo")
    /**
     * 盘点单VO
     */
    private StockCheckVO stockCheckVo;

    public void setStockCheckVo(StockCheckVO stockCheckVo) {
        this.stockCheckVo = stockCheckVo;
    }

    public StockCheckVO getStockCheckVo() {
        return this.stockCheckVo;
    }

    public static class StockCheckVO {
            @JsonProperty(value = "biz_bill_no")
        /**
        * 业务单据单号
        */
        private String bizBillNo;
            @JsonProperty(value = "idempotent_no")
        /**
        * 幂等单号（请求唯一标识）
        */
        private String idempotentNo;
            @JsonProperty(value = "business_time")
        /**
        * 盘点时间
        */
        private Long businessTime;
            @JsonProperty(value = "created_at")
        /**
        * 创建时间
        */
        private Long createdAt;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
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
        * 退货入库单用于记录关联订单号
        */
        private String sourceOrderNo;
            @JsonProperty(value = "operator_name")
        /**
        * 员工名称
        */
        private String operatorName;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "updated_at")
        /**
        * 更新时间
        */
        private Long updatedAt;
            @JsonProperty(value = "admin_id")
        /**
        * 员工id
        */
        private Long adminId;
            @JsonProperty(value = "status")
        /**
        * 状态（DOING(1, "待处理"),
  DONE(2, "处理成功"),
  FAIL(3, "处理失败")）
        */
        private Long status;
            @JsonProperty(value = "stock_take_order_items")
        /**
        * 盘点单明细
        */
        private StockCheckItemVO[] stockTakeOrderItems;
            @JsonProperty(value = "warehouse_name")
        /**
        * 仓库名称
        */
        private String warehouseName;
    
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

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
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

            public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getOperatorName() {
            return this.operatorName;
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

            public void setStockTakeOrderItems(StockCheckItemVO[] stockTakeOrderItems) {
            this.stockTakeOrderItems = stockTakeOrderItems;
        }

        public StockCheckItemVO[] getStockTakeOrderItems() {
            return this.stockTakeOrderItems;
        }

            public void setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
        }

        public String getWarehouseName() {
            return this.warehouseName;
        }

        }

    public static class StockCheckItemVO {
            @JsonProperty(value = "biz_bill_no")
        /**
        * 业务单据单号
        */
        private String bizBillNo;
            @JsonProperty(value = "amount")
        /**
        * 系统库存数量，amount= realAmount - oldAmount
        */
        private Long amount;
            @JsonProperty(value = "total_cost")
        /**
        * 成本价小计
        */
        private Long totalCost;
            @JsonProperty(value = "old_amount")
        /**
        * 数据库原值
        */
        private Long oldAmount;
            @JsonProperty(value = "sku_id")
        /**
        * skuId
        */
        private Long skuId;
            @JsonProperty(value = "type")
        /**
        * 业务类型
        */
        private Long type;
            @JsonProperty(value = "version")
        /**
        * 版本号
        */
        private Long version;
            @JsonProperty(value = "specifications")
        /**
        * 规格描述
        */
        private String specifications;
            @JsonProperty(value = "product_name")
        /**
        * 商品名称
        */
        private String productName;
            @JsonProperty(value = "real_amount")
        /**
        * 实际库存数量,变更后的值
        */
        private Long realAmount;
            @JsonProperty(value = "kdt_id")
        /**
        * 商家id
        */
        private Long kdtId;
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
            @JsonProperty(value = "sku_no")
        /**
        * sku序号
        */
        private String skuNo;
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

            public void setTotalCost(Long totalCost) {
            this.totalCost = totalCost;
        }

        public Long getTotalCost() {
            return this.totalCost;
        }

            public void setOldAmount(Long oldAmount) {
            this.oldAmount = oldAmount;
        }

        public Long getOldAmount() {
            return this.oldAmount;
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

            public void setVersion(Long version) {
            this.version = version;
        }

        public Long getVersion() {
            return this.version;
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

            public void setRealAmount(Long realAmount) {
            this.realAmount = realAmount;
        }

        public Long getRealAmount() {
            return this.realAmount;
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


}