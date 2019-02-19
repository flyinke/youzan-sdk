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

public class YouzanRetailStockCostchangeGetResult implements APIResult {

    @JsonProperty(value = "cost_change_order_vo")
    /**
     * 成本变更实体信息
     */
    private CostChangeOrderVO costChangeOrderVo;

    public void setCostChangeOrderVo(CostChangeOrderVO costChangeOrderVo) {
        this.costChangeOrderVo = costChangeOrderVo;
    }

    public CostChangeOrderVO getCostChangeOrderVo() {
        return this.costChangeOrderVo;
    }

    public static class CostChangeOrderItemVO {
            @JsonProperty(value = "product_name")
        /**
        * 商品名称
        */
        private String productName;
            @JsonProperty(value = "specifications")
        /**
        * 规格
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
            @JsonProperty(value = "before_unit_cost")
        /**
        * 调整前成本单价
        */
        private Long beforeUnitCost;
            @JsonProperty(value = "after_unit_cost")
        /**
        * 调整前后成本单价
        */
        private Long afterUnitCost;
            @JsonProperty(value = "change_current_num")
        /**
        * 变更时库存值
        */
        private Long changeCurrentNum;
            @JsonProperty(value = "change_total_cost")
        /**
        * 变更小计
        */
        private Long changeTotalCost;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 业务单据号
        */
        private String bizBillNo;
            @JsonProperty(value = "type")
        /**
        * 业务类型
        */
        private Long type;
            @JsonProperty(value = "sku_id")
        /**
        * skuId
        */
        private Long skuId;
    
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

            public void setBeforeUnitCost(Long beforeUnitCost) {
            this.beforeUnitCost = beforeUnitCost;
        }

        public Long getBeforeUnitCost() {
            return this.beforeUnitCost;
        }

            public void setAfterUnitCost(Long afterUnitCost) {
            this.afterUnitCost = afterUnitCost;
        }

        public Long getAfterUnitCost() {
            return this.afterUnitCost;
        }

            public void setChangeCurrentNum(Long changeCurrentNum) {
            this.changeCurrentNum = changeCurrentNum;
        }

        public Long getChangeCurrentNum() {
            return this.changeCurrentNum;
        }

            public void setChangeTotalCost(Long changeTotalCost) {
            this.changeTotalCost = changeTotalCost;
        }

        public Long getChangeTotalCost() {
            return this.changeTotalCost;
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

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

        }

    public static class CostChangeOrderVO {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "warehouse_name")
        /**
        * 仓库名称
        */
        private String warehouseName;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 业务单据号
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
            @JsonProperty(value = "operator_name")
        /**
        * 操作人
        */
        private String operatorName;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "change_total_cost")
        /**
        * 变更总金额
        */
        private Long changeTotalCost;
            @JsonProperty(value = "cost_change_order_items")
        /**
        * 成本变更明细
        */
        private CostChangeOrderItemVO[] costChangeOrderItems;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
        }

        public String getWarehouseName() {
            return this.warehouseName;
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

            public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getOperatorName() {
            return this.operatorName;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setChangeTotalCost(Long changeTotalCost) {
            this.changeTotalCost = changeTotalCost;
        }

        public Long getChangeTotalCost() {
            return this.changeTotalCost;
        }

            public void setCostChangeOrderItems(CostChangeOrderItemVO[] costChangeOrderItems) {
            this.costChangeOrderItems = costChangeOrderItems;
        }

        public CostChangeOrderItemVO[] getCostChangeOrderItems() {
            return this.costChangeOrderItems;
        }

        }


}