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

public class YouzanLogisticsOnlineDelayParams implements APIParams, FileParams  {

    /**
     * 延期数
     */
    private Long delayIssue;
    /**
     * 待配送期次
     */
    private Long issue;
    /**
     * 交易编号
     */
    private String tid;

    public void setDelayIssue(Long delayIssue) {
        this.delayIssue = delayIssue;
    }

    public Long getDelayIssue() {
        return this.delayIssue;
    }

    public void setIssue(Long issue) {
        this.issue = issue;
    }

    public Long getIssue() {
        return this.issue;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (delayIssue != null) {
            params.put("delay_issue", delayIssue);
        }
        if (issue != null) {
            params.put("issue", issue);
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