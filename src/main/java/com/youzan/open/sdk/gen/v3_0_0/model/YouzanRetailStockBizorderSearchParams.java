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

public class YouzanRetailStockBizorderSearchParams implements APIParams, FileParams  {

    /**
     * 业务操作人id
     */
    private Long bizOperatorId;
    /**
     * 盘点单状态（CHECKING(1, "盘点中"), DONE(2, "已完成"), CANCEL(3, "已作废")）
     */
    private String checkOrderStatus;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 业务单据单号
     */
    private String orderNo;
    /**
     * 单据类型  1, "库存盘点单" 2, "采购入库单"  3, "退货入库单"  4, "出库单"  5,"成本改价"  与order_types必须有一个

     */
    private Long orderType;
    /**
     * 单据类型集合（入库聚合）
     */
    private String orderTypes;
    /**
     * 查询页面
     */
    private Long pageNo;
    /**
     * 一页数量
     */
    private Long pageSize;
    /**
     * 备注
     */
    private String remark;
    /**
     * sku名称
     */
    private String skuName;
    /**
     * sku条码
     */
    private String skuNo;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;
    /**
     * 源单号
     */
    private String sourceOrderNo;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 入库单据详细类型  21:采购入库  22:调拨入库   31 退货入库
     */
    private Long stockInType;
    /**
     * 出库单详细类型  41:网店出库  42:门店出库   43:其它出库-报损  44:其它出库-领用  49：其它出库-其他
     */
    private String stockOutTypes;
    /**
     * 供货商id
     */
    private Long vendorId;
    /**
     * 门店或独立仓id   连锁版使用此字段,若不传,会默认查下面所有仓库的单据
     */
    private String warehouseIds;

    public void setBizOperatorId(Long bizOperatorId) {
        this.bizOperatorId = bizOperatorId;
    }

    public Long getBizOperatorId() {
        return this.bizOperatorId;
    }

    public void setCheckOrderStatus(String checkOrderStatus) {
        this.checkOrderStatus = checkOrderStatus;
    }

    public String getCheckOrderStatus() {
        return this.checkOrderStatus;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setOrderTypes(String orderTypes) {
        this.orderTypes = orderTypes;
    }

    public String getOrderTypes() {
        return this.orderTypes;
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

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
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

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setSourceOrderNo(String sourceOrderNo) {
        this.sourceOrderNo = sourceOrderNo;
    }

    public String getSourceOrderNo() {
        return this.sourceOrderNo;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStockInType(Long stockInType) {
        this.stockInType = stockInType;
    }

    public Long getStockInType() {
        return this.stockInType;
    }

    public void setStockOutTypes(String stockOutTypes) {
        this.stockOutTypes = stockOutTypes;
    }

    public String getStockOutTypes() {
        return this.stockOutTypes;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public void setWarehouseIds(String warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    public String getWarehouseIds() {
        return this.warehouseIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (bizOperatorId != null) {
            params.put("biz_operator_id", bizOperatorId);
        }
        if (checkOrderStatus != null) {
            params.put("check_order_status", checkOrderStatus);
        }
        if (endTime != null) {
            params.put("end_time", endTime);
        }
        if (orderNo != null) {
            params.put("order_no", orderNo);
        }
        if (orderType != null) {
            params.put("order_type", orderType);
        }
        if (orderTypes != null) {
            params.put("order_types", orderTypes);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (skuName != null) {
            params.put("sku_name", skuName);
        }
        if (skuNo != null) {
            params.put("sku_no", skuNo);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (sourceOrderNo != null) {
            params.put("source_order_no", sourceOrderNo);
        }
        if (startTime != null) {
            params.put("start_time", startTime);
        }
        if (stockInType != null) {
            params.put("stock_in_type", stockInType);
        }
        if (stockOutTypes != null) {
            params.put("stock_out_types", stockOutTypes);
        }
        if (vendorId != null) {
            params.put("vendor_id", vendorId);
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