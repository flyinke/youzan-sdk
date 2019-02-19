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

public class YouzanRetailProductSpusBatchUpdateResult implements APIResult {

    @JsonProperty(value = "result")
    /**
     * 批量操作结果
     */
    private Map result;

    public void setResult(Map result) {
        this.result = result;
    }

    public Map getResult() {
        return this.result;
    }

    public static class Map {
            @JsonProperty(value = "skuId")
        /**
        * 待更新商品id
        */
        private Long skuId;
            @JsonProperty(value = "result")
        /**
        * 是否更新成功
        */
        private Boolean result;
    
            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setResult(Boolean result) {
            this.result = result;
        }

        public Boolean getResult() {
            return this.result;
        }

        }


}