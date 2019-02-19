package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardRechgRcdBypubSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardRechgRcdBypubSearchParams;

public class YouzanCardvoucherValuecardRechgRcdBypubSearch extends AbstractAPI {

    public YouzanCardvoucherValuecardRechgRcdBypubSearch() {
    }

    public YouzanCardvoucherValuecardRechgRcdBypubSearch(YouzanCardvoucherValuecardRechgRcdBypubSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.cardvoucher.valuecard.rechg.rcd.bypub.search";
    }

    public Class getResultModelClass() {
        return YouzanCardvoucherValuecardRechgRcdBypubSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCardvoucherValuecardRechgRcdBypubSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}