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

public class YouzanMeiCustomerTagListParams implements APIParams, FileParams  {

    /**
     * 是否列出所有 0否 1是 默认0
     */
    private Long listAll;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 标签名字
     */
    private String name;
    /**
     * 页码
     */
    private Long pageNo;
    /**
     * 每页数量
     */
    private Long pageSize;

    public void setListAll(Long listAll) {
        this.listAll = listAll;
    }

    public Long getListAll() {
        return this.listAll;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (listAll != null) {
            params.put("list_all", listAll);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}