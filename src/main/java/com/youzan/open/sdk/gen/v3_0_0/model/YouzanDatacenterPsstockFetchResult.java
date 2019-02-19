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

public class YouzanDatacenterPsstockFetchResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 该店铺剩余的监控条数，如果该条数为0则不能创建推广分析
     */
    private YunPsStockModel response;

    public void setResponse(YunPsStockModel response) {
        this.response = response;
    }

    public YunPsStockModel getResponse() {
        return this.response;
    }

    public static class YunPsStockModel {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "rest_stock")
        /**
        * 剩余可用监控链接数
        */
        private Long restStock;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setRestStock(Long restStock) {
            this.restStock = restStock;
        }

        public Long getRestStock() {
            return this.restStock;
        }

        }


}