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

public class YouzanRetailProductSkusSearchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private Paginator paginator;
    @JsonProperty(value = "items")
    /**
     * 实体对象
     */
    private SkuCenterSearchVO[] items;

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }
    public void setItems(SkuCenterSearchVO[] items) {
        this.items = items;
    }

    public SkuCenterSearchVO[] getItems() {
        return this.items;
    }

    public static class SkuCenterSearchVO {
            @JsonProperty(value = "skuId")
        /**
        * 商品id
        */
        private Long skuId;
            @JsonProperty(value = "kdtId")
        /**
        * 关联的商户id
        */
        private Long kdtId;
            @JsonProperty(value = "categoryId")
        /**
        * 分类id
        */
        private Long categoryId;
            @JsonProperty(value = "categoryName")
        /**
        * 分类名称
        */
        private String categoryName;
            @JsonProperty(value = "name")
        /**
        * 名称
        */
        private String name;
            @JsonProperty(value = "specifications")
        /**
        * 规格
        */
        private String specifications;
            @JsonProperty(value = "status")
        /**
        * 状态
        */
        private Long status;
            @JsonProperty(value = "photoUrl")
        /**
        * 图片地址
        */
        private String photoUrl;
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
            @JsonProperty(value = "skuNo")
        /**
        * 编码
        */
        private String skuNo;
            @JsonProperty(value = "lastCostPrice")
        /**
        * 最后一次入库成本价
        */
        private Long lastCostPrice;
            @JsonProperty(value = "avgCostPrice")
        /**
        * 平均成本价
        */
        private Long avgCostPrice;
            @JsonProperty(value = "createdAt")
        /**
        * 创建时间
        */
        private Date createdAt;
            @JsonProperty(value = "updatedAt")
        /**
        * 更新时间
        */
        private Date updatedAt;
            @JsonProperty(value = "sellChannel")
        /**
        * 销售渠道：1 未设置，2门店 4 网店 6 门店+网店
        */
        private Long sellChannel;
            @JsonProperty(value = "stockNum")
        /**
        * 库存数量
        */
        private Long stockNum;
            @JsonProperty(value = "overSoldNum")
        /**
        * 超卖数量
        */
        private Long overSoldNum;
            @JsonProperty(value = "sellStockCount")
        /**
        * 销售库存
        */
        private Long sellStockCount;
    
            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
        }

        public Long getCategoryId() {
            return this.categoryId;
        }

            public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public String getCategoryName() {
            return this.categoryName;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setSpecifications(String specifications) {
            this.specifications = specifications;
        }

        public String getSpecifications() {
            return this.specifications;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
        }

        public String getPhotoUrl() {
            return this.photoUrl;
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

            public void setLastCostPrice(Long lastCostPrice) {
            this.lastCostPrice = lastCostPrice;
        }

        public Long getLastCostPrice() {
            return this.lastCostPrice;
        }

            public void setAvgCostPrice(Long avgCostPrice) {
            this.avgCostPrice = avgCostPrice;
        }

        public Long getAvgCostPrice() {
            return this.avgCostPrice;
        }

            public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }

        public Date getCreatedAt() {
            return this.createdAt;
        }

            public void setUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Date getUpdatedAt() {
            return this.updatedAt;
        }

            public void setSellChannel(Long sellChannel) {
            this.sellChannel = sellChannel;
        }

        public Long getSellChannel() {
            return this.sellChannel;
        }

            public void setStockNum(Long stockNum) {
            this.stockNum = stockNum;
        }

        public Long getStockNum() {
            return this.stockNum;
        }

            public void setOverSoldNum(Long overSoldNum) {
            this.overSoldNum = overSoldNum;
        }

        public Long getOverSoldNum() {
            return this.overSoldNum;
        }

            public void setSellStockCount(Long sellStockCount) {
            this.sellStockCount = sellStockCount;
        }

        public Long getSellStockCount() {
            return this.sellStockCount;
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