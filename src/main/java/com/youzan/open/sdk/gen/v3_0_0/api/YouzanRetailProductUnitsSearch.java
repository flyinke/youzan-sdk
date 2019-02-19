package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductUnitsSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductUnitsSearchParams;

public class YouzanRetailProductUnitsSearch extends AbstractAPI {

    public YouzanRetailProductUnitsSearch() {
    }

    public YouzanRetailProductUnitsSearch(YouzanRetailProductUnitsSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.units.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductUnitsSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductUnitsSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}