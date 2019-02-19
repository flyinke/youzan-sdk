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

public class YouzanRetailOpenApplyorderGetResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 要货申请单
     */
    private OpenGoodsApplyOrderDTO response;

    public void setResponse(OpenGoodsApplyOrderDTO response) {
        this.response = response;
    }

    public OpenGoodsApplyOrderDTO getResponse() {
        return this.response;
    }

    public static class OpenApplyOrderItemDTO {
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
            @JsonProperty(value = "delivery_cost")
        /**
        * 配送价（元）
        */
        private String deliveryCost;
            @JsonProperty(value = "checked_delivery_cost")
        /**
        * 审核配送价（元）
        */
        private String checkedDeliveryCost;
            @JsonProperty(value = "sku_code")
        /**
        * 商品sku编码
        */
        private String skuCode;
            @JsonProperty(value = "product_name")
        /**
        * 商品名称
        */
        private String productName;
            @JsonProperty(value = "sku_no")
        /**
        * 商品sku条码
        */
        private String skuNo;
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
            @JsonProperty(value = "with_tax_cost")
        /**
        * 含税成本单价（元）
        */
        private String withTaxCost;
            @JsonProperty(value = "without_tax_cost")
        /**
        * 不含税成本单价（元）
        */
        private String withoutTaxCost;
            @JsonProperty(value = "without_tax_amount")
        /**
        * 不含税总金额
        */
        private String withoutTaxAmount;
            @JsonProperty(value = "with_tax_amount")
        /**
        * 含税总金额
        */
        private String withTaxAmount;
    
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

            public void setWithTaxCost(String withTaxCost) {
            this.withTaxCost = withTaxCost;
        }

        public String getWithTaxCost() {
            return this.withTaxCost;
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

            public void setWithTaxAmount(String withTaxAmount) {
            this.withTaxAmount = withTaxAmount;
        }

        public String getWithTaxAmount() {
            return this.withTaxAmount;
        }

        }

    public static class OpenGoodsApplyOrderDTO {
            @JsonProperty(value = "apply_biz_no")
        /**
        * 要货申请单单号
        */
        private String applyBizNo;
            @JsonProperty(value = "from_warehouse_code")
        /**
        * 出库仓库编码
        */
        private String fromWarehouseCode;
            @JsonProperty(value = "to_warehouse_code")
        /**
        * 入库仓库编码
        */
        private String toWarehouseCode;
            @JsonProperty(value = "from_warehouse_name")
        /**
        * 出库仓库名称
        */
        private String fromWarehouseName;
            @JsonProperty(value = "to_warehouse_name")
        /**
        * 入库仓库名称
        */
        private String toWarehouseName;
            @JsonProperty(value = "status")
        /**
        * 1-待审核 2-待出库 3-待入库 4-已驳回 5-已关闭 6-已完成 7-出库执行中 8-入库执行中
        */
        private Long status;
            @JsonProperty(value = "refused_reason")
        /**
        * 拒绝理由
        */
        private String refusedReason;
            @JsonProperty(value = "out_biz_no")
        /**
        * 出库单据编号
        */
        private String outBizNo;
            @JsonProperty(value = "in_biz_no")
        /**
        * 入库单据编号
        */
        private String inBizNo;
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
            @JsonProperty(value = "created_time")
        /**
        * 单据日期
        */
        private String createdTime;
            @JsonProperty(value = "order_items")
        /**
        * 要货申请单-商品详情
        */
        private OpenApplyOrderItemDTO[] orderItems;
            @JsonProperty(value = "dis_orders")
        /**
        * 关联配送单号
        */
        private String[] disOrders;
    
            public void setApplyBizNo(String applyBizNo) {
            this.applyBizNo = applyBizNo;
        }

        public String getApplyBizNo() {
            return this.applyBizNo;
        }

            public void setFromWarehouseCode(String fromWarehouseCode) {
            this.fromWarehouseCode = fromWarehouseCode;
        }

        public String getFromWarehouseCode() {
            return this.fromWarehouseCode;
        }

            public void setToWarehouseCode(String toWarehouseCode) {
            this.toWarehouseCode = toWarehouseCode;
        }

        public String getToWarehouseCode() {
            return this.toWarehouseCode;
        }

            public void setFromWarehouseName(String fromWarehouseName) {
            this.fromWarehouseName = fromWarehouseName;
        }

        public String getFromWarehouseName() {
            return this.fromWarehouseName;
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

            public void setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
        }

        public String getCreatedTime() {
            return this.createdTime;
        }

            public void setOrderItems(OpenApplyOrderItemDTO[] orderItems) {
            this.orderItems = orderItems;
        }

        public OpenApplyOrderItemDTO[] getOrderItems() {
            return this.orderItems;
        }

            public void setDisOrders(String[] disOrders) {
            this.disOrders = disOrders;
        }

        public String[] getDisOrders() {
            return this.disOrders;
        }

        }


}