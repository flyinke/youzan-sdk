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

public class YouzanRetailOpenStockcheckorderGetResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 盘点单返回体
     */
    private OpenStockCheckOrderResponse response;

    public void setResponse(OpenStockCheckOrderResponse response) {
        this.response = response;
    }

    public OpenStockCheckOrderResponse getResponse() {
        return this.response;
    }

    public static class OpenStockCheckOrderItemDTO {
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
            @JsonProperty(value = "old_num")
        /**
        * 原库存数
        */
        private String oldNum;
            @JsonProperty(value = "real_num")
        /**
        * 实际库存数（变更后的值）
        */
        private String realNum;
            @JsonProperty(value = "number")
        /**
        * 系统库存数（实际库存-原库存）
        */
        private String number;
    
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

            public void setOldNum(String oldNum) {
            this.oldNum = oldNum;
        }

        public String getOldNum() {
            return this.oldNum;
        }

            public void setRealNum(String realNum) {
            this.realNum = realNum;
        }

        public String getRealNum() {
            return this.realNum;
        }

            public void setNumber(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }

        }

    public static class OpenStockCheckOrderResponse {
            @JsonProperty(value = "biz_bill_no")
        /**
        * 单点单号
        */
        private String bizBillNo;
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
            @JsonProperty(value = "status")
        /**
        * 单据状态:
CHECKING=盘点中
DONE=已完成
CANCEL=已作废
ASYNC_DOING=异步处理中
FAILURE=失败
        */
        private String status;
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
        * 制单时间
        */
        private String createdTime;
            @JsonProperty(value = "order_items")
        /**
        * 盘点单明细
        */
        private OpenStockCheckOrderItemDTO[] orderItems;
    
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

            public void setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
        }

        public String getWarehouseName() {
            return this.warehouseName;
        }

            public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
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

            public void setOrderItems(OpenStockCheckOrderItemDTO[] orderItems) {
            this.orderItems = orderItems;
        }

        public OpenStockCheckOrderItemDTO[] getOrderItems() {
            return this.orderItems;
        }

        }


}