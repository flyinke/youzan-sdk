package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardPayRcdBypubSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardPayRcdBypubSearchParams;

public class YouzanCardvoucherValuecardPayRcdBypubSearch extends AbstractAPI {

    public YouzanCardvoucherValuecardPayRcdBypubSearch() {
    }

    public YouzanCardvoucherValuecardPayRcdBypubSearch(YouzanCardvoucherValuecardPayRcdBypubSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.cardvoucher.valuecard.pay.rcd.bypub.search";
    }

    public Class getResultModelClass() {
        return YouzanCardvoucherValuecardPayRcdBypubSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCardvoucherValuecardPayRcdBypubSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}