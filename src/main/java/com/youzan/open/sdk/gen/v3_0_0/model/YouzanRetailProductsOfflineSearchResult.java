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

public class YouzanRetailProductsOfflineSearchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private Paginator paginator;
    @JsonProperty(value = "items")
    /**
     * 门店商品搜索结果实体信息
     */
    private OfflineProductSearchVO[] items;

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }
    public void setItems(OfflineProductSearchVO[] items) {
        this.items = items;
    }

    public OfflineProductSearchVO[] getItems() {
        return this.items;
    }

    public static class OfflineProductSearchVO {
            @JsonProperty(value = "category_id")
        /**
        * 分类id
        */
        private Long categoryId;
            @JsonProperty(value = "category_name")
        /**
        * 分类名称
        */
        private String categoryName;
            @JsonProperty(value = "specifications")
        /**
        * 规格
        */
        private String specifications;
            @JsonProperty(value = "sku_no")
        /**
        * 门店商品编码（废弃）
        */
        private String skuNo;
            @JsonProperty(value = "measurement")
        /**
        * 计量方式（0：计数，10：计重）
        */
        private Long measurement;
            @JsonProperty(value = "item_id")
        /**
        * 门店商品id
        */
        private Long itemId;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "title")
        /**
        * 门店商品名称
        */
        private Long title;
            @JsonProperty(value = "unit")
        /**
        * 门店商品单位
        */
        private String unit;
            @JsonProperty(value = "photo_url")
        /**
        * 门店商品图片
        */
        private String photoUrl;
            @JsonProperty(value = "price")
        /**
        * 零售价，单位：分
        */
        private Long price;
            @JsonProperty(value = "created_at")
        /**
        * 创建时间
        */
        private Date createdAt;
            @JsonProperty(value = "updated_at")
        /**
        * 更新时间
        */
        private Date updatedAt;
            @JsonProperty(value = "sell_stock_count")
        /**
        * 销售库存（实际库存量*1000返回）
        */
        private Long sellStockCount;
            @JsonProperty(value = "spu_no")
        /**
        * 商品编码
        */
        private String spuNo;
            @JsonProperty(value = "Sell_type")
        /**
        * 销售类型（0:单个销售 ，1:组合销售）
        */
        private Long sellType;
            @JsonProperty(value = "has_multi_sku")
        /**
        * 是否多规格
        */
        private Boolean hasMultiSku;
            @JsonProperty(value = "item_sku_models")
        /**
        * 门店、网店规格信息
        */
        private ItemSkuModelVO[] itemSkuModels;
    
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

            public void setMeasurement(Long measurement) {
            this.measurement = measurement;
        }

        public Long getMeasurement() {
            return this.measurement;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setTitle(Long title) {
            this.title = title;
        }

        public Long getTitle() {
            return this.title;
        }

            public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getUnit() {
            return this.unit;
        }

            public void setPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
        }

        public String getPhotoUrl() {
            return this.photoUrl;
        }

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
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

            public void setSellStockCount(Long sellStockCount) {
            this.sellStockCount = sellStockCount;
        }

        public Long getSellStockCount() {
            return this.sellStockCount;
        }

            public void setSpuNo(String spuNo) {
            this.spuNo = spuNo;
        }

        public String getSpuNo() {
            return this.spuNo;
        }

            public void setSellType(Long sellType) {
            this.sellType = sellType;
        }

        public Long getSellType() {
            return this.sellType;
        }

            public void setHasMultiSku(Boolean hasMultiSku) {
            this.hasMultiSku = hasMultiSku;
        }

        public Boolean getHasMultiSku() {
            return this.hasMultiSku;
        }

            public void setItemSkuModels(ItemSkuModelVO[] itemSkuModels) {
            this.itemSkuModels = itemSkuModels;
        }

        public ItemSkuModelVO[] getItemSkuModels() {
            return this.itemSkuModels;
        }

        }

    public static class ItemSkuModelVO {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "sku_no")
        /**
        * 商品编码
        */
        private String skuNo;
            @JsonProperty(value = "item_id")
        /**
        * 商品id
        */
        private Long itemId;
            @JsonProperty(value = "sku_id")
        /**
        * skuId
        */
        private Long skuId;
            @JsonProperty(value = "specs")
        /**
        * 规格描述 JSON
        */
        private String specs;
            @JsonProperty(value = "price")
        /**
        * 价格 单位：分
        */
        private Long price;
            @JsonProperty(value = "related_item_id")
        /**
        * 关联商品库商品spuId
        */
        private Long relatedItemId;
            @JsonProperty(value = "related_sku_id")
        /**
        * 关联商品库商品skuId
        */
        private Long relatedSkuId;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setSkuNo(String skuNo) {
            this.skuNo = skuNo;
        }

        public String getSkuNo() {
            return this.skuNo;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setSpecs(String specs) {
            this.specs = specs;
        }

        public String getSpecs() {
            return this.specs;
        }

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setRelatedItemId(Long relatedItemId) {
            this.relatedItemId = relatedItemId;
        }

        public Long getRelatedItemId() {
            return this.relatedItemId;
        }

            public void setRelatedSkuId(Long relatedSkuId) {
            this.relatedSkuId = relatedSkuId;
        }

        public Long getRelatedSkuId() {
            return this.relatedSkuId;
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