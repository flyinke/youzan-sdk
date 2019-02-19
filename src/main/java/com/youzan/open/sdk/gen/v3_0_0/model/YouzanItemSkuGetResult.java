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

public class YouzanItemSkuGetResult implements APIResult {

    @JsonProperty(value = "sku")
    /**
     * 返回sku对象
     */
    private ItemSku sku;

    public void setSku(ItemSku sku) {
        this.sku = sku;
    }

    public ItemSku getSku() {
        return this.sku;
    }

    public static class ItemSku {
            @JsonProperty(value = "sku_unique_code")
        /**
        * 库存唯一编码
        */
        private String skuUniqueCode;
            @JsonProperty(value = "item_id")
        /**
        * 商品ID
        */
        private Long itemId;
            @JsonProperty(value = "sku_id")
        /**
        * SKU ID
        */
        private Long skuId;
            @JsonProperty(value = "properties_name")
        /**
        * 规格属性
        */
        private String propertiesName;
            @JsonProperty(value = "properties_name_json")
        /**
        * 规格属性json串
        */
        private String propertiesNameJson;
            @JsonProperty(value = "with_hold_quantity")
        /**
        * 下单数量 - 销售数量
        */
        private Long withHoldQuantity;
            @JsonProperty(value = "price")
        /**
        * 价格, 单位元,精确到小数点后两位
        */
        private String price;
            @JsonProperty(value = "created")
        /**
        * 创建时间, 格式:yyyy-MM-dd HH:mm:ss
        */
        private String created;
            @JsonProperty(value = "modified")
        /**
        * 修改时间,格式:yyyy-MM-dd HH:mm:ss
        */
        private String modified;
            @JsonProperty(value = "quantity")
        /**
        * 库存数量
        */
        private Long quantity;
            @JsonProperty(value = "item_no")
        /**
        * 商品编码
        */
        private String itemNo;
            @JsonProperty(value = "weight")
        /**
        * 重量
        */
        private String weight;
    
            public void setSkuUniqueCode(String skuUniqueCode) {
            this.skuUniqueCode = skuUniqueCode;
        }

        public String getSkuUniqueCode() {
            return this.skuUniqueCode;
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

            public void setPropertiesName(String propertiesName) {
            this.propertiesName = propertiesName;
        }

        public String getPropertiesName() {
            return this.propertiesName;
        }

            public void setPropertiesNameJson(String propertiesNameJson) {
            this.propertiesNameJson = propertiesNameJson;
        }

        public String getPropertiesNameJson() {
            return this.propertiesNameJson;
        }

            public void setWithHoldQuantity(Long withHoldQuantity) {
            this.withHoldQuantity = withHoldQuantity;
        }

        public Long getWithHoldQuantity() {
            return this.withHoldQuantity;
        }

            public void setPrice(String price) {
            this.price = price;
        }

        public String getPrice() {
            return this.price;
        }

            public void setCreated(String created) {
            this.created = created;
        }

        public String getCreated() {
            return this.created;
        }

            public void setModified(String modified) {
            this.modified = modified;
        }

        public String getModified() {
            return this.modified;
        }

            public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public Long getQuantity() {
            return this.quantity;
        }

            public void setItemNo(String itemNo) {
            this.itemNo = itemNo;
        }

        public String getItemNo() {
            return this.itemNo;
        }

            public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getWeight() {
            return this.weight;
        }

        }


}