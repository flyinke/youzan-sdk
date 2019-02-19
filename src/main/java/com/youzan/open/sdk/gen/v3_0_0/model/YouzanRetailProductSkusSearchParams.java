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

public class YouzanRetailProductSkusSearchParams implements APIParams, FileParams  {

    /**
     * 返回属性（1, "商品基础信息"，3, "库存"）
     */
    private String attributes;
    /**
     * 批量筛选子类目id
     */
    private String categoryIds;
    /**
     * 类目筛选的时候是否包括子类目
     */
    private Boolean childCategory;
    /**
     * 库存低值预警
     */
    private Boolean isLowWarning;
    /**
     * 商品名称或商品编码
     */
    private String nameOrSkuNo;
    /**
     * 查询页面
     */
    private Long pageNo;
    /**
     * 一页数量（最大为50）
     */
    private Long pageSize;
    /**
     * 销售渠道过滤
     */
    private Long sellingChannel;
    /**
     * 排序字段
     */
    private String sortName;
    /**
     * 排序顺序  1 升序 2 降序
     */
    private Long sortType;
    /**
     * 来源
     */
    private String source;
    /**
     * 仓库id(目前仅支持查询单仓)
     */
    private String warehouseIds;

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getAttributes() {
        return this.attributes;
    }

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public void setChildCategory(Boolean childCategory) {
        this.childCategory = childCategory;
    }

    public Boolean getChildCategory() {
        return this.childCategory;
    }

    public void setIsLowWarning(Boolean isLowWarning) {
        this.isLowWarning = isLowWarning;
    }

    public Boolean getIsLowWarning() {
        return this.isLowWarning;
    }

    public void setNameOrSkuNo(String nameOrSkuNo) {
        this.nameOrSkuNo = nameOrSkuNo;
    }

    public String getNameOrSkuNo() {
        return this.nameOrSkuNo;
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

    public void setSellingChannel(Long sellingChannel) {
        this.sellingChannel = sellingChannel;
    }

    public Long getSellingChannel() {
        return this.sellingChannel;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortName() {
        return this.sortName;
    }

    public void setSortType(Long sortType) {
        this.sortType = sortType;
    }

    public Long getSortType() {
        return this.sortType;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setWarehouseIds(String warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    public String getWarehouseIds() {
        return this.warehouseIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (attributes != null) {
            params.put("attributes", attributes);
        }
        if (categoryIds != null) {
            params.put("category_ids", categoryIds);
        }
        if (childCategory != null) {
            params.put("child_category", childCategory);
        }
        if (isLowWarning != null) {
            params.put("is_low_warning", isLowWarning);
        }
        if (nameOrSkuNo != null) {
            params.put("name_or_sku_no", nameOrSkuNo);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (sellingChannel != null) {
            params.put("selling_channel", sellingChannel);
        }
        if (sortName != null) {
            params.put("sort_name", sortName);
        }
        if (sortType != null) {
            params.put("sort_type", sortType);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (warehouseIds != null) {
            params.put("warehouse_ids", warehouseIds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}