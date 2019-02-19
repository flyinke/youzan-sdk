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

public class YouzanRegionsGetParams implements APIParams, FileParams  {

    /**
     * 需要返回的区域地名对象字段
     */
    private String fields;
    /**
     * 区域ID
     */
    private Long id;
    /**
     * 要获取的区域等级
     */
    private Long level;
    /**
     * 区域父级ID
     */
    private Long parentId;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getLevel() {
        return this.level;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return this.parentId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (fields != null) {
            params.put("fields", fields);
        }
        if (id != null) {
            params.put("id", id);
        }
        if (level != null) {
            params.put("level", level);
        }
        if (parentId != null) {
            params.put("parent_id", parentId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}