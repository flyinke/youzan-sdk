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

public class YouzanTradeMemoUpdateParams implements APIParams, FileParams  {

    /**
     * 订单备注加星标，取值为1-5
     */
    private String flag;
    /**
     * 订单备注
     */
    private String memo;
    /**
     * 订单号
     */
    private String tid;

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFlag() {
        return this.flag;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (flag != null) {
            params.put("flag", flag);
        }
        if (memo != null) {
            params.put("memo", memo);
        }
        if (tid != null) {
            params.put("tid", tid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}