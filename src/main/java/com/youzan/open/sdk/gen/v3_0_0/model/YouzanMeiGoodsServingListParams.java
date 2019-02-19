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

public class YouzanMeiGoodsServingListParams implements APIParams, FileParams  {

    /**
     * 分类Id
     */
    private Long categoryId;
    /**
     * 是否包含分类信息
     */
    private Long containCategoryInfo;
    /**
     * 是否包含规格信息
     */
    private Long containSkuInfo;
    /**
     * 是否售罄
     */
    private Long containSoldOut;
    /**
     * 是否包含规格项信息
     */
    private Long containSpecTree;
    /**
     * 是否包含库存
     */
    private Long containStock;
    /**
     * 是否包含分类信息
     */
    private Long containTagInfo;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 是否需要支付  0 不需要 1 需要
     */
    private Long needPay;
    /**
     * 页码
     */
    private Long pageNo;
    /**
     * 每页数目
     */
    private Long pageSize;
    /**
     * 上下架 1, "上架" 2, "下架"
     */
    private Long status;
    /**
     * 标签id
     */
    private Long tagId;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setContainCategoryInfo(Long containCategoryInfo) {
        this.containCategoryInfo = containCategoryInfo;
    }

    public Long getContainCategoryInfo() {
        return this.containCategoryInfo;
    }

    public void setContainSkuInfo(Long containSkuInfo) {
        this.containSkuInfo = containSkuInfo;
    }

    public Long getContainSkuInfo() {
        return this.containSkuInfo;
    }

    public void setContainSoldOut(Long containSoldOut) {
        this.containSoldOut = containSoldOut;
    }

    public Long getContainSoldOut() {
        return this.containSoldOut;
    }

    public void setContainSpecTree(Long containSpecTree) {
        this.containSpecTree = containSpecTree;
    }

    public Long getContainSpecTree() {
        return this.containSpecTree;
    }

    public void setContainStock(Long containStock) {
        this.containStock = containStock;
    }

    public Long getContainStock() {
        return this.containStock;
    }

    public void setContainTagInfo(Long containTagInfo) {
        this.containTagInfo = containTagInfo;
    }

    public Long getContainTagInfo() {
        return this.containTagInfo;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsName() {
        return this.goodsName;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setNeedPay(Long needPay) {
        this.needPay = needPay;
    }

    public Long getNeedPay() {
        return this.needPay;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getTagId() {
        return this.tagId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (categoryId != null) {
            params.put("category_id", categoryId);
        }
        if (containCategoryInfo != null) {
            params.put("contain_category_info", containCategoryInfo);
        }
        if (containSkuInfo != null) {
            params.put("contain_sku_info", containSkuInfo);
        }
        if (containSoldOut != null) {
            params.put("contain_sold_out", containSoldOut);
        }
        if (containSpecTree != null) {
            params.put("contain_spec_tree", containSpecTree);
        }
        if (containStock != null) {
            params.put("contain_stock", containStock);
        }
        if (containTagInfo != null) {
            params.put("contain_tag_info", containTagInfo);
        }
        if (goodsName != null) {
            params.put("goods_name", goodsName);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (needPay != null) {
            params.put("need_pay", needPay);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (status != null) {
            params.put("status", status);
        }
        if (tagId != null) {
            params.put("tag_id", tagId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}