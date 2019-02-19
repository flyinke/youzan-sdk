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

public class YouzanRetailOpenAllotorderGetResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 调拨单
     */
    private OpenAllotOrderDTO response;

    public void setResponse(OpenAllotOrderDTO response) {
        this.response = response;
    }

    public OpenAllotOrderDTO getResponse() {
        return this.response;
    }

    public static class OpenAllotOrderItemDTO {
            @JsonProperty(value = "sku_code")
        /**
        * sku编码
        */
        private String skuCode;
            @JsonProperty(value = "product_name")
        /**
        * 商品名称
        */
        private String productName;
            @JsonProperty(value = "sku_no")
        /**
        * sku条码
        */
        private String skuNo;
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
            @JsonProperty(value = "pre_out_num")
        /**
        * 预发数量
        */
        private String preOutNum;
            @JsonProperty(value = "actual_out_num")
        /**
        * 实际出库数量
        */
        private String actualOutNum;
            @JsonProperty(value = "actual_in_num")
        /**
        * 实际入库数量
        */
        private String actualInNum;
            @JsonProperty(value = "unit_cost")
        /**
        * 成本单价
        */
        private String unitCost;
            @JsonProperty(value = "delivery_cost")
        /**
        * 配送价
        */
        private String deliveryCost;
            @JsonProperty(value = "checked_delivery_cost")
        /**
        * 审核配送价
        */
        private String checkedDeliveryCost;
            @JsonProperty(value = "total_cost")
        /**
        * 总价
        */
        private String totalCost;
    
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

            public void setApplyNum(String applyNum) {
            this.applyNum = applyNum;
        }

        public String getApplyNum() {
            return this.applyNum;
        }

            public void setPreOutNum(String preOutNum) {
            this.preOutNum = preOutNum;
        }

        public String getPreOutNum() {
            return this.preOutNum;
        }

            public void setActualOutNum(String actualOutNum) {
            this.actualOutNum = actualOutNum;
        }

        public String getActualOutNum() {
            return this.actualOutNum;
        }

            public void setActualInNum(String actualInNum) {
            this.actualInNum = actualInNum;
        }

        public String getActualInNum() {
            return this.actualInNum;
        }

            public void setUnitCost(String unitCost) {
            this.unitCost = unitCost;
        }

        public String getUnitCost() {
            return this.unitCost;
        }

            public void setDeliveryCost(String deliveryCost) {
            this.deliveryCost = deliveryCost;
        }

        public String getDeliveryCost() {
            return this.deliveryCost;
        }

            public void setCheckedDeliveryCost(String checkedDeliveryCost) {
            this.checkedDeliveryCost = checkedDeliveryCost;
        }

        public String getCheckedDeliveryCost() {
            return this.checkedDeliveryCost;
        }

            public void setTotalCost(String totalCost) {
            this.totalCost = totalCost;
        }

        public String getTotalCost() {
            return this.totalCost;
        }

        }

    public static class OpenAllotOrderDTO {
            @JsonProperty(value = "allot_order_no")
        /**
        * 调拨单号
        */
        private String allotOrderNo;
            @JsonProperty(value = "from_warehouse_code")
        /**
        * 调出仓库仓库编码
        */
        private String fromWarehouseCode;
            @JsonProperty(value = "from_warehouse_name")
        /**
        * 调出仓库仓库名称
        */
        private String fromWarehouseName;
            @JsonProperty(value = "to_warehouse_code")
        /**
        * 调入仓库仓库编码
        */
        private String toWarehouseCode;
            @JsonProperty(value = "to_warehouse_name")
        /**
        * 调入仓库仓库名称
        */
        private String toWarehouseName;
            @JsonProperty(value = "status")
        /**
        * 单据状态：
1=待审核
2=待出库
3=待入库
4=已驳回
5=已关闭
6=已完成
7=出库执行中
8=入库执行中
        */
        private Long status;
            @JsonProperty(value = "type")
        /**
        * 单据类型：
1=店内调拨单
2=店间调拨单
        */
        private Long type;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "refused_reason")
        /**
        * 驳回原因
        */
        private String refusedReason;
            @JsonProperty(value = "out_biz_no")
        /**
        * 关联出库单单据号
        */
        private String outBizNo;
            @JsonProperty(value = "in_biz_no")
        /**
        * 关联入库单单据号
        */
        private String inBizNo;
            @JsonProperty(value = "creator")
        /**
        * 制单人
        */
        private String creator;
            @JsonProperty(value = "createdTime")
        /**
        * 制单时间
        */
        private String createdTime;
            @JsonProperty(value = "order_items")
        /**
        * 调拨单明细
        */
        private OpenAllotOrderItemDTO[] orderItems;
    
            public void setAllotOrderNo(String allotOrderNo) {
            this.allotOrderNo = allotOrderNo;
        }

        public String getAllotOrderNo() {
            return this.allotOrderNo;
        }

            public void setFromWarehouseCode(String fromWarehouseCode) {
            this.fromWarehouseCode = fromWarehouseCode;
        }

        public String getFromWarehouseCode() {
            return this.fromWarehouseCode;
        }

            public void setFromWarehouseName(String fromWarehouseName) {
            this.fromWarehouseName = fromWarehouseName;
        }

        public String getFromWarehouseName() {
            return this.fromWarehouseName;
        }

            public void setToWarehouseCode(String toWarehouseCode) {
            this.toWarehouseCode = toWarehouseCode;
        }

        public String getToWarehouseCode() {
            return this.toWarehouseCode;
        }

            public void setToWarehouseName(String toWarehouseName) {
            this.toWarehouseName = toWarehouseName;
        }

        public String getToWarehouseName() {
            return this.toWarehouseName;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

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

            public void setRefusedReason(String refusedReason) {
            this.refusedReason = refusedReason;
        }

        public String getRefusedReason() {
            return this.refusedReason;
        }

            public void setOutBizNo(String outBizNo) {
            this.outBizNo = outBizNo;
        }

        public String getOutBizNo() {
            return this.outBizNo;
        }

            public void setInBizNo(String inBizNo) {
            this.inBizNo = inBizNo;
        }

        public String getInBizNo() {
            return this.inBizNo;
        }

            public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getCreator() {
            return this.creator;
        }

            public void setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
        }

        public String getCreatedTime() {
            return this.createdTime;
        }

            public void setOrderItems(OpenAllotOrderItemDTO[] orderItems) {
            this.orderItems = orderItems;
        }

        public OpenAllotOrderItemDTO[] getOrderItems() {
            return this.orderItems;
        }

        }


}