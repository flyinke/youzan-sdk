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

public class YouzanRetailProductSpusSearchParams implements APIParams, FileParams  {

    /**
     * 返回属性
1:商品基本信息
     */
    private String attributes;
    /**
     * 批量筛选子类目id
     */
    private String categoryIds;
    /**
     * 类目筛选的时候是否包括子类目 默认 true
     */
    private Boolean childCategory;
    /**
     * 搜索编码
     */
    private String code;
    /**
     * 首选供应商id
     */
    private Long defaultVendorId;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 名称或编码
     */
    private String nameOrCode;
    /**
     * 页码
     */
    private Long pageNo;
    /**
     * 页大小(最大50个)
     */
    private Long pageSize;
    /**
     * 请求来源
     */
    private String retailSource;
    /**
     * 销售渠道过滤  [] 未设置  [2] 门店 [4] 网店 [2,4]门店+网店 传null则表示全部
     */
    private String sellChannels;
    /**
     * 排序字段
     */
    private String sortName;
    /**
     * 1 升序 2 降序
     */
    private Long sortType;
    /**
     * 商品库ID列表(最大50个)
     */
    private String spuIds;

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

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setDefaultVendorId(Long defaultVendorId) {
        this.defaultVendorId = defaultVendorId;
    }

    public Long getDefaultVendorId() {
        return this.defaultVendorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNameOrCode(String nameOrCode) {
        this.nameOrCode = nameOrCode;
    }

    public String getNameOrCode() {
        return this.nameOrCode;
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

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setSellChannels(String sellChannels) {
        this.sellChannels = sellChannels;
    }

    public String getSellChannels() {
        return this.sellChannels;
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

    public void setSpuIds(String spuIds) {
        this.spuIds = spuIds;
    }

    public String getSpuIds() {
        return this.spuIds;
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
        if (code != null) {
            params.put("code", code);
        }
        if (defaultVendorId != null) {
            params.put("default_vendor_id", defaultVendorId);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (nameOrCode != null) {
            params.put("name_or_code", nameOrCode);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (sellChannels != null) {
            params.put("sell_channels", sellChannels);
        }
        if (sortName != null) {
            params.put("sort_name", sortName);
        }
        if (sortType != null) {
            params.put("sort_type", sortType);
        }
        if (spuIds != null) {
            params.put("spu_ids", spuIds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}