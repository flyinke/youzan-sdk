package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsTemplateCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsTemplateCreateParams;

public class YouzanLogisticsTemplateCreate extends AbstractAPI {

    public YouzanLogisticsTemplateCreate() {
    }

    public YouzanLogisticsTemplateCreate(YouzanLogisticsTemplateCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.template.create";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsTemplateCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsTemplateCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}