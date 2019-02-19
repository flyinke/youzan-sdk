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

public class YouzanRetailStockVendorsSearchParams implements APIParams, FileParams  {

    /**
     * 供应商名称
     */
    private String name;
    /**
     * 名称or手机
     */
    private String nameOrPhone;
    /**
     * 是否仅启用
     */
    private Boolean onlyEnable;
    /**
     * 分页index
     */
    private Long pageNo;
    /**
     * 分页大小
     */
    private Long pageSize;
    /**
     * 调用来源
     */
    private String source;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNameOrPhone(String nameOrPhone) {
        this.nameOrPhone = nameOrPhone;
    }

    public String getNameOrPhone() {
        return this.nameOrPhone;
    }

    public void setOnlyEnable(Boolean onlyEnable) {
        this.onlyEnable = onlyEnable;
    }

    public Boolean getOnlyEnable() {
        return this.onlyEnable;
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


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (name != null) {
            params.put("name", name);
        }
        if (nameOrPhone != null) {
            params.put("name_or_phone", nameOrPhone);
        }
        if (onlyEnable != null) {
            params.put("only_enable", onlyEnable);
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
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}