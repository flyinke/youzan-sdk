package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.api.FileParams;
import com.youzan.open.sdk.api.APIResult;
import com.youzan.open.sdk.model.ByteWrapper;
import java.util.List;
import java.util.Map;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class YouzanRetailStocksStockoutSearchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private Paginator paginator;
    @JsonProperty(value = "items")
    /**
     * 出库单详情
     */
    private StockOutOrderVO[] items;

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }
    public void setItems(StockOutOrderVO[] items) {
        this.items = items;
    }

    public StockOutOrderVO[] getItems() {
        return this.items;
    }

    public static class StockOutOrderItemVO {
            @JsonProperty(value = "product_name")
        /**
        * 商品名称
        */
        private String productName;
            @JsonProperty(value = "specifications")
        /**
        * 规格描述
        */
        private String specifications;
            @JsonProperty(value = "sku_no")
        /**
        * 条码
        */
        private String skuNo;
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
            @JsonProperty(value = "amount")
        /**
        * 数量（千倍）
        */
        private Long amount;
            @JsonProperty(value = "kdt_id")
        /**
        * 商家id
        */
        private Long kdtId;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 业务单据单号
        */
        private String bizBillNo;
            @JsonProperty(value = "type")
        /**
        * 业务类型
        */
        private Long type;
            @JsonProperty(value = "skuId")
        /**
        * skuId
        */
        private Long skuId;
            @JsonProperty(value = "admin_id")
        /**
        * 操作者id
        */
        private Long adminId;
            @JsonProperty(value = "total_cost")
        /**
        * 成本价小计
        */
        private Long totalCost;
            @JsonProperty(value = "total_sell")
        /**
        * 销售小计
        */
        private Long totalSell;
            @JsonProperty(value = "unit_cost")
        /**
        * 成本单价
        */
        private Long unitCost;
            @JsonProperty(value = "unit_sell")
        /**
        * 销售单价
        */
        private Long unitSell;
    
            public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductName() {
            return this.productName;
        }

            public void setSpecifications(String specifications) {
            this.specifications = specifications;
        }

        public String getSpecifications() {
            return this.specifications;
        }

            public void setSkuNo(String skuNo) {
            this.skuNo = skuNo;
        }

        public String getSkuNo() {
            return this.skuNo;
        }

            public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getUnit() {
            return this.unit;
        }

            public void setAmount(Long amount) {
            this.amount = amount;
        }

        public Long getAmount() {
            return this.amount;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setBizBillNo(String bizBillNo) {
            this.bizBillNo = bizBillNo;
        }

        public String getBizBillNo() {
            return this.bizBillNo;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setAdminId(Long adminId) {
            this.adminId = adminId;
        }

        public Long getAdminId() {
            return this.adminId;
        }

            public void setTotalCost(Long totalCost) {
            this.totalCost = totalCost;
        }

        public Long getTotalCost() {
            return this.totalCost;
        }

            public void setTotalSell(Long totalSell) {
            this.totalSell = totalSell;
        }

        public Long getTotalSell() {
            return this.totalSell;
        }

            public void setUnitCost(Long unitCost) {
            this.unitCost = unitCost;
        }

        public Long getUnitCost() {
            return this.unitCost;
        }

            public void setUnitSell(Long unitSell) {
            this.unitSell = unitSell;
        }

        public Long getUnitSell() {
            return this.unitSell;
        }

        }

    public static class StockOutOrderVO {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "business_time")
        /**
        * 业务时间
        */
        private Date businessTime;
            @JsonProperty(value = "type")
        /**
        * 业务类型（STOCK_CHECK(1, "库存盘点单"),
  STOCK_IN(2, "采购入库单"),
  STOCK_RETURN(3, "退货入库单"),
  STOCK_OUT(4, "出库单")）
        */
        private Long type;
            @JsonProperty(value = "admin_id")
        /**
        * 操作者id
        */
        private Long adminId;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 业务单据单号
        */
        private String bizBillNo;
            @JsonProperty(value = "idempotent_no")
        /**
        * 幂等单号（请求唯一标识）
        */
        private String idempotentNo;
            @JsonProperty(value = "source_order_no")
        /**
        * 用于存储退货入库单关联的订单号（其他单据为业务单号）
        */
        private String sourceOrderNo;
            @JsonProperty(value = "order_biz_type")
        /**
        * 单据业务类型（  SELL_ONLINE_OUT(41, "网店销售出库"),
  SELL_OFFLINE_OUT(42, "门店销售出库"),）
        */
        private Long orderBizType;
            @JsonProperty(value = "create_name")
        /**
        * 创建人
        */
        private String createName;
            @JsonProperty(value = "operator_name")
        /**
        * 操作人
        */
        private String operatorName;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "relation_order_no")
        /**
        * 关联订单号
        */
        private String relationOrderNo;
            @JsonProperty(value = "stock_out_order_items")
        /**
        * 出库单详情
        */
        private StockOutOrderItemVO[] stockOutOrderItems;
            @JsonProperty(value = "warehouse_name")
        /**
        * 仓库名称
        */
        private String warehouseName;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setBusinessTime(Date businessTime) {
            this.businessTime = businessTime;
        }

        public Date getBusinessTime() {
            return this.businessTime;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setAdminId(Long adminId) {
            this.adminId = adminId;
        }

        public Long getAdminId() {
            return this.adminId;
        }

            public void setBizBillNo(String bizBillNo) {
            this.bizBillNo = bizBillNo;
        }

        public String getBizBillNo() {
            return this.bizBillNo;
        }

            public void setIdempotentNo(String idempotentNo) {
            this.idempotentNo = idempotentNo;
        }

        public String getIdempotentNo() {
            return this.idempotentNo;
        }

            public void setSourceOrderNo(String sourceOrderNo) {
            this.sourceOrderNo = sourceOrderNo;
        }

        public String getSourceOrderNo() {
            return this.sourceOrderNo;
        }

            public void setOrderBizType(Long orderBizType) {
            this.orderBizType = orderBizType;
        }

        public Long getOrderBizType() {
            return this.orderBizType;
        }

            public void setCreateName(String createName) {
            this.createName = createName;
        }

        public String getCreateName() {
            return this.createName;
        }

            public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getOperatorName() {
            return this.operatorName;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setRelationOrderNo(String relationOrderNo) {
            this.relationOrderNo = relationOrderNo;
        }

        public String getRelationOrderNo() {
            return this.relationOrderNo;
        }

            public void setStockOutOrderItems(StockOutOrderItemVO[] stockOutOrderItems) {
            this.stockOutOrderItems = stockOutOrderItems;
        }

        public StockOutOrderItemVO[] getStockOutOrderItems() {
            return this.stockOutOrderItems;
        }

            public void setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
        }

        public String getWarehouseName() {
            return this.warehouseName;
        }

        }

    public static class Paginator {
            @JsonProperty(value = "page")
        /**
        * 当前页码
        */
        private Long page;
            @JsonProperty(value = "pageSize")
        /**
        * 每页数量
        */
        private Long pageSize;
            @JsonProperty(value = "totalCount")
        /**
        * 总数
        */
        private Long totalCount;
    
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

            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
        }

        }


}