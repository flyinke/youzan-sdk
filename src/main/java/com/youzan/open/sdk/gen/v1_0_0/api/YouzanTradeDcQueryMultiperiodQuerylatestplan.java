package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanTradeDcQueryMultiperiodQuerylatestplanResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanTradeDcQueryMultiperiodQuerylatestplanParams;

public class YouzanTradeDcQueryMultiperiodQuerylatestplan extends AbstractAPI {

    public YouzanTradeDcQueryMultiperiodQuerylatestplan() {
    }

    public YouzanTradeDcQueryMultiperiodQuerylatestplan(YouzanTradeDcQueryMultiperiodQuerylatestplanParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.trade.dc.query.multiperiod.querylatestplan";
    }

    public Class getResultModelClass() {
        return YouzanTradeDcQueryMultiperiodQuerylatestplanResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeDcQueryMultiperiodQuerylatestplanParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}