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

public class YouzanRetailProductCategorySearchParams implements APIParams, FileParams  {

    /**
     * 商品分类id列表（根据分类id查询时要传）
     */
    private String categoryIds;
    /**
     * 商品分类层级(0代表所有子分类，1表示不需求子分类，2表示获取单层子分类)
     */
    private Long level;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getLevel() {
        return this.level;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (categoryIds != null) {
            params.put("category_ids", categoryIds);
        }
        if (level != null) {
            params.put("level", level);
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