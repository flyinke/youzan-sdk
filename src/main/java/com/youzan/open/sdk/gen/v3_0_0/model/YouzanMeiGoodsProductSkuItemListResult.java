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

public class YouzanMeiGoodsProductSkuItemListResult implements APIResult {

    @JsonProperty(value = "sku_items")
    /**
     * 规格项列表
     */
    private MeiGoodsSkuItem[] skuItems;

    public void setSkuItems(MeiGoodsSkuItem[] skuItems) {
        this.skuItems = skuItems;
    }

    public MeiGoodsSkuItem[] getSkuItems() {
        return this.skuItems;
    }

    public static class MeiGoodsSkuItem {
            @JsonProperty(value = "dict_id")
        /**
        * 订单项ID
        */
        private Long dictId;
            @JsonProperty(value = "text")
        /**
        * 订单项名称
        */
        private String text;
    
            public void setDictId(Long dictId) {
            this.dictId = dictId;
        }

        public Long getDictId() {
            return this.dictId;
        }

            public void setText(String text) {
            this.text = text;
        }

        public String getText() {
            return this.text;
        }

        }


}