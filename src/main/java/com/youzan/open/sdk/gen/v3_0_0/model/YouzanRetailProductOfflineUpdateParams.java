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

public class YouzanRetailProductOfflineUpdateParams implements APIParams, FileParams  {

    /**
     * 是否全量上下架状态
-1 未选择 默认
 0 下架
1 上架
     */
    private Long allBatchOperate;
    /**
     * 分类id：单个销售商品使用关联的商品库商品的分类 组合销售 用户自己选择关联的分类
     */
    private Long categoryId;
    /**
     * 组合商品关联关系
     */
    private String combineParams;
    /**
     * 是否上架（1上架，0下架）
     */
    private Long display;
    /**
     * 商品编码
组合商品生效  单个销售商品使用关联的商品库商品 spuNo
     */
    private String goodsNo;
    /**
     * 门店商品id
     */
    private Long itemId;
    /**
     * 计量方式（0表示非称重，10表示称重）
     */
    private Long measurement;
    /**
     * 门店商品名称
     */
    private String name;
    /**
     * 图片地址（例如：[{"url":"upload_files/2016/05/16/FjvGju7UwGfol_yAXK3RzxOGelt0.png","id":"642430978","width":"300","height":"299"},{"url":"upload_files/2016/05/20/FgNkCcgqoGd_fMDPPCas1UIX3aCM.jpg","id":"644360875","width":"640","height"）
     */
    private String photoUrl;
    /**
     * 本次关联的商品库商品id
     */
    private Long relateSkuId;
    /**
     * 零售价（最小为1分，最大为999999900分。单位：分）
     */
    private Long retailPrice;
    /**
     * 下架分店id(连锁版生效)
     */
    private String saleDownKdtIds;
    /**
     * 上架分店id(连锁版生效)
     */
    private String saleUpKdtIds;
    /**
     * 销售库存
组合商品需要传计算后的可售库存
     */
    private Long sellStockCount;
    /**
     * 销售类型：1单个销售，2组合销售
     */
    private Long sellType;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;
    /**
     * 规格定义 组合商品需要用户自己填写
     */
    private String specifications;
    /**
     * 最新关联商品库的spu_id
     */
    private Long spuId;
    /**
     * 门店商品sku定义
     */
    private String stocks;
    /**
     * 商品单位
组合商品生效  单个销售商品使用关联的商品库商品的单位
     */
    private String unit;

    public void setAllBatchOperate(Long allBatchOperate) {
        this.allBatchOperate = allBatchOperate;
    }

    public Long getAllBatchOperate() {
        return this.allBatchOperate;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCombineParams(String combineParams) {
        this.combineParams = combineParams;
    }

    public String getCombineParams() {
        return this.combineParams;
    }

    public void setDisplay(Long display) {
        this.display = display;
    }

    public Long getDisplay() {
        return this.display;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsNo() {
        return this.goodsNo;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setMeasurement(Long measurement) {
        this.measurement = measurement;
    }

    public Long getMeasurement() {
        return this.measurement;
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

    public void setRelateSkuId(Long relateSkuId) {
        this.relateSkuId = relateSkuId;
    }

    public Long getRelateSkuId() {
        return this.relateSkuId;
    }

    public void setRetailPrice(Long retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Long getRetailPrice() {
        return this.retailPrice;
    }

    public void setSaleDownKdtIds(String saleDownKdtIds) {
        this.saleDownKdtIds = saleDownKdtIds;
    }

    public String getSaleDownKdtIds() {
        return this.saleDownKdtIds;
    }

    public void setSaleUpKdtIds(String saleUpKdtIds) {
        this.saleUpKdtIds = saleUpKdtIds;
    }

    public String getSaleUpKdtIds() {
        return this.saleUpKdtIds;
    }

    public void setSellStockCount(Long sellStockCount) {
        this.sellStockCount = sellStockCount;
    }

    public Long getSellStockCount() {
        return this.sellStockCount;
    }

    public void setSellType(Long sellType) {
        this.sellType = sellType;
    }

    public Long getSellType() {
        return this.sellType;
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

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Long getSpuId() {
        return this.spuId;
    }

    public void setStocks(String stocks) {
        this.stocks = stocks;
    }

    public String getStocks() {
        return this.stocks;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return this.unit;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (allBatchOperate != null) {
            params.put("all_batch_operate", allBatchOperate);
        }
        if (categoryId != null) {
            params.put("category_id", categoryId);
        }
        if (combineParams != null) {
            params.put("combine_params", combineParams);
        }
        if (display != null) {
            params.put("display", display);
        }
        if (goodsNo != null) {
            params.put("goods_no", goodsNo);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (measurement != null) {
            params.put("measurement", measurement);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (photoUrl != null) {
            params.put("photo_url", photoUrl);
        }
        if (relateSkuId != null) {
            params.put("relate_sku__id", relateSkuId);
        }
        if (retailPrice != null) {
            params.put("retail_price", retailPrice);
        }
        if (saleDownKdtIds != null) {
            params.put("sale_down_kdt_ids", saleDownKdtIds);
        }
        if (saleUpKdtIds != null) {
            params.put("sale_up_kdt_ids", saleUpKdtIds);
        }
        if (sellStockCount != null) {
            params.put("sell_stock_count", sellStockCount);
        }
        if (sellType != null) {
            params.put("sell_type", sellType);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (specifications != null) {
            params.put("specifications", specifications);
        }
        if (spuId != null) {
            params.put("spu_id", spuId);
        }
        if (stocks != null) {
            params.put("stocks", stocks);
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