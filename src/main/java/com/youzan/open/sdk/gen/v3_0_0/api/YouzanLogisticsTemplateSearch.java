package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsTemplateSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsTemplateSearchParams;

public class YouzanLogisticsTemplateSearch extends AbstractAPI {

    public YouzanLogisticsTemplateSearch() {
    }

    public YouzanLogisticsTemplateSearch(YouzanLogisticsTemplateSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.template.search";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsTemplateSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsTemplateSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}