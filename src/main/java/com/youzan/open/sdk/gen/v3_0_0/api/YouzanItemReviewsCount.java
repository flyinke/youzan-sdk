package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemReviewsCountResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemReviewsCountParams;

public class YouzanItemReviewsCount extends AbstractAPI {

    public YouzanItemReviewsCount() {
    }

    public YouzanItemReviewsCount(YouzanItemReviewsCountParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.reviews.count";
    }

    public Class getResultModelClass() {
        return YouzanItemReviewsCountResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemReviewsCountParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}