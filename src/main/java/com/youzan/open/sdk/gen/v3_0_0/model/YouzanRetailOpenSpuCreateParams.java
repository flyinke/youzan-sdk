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

public class YouzanRetailOpenSpuCreateParams implements APIParams, FileParams  {

    /**
     * 类目ID
     */
    private Long categoryId;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 建议零售价（单位：元）
     */
    private String retailPrice;
    /**
     * 零售调用来源(调用方和有赞约定的值)
     */
    private String retailSource;
    /**
     * 商品规格列表
     */
    private String skus;
    /**
     * 规格定义
     */
    private String specDefineTuple;
    /**
     * 商品编码
     */
    private String spuCode;
    /**
     * 商品条码
     */
    private String spuNo;
    /**
     * 单位
     */
    private String unit;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getRetailPrice() {
        return this.retailPrice;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setSkus(String skus) {
        this.skus = skus;
    }

    public String getSkus() {
        return this.skus;
    }

    public void setSpecDefineTuple(String specDefineTuple) {
        this.specDefineTuple = specDefineTuple;
    }

    public String getSpecDefineTuple() {
        return this.specDefineTuple;
    }

    public void setSpuCode(String spuCode) {
        this.spuCode = spuCode;
    }

    public String getSpuCode() {
        return this.spuCode;
    }

    public void setSpuNo(String spuNo) {
        this.spuNo = spuNo;
    }

    public String getSpuNo() {
        return this.spuNo;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return this.unit;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (categoryId != null) {
            params.put("category_id", categoryId);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (retailPrice != null) {
            params.put("retail_price", retailPrice);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (skus != null) {
            params.put("skus", skus);
        }
        if (specDefineTuple != null) {
            params.put("spec_define_tuple", specDefineTuple);
        }
        if (spuCode != null) {
            params.put("spu_code", spuCode);
        }
        if (spuNo != null) {
            params.put("spu_no", spuNo);
        }
        if (unit != null) {
            params.put("unit", unit);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}