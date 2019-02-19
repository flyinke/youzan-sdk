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

public class YouzanItemSearchParams implements APIParams, FileParams  {

    /**
     * 作为查询条件的商品ID列表，以逗号分隔，如1,2
     */
    private String itemIds;
    /**
     * 页码 
     */
    private Long pageNo;
    /**
     * 每页数量
     */
    private Long pageSize;
    /**
     * 搜索关键字
     */
    private String q;
    /**
     * 是否在售:
     0: 在售
     1: 售罄或部分售罄
     2: 全部
     */
    private Long showSoldOut;
    /**
     * 作为查询的分组ID列表，以逗号分隔，如1,2
     */
    private String tagIds;

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    public String getItemIds() {
        return this.itemIds;
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

    public void setQ(String q) {
        this.q = q;
    }

    public String getQ() {
        return this.q;
    }

    public void setShowSoldOut(Long showSoldOut) {
        this.showSoldOut = showSoldOut;
    }

    public Long getShowSoldOut() {
        return this.showSoldOut;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getTagIds() {
        return this.tagIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (itemIds != null) {
            params.put("item_ids", itemIds);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (q != null) {
            params.put("q", q);
        }
        if (showSoldOut != null) {
            params.put("show_sold_out", showSoldOut);
        }
        if (tagIds != null) {
            params.put("tag_ids", tagIds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}