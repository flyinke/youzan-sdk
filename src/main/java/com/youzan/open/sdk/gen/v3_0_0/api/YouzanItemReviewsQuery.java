package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemReviewsQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemReviewsQueryParams;

public class YouzanItemReviewsQuery extends AbstractAPI {

    public YouzanItemReviewsQuery() {
    }

    public YouzanItemReviewsQuery(YouzanItemReviewsQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.reviews.query";
    }

    public Class getResultModelClass() {
        return YouzanItemReviewsQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemReviewsQueryParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}