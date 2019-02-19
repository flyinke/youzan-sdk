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

public class YouzanRetailStockStockallotSearchParams implements APIParams, FileParams  {

    /**
     * 单据操作人
     */
    private Long bizOperatorId;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 出库店铺
     */
    private Long fromKdtId;
    /**
     * 单据名称或编码
     */
    private String nameOrNo;
    /**
     * 单据编号
     */
    private String orderNo;
    /**
     * 单据状态
     */
    private Long orderStatus;
    /**
     * 单据类型
     */
    private Long orderType;
    /**
     * 分页号
     */
    private Long pageNo;
    /**
     * 分页大小
     */
    private Long pageSize;
    /**
     * 系统来源
     */
    private String retailSource;
    /**
     * 是否显示明细
     */
    private Boolean showItem;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 商品编码
     */
    private String skuNo;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 入库店铺
     */
    private Long toKdtId;

    public void setBizOperatorId(Long bizOperatorId) {
        this.bizOperatorId = bizOperatorId;
    }

    public Long getBizOperatorId() {
        return this.bizOperatorId;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setFromKdtId(Long fromKdtId) {
        this.fromKdtId = fromKdtId;
    }

    public Long getFromKdtId() {
        return this.fromKdtId;
    }

    public void setNameOrNo(String nameOrNo) {
        this.nameOrNo = nameOrNo;
    }

    public String getNameOrNo() {
        return this.nameOrNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Long getOrderType() {
        return this.orderType;
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

    public void setShowItem(Boolean showItem) {
        this.showItem = showItem;
    }

    public Boolean getShowItem() {
        return this.showItem;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuName() {
        return this.skuName;
    }

    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    public String getSkuNo() {
        return this.skuNo;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setToKdtId(Long toKdtId) {
        this.toKdtId = toKdtId;
    }

    public Long getToKdtId() {
        return this.toKdtId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (bizOperatorId != null) {
            params.put("biz_operator_id", bizOperatorId);
        }
        if (endTime != null) {
            params.put("end_time", endTime);
        }
        if (fromKdtId != null) {
            params.put("from_kdt_id", fromKdtId);
        }
        if (nameOrNo != null) {
            params.put("name_or_no", nameOrNo);
        }
        if (orderNo != null) {
            params.put("order_no", orderNo);
        }
        if (orderStatus != null) {
            params.put("order_status", orderStatus);
        }
        if (orderType != null) {
            params.put("order_type", orderType);
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
        if (showItem != null) {
            params.put("show_item", showItem);
        }
        if (skuName != null) {
            params.put("sku_name", skuName);
        }
        if (skuNo != null) {
            params.put("sku_no", skuNo);
        }
        if (startTime != null) {
            params.put("start_time", startTime);
        }
        if (toKdtId != null) {
            params.put("to_kdt_id", toKdtId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}