package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardInfoQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardInfoQueryParams;

public class YouzanCardvoucherValuecardInfoQuery extends AbstractAPI {

    public YouzanCardvoucherValuecardInfoQuery() {
    }

    public YouzanCardvoucherValuecardInfoQuery(YouzanCardvoucherValuecardInfoQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.cardvoucher.valuecard.info.query";
    }

    public Class getResultModelClass() {
        return YouzanCardvoucherValuecardInfoQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCardvoucherValuecardInfoQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}