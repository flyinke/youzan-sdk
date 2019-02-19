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

public class YouzanDatacenterPssourceFetchParams implements APIParams, FileParams  {

    /**
     * 查询一段时间内推广渠道列表的 查询结束时间 格式yyyy-MM-dd
     */
    private String endDay;
    /**
     * 当前第几页 默认第1页
     */
    private Long page;
    /**
     * 页面条数 默认 20条 最大200
     */
    private Long pageSize;
    /**
     * 渠道ID集合，最大200个，用来查询特定渠道的信息，可以从 推广监控列表基本数据的source_id获取
     */
    private String sourceIds;
    /**
     * 推广分析中所使用的渠道名称
     */
    private String sourceName;
    /**
     * 查询一段时间内推广渠道列表的 查询开始时间 格式yyyy-MM-dd
     */
    private String startDay;

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getEndDay() {
        return this.endDay;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPage() {
        return this.page;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setSourceIds(String sourceIds) {
        this.sourceIds = sourceIds;
    }

    public String getSourceIds() {
        return this.sourceIds;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getStartDay() {
        return this.startDay;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (endDay != null) {
            params.put("end_day", endDay);
        }
        if (page != null) {
            params.put("page", page);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (sourceIds != null) {
            params.put("source_ids", sourceIds);
        }
        if (sourceName != null) {
            params.put("source_name", sourceName);
        }
        if (startDay != null) {
            params.put("start_day", startDay);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}