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

public class YouzanRetailStockStockallotCheckResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 审核结果
     */
    private InterCheckRes[] response;

    public void setResponse(InterCheckRes[] response) {
        this.response = response;
    }

    public InterCheckRes[] getResponse() {
        return this.response;
    }

    public static class InterCheckRes {
            @JsonProperty(value = "success")
        /**
        * 是否成功
        */
        private Boolean success;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 对应的单据号
        */
        private String bizBillNo;
    
            public void setSuccess(Boolean success) {
            this.success = success;
        }

        public Boolean getSuccess() {
            return this.success;
        }

            public void setBizBillNo(String bizBillNo) {
            this.bizBillNo = bizBillNo;
        }

        public String getBizBillNo() {
            return this.bizBillNo;
        }

        }


}