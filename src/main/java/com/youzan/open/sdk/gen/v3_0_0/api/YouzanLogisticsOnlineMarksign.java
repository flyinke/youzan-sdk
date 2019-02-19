package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsOnlineMarksignResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsOnlineMarksignParams;

public class YouzanLogisticsOnlineMarksign extends AbstractAPI {

    public YouzanLogisticsOnlineMarksign() {
    }

    public YouzanLogisticsOnlineMarksign(YouzanLogisticsOnlineMarksignParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.online.marksign";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsOnlineMarksignResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsOnlineMarksignParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}