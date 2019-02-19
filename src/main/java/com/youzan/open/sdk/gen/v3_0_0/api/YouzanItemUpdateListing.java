package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemUpdateListingResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemUpdateListingParams;

public class YouzanItemUpdateListing extends AbstractAPI {

    public YouzanItemUpdateListing() {
    }

    public YouzanItemUpdateListing(YouzanItemUpdateListingParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.update.listing";
    }

    public Class getResultModelClass() {
        return YouzanItemUpdateListingResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemUpdateListingParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}