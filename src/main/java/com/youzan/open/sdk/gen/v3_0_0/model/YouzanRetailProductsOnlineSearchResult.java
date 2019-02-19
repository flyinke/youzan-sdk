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

public class YouzanRetailProductsOnlineSearchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private Paginator paginator;
    @JsonProperty(value = "items")
    /**
     * 网店商品搜索结果实体信息
     */
    private OnlineProductSearchVO[] items;

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }
    public void setItems(OnlineProductSearchVO[] items) {
        this.items = items;
    }

    public OnlineProductSearchVO[] getItems() {
        return this.items;
    }

    public static class OnlineProductSearchVO {
            @JsonProperty(value = "item_id")
        /**
        * 网店商品id
        */
        private Long itemId;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "title")
        /**
        * 商品名称
        */
        private String title;
            @JsonProperty(value = "photo_url")
        /**
        * 商品图片url（多图片返回首图）
        */
        private String photoUrl;
            @JsonProperty(value = "price")
        /**
        * 零售价，单位：分
        */
        private Long price;
            @JsonProperty(value = "created_at")
        /**
        * 商品创建时间
        */
        private Date createdAt;
            @JsonProperty(value = "updated_at")
        /**
        * 商品更新时间
        */
        private Date updatedAt;
            @JsonProperty(value = "sell_stock_count")
        /**
        * 销售库存
        */
        private Long sellStockCount;
            @JsonProperty(value = "display_url")
        /**
        * 商品h5页面url
        */
        private String displayUrl;
            @JsonProperty(value = "is_virtual")
        /**
        * 是否为虚拟商品
        */
        private Long isVirtual;
    
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

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
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

            public void setDisplayUrl(String displayUrl) {
            this.displayUrl = displayUrl;
        }

        public String getDisplayUrl() {
            return this.displayUrl;
        }

            public void setIsVirtual(Long isVirtual) {
            this.isVirtual = isVirtual;
        }

        public Long getIsVirtual() {
            return this.isVirtual;
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