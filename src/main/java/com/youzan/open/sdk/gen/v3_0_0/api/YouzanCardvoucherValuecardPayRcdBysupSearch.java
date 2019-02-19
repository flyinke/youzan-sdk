package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardPayRcdBysupSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardPayRcdBysupSearchParams;

public class YouzanCardvoucherValuecardPayRcdBysupSearch extends AbstractAPI {

    public YouzanCardvoucherValuecardPayRcdBysupSearch() {
    }

    public YouzanCardvoucherValuecardPayRcdBysupSearch(YouzanCardvoucherValuecardPayRcdBysupSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.cardvoucher.valuecard.pay.rcd.bysup.search";
    }

    public Class getResultModelClass() {
        return YouzanCardvoucherValuecardPayRcdBysupSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCardvoucherValuecardPayRcdBysupSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}