package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardRfndRcdBypubSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardRfndRcdBypubSearchParams;

public class YouzanCardvoucherValuecardRfndRcdBypubSearch extends AbstractAPI {

    public YouzanCardvoucherValuecardRfndRcdBypubSearch() {
    }

    public YouzanCardvoucherValuecardRfndRcdBypubSearch(YouzanCardvoucherValuecardRfndRcdBypubSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.cardvoucher.valuecard.rfnd.rcd.bypub.search";
    }

    public Class getResultModelClass() {
        return YouzanCardvoucherValuecardRfndRcdBypubSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCardvoucherValuecardRfndRcdBypubSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}