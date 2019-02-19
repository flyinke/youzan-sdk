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

public class YouzanDatacenterPspagesourceDataFetchParams implements APIParams, FileParams  {

    /**
     * 追踪信息集合, 最大200个, 查找特定链接的信息时可以指定相应的dcps追踪号；
该追踪号在创建追踪链接时生成，也可以根据推广名称在获取推广信息接口中获取。
不传可以分页获取店铺下所有推广链接的数据
     */
    private String dcpsList;
    /**
     * 查询结束时间 格式为yyyy-MM-dd
     */
    private String endDay;
    /**
     * 当前第几页 默认1 
     */
    private Long page;
    /**
     * 页面条数 默认20 最大200
     */
    private Long pageSize;
    /**
     * 查询开始时间 格式为yyyy-MM-dd
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