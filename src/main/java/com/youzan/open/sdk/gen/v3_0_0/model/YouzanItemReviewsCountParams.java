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

public class YouzanItemReviewsCountParams implements APIParams, FileParams  {

    /**
     * 商品id
     */
    private Long itemId;
    /**
     * 供货商店铺id
     */
    private Long supplierKdtId;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setSupplierKdtId(Long supplierKdtId) {
        this.supplierKdtId = supplierKdtId;
    }

    public Long getSupplierKdtId() {
        return this.supplierKdtId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (supplierKdtId != null) {
            params.put("supplier_kdt_id", supplierKdtId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}