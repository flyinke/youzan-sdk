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

public class YouzanRetailProductOfflineGetResult implements APIResult {

    @JsonProperty(value = "offline_vo")
    /**
     * 门店商品详情
     */
    private OfflineProductVO offlineVo;

    public void setOfflineVo(OfflineProductVO offlineVo) {
        this.offlineVo = offlineVo;
    }

    public OfflineProductVO getOfflineVo() {
        return this.offlineVo;
    }

    public static class OfflineSkuModel {
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
            @JsonProperty(value = "item_id")
        /**
        * 商品id
        */
        private Long itemId;
            @JsonProperty(value = "price")
        /**
        * 售价
        */
        private Long price;
            @JsonProperty(value = "s1")
        /**
        * 第一个规格值id
        */
        private Long s1;
            @JsonProperty(value = "s2")
        /**
        * 第二个规格值id
        */
        private Long s2;
            @JsonProperty(value = "s3")
        /**
        * 第三个规格值id
        */
        private Long s3;
            @JsonProperty(value = "s4")
        /**
        * 第四个规格值id
        */
        private Long s4;
            @JsonProperty(value = "s5")
        /**
        * 第五个规格值id
        */
        private Long s5;
            @JsonProperty(value = "name")
        /**
        * 规格名称（组合商品有效）
        */
        private String name;
            @JsonProperty(value = "related_sku_id")
        /**
        * 关联的商品库商品skuid
        */
        private Long relatedSkuId;
            @JsonProperty(value = "related_item_id")
        /**
        * 关联的商品库商品spuid
        */
        private Long relatedItemId;
            @JsonProperty(value = "last_cost_price")
        /**
        * 关联的商品库商品最后一次入库价
        */
        private Long lastCostPrice;
            @JsonProperty(value = "avg_cost_price")
        /**
        * 关联的商品库商品平均成本价
        */
        private Long avgCostPrice;
    
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

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setS1(Long s1) {
            this.s1 = s1;
        }

        public Long getS1() {
            return this.s1;
        }

            public void setS2(Long s2) {
            this.s2 = s2;
        }

        public Long getS2() {
            return this.s2;
        }

            public void setS3(Long s3) {
            this.s3 = s3;
        }

        public Long getS3() {
            return this.s3;
        }

            public void setS4(Long s4) {
            this.s4 = s4;
        }

        public Long getS4() {
            return this.s4;
        }

            public void setS5(Long s5) {
            this.s5 = s5;
        }

