package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterInviteeListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterInviteeListParams;

public class YouzanMeiPromoterInviteeList extends AbstractAPI {

    public YouzanMeiPromoterInviteeList() {
    }

    public YouzanMeiPromoterInviteeList(YouzanMeiPromoterInviteeListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.promoter.invitee.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiPromoterInviteeListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiPromoterInviteeListParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}