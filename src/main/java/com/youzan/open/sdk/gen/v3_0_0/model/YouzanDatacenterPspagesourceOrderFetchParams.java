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

public class YouzanDatacenterPspagesourceOrderFetchParams implements APIParams, FileParams  {

    /**
     * 推广分析dcps信息，该dcps在创建推广链接时会生成一个唯一追踪号，不能为空 
     */
    private String dcps;
    /**
     * 查询订单结束时间 格式yyyy-MM-dd
     */
    private String endDay;
    /**
     * 当前第几页 默认1
     */
    private Long page;
    /**
     * 页面条数 最小1 最大200， 默认20
     */
    private Long pageSize;
    /**
     * 查询订单开始时间 格式yyyy-MM-dd
     */
    private String startDay;

    public void setDcps(String dcps) {
        this.dcps = dcps;
    }

    public String getDcps() {
        return this.dcps;
    }

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

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getStartDay() {
        return this.startDay;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (dcps != null) {
            params.put("dcps", dcps);
        }
        if (endDay != null) {
            params.put("end_day", endDay);
        }
        if (page != null) {
            params.put("page", page);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
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