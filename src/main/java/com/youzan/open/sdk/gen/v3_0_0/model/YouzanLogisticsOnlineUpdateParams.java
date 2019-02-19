package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanLogisticsOnlineUpdateParams implements APIParams, FileParams  {

    /**
     * 订单号
     */
    private String tid;
    /**
     * 修改物流信息
     */
    private String tradeExpressModify;

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }

    public void setTradeExpressModify(String tradeExpressModify) {
        this.tradeExpressModify = tradeExpressModify;
    }

    public String getTradeExpressModify() {
        return this.tradeExpressModify;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (tid != null) {
            params.put("tid", tid);
        }
        if (tradeExpressModify != null) {
            params.put("trade_express_modify", tradeExpressModify);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}