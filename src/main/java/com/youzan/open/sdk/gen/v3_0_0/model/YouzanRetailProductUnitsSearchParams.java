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

public class YouzanRetailProductUnitsSearchParams implements APIParams, FileParams  {

    /**
     * 单位名称（模糊搜索）
     */
    private String namePart;
    /**
     * 页数
     */
    private Long pageNo;
    /**
     * 页大小
     */
    private Long pageSize;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;
    /**
     * 根据状态筛选，不传则查询出所有（0表示禁用，1表示启用）
     */
    private Long status;

    public void setNamePart(String namePart) {
        this.namePart = namePart;
    }

    public String getNamePart() {
        return this.namePart;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (namePart != null) {
            params.put("name_part", namePart);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (status != null) {
            params.put("status", status);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}