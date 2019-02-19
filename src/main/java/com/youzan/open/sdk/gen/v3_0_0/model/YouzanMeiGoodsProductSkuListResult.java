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

public class YouzanMeiGoodsProductSkuListResult implements APIResult {

    @JsonProperty(value = "skus")
    /**
     * 规格列表
     */
    private MeiGoodsSkuInfo[] skus;

    public void setSkus(MeiGoodsSkuInfo[] skus) {
        this.skus = skus;
    }

    public MeiGoodsSkuInfo[] getSkus() {
        return this.skus;
    }

    public static class MeiGoodsSkuInfo {
            @JsonProperty(value = "dict_id")
        /**
        * 规格ID
        */
        private Long dictId;
            @JsonProperty(value = "text")
        /**
        * 规格名称
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