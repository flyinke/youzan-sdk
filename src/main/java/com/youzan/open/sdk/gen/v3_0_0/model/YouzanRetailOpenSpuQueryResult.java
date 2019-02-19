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

public class YouzanRetailOpenSpuQueryResult implements APIResult {

    @JsonProperty(value = "spus")
    /**
     * 商品spu信息列表
     */
    private OpenSpuDTO[] spus;
    @JsonProperty(value = "paginator")
    /**
     * 分页结果信息
     */
    private Paginator paginator;

    public void setSpus(OpenSpuDTO[] spus) {
        this.spus = spus;
    }

    public OpenSpuDTO[] getSpus() {
        return this.spus;
    }
    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }

    public static class OpenSpuDTO {
            @JsonProperty(value = "category_id")
        /**
        * 类目ID
        */
        private String categoryId;
            @JsonProperty(value = "category_name")
        /**
        * 类目名称
        */
        private String categoryName;
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
            @JsonProperty(value = "spu_no")
        /**
        * spu条码
        */
        private String spuNo;
            @JsonProperty(value = "bar_codes")
        /**
        * 一品多码
        */
        private String[] barCodes;
            @JsonProperty(value = "sell_channels")
        /**
        * 销售渠道
2=门店,4=网店
        */
        private Number[] sellChannels;
            @JsonProperty(value = "create_time")
        /**
        * 创建时间
        */
        private String createTime;
            @JsonProperty(value = "update_time")
        /**
        * 修改时间
        */
        private String updateTime;
            @JsonProperty(value = "skus")
        /**
        * sku信息
        */
        private OpenSkuDTO[] skus;
            @JsonProperty(value = "spu_code")
        /**
        * spu编码
        */
        private String spuCode;
    
            public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryId() {
            return this.categoryId;
        }

            public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public String getCategoryName() {
            return this.categoryName;
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

            public void setSpuNo(String spuNo) {
            this.spuNo = spuNo;
        }

        public String getSpuNo() {
            return this.spuNo;
        }

            public void setBarCodes(String[] barCodes) {
            this.barCodes = barCodes;
        }

        public String[] getBarCodes() {
            return this.barCodes;
        }

            public void setSellChannels(Number[] sellChannels) {
            this.sellChannels = sellChannels;
        }

        public Number[] getSellChannels() {
            return this.sellChannels;
        }

            public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateTime() {
            return this.createTime;
        }

            public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getUpdateTime() {
            return this.updateTime;
        }

            public void setSkus(OpenSkuDTO[] skus) {
            this.skus = skus;
        }

        public OpenSkuDTO[] getSkus() {
            return this.skus;
        }

            public void setSpuCode(String spuCode) {
            this.spuCode = spuCode;
        }

        public String getSpuCode() {
            return this.spuCode;
        }

        }

    public static class OpenSkuDTO {
            @JsonProperty(value = "warehouse_code")
        /**
        * 仓库编码
        */
        private String warehouseCode;
            @JsonProperty(value = "category_id")
        /**
        * 类目id
        */
        private String categoryId;
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
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
            @JsonProperty(value = "sku_no")
        /**
        * sku条码
        */
        private String skuNo;
            @JsonProperty(value = "sku_code")
        /**
        * sku编码
        */
        private String skuCode;
            @JsonProperty(value = "bar_codes")
        /**
        * 一品多码
        */
        private String[] barCodes;
            @JsonProperty(value = "retail_price")
        /**
        * 建议零售价
        */
        private String retailPrice;
            @JsonProperty(value = "output_tax_rate")
        /**
        * 销项税率
        */
        private String outputTaxRate;
            @JsonProperty(value = "input_tax_tate")
        /**
        * 进项税率
        */
        private String inputTaxTate;
            @JsonProperty(value = "stock_num")
        /**
        * 库存
        */
        private String stockNum;
            @JsonProperty(value = "order_num")
        /**
        * 占用库存
        */
        private String orderNum;
            @JsonProperty(value = "create_time")
        /**
        * 创建日期
        */
        private String createTime;
            @JsonProperty(value = "update_time")
        /**
        * 更新日期
        */
        private String updateTime;
            @JsonProperty(value = "sell_stock_num")
        /**
        * 销售库存
        */
        private String sellStockNum;
            @JsonProperty(value = "last_stock_in_cost")
        /**
        * 最后一次入库成本价
        */
        private String lastStockInCost;
            @JsonProperty(value = "avg_stock_in_cost")
        /**
        * 平均入库成本
        */
        private String avgStockInCost;
    
            public void setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
        }

        public String getWarehouseCode() {
            return this.warehouseCode;
        }

            public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryId() {
            return this.categoryId;
        }

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

            public void setSkuCode(String skuCode) {
            this.skuCode = skuCode;
        }

        public String getSkuCode() {
            return this.skuCode;
        }

            public void setBarCodes(String[] barCodes) {
            this.barCodes = barCodes;
        }

        public String[] getBarCodes() {
            return this.barCodes;
        }

            public void setRetailPrice(String retailPrice) {
            this.retailPrice = retailPrice;
        }

        public String getRetailPrice() {
            return this.retailPrice;
        }

            public void setOutputTaxRate(String outputTaxRate) {
            this.outputTaxRate = outputTaxRate;
        }

        public String getOutputTaxRate() {
            return this.outputTaxRate;
        }

            public void setInputTaxTate(String inputTaxTate) {
            this.inputTaxTate = inputTaxTate;
        }

        public String getInputTaxTate() {
            return this.inputTaxTate;
        }

            public void setStockNum(String stockNum) {
            this.stockNum = stockNum;
        }

        public String getStockNum() {
            return this.stockNum;
        }

            public void setOrderNum(String orderNum) {
            this.orderNum = orderNum;
        }

        public String getOrderNum() {
            return this.orderNum;
        }

            public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateTime() {
            return this.createTime;
        }

            public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getUpdateTime() {
            return this.updateTime;
        }

            public void setSellStockNum(String sellStockNum) {
            this.sellStockNum = sellStockNum;
        }

        public String getSellStockNum() {
            return this.sellStockNum;
        }

            public void setLastStockInCost(String lastStockInCost) {
            this.lastStockInCost = lastStockInCost;
        }

        public String getLastStockInCost() {
            return this.lastStockInCost;
        }

            public void setAvgStockInCost(String avgStockInCost) {
            this.avgStockInCost = avgStockInCost;
        }

        public String getAvgStockInCost() {
            return this.avgStockInCost;
        }

        }

    public static class Paginator {
            @JsonProperty(value = "page")
        /**
        * 当前页码
        */
        private Long page;
            @JsonProperty(value = "pageSize")
        /**
        * 每页数量
        */
        private Long pageSize;
            @JsonProperty(value = "totalCount")
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


}