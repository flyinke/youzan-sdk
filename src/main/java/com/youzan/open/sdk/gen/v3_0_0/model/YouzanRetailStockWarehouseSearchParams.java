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

public class YouzanRetailStockWarehouseSearchParams implements APIParams, FileParams  {

    /**
     * 分页时的页码
     */
    private Long pageNo;
    /**
     * 一页展示的数量
     */
    private Long pageSize;
    /**
     * 查询可以设置期初库存的仓库列表，该参数为true时，分页参数不生效
     */
    private Boolean queryCanInit;
    /**
     * 是否为门店场景要查询总部仓库信息，query_can_init,warehouse_ids时该参数不生效
     */
    private Boolean queryGroup;
    /**
     * 查询类型，
1:只查询基础信息（不包含仓库名称，地址）单次插询数量无限制
2:查询仓库名称地址信息。单次查询最大100.
3.查询包含仓库名称地址及物流供货相关信息，单次数量最大20
     */
    private Long queryType;
    /**
     * 来源
     */
    private String retailSource;
    /**
     * 仓库状态 0:启用 1:停用
     */
    private Long status;
    /**
     * 仓库类型 1:独立仓  2:门店仓
     */
    private Long type;
    /**
     * 仓库ID列表，传递该参数时，分页参数不生效
     */
    private String warehouseIds;

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

    public void setQueryCanInit(Boolean queryCanInit) {
        this.queryCanInit = queryCanInit;
    }

    public Boolean getQueryCanInit() {
        return this.queryCanInit;
    }

    public void setQueryGroup(Boolean queryGroup) {
        this.queryGroup = queryGroup;
    }

    public Boolean getQueryGroup() {
        return this.queryGroup;
    }

    public void setQueryType(Long queryType) {
        this.queryType = queryType;
    }

    public Long getQueryType() {
        return this.queryType;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public void setWarehouseIds(String warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    public String getWarehouseIds() {
        return this.warehouseIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (queryCanInit != null) {
            params.put("query_can_init", queryCanInit);
        }
        if (queryGroup != null) {
            params.put("query_group", queryGroup);
        }
        if (queryType != null) {
            params.put("query_type", queryType);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (status != null) {
            params.put("status", status);
        }
        if (type != null) {
            params.put("type", type);
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