        public Long getS5() {
            return this.s5;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setRelatedSkuId(Long relatedSkuId) {
            this.relatedSkuId = relatedSkuId;
        }

        public Long getRelatedSkuId() {
            return this.relatedSkuId;
        }

            public void setRelatedItemId(Long relatedItemId) {
            this.relatedItemId = relatedItemId;
        }

        public Long getRelatedItemId() {
            return this.relatedItemId;
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

        }

    public static class OfflineProductVO {
            @JsonProperty(value = "id")
        /**
        * ic中的商品id
        */
        private Long id;
            @JsonProperty(value = "sku_center_id")
        /**
        * 商品库中的商品id（废弃）
        */
        private Long skuCenterId;
            @JsonProperty(value = "kdt_id")
        /**
        * 关联商户id
        */
        private Long kdtId;
            @JsonProperty(value = "category_id")
        /**
        * 分类id
        */
        private Long categoryId;
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
            @JsonProperty(value = "photo_url")
        /**
        * 图片地址
        */
        private String photoUrl;
            @JsonProperty(value = "sku_no")
        /**
        * 编码（废弃）
        */
        private String skuNo;
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
            @JsonProperty(value = "measurement")
        /**
        * 计量方式
        */
        private Long measurement;
            @JsonProperty(value = "last_cost_price")
        /**
        * 最后一次入库成本价(保留两位小数，实际传参*100后传入，如实际最后一次入库成本价2.22，实际传参为222)
        */
        private Long lastCostPrice;
            @JsonProperty(value = "avg_cost_price")
        /**
        * 平均成本价零售价(保留两位小数，实际传参*100后传入，如实际平均成本价2.22，实际传参为222)
        */
        private Long avgCostPrice;
            @JsonProperty(value = "retail_price")
        /**
        * 零售价(保留两位小数，实际传参*100后传入，如实际零售价2.22，实际传参为222)
        */
        private Long retailPrice;
            @JsonProperty(value = "sell_stock_count")
        /**
        * 可售库存(保留三位小数，实际传参*1000后传入，如实际库存1.111，实际传参为1111)
        */
        private Long sellStockCount;
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
            @JsonProperty(value = "spu_id")
        /**
        * 商品库商品id
        */
        private Long spuId;
            @JsonProperty(value = "goods_no")
        /**
        * 商品编码
        */
        private String goodsNo;
            @JsonProperty(value = "on_sale_kdt_ids")
        /**
        * 在售门店列表
        */
        private Number[] onSaleKdtIds;
            @JsonProperty(value = "is_display")
        /**
        * 是否上架 1：上架状态 0:未上架
        */
        private Long isDisplay;
            @JsonProperty(value = "combine_models")
        /**
        * 组合商品关联关系详情
        */
        private OfflineCombineVO[] combineModels;
            @JsonProperty(value = "item_sku_models")
        /**
        * 门店商品规格明细
        */
        private OfflineSkuModel[] itemSkuModels;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setSkuCenterId(Long skuCenterId) {
            this.skuCenterId = skuCenterId;
        }

        public Long getSkuCenterId() {
            return this.skuCenterId;
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

            public void setMeasurement(Long measurement) {
            this.measurement = measurement;
        }

        public Long getMeasurement() {
            return this.measurement;
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

            public void setRetailPrice(Long retailPrice) {
            this.retailPrice = retailPrice;
        }

        public Long getRetailPrice() {
            return this.retailPrice;
        }

            public void setSellStockCount(Long sellStockCount) {
            this.sellStockCount = sellStockCount;
        }

        public Long getSellStockCount() {
            return this.sellStockCount;
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

            public void setSpuId(Long spuId) {
            this.spuId = spuId;
        }

        public Long getSpuId() {
            return this.spuId;
        }

            public void setGoodsNo(String goodsNo) {
            this.goodsNo = goodsNo;
        }

        public String getGoodsNo() {
            return this.goodsNo;
        }

            public void setOnSaleKdtIds(Number[] onSaleKdtIds) {
            this.onSaleKdtIds = onSaleKdtIds;
        }

        public Number[] getOnSaleKdtIds() {
            return this.onSaleKdtIds;
        }

            public void setIsDisplay(Long isDisplay) {
            this.isDisplay = isDisplay;
        }

        public Long getIsDisplay() {
            return this.isDisplay;
        }

            public void setCombineModels(OfflineCombineVO[] combineModels) {
            this.combineModels = combineModels;
        }

        public OfflineCombineVO[] getCombineModels() {
            return this.combineModels;
        }

            public void setItemSkuModels(OfflineSkuModel[] itemSkuModels) {
            this.itemSkuModels = itemSkuModels;
        }

        public OfflineSkuModel[] getItemSkuModels() {
            return this.itemSkuModels;
        }

        }

    public static class OfflineCombineVO {
            @JsonProperty(value = "related_combine_sku_id")
        /**
        * 组合商品关联的商品库商品skuId
        */
        private Long relatedCombineSkuId;
            @JsonProperty(value = "related_combine_item_id")
        /**
        * 组合商品关联的商品库商品spuId
        */
        private Long relatedCombineItemId;
            @JsonProperty(value = "related_combine_num")
        /**
        * 组合数量
        */
        private Long relatedCombineNum;
            @JsonProperty(value = "sku_no")
        /**
        * 组合商品关联的商品库商品编码
        */
        private String skuNo;
            @JsonProperty(value = "name")
        /**
        * 组合商品名称
        */
        private String name;
            @JsonProperty(value = "related_combine_price")
        /**
        * 分摊价格
        */
        private Long relatedCombinePrice;
    
            public void setRelatedCombineSkuId(Long relatedCombineSkuId) {
            this.relatedCombineSkuId = relatedCombineSkuId;
        }

        public Long getRelatedCombineSkuId() {
            return this.relatedCombineSkuId;
        }

            public void setRelatedCombineItemId(Long relatedCombineItemId) {
            this.relatedCombineItemId = relatedCombineItemId;
        }

        public Long getRelatedCombineItemId() {
            return this.relatedCombineItemId;
        }

            public void setRelatedCombineNum(Long relatedCombineNum) {
            this.relatedCombineNum = relatedCombineNum;
        }

        public Long getRelatedCombineNum() {
            return this.relatedCombineNum;
        }

            public void setSkuNo(String skuNo) {
            this.skuNo = skuNo;
        }

        public String getSkuNo() {
            return this.skuNo;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setRelatedCombinePrice(Long relatedCombinePrice) {
            this.relatedCombinePrice = relatedCombinePrice;
        }

        public Long getRelatedCombinePrice() {
            return this.relatedCombinePrice;
        }

        }


}