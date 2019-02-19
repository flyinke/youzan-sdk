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

public class YouzanMeiStockListParams implements APIParams, FileParams  {

    /**
     * 分类ID
     */
    private Long categoryId;
    /**
     * 商品名称
     */
    private String itemTitle;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 页码
     */
    private Long pageNo;
    /**
     * 每页数量
     */
    private Long pageSize;
    /**
     * 仓库ID
     */
    private Long wareHouseId;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemTitle() {
        return this.itemTitle;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
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

    public void setWareHouseId(Long wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public Long getWareHouseId() {
        return this.wareHouseId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (categoryId != null) {
            params.put("category_id", categoryId);
        }
        if (itemTitle != null) {
            params.put("item_title", itemTitle);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (wareHouseId != null) {
            params.put("ware_house_id", wareHouseId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}