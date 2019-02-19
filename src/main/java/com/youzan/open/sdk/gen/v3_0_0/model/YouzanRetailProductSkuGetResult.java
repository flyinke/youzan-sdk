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

public class YouzanRetailProductSkuGetResult implements APIResult {

    @JsonProperty(value = "sku_center_vo")
    /**
     * 商品库商品实体类
     */
    private SkuCenterVO skuCenterVo;

    public void setSkuCenterVo(SkuCenterVO skuCenterVo) {
        this.skuCenterVo = skuCenterVo;
    }

    public SkuCenterVO getSkuCenterVo() {
        return this.skuCenterVo;
    }

    public static class SkuCenterVO {
            @JsonProperty(value = "sell_channel")
        /**
        * 销售渠道
        */
        private Long sellChannel;
            @JsonProperty(value = "sku_id")
        /**
        * 商品id
        */
        private Long skuId;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "category_id")
        /**
        * 分类id
        */
        private Long categoryId;
            @JsonProperty(value = "name")
        /**
        * 商品名称
        */
        private String name;
            @JsonProperty(value = "specifications")
        /**
        * 商品规格
        */
        private String specifications;
            @JsonProperty(value = "photo_url")
        /**
        * 商品图片
        */
        private String photoUrl;
            @JsonProperty(value = "sku_no")
        /**
        * 商品编码
        */
        private String skuNo;
            @JsonProperty(value = "unit")
        /**
        * 单位名称
        */
        private String unit;
            @JsonProperty(value = "status")
        /**
        * 商品状态
        */
        private Long status;
            @JsonProperty(value = "last_cost_price")
        /**
        * 最后一次入库成本价
        */
        private Long lastCostPrice;
            @JsonProperty(value = "avg_cost_price")
        /**
        * 平均成本价
        */
        private Long avgCostPrice;
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
            @JsonProperty(value = "stock_num")
        /**
        * 实物库存
        */
        private Long stockNum;
            @JsonProperty(value = "sell_stock_count")
        /**
        * 可售库存
        */
        private Long sellStockCount;
            @JsonProperty(value = "version")
        /**
        * 版本号
        */
        private Long version;
            @JsonProperty(value = "spu_id")
        /**
        * 商品库商品spuid
        */
        private Long spuId;
    
            public void setSellChannel(Long sellChannel) {
            this.sellChannel = sellChannel;
        }

        public Long getSellChannel() {
            return this.sellChannel;
        }

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

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
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

            public void setVersion(Long version) {
            this.version = version;
        }

        public Long getVersion() {
            return this.version;
        }

            public void setSpuId(Long spuId) {
            this.spuId = spuId;
        }

        public Long getSpuId() {
            return this.spuId;
        }

        }


}