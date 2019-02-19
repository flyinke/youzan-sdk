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

public class YouzanRetailStockStockallotCloseResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 是否成功
     */
    private PlainBoolResult response;

    public void setResponse(PlainBoolResult response) {
        this.response = response;
    }

    public PlainBoolResult getResponse() {
        return this.response;
    }

    public static class PlainBoolResult {
            @JsonProperty(value = "is_success")
        /**
        * 是否成功
        */
        private Boolean isSuccess;
    
            public void setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
        }

        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        }


}