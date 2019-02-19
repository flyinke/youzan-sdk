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

public class YouzanDatacenterPspagesourceFetchParams implements APIParams, FileParams  {

    /**
     * 推广分析监控追踪ID集合最多200个， 可以查询指定dcps的推广基本信息，为空是查询所有。dcps即是监控链接url后面的dc_ps 参数 
     */
    private String dcpsList;
    /**
     * 查询一段时间内的推广分析列表的查询结束时间 格式yyyy-MM-dd
     */
    private String endDay;
    /**
     * 当前页 默认 1
     */
    private Long page;
    /**
     * 页面条数 默认20 最大200
     */
    private Long pageSize;
    /**
     * 推广分析名称，可以模糊匹配
     */
    private String psName;
    /**
     * 推广分析状态1:推广中;2:推广结束
     */
    private Long psStatus;
    /**
     * 查询一段时间内的推广分析列表 的查询开始时间 格式yyyy-MM-dd
     */
    private String startDay;

    public void setDcpsList(String dcpsList) {
        this.dcpsList = dcpsList;
    }

    public String getDcpsList() {
        return this.dcpsList;
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

    public void setPsName(String psName) {
        this.psName = psName;
    }

    public String getPsName() {
        return this.psName;
    }

    public void setPsStatus(Long psStatus) {
        this.psStatus = psStatus;
    }

    public Long getPsStatus() {
        return this.psStatus;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getStartDay() {
        return this.startDay;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (dcpsList != null) {
            params.put("dcps_list", dcpsList);
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
        if (psName != null) {
            params.put("ps_name", psName);
        }
        if (psStatus != null) {
            params.put("ps_status", psStatus);
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