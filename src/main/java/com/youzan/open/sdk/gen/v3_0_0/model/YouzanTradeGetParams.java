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

public class YouzanTradeGetParams implements APIParams, FileParams  {

    /**
     * 指到需要返回的交易对象字段，如tid,title,receiver_city等
     */
    private String fields;
    /**
     * 指定获取子交易的第几页，不传则获取全部
     */
    private Long subTradePageNo;
    /**
     * 指定获取子交易的第几页，不传则获取全部
     */
    private Long subTradePageSize;
    /**
     * 交易订单号
     */
    private String tid;
    /**
     * 是否需要获取子订单,true为需要，false为不需要
     */
    private Boolean withChilds;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setSubTradePageNo(Long subTradePageNo) {
        this.subTradePageNo = subTradePageNo;
    }

    public Long getSubTradePageNo() {
        return this.subTradePageNo;
    }

    public void setSubTradePageSize(Long subTradePageSize) {
        this.subTradePageSize = subTradePageSize;
    }

    public Long getSubTradePageSize() {
        return this.subTradePageSize;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }

    public void setWithChilds(Boolean withChilds) {
        this.withChilds = withChilds;
    }

    public Boolean getWithChilds() {
        return this.withChilds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (fields != null) {
            params.put("fields", fields);
        }
        if (subTradePageNo != null) {
            params.put("sub_trade_page_no", subTradePageNo);
        }
        if (subTradePageSize != null) {
            params.put("sub_trade_page_size", subTradePageSize);
        }
        if (tid != null) {
            params.put("tid", tid);
        }
        if (withChilds != null) {
            params.put("with_childs", withChilds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}