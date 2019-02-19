package com.youzan.open.sdk.gen.v2_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v2_0_0.model.YouzanTradeDcQueryMultiperioddetailResult;
import com.youzan.open.sdk.gen.v2_0_0.model.YouzanTradeDcQueryMultiperioddetailParams;

public class YouzanTradeDcQueryMultiperioddetail extends AbstractAPI {

    public YouzanTradeDcQueryMultiperioddetail() {
    }

    public YouzanTradeDcQueryMultiperioddetail(YouzanTradeDcQueryMultiperioddetailParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "2.0.0";
    }

    public String getName() {
        return "youzan.trade.dc.query.multiperioddetail";
    }

    public Class getResultModelClass() {
        return YouzanTradeDcQueryMultiperioddetailResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeDcQueryMultiperioddetailParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}