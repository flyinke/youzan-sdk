package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardFundPayResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCardvoucherValuecardFundPayParams;

public class YouzanCardvoucherValuecardFundPay extends AbstractAPI {

    public YouzanCardvoucherValuecardFundPay() {
    }

    public YouzanCardvoucherValuecardFundPay(YouzanCardvoucherValuecardFundPayParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.cardvoucher.valuecard.fund.pay";
    }

    public Class getResultModelClass() {
        return YouzanCardvoucherValuecardFundPayResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCardvoucherValuecardFundPayParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}