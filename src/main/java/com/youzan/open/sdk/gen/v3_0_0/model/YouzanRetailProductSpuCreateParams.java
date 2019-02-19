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

public class YouzanRetailProductSpuCreateParams implements APIParams, FileParams  {

    /**
     * 更多编码(最多10个编码，仅限英文字符与数据组合)
     */
    private String barCodes;
    /**
     * 商品所属分类id
     */
    private Long categoryId;
    /**
     * 默认供应商id
     */
    private Long defaultVendorId;
    /**
     * 成本价（单店版使用）
     */
    private Long lastCostPrice;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 图片地址 
[{"url":"https://img.yzcdn.cn/public_files/2017/08/30/63a8d28bce4ca2e5d081e1e69926288e.jpg"}]
     */
    private String photoUrl;
    /**
     * 建议零售价 无规格商品时传输
最大为9999999元
最小为0.01元
     */
    private Long retailPrice;
    /**
     * 调用来源（例如：OPEN-XXX）
     */
    private String retailSource;
    /**
     * sku定义
     */
    private String skus;
    /**
     * 规格定义组
[{"key":{"k":"颜色","kId":1},"values":[{"v":"蓝色 ","vId":3},{"v":"红色 ","vId":10}]}]
     */
    private String specDefineTuple;
    /**
     * 规格型号（规格最多100个字）
     */
    private String specifications;
    /**
     * 商品编码（最多20个字符，仅限英文字符与数据组合。如果为空，系统自动生成）
     */
    private String spuNo;
    /**
     * 初始库存（单店版使用,初始库存量最大为100000）
     */
    private Long stockNum;
    /**
     * 单位，如：克、千克
     */
    private String unit;

    public void setBarCodes(String barCodes) {
        this.barCodes = barCodes;
    }

    public String getBarCodes() {
        return this.barCodes;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setDefaultVendorId(Long defaultVendorId) {
        this.defaultVendorId = defaultVendorId;
    }

    public Long getDefaultVendorId() {
        return this.defaultVendorId;
    }

    public void setLastCostPrice(Long lastCostPrice) {
        this.lastCostPrice = lastCostPrice;
    }

    public Long getLastCostPrice() {
        return this.lastCostPrice;
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

    public void setRetailPrice(Long retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Long getRetailPrice() {
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

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getSpecifications() {
        return this.specifications;
    }

    public void setSpuNo(String spuNo) {
        this.spuNo = spuNo;
    }

    public String getSpuNo() {
        return this.spuNo;
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
        if (barCodes != null) {
            params.put("bar_codes", barCodes);
        }
        if (categoryId != null) {
            params.put("category_id", categoryId);
        }
        if (defaultVendorId != null) {
            params.put("default_vendor_id", defaultVendorId);
        }
        if (lastCostPrice != null) {
            params.put("last_cost_price", lastCostPrice);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (photoUrl != null) {
            params.put("photo_url", photoUrl);
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
        if (specifications != null) {
            params.put("specifications", specifications);
        }
        if (spuNo != null) {
            params.put("spu_no", spuNo);
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