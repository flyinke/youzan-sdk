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

public class YouzanMultistoreGoodsSkuUpdateParams implements APIParams, FileParams  {

    /**
     * 商品id
     */
    private Long numIid;
    /**
     * 网点id
     */
    private Long offlineId;
    /**
     * 商品货号（商家为商品设置的外部编号）
     */
    private String outerId;
    /**
     * 商品价格
     */
    private Float price;
    /**
     * 商品总库存。当商品没有SKU的时候有效，当商品有SKU时，总库存会自动按所有SKU库存之和计算
     */
    private String quantity;
    /**
     * 商品Sku信息的Json字符串，示例 [{"sku_property":{"颜色":"白色","尺寸":"M"},"sku_price":1.0,"sku_quantity":16,"sku_outer_id":"1702210201","sku_id":36149753},{"sku_property":{"颜色":"白色","尺寸":"S"},"sku_price":1.0,"sku_quantity":18,"sku_outer_id":"1702210202","sku_id":36149754}] 其中sku_property是k:v;k:v组合；
sku_quantity是sku库存数量；
sku_price是sku价格；
sku_outer_id是sku商家编码；
sku_id是sku的id; 网点商品含sku时，必需要传入。
     */
    private String skusWithJson;

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setOfflineId(Long offlineId) {
        this.offlineId = offlineId;
    }

    public Long getOfflineId() {
        return this.offlineId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public void setSkusWithJson(String skusWithJson) {
        this.skusWithJson = skusWithJson;
    }

    public String getSkusWithJson() {
        return this.skusWithJson;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (numIid != null) {
            params.put("num_iid", numIid);
        }
        if (offlineId != null) {
            params.put("offline_id", offlineId);
        }
        if (outerId != null) {
            params.put("outer_id", outerId);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (quantity != null) {
            params.put("quantity", quantity);
        }
        if (skusWithJson != null) {
            params.put("skus_with_json", skusWithJson);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}