package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemPicUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemPicUpdateParams;

public class YouzanItemPicUpdate extends AbstractAPI {

    public YouzanItemPicUpdate() {
    }

    public YouzanItemPicUpdate(YouzanItemPicUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.pic.update";
    }

    public Class getResultModelClass() {
        return YouzanItemPicUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemPicUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}