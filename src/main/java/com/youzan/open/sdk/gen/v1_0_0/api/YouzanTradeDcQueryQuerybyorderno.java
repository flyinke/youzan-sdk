package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanTradeDcQueryQuerybyordernoResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanTradeDcQueryQuerybyordernoParams;

public class YouzanTradeDcQueryQuerybyorderno extends AbstractAPI {

    public YouzanTradeDcQueryQuerybyorderno() {
    }

    public YouzanTradeDcQueryQuerybyorderno(YouzanTradeDcQueryQuerybyordernoParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.trade.dc.query.querybyorderno";
    }

    public Class getResultModelClass() {
        return YouzanTradeDcQueryQuerybyordernoResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeDcQueryQuerybyordernoParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}