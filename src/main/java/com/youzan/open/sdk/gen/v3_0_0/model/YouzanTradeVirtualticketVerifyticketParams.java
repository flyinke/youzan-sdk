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

public class YouzanTradeVirtualticketVerifyticketParams implements APIParams, FileParams  {

    /**
     * 电子卡券码券号（每个电子卡券下的12位的码券号）
     */
    private String ticketCode;

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getTicketCode() {
        return this.ticketCode;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (ticketCode != null) {
            params.put("ticket_code", ticketCode);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}