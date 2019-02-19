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

public class YouzanRetailProductsOfflineDisplayParams implements APIParams, FileParams  {

    /**
     * 是否全量上下架状态 默认false
   * false 非全量 
   * true   全量
     */
    private Boolean allBatchOperate;
    /**
     * 取消选择店铺id（全量上下架 ，取消选择的店铺）
     */
    private String cancelKdtIds;
    /**
     * 更新商品状态上架或下架（1下架，0上架）
     */
    private Long display;
    /**
     * 批量更新门店商品列表
     */
    private String itemIds;
    /**
     * 请求来源
     */
    private String source;
    /**
     * 待处理分店kdtId列表（未全量上下架生效）
     */
    private String subKdtIds;

    public void setAllBatchOperate(Boolean allBatchOperate) {
        this.allBatchOperate = allBatchOperate;
    }

    public Boolean getAllBatchOperate() {
        return this.allBatchOperate;
    }

    public void setCancelKdtIds(String cancelKdtIds) {
        this.cancelKdtIds = cancelKdtIds;
    }

    public String getCancelKdtIds() {
        return this.cancelKdtIds;
    }

    public void setDisplay(Long display) {
        this.display = display;
    }

    public Long getDisplay() {
        return this.display;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    public String getItemIds() {
        return this.itemIds;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setSubKdtIds(String subKdtIds) {
        this.subKdtIds = subKdtIds;
    }

    public String getSubKdtIds() {
        return this.subKdtIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (allBatchOperate != null) {
            params.put("all_batch_operate", allBatchOperate);
        }
        if (cancelKdtIds != null) {
            params.put("cancel_kdt_ids", cancelKdtIds);
        }
        if (display != null) {
            params.put("display", display);
        }
        if (itemIds != null) {
            params.put("item_ids", itemIds);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (subKdtIds != null) {
            params.put("sub_kdt_ids", subKdtIds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}