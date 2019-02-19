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

public class YouzanRetailStockDeliveryGetParams implements APIParams, FileParams  {

    /**
     * 单据号
     */
    private String bizBillNo;
    /**
     * 总部id
     */
    private Long groupId;
    /**
     * 来源
     */
    private String retailSource;
    /**
     * 是否展示单据明细，默认是
     */
    private Boolean showItem;
    /**
     * 单据类型，InterBusinessOrderType
     */
    private Long type;

    public void setBizBillNo(String bizBillNo) {
        this.bizBillNo = bizBillNo;
    }

    public String getBizBillNo() {
        return this.bizBillNo;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setShowItem(Boolean showItem) {
        this.showItem = showItem;
    }

    public Boolean getShowItem() {
        return this.showItem;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (bizBillNo != null) {
            params.put("biz_bill_no", bizBillNo);
        }
        if (groupId != null) {
            params.put("group_id", groupId);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (showItem != null) {
            params.put("show_item", showItem);
        }
        if (type != null) {
            params.put("type", type);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}