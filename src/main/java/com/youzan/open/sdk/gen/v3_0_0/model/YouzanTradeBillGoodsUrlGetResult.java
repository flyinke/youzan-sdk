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

public class YouzanTradeBillGoodsUrlGetResult implements APIResult {

    @JsonProperty(value = "is_success")
    /**
     * 操作是否成功，true为成功，false为失败
     */
    private Boolean isSuccess;
    @JsonProperty(value = "book_key")
    /**
     * 操作key
     */
    private String bookKey;
    @JsonProperty(value = "url")
    /**
     * 多商品下单结算页url
     */
    private String url;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }
    public void setBookKey(String bookKey) {
        this.bookKey = bookKey;
    }

    public String getBookKey() {
        return this.bookKey;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }


}