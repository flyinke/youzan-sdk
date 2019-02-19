package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardInfoBysupQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardInfoBysupQueryParams;

public class YouzanCardvoucherValuecardInfoBysupQuery extends AbstractAPI {

    public YouzanCardvoucherValuecardInfoBysupQuery() {
    }

    public YouzanCardvoucherValuecardInfoBysupQuery(YouzanCardvoucherValuecardInfoBysupQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.cardvoucher.valuecard.info.bysup.query";
    }

    public Class getResultModelClass() {
        return YouzanCardvoucherValuecardInfoBysupQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCardvoucherValuecardInfoBysupQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}