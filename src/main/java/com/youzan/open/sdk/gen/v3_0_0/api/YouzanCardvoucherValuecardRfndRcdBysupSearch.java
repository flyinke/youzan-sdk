package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardRfndRcdBysupSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardRfndRcdBysupSearchParams;

public class YouzanCardvoucherValuecardRfndRcdBysupSearch extends AbstractAPI {

    public YouzanCardvoucherValuecardRfndRcdBysupSearch() {
    }

    public YouzanCardvoucherValuecardRfndRcdBysupSearch(YouzanCardvoucherValuecardRfndRcdBysupSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.cardvoucher.valuecard.rfnd.rcd.bysup.search";
    }

    public Class getResultModelClass() {
        return YouzanCardvoucherValuecardRfndRcdBysupSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCardvoucherValuecardRfndRcdBysupSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}