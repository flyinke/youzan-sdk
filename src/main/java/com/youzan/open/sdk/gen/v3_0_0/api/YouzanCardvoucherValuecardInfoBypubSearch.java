package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardInfoBypubSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardInfoBypubSearchParams;

public class YouzanCardvoucherValuecardInfoBypubSearch extends AbstractAPI {

    public YouzanCardvoucherValuecardInfoBypubSearch() {
    }

    public YouzanCardvoucherValuecardInfoBypubSearch(YouzanCardvoucherValuecardInfoBypubSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.cardvoucher.valuecard.info.bypub.search";
    }

    public Class getResultModelClass() {
        return YouzanCardvoucherValuecardInfoBypubSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCardvoucherValuecardInfoBypubSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}