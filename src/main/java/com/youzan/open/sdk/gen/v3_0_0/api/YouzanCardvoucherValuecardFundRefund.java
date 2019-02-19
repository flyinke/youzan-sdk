package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardFundRefundResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardFundRefundParams;

public class YouzanCardvoucherValuecardFundRefund extends AbstractAPI {

    public YouzanCardvoucherValuecardFundRefund() {
    }

    public YouzanCardvoucherValuecardFundRefund(YouzanCardvoucherValuecardFundRefundParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.cardvoucher.valuecard.fund.refund";
    }

    public Class getResultModelClass() {
        return YouzanCardvoucherValuecardFundRefundResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCardvoucherValuecardFundRefundParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}