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

public class YouzanItemHotelRoomQueryParams implements APIParams, FileParams  {

    /**
     * 房态开始时间
     */
    private String beginDate;
    /**
     * 房态结束时间
     */
    private String endDate;
    /**
     * 商品Id
     */
    private Long itemId;
    /**
     * skuIds, 多个id用,隔开
     */
    private String skuIds;

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getBeginDate() {
        return this.beginDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    public String getSkuIds() {
        return this.skuIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (beginDate != null) {
            params.put("begin_date", beginDate);
        }
        if (endDate != null) {
            params.put("end_date", endDate);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (skuIds != null) {
            params.put("sku_ids", skuIds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}