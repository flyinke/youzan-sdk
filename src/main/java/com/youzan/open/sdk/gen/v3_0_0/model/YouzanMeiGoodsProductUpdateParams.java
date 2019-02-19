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

public class YouzanMeiGoodsProductUpdateParams implements APIParams, FileParams  {

    /**
     * 分组ID
     */
    private Long category;
    /**
     * 成本价，单位：分
     */
    private Long costPrice;
    /**
     * 商品ID
     */
    private Long goodsId;
    /**
     * 商品编号/条形码
     */
    private String goodsNo;
    /**
     * 商品图片列表
     */
    private String goodsPictures;
    /**
     * 服务规格信息列表
     */
    private String goodsSkus;
    /**
     * 产品ID
     */
    private Long itemId;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 服务详情 支持富文本
     */
    private String memo;
    /**
     * 服务名称
     */
    private String name;
    /**
     * 是否上架 1 是 0 否
     */
    private Long onShelve;
    /**
     * 运费，单位：分
     */
    private Long postage;
    /**
     * 价格，有规格时不需要传这个参数
     */
    private Long price;
    /**
     * 服务简介 支持富文本
     */
    private String shortMemo;
    /**
     * 商品Sku图片信息列表，当规格需要设置图片时 需要传此参数
     */
    private String skuImages;
    /**
     * 商品标签ID列表
     */
    private String tags;

    public void setCategory(Long category) {
        this.category = category;
    }

    public Long getCategory() {
        return this.category;
    }

    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    public Long getCostPrice() {
        return this.costPrice;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsNo() {
        return this.goodsNo;
    }

    public void setGoodsPictures(String goodsPictures) {
        this.goodsPictures = goodsPictures;
    }

    public String getGoodsPictures() {
        return this.goodsPictures;
    }

    public void setGoodsSkus(String goodsSkus) {
        this.goodsSkus = goodsSkus;
    }

    public String getGoodsSkus() {
        return this.goodsSkus;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOnShelve(Long onShelve) {
        this.onShelve = onShelve;
    }

    public Long getOnShelve() {
        return this.onShelve;
    }

    public void setPostage(Long postage) {
        this.postage = postage;
    }

    public Long getPostage() {
        return this.postage;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setShortMemo(String shortMemo) {
        this.shortMemo = shortMemo;
    }

    public String getShortMemo() {
        return this.shortMemo;
    }

    public void setSkuImages(String skuImages) {
        this.skuImages = skuImages;
    }

    public String getSkuImages() {
        return this.skuImages;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTags() {
        return this.tags;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (category != null) {
            params.put("category", category);
        }
        if (costPrice != null) {
            params.put("cost_price", costPrice);
        }
        if (goodsId != null) {
            params.put("goods_id", goodsId);
        }
        if (goodsNo != null) {
            params.put("goods_no", goodsNo);
        }
        if (goodsPictures != null) {
            params.put("goods_pictures", goodsPictures);
        }
        if (goodsSkus != null) {
            params.put("goods_skus", goodsSkus);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (memo != null) {
            params.put("memo", memo);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (onShelve != null) {
            params.put("on_shelve", onShelve);
        }
        if (postage != null) {
            params.put("postage", postage);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (shortMemo != null) {
            params.put("short_memo", shortMemo);
        }
        if (skuImages != null) {
            params.put("sku_images", skuImages);
        }
        if (tags != null) {
            params.put("tags", tags);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }

    public static class MeiGoodsSkuInfo {
            private Long dictId;
            private String text;
    
            public void setDictId(Long dictId) {
            this.dictId = dictId;
        }

        public Long getDictId() {
            return this.dictId;
        }
            public void setText(String text) {
            this.text = text;
        }

        public String getText() {
            return this.text;
        }
        }

}