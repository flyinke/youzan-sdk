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

public class YouzanRetailProductCategoryCreateParams implements APIParams, FileParams  {

    /**
     * 类目名称（分类名称字符数在1-20之间）
     */
    private String name;
    /**
     * 父级节点id（默认0，表示第一层分类）
     */
    private Long parentId;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return this.parentId;
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
        if (parentId != null) {
            params.put("parent_id", parentId);
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