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

public class YouzanLogisticsOnlineConfirmParams implements APIParams, FileParams  {

    /**
     * 发货是否无需物流  如果为 0 则必须传递物流参数，如果为 1 则无需传递物流参数（out_stype和out_sid），默认为 0
     */
    private Long isNoExpress;
    /**
     * 配送期次，周期购订单专用，例如：1，表示配送第1期
     */
    private Long issue;
    /**
     * 如果需要拆单发货，使用该字段指定要发货的商品交易明细编号，多个明细编号用半角逗号“,”分隔；  不需要拆单发货，则该字段不传或值为空；
     */
    private String oids;
    /**
     * 快递单号（具体一个物流公司的真实快递单号）
     */
    private String outSid;
    /**
     * 物流公司编号，可以通过请求 youzan.logistics.express.get 该接口获得
     */
    private String outStype;
    /**
     * 外部交易编号
     */
    private String outerTid;
    /**
     * 交易订单号
     */
    private String tid;

    public void setIsNoExpress(Long isNoExpress) {
        this.isNoExpress = isNoExpress;
    }

    public Long getIsNoExpress() {
        return this.isNoExpress;
    }

    public void setIssue(Long issue) {
        this.issue = issue;
    }

    public Long getIssue() {
        return this.issue;
    }

    public void setOids(String oids) {
        this.oids = oids;
    }

    public String getOids() {
        return this.oids;
    }

    public void setOutSid(String outSid) {
        this.outSid = outSid;
    }

    public String getOutSid() {
        return this.outSid;
    }

    public void setOutStype(String outStype) {
        this.outStype = outStype;
    }

    public String getOutStype() {
        return this.outStype;
    }

    public void setOuterTid(String outerTid) {
        this.outerTid = outerTid;
    }

    public String getOuterTid() {
        return this.outerTid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (isNoExpress != null) {
            params.put("is_no_express", isNoExpress);
        }
        if (issue != null) {
            params.put("issue", issue);
        }
        if (oids != null) {
            params.put("oids", oids);
        }
        if (outSid != null) {
            params.put("out_sid", outSid);
        }
        if (outStype != null) {
            params.put("out_stype", outStype);
        }
        if (outerTid != null) {
            params.put("outer_tid", outerTid);
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