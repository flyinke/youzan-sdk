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

public class YouzanMeiStockListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 商品库存信息列表
     */
    private MeiItemSkuStockResponseDTOV2[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiItemSkuStockResponseDTOV2[] items) {
        this.items = items;
    }

    public MeiItemSkuStockResponseDTOV2[] getItems() {
        return this.items;
    }

    public static class MeiItemSkuStockResponseDTOV2 {
            @JsonProperty(value = "item_id")
        /**
        * 商品ID
        */
        private Long itemId;
            @JsonProperty(value = "item_type")
        /**
        * 商品类型
        */
        private Long itemType;
            @JsonProperty(value = "image_url")
        /**
        * 商品图片
        */
        private String imageUrl;
            @JsonProperty(value = "sku_id")
        /**
        * 规格ID
        */
        private Long skuId;
            @JsonProperty(value = "available_quantity")
        /**
        * 可用库存
        */
        private Long availableQuantity;
            @JsonProperty(value = "physical_quantity")
        /**
        * 物理库存
        */
        private Long physicalQuantity;
            @JsonProperty(value = "sku_name")
        /**
        * 规格名称
        */
        private String skuName;
            @JsonProperty(value = "item_title")
        /**
        * 商品名称
        */
        private String itemTitle;
            @JsonProperty(value = "negative_quantity")
        /**
        * 负库存
        */
        private Long negativeQuantity;
            @JsonProperty(value = "sku_code")
        /**
        * 规格码
        */
        private String skuCode;
            @JsonProperty(value = "locked_quantity")
        /**
        * 锁定库存
        */
        private Long lockedQuantity;
            @JsonProperty(value = "status")
        /**
        * 状态
        */
        private Long status;
            @JsonProperty(value = "category")
        /**
        * 商品分类信息
        */
        private MeiCategoryResponseDTO category;
    
            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setItemType(Long itemType) {
            this.itemType = itemType;
        }

        public Long getItemType() {
            return this.itemType;
        }

            public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setAvailableQuantity(Long availableQuantity) {
            this.availableQuantity = availableQuantity;
        }

        public Long getAvailableQuantity() {
            return this.availableQuantity;
        }

            public void setPhysicalQuantity(Long physicalQuantity) {
            this.physicalQuantity = physicalQuantity;
        }

        public Long getPhysicalQuantity() {
            return this.physicalQuantity;
        }

            public void setSkuName(String skuName) {
            this.skuName = skuName;
        }

        public String getSkuName() {
            return this.skuName;
        }

            public void setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
        }

        public String getItemTitle() {
            return this.itemTitle;
        }

            public void setNegativeQuantity(Long negativeQuantity) {
            this.negativeQuantity = negativeQuantity;
        }

        public Long getNegativeQuantity() {
            return this.negativeQuantity;
        }

            public void setSkuCode(String skuCode) {
            this.skuCode = skuCode;
        }

        public String getSkuCode() {
            return this.skuCode;
        }

            public void setLockedQuantity(Long lockedQuantity) {
            this.lockedQuantity = lockedQuantity;
        }

        public Long getLockedQuantity() {
            return this.lockedQuantity;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setCategory(MeiCategoryResponseDTO category) {
            this.category = category;
        }

        public MeiCategoryResponseDTO getCategory() {
            return this.category;
        }

        }

    public static class MeiPaginator {
            @JsonProperty(value = "total_count")
        /**
        * 总记录数
        */
        private Long totalCount;
            @JsonProperty(value = "page")
        /**
        * 第几页
        */
        private Long page;
            @JsonProperty(value = "page_size")
        /**
        * 每页显示的记录数
        */
        private Long pageSize;
    
            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
        }

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

        }

    public static class MeiCategoryResponseDTO {
            @JsonProperty(value = "id")
        /**
        * 分类ID
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 分类名称
        */
        private String name;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        }


}