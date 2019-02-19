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

public class YouzanItemStandardSearchResult implements APIResult {

    @JsonProperty(value = "count")
    /**
     * 查询到的商品标准数量
     */
    private Long count;
    @JsonProperty(value = "item_standards")
    /**
     * 查询到的商品标准列表
     */
    private ItemStandardOpenModel[] itemStandards;

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return this.count;
    }
    public void setItemStandards(ItemStandardOpenModel[] itemStandards) {
        this.itemStandards = itemStandards;
    }

    public ItemStandardOpenModel[] getItemStandards() {
        return this.itemStandards;
    }

    public static class ItemStandardSpuOpenModel {
            @JsonProperty(value = "manu_name")
        /**
        * 厂商
        */
        private String manuName;
            @JsonProperty(value = "item_name")
        /**
        * 商品名称
        */
        private String itemName;
            @JsonProperty(value = "brand")
        /**
        * 商标/品牌
        */
        private String brand;
            @JsonProperty(value = "valid_period")
        /**
        * 有效期
        */
        private String validPeriod;
    
            public void setManuName(String manuName) {
            this.manuName = manuName;
        }

        public String getManuName() {
            return this.manuName;
        }

            public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getItemName() {
            return this.itemName;
        }

            public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return this.brand;
        }

            public void setValidPeriod(String validPeriod) {
            this.validPeriod = validPeriod;
        }

        public String getValidPeriod() {
            return this.validPeriod;
        }

        }

    public static class ItemStandardExtraOpenModel {
            @JsonProperty(value = "kid")
        /**
        * 扩展信息键ID
        */
        private Long kid;
            @JsonProperty(value = "attr_key")
        /**
        * 扩展信息键名称
        */
        private String attrKey;
            @JsonProperty(value = "attr_value")
        /**
        * 扩展信息值
        */
        private String attrValue;
    
            public void setKid(Long kid) {
            this.kid = kid;
        }

        public Long getKid() {
            return this.kid;
        }

            public void setAttrKey(String attrKey) {
            this.attrKey = attrKey;
        }

        public String getAttrKey() {
            return this.attrKey;
        }

            public void setAttrValue(String attrValue) {
            this.attrValue = attrValue;
        }

        public String getAttrValue() {
            return this.attrValue;
        }

        }

    public static class ItemStandardOpenModel {
            @JsonProperty(value = "code")
        /**
        * 条形码编码
        */
        private String code;
            @JsonProperty(value = "item_type")
        /**
        * 商品类型
        */
        private String itemType;
            @JsonProperty(value = "price")
        /**
        * 价格, 单位为分
        */
        private Long price;
            @JsonProperty(value = "imgs")
        /**
        * 图片，格式为JSON，如下
[{"width":320,"id":"20177","url":"http://img.yzcdn.cn/upload_files/2017/07/11/FjM2RwUUXEvcEr6lEyyeH9E_C8rZ.jpg","height":320},{"width":790,"id":"20178","url":"http://img.yzcdn.cn/upload_files/2017/07/11/FlkOmdespJXZg70D40LDODCw51Um.jpg","height":955},{"width":790,"id":"20179","url":"ht
        */
        private String imgs;
            @JsonProperty(value = "spu")
        /**
        * 商品SPU标准模型
        */
        private ItemStandardSpuOpenModel spu;
            @JsonProperty(value = "extra_info")
        /**
        * 商品标准扩展信息模型
        */
        private ItemStandardExtraOpenModel[] extraInfo;
    
            public void setCode(String code) {
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }

            public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public String getItemType() {
            return this.itemType;
        }

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setImgs(String imgs) {
            this.imgs = imgs;
        }

        public String getImgs() {
            return this.imgs;
        }

            public void setSpu(ItemStandardSpuOpenModel spu) {
            this.spu = spu;
        }

        public ItemStandardSpuOpenModel getSpu() {
            return this.spu;
        }

            public void setExtraInfo(ItemStandardExtraOpenModel[] extraInfo) {
            this.extraInfo = extraInfo;
        }

        public ItemStandardExtraOpenModel[] getExtraInfo() {
            return this.extraInfo;
        }

        }


}