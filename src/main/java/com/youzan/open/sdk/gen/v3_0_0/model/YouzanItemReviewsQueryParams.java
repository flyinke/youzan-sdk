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

public class YouzanItemReviewsQueryParams implements APIParams, FileParams  {

    /**
     * alias，短url，唯一字符串
     */
    private String alias;
    /**
     * 是否获取头像的信息，（注：1是；0否）,必填项
     */
    private Long avatar;
    /**
     * 买家id
     */
    private Long buyerId;
    /**
     * 粉丝id
     */
    private Long fansId;
    /**
     * 粉丝类型
     */
    private Long fansType;
    /**
     * 商品id
     */
    private Long itemId;
    /**
     * 最新的评价id
     */
    private Long lastReviewId;
    /**
     * 页数
     */
    private Long page;
    /**
     * 每页大小
     */
    private Long pageSize;
    /**
     * 图片
     */
    private String picture;
    /**
     * 评价的数值
     */
    private Long rate;
    /**
     * 评价内容
     */
    private String review;
    /**
     * 供货商采购订单编号
     */
    private String sellerTid;
    /**
     * skuId
     */
    private Long skuId;
    /**
     * 供应商的店铺goodsId，必填，如果是分销商品，则supplierGoodsId为供应商的goodsId，如是普通商品则supplierGoodsId为当前的goodsId
     */
    private Long supplierItemId;
    /**
     * 供应商的店铺kdtId，必填，如果是分销商品，则supplierKdtId为供应商的kdtId，如是普通商品则supplierKdtId为自己店铺kdtId
     */
    private Long supplierKdtId;
    /**
     * 供应商skuId
     */
    private Long supplierSkuId;
    /**
     * 订单号
     */
    private String tid;

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAvatar(Long avatar) {
        this.avatar = avatar;
    }

    public Long getAvatar() {
        return this.avatar;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }

    public void setFansId(Long fansId) {
        this.fansId = fansId;
    }

    public Long getFansId() {
        return this.fansId;
    }

    public void setFansType(Long fansType) {
        this.fansType = fansType;
    }

    public Long getFansType() {
        return this.fansType;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setLastReviewId(Long lastReviewId) {
        this.lastReviewId = lastReviewId;
    }

    public Long getLastReviewId() {
        return this.lastReviewId;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPage() {
        return this.page;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public Long getRate() {
        return this.rate;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getReview() {
        return this.review;
    }

    public void setSellerTid(String sellerTid) {
        this.sellerTid = sellerTid;
    }

    public String getSellerTid() {
        return this.sellerTid;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSupplierItemId(Long supplierItemId) {
        this.supplierItemId = supplierItemId;
    }

    public Long getSupplierItemId() {
        return this.supplierItemId;
    }

    public void setSupplierKdtId(Long supplierKdtId) {
        this.supplierKdtId = supplierKdtId;
    }

    public Long getSupplierKdtId() {
        return this.supplierKdtId;
    }

    public void setSupplierSkuId(Long supplierSkuId) {
        this.supplierSkuId = supplierSkuId;
    }

    public Long getSupplierSkuId() {
        return this.supplierSkuId;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (alias != null) {
            params.put("alias", alias);
        }
        if (avatar != null) {
            params.put("avatar", avatar);
        }
        if (buyerId != null) {
            params.put("buyer_id", buyerId);
        }
        if (fansId != null) {
            params.put("fans_id", fansId);
        }
        if (fansType != null) {
            params.put("fans_type", fansType);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (lastReviewId != null) {
            params.put("last_review_id", lastReviewId);
        }
        if (page != null) {
            params.put("page", page);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (picture != null) {
            params.put("picture", picture);
        }
        if (rate != null) {
            params.put("rate", rate);
        }
        if (review != null) {
            params.put("review", review);
        }
        if (sellerTid != null) {
            params.put("seller_tid", sellerTid);
        }
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        if (supplierItemId != null) {
            params.put("supplier_item_id", supplierItemId);
        }
        if (supplierKdtId != null) {
            params.put("supplier_kdt_id", supplierKdtId);
        }
        if (supplierSkuId != null) {
            params.put("supplier_sku_id", supplierSkuId);
        }
        if (tid != null) {
            params.put("tid", tid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}