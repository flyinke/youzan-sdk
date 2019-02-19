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

public class YouzanRetailOpenDistributionorderGetResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 配送单返回体
     */
    private OpenDistributionOrderResponse response;

    public void setResponse(OpenDistributionOrderResponse response) {
        this.response = response;
    }

    public OpenDistributionOrderResponse getResponse() {
        return this.response;
    }

    public static class OpenDistributionOrderResponse {
            @JsonProperty(value = "biz_bill_no")
        /**
        * 配送单号
        */
        private String bizBillNo;
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
        * 单据状态:
TO_CHECK=待审核
TO_OUT=待出库
TO_IN=待入库
REFUSED=已驳回
CLOSED=已关闭
FINISHED=已完成
OUT_DOING=出库执行中
IN_DOING=入库执行中
        */
        private String status;
            @JsonProperty(value = "creator")
        /**
        * 制单人
        */
        private String creator;
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
            @JsonProperty(value = "order_items")
        /**
        * 配送单明细
        */
        private OpenDistributionOrderItemDTO[] orderItems;
            @JsonProperty(value = "out_biz_bill_no")
        /**
        * 关联出库单据号
        */
        private String outBizBillNo;
            @JsonProperty(value = "in_biz_bill_no")
        /**
        * 关联入库单据号
        */
        private String inBizBillNo;
            @JsonProperty(value = "distributed_out_time")
        /**
        * 配送出库时间
        */
        private String distributedOutTime;
    
            public void setBizBillNo(String bizBillNo) {
            this.bizBillNo = bizBillNo;
        }

        public String getBizBillNo() {
            return this.bizBillNo;
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

            public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }

            public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getCreator() {
            return this.creator;
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

            public void setOrderItems(OpenDistributionOrderItemDTO[] orderItems) {
            this.orderItems = orderItems;
        }

        public OpenDistributionOrderItemDTO[] getOrderItems() {
            return this.orderItems;
        }

            public void setOutBizBillNo(String outBizBillNo) {
            this.outBizBillNo = outBizBillNo;
        }

        public String getOutBizBillNo() {
            return this.outBizBillNo;
        }

            public void setInBizBillNo(String inBizBillNo) {
            this.inBizBillNo = inBizBillNo;
        }

        public String getInBizBillNo() {
            return this.inBizBillNo;
        }

            public void setDistributedOutTime(String distributedOutTime) {
            this.distributedOutTime = distributedOutTime;
        }

        public String getDistributedOutTime() {
            return this.distributedOutTime;
        }

        }

    public static class OpenDistributionOrderItemDTO {
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

        }


}