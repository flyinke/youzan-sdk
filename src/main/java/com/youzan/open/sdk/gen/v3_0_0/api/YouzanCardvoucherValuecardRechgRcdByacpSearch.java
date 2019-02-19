package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardRechgRcdByacpSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardRechgRcdByacpSearchParams;

public class YouzanCardvoucherValuecardRechgRcdByacpSearch extends AbstractAPI {

    public YouzanCardvoucherValuecardRechgRcdByacpSearch() {
    }

    public YouzanCardvoucherValuecardRechgRcdByacpSearch(YouzanCardvoucherValuecardRechgRcdByacpSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.cardvoucher.valuecard.rechg.rcd.byacp.search";
    }

    public Class getResultModelClass() {
        return YouzanCardvoucherValuecardRechgRcdByacpSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCardvoucherValuecardRechgRcdByacpSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}