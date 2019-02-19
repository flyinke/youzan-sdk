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

public class YouzanMeiGoodsServingCreateParams implements APIParams, FileParams  {

    /**
     * 分组ID
     */
    private Long category;
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
     * 是否需要线上支付
     */
    private Long needPay;
    /**
     * 是否上架 1 是 0 否
     */
    private Long onShelve;
    /**
     * 价格，有规格时不需要传这个参数
     */
    private Long price;
    /**
     * 服务时长
     */
    private Long serviceDuration;
    /**
     * 服务简介 支持富文本
     */
    private String shortMemo;
    /**
     * 商品Sku图片信息列表，当规格需要设置图片时 需要传此参数
     */
    private String skuImages;
    /**
     * 服务标签ID列表
     */
    private String tags;

    public void setCategory(Long category) {
        this.category = category;
    }

    public Long getCategory() {
        return this.category;
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

    public void setNeedPay(Long needPay) {
        this.needPay = needPay;
    }

    public Long getNeedPay() {
        return this.needPay;
    }

    public void setOnShelve(Long onShelve) {
        this.onShelve = onShelve;
    }

    public Long getOnShelve() {
        return this.onShelve;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setServiceDuration(Long serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    public Long getServiceDuration() {
        return this.serviceDuration;
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
        if (goodsNo != null) {
            params.put("goods_no", goodsNo);
        }
        if (goodsPictures != null) {
            params.put("goods_pictures", goodsPictures);
        }
        if (goodsSkus != null) {
            params.put("goods_skus", goodsSkus);
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
        if (needPay != null) {
            params.put("need_pay", needPay);
        }
        if (onShelve != null) {
            params.put("on_shelve", onShelve);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (serviceDuration != null) {
            params.put("service_duration", serviceDuration);
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