package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanTradeDcQueryMultiperiodQuerydeliveryrecordsResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanTradeDcQueryMultiperiodQuerydeliveryrecordsParams;

public class YouzanTradeDcQueryMultiperiodQuerydeliveryrecords extends AbstractAPI {

    public YouzanTradeDcQueryMultiperiodQuerydeliveryrecords() {
    }

    public YouzanTradeDcQueryMultiperiodQuerydeliveryrecords(YouzanTradeDcQueryMultiperiodQuerydeliveryrecordsParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.trade.dc.query.multiperiod.querydeliveryrecords";
    }

    public Class getResultModelClass() {
        return YouzanTradeDcQueryMultiperiodQuerydeliveryrecordsResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeDcQueryMultiperiodQuerydeliveryrecordsParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}