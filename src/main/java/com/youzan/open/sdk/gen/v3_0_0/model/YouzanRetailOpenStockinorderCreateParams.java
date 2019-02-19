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

public class YouzanRetailOpenStockinorderCreateParams implements APIParams, FileParams  {

    /**
     * 单据编号
     */
    private String bizBillNo;
    /**
     * 单据创建日期(YYYY-MM-DD HH:MM:SS)
     */
    private String createTime;
    /**
     * 制单人
     */
    private String creator;
    /**
     * 入库商品明细
     */
    private String orderItems;
    /**
     * 出库单类型(BYRK=报溢入库;PYRK=盘盈入库;
CGRK=采购入库; THRK=退货入库;DBRK=调拨入库;)
     */
    private String orderType;
    /**
     * 备注
     */
    private String remark;
    /**
     * 零售调用来源（调用方和有赞约定的值）
     */
    private String retailSource;
    /**
     * 关联单据号，如交易出库关联的订单号	
     */
    private String sourceOrderNo;
    /**
     * 仓库编码
     */
    private String warehouseCode;

    public void setBizBillNo(String bizBillNo) {
        this.bizBillNo = bizBillNo;
    }

    public String getBizBillNo() {
        return this.bizBillNo;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setOrderItems(String orderItems) {
        this.orderItems = orderItems;
    }

    public String getOrderItems() {
        return this.orderItems;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setSourceOrderNo(String sourceOrderNo) {
        this.sourceOrderNo = sourceOrderNo;
    }

    public String getSourceOrderNo() {
        return this.sourceOrderNo;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseCode() {
        return this.warehouseCode;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (bizBillNo != null) {
            params.put("biz_bill_no", bizBillNo);
        }
        if (createTime != null) {
            params.put("create_time", createTime);
        }
        if (creator != null) {
            params.put("creator", creator);
        }
        if (orderItems != null) {
            params.put("order_items", orderItems);
        }
        if (orderType != null) {
            params.put("order_type", orderType);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (sourceOrderNo != null) {
            params.put("source_order_no", sourceOrderNo);
        }
        if (warehouseCode != null) {
            params.put("warehouse_code", warehouseCode);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}