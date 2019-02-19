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

public class YouzanRetailProductSpusSearchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private Paginator paginator;
    @JsonProperty(value = "items")
    /**
     * 商品库搜索结果对象
     */
    private SpuSearchVO[] items;

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }
    public void setItems(SpuSearchVO[] items) {
        this.items = items;
    }

    public SpuSearchVO[] getItems() {
        return this.items;
    }

    public static class SkuVO {
            @JsonProperty(value = "sku_id")
        /**
        * 商品规格id
        */
        private Long skuId;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "spu_id")
        /**
        * spu id
        */
        private Long spuId;
            @JsonProperty(value = "retail_price")
        /**
        * 商品建议零售价
        */
        private Long retailPrice;
            @JsonProperty(value = "stock_num")
        /**
        * 商品实物库存
        */
        private Long stockNum;
            @JsonProperty(value = "sell_stock_count")
        /**
        * 商品销售库存
        */
        private Long sellStockCount;
            @JsonProperty(value = "sku_no")
        /**
        * 商品编码
        */
        private String skuNo;
            @JsonProperty(value = "created_at")
        /**
        * 规格创建时间
        */
        private Date createdAt;
            @JsonProperty(value = "updated_at")
        /**
        * 规格更新时间
        */
        private Date updatedAt;
            @JsonProperty(value = "last_cost_price")
        /**
        * 最后一次入库成本价
        */
        private Long lastCostPrice;
            @JsonProperty(value = "avg_cost_price")
        /**
        * 平均入库成本价
        */
        private Long avgCostPrice;
            @JsonProperty(value = "bar_codes")
        /**
        * 一品多码
        */
        private String[] barCodes;
            @JsonProperty(value = "specs")
        /**
        * 规格定义
        */
        private SpecKeyValue[] specs;
    
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

            public void setSpuId(Long spuId) {
            this.spuId = spuId;
        }

        public Long getSpuId() {
            return this.spuId;
        }

            public void setRetailPrice(Long retailPrice) {
            this.retailPrice = retailPrice;
        }

        public Long getRetailPrice() {
            return this.retailPrice;
        }

            public void setStockNum(Long stockNum) {
            this.stockNum = stockNum;
        }

        public Long getStockNum() {
            return this.stockNum;
        }

            public void setSellStockCount(Long sellStockCount) {
            this.sellStockCount = sellStockCount;
        }

        public Long getSellStockCount() {
            return this.sellStockCount;
        }

            public void setSkuNo(String skuNo) {
            this.skuNo = skuNo;
        }

        public String getSkuNo() {
            return this.skuNo;
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

            public void setBarCodes(String[] barCodes) {
            this.barCodes = barCodes;
        }

        public String[] getBarCodes() {
            return this.barCodes;
        }

            public void setSpecs(SpecKeyValue[] specs) {
            this.specs = specs;
        }

        public SpecKeyValue[] getSpecs() {
            return this.specs;
        }

        }

    public static class SpecKeyValue {
            @JsonProperty(value = "kId")
        /**
        * 规格项id
        */
        private Long kId;
            @JsonProperty(value = "k")
        /**
        * 规格项名称
        */
        private String k;
            @JsonProperty(value = "vId")
        /**
        * 规格值id
        */
        private Long vId;
            @JsonProperty(value = "v")
        /**
        * 规格值名称
        */
        private String v;
    
            public void setKId(Long kId) {
            this.kId = kId;
        }

        public Long getKId() {
            return this.kId;
        }

            public void setK(String k) {
            this.k = k;
        }

        public String getK() {
            return this.k;
        }

            public void setVId(Long vId) {
            this.vId = vId;
        }

        public Long getVId() {
            return this.vId;
        }

            public void setV(String v) {
            this.v = v;
        }

        public String getV() {
            return this.v;
        }

        }

    public static class SpuSearchVO {
            @JsonProperty(value = "spu_id")
        /**
        * 商品id
        */
        private Long spuId;
            @JsonProperty(value = "kdt_id")
        /**
        * 关联的商户id
        */
        private Long kdtId;
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
            @JsonProperty(value = "name")
        /**
        * 名称
        */
        private String name;
            @JsonProperty(value = "specifications")
        /**
        * 规格型号
        */
        private String specifications;
            @JsonProperty(value = "photo_url")
        /**
        * 图片地址
        */
        private String photoUrl;
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
            @JsonProperty(value = "spu_no")
        /**
        * 编码
        */
        private String spuNo;
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
            @JsonProperty(value = "sell_channels")
        /**
        * 销售渠道 注：2 门店 4 网店
        */
        private Number[] sellChannels;
            @JsonProperty(value = "bar_codes")
        /**
        * 一品多码
        */
        private String[] barCodes;
            @JsonProperty(value = "spec_define_tuple")
        /**
        * 规格定义组
        */
        private String specDefineTuple;
            @JsonProperty(value = "skus")
        /**
        * sku详情
        */
        private SkuVO[] skus;
    
            public void setSpuId(Long spuId) {
            this.spuId = spuId;
        }

        public Long getSpuId() {
            return this.spuId;
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

            public void setSpuNo(String spuNo) {
            this.spuNo = spuNo;
        }

        public String getSpuNo() {
            return this.spuNo;
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

            public void setSellChannels(Number[] sellChannels) {
            this.sellChannels = sellChannels;
        }

        public Number[] getSellChannels() {
            return this.sellChannels;
        }

            public void setBarCodes(String[] barCodes) {
            this.barCodes = barCodes;
        }

        public String[] getBarCodes() {
            return this.barCodes;
        }

            public void setSpecDefineTuple(String specDefineTuple) {
            this.specDefineTuple = specDefineTuple;
        }

        public String getSpecDefineTuple() {
            return this.specDefineTuple;
        }

            public void setSkus(SkuVO[] skus) {
            this.skus = skus;
        }

        public SkuVO[] getSkus() {
            return this.skus;
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