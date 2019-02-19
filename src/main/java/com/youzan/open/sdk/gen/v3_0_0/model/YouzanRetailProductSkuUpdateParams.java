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

public class YouzanRetailProductSkuUpdateParams implements APIParams, FileParams  {

    /**
     * 目录id
     */
    private Long categoryId;
    /**
     * 名称
     */
    private String name;
    /**
     * 图片地址(例如：https://img.yzcdn.cn/public_files/2017/08/30/63a8d)
     */
    private String photoUrl;
    /**
     * 商品Id
     */
    private String skuId;
    /**
     * 商品编码（最多20个字符，仅限英文字符与数据组合。如果为空，系统自动生成）
     */
    private String skuNo;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;
    /**
     * 商品库商品规格（规格最多100个字）
     */
    private String specifications;

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

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    public String getSkuNo() {
        return this.skuNo;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getSpecifications() {
        return this.specifications;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (categoryId != null) {
            params.put("category_id", categoryId);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (photoUrl != null) {
            params.put("photo_url", photoUrl);
        }
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        if (skuNo != null) {
            params.put("sku_no", skuNo);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (specifications != null) {
            params.put("specifications", specifications);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}