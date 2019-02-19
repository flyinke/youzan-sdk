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

public class YouzanUsersWeixinFollowersPullParams implements APIParams, FileParams  {

    /**
     * 用于拉取该粉丝编码之后的查询条件。第一次查询可传入0，之后每次查询可传入上次查询里返回的last_fans_id，直到返回结果里的has_next为false
     */
    private Long afterFansId;
    /**
     * 需要返回的微信粉丝对象字段，如nick,avatar等。可选值：CrmWeixinFans微信粉丝结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
     */
    private String fields;
    /**
     * 每页条数，最大值：50
     */
    private Long pageSize;

    public void setAfterFansId(Long afterFansId) {
        this.afterFansId = afterFansId;
    }

    public Long getAfterFansId() {
        return this.afterFansId;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (afterFansId != null) {
            params.put("after_fans_id", afterFansId);
        }
        if (fields != null) {
            params.put("fields", fields);
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