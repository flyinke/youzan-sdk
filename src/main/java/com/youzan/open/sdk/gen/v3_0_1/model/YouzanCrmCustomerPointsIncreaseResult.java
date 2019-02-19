package com.youzan.open.sdk.gen.v3_0_1.model;

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

public class YouzanCrmCustomerPointsIncreaseResult implements APIResult {

    @JsonProperty(value = "is_success")
    /**
     * true表示操作成功，false表示操作失败
     */
    private String isSuccess;

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getIsSuccess() {
        return this.isSuccess;
    }


}