package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanFenxiaoSupportOrderSearchResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanFenxiaoSupportOrderSearchParams;

public class YouzanFenxiaoSupportOrderSearch extends AbstractAPI {

    public YouzanFenxiaoSupportOrderSearch() {
    }

    public YouzanFenxiaoSupportOrderSearch(YouzanFenxiaoSupportOrderSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.fenxiao.support.order.search";
    }

    public Class getResultModelClass() {
        return YouzanFenxiaoSupportOrderSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanFenxiaoSupportOrderSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}