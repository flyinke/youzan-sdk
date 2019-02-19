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

public class YouzanRetailProductSkuCreateParams implements APIParams, FileParams  {

    /**
     * 商品库商品所属分类id
     */
    private Long categoryId;
    /**
     * 成本价（成本价最大为9999999元。单位：分）
     */
    private Long costPrice;
    /**
     * 商品库商品名称（名称最多100个字）
     */
    private String name;
    /**
     * 外部id 用于第三方关联商品库商品（最长64个字符）
     */
    private String outId;
    /**
     * 图片地址
     */
    private String photoUrl;
    /**
     * 商品库商品编码（最多20个字符，仅限英文字符与数据组合。如果为空，系统自动生成）
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
    /**
     * 库存数量（初始库存量最大为100000）
     */
    private Long stockNum;
    /**
     * 单位，如：克、千克
     */
    private String unit;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    public Long getCostPrice() {
        return this.costPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }

    public String getOutId() {
        return this.outId;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
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

    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }

    public Long getStockNum() {
        return this.stockNum;
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
        if (costPrice != null) {
            params.put("cost_price", costPrice);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (outId != null) {
            params.put("out_id", outId);
        }
        if (photoUrl != null) {
            params.put("photo_url", photoUrl);
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
        if (stockNum != null) {
            params.put("stock_num", stockNum);
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