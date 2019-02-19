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

public class YouzanRetailOpenDeliveryorderConfirmParams implements APIParams, FileParams  {

    /**
     * 销售发货单号
     */
    private String deliveryOrderNo;
    /**
     * 运单号
     */
    private String expressCode;
    /**
     * 物流公司编号，可以通过请求 youzan.logistics.express.get 该接口获得
     */
    private String logisticsId;
    /**
     * 操作人
     */
    private String operatorName;
    /**
     * 发货的商品明细ID
如果需要拆单发货，使用该字段指定要发货的商品明细ID，不需要拆单发货，则该字段不传或值为空。
     */
    private String orderItemNos;
    /**
     * 零售调用来源(调用方和有赞约定的值)
     */
    private String retailSource;
    /**
     * 仓库编码
     */
    private String warehouseCode;

    public void setDeliveryOrderNo(String deliveryOrderNo) {
        this.deliveryOrderNo = deliveryOrderNo;
    }

    public String getDeliveryOrderNo() {
        return this.deliveryOrderNo;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getExpressCode() {
        return this.expressCode;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getLogisticsId() {
        return this.logisticsId;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorName() {
        return this.operatorName;
    }

    public void setOrderItemNos(String orderItemNos) {
        this.orderItemNos = orderItemNos;
    }

    public String getOrderItemNos() {
        return this.orderItemNos;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseCode() {
        return this.warehouseCode;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (deliveryOrderNo != null) {
            params.put("delivery_order_no", deliveryOrderNo);
        }
        if (expressCode != null) {
            params.put("express_code", expressCode);
        }
        if (logisticsId != null) {
            params.put("logistics_id", logisticsId);
        }
        if (operatorName != null) {
            params.put("operator_name", operatorName);
        }
        if (orderItemNos != null) {
            params.put("order_item_nos", orderItemNos);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
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