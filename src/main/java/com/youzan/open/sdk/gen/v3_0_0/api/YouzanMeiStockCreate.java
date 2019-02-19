package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStockCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStockCreateParams;

public class YouzanMeiStockCreate extends AbstractAPI {

    public YouzanMeiStockCreate() {
    }

    public YouzanMeiStockCreate(YouzanMeiStockCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.stock.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiStockCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiStockCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}