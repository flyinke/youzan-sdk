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

public class YouzanRetailStockBizorderSearchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private Paginator paginator;
    @JsonProperty(value = "items")
    /**
     * 实体信息
     */
    private StockBizOrderSearchVO[] items;

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }
    public void setItems(StockBizOrderSearchVO[] items) {
        this.items = items;
    }

    public StockBizOrderSearchVO[] getItems() {
        return this.items;
    }

    public static class StockBizOrderSearchVO {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
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
            @JsonProperty(value = "admin_id")
        /**
        * 操作者id
        */
        private Long adminId;
            @JsonProperty(value = "operator_name")
        /**
        * 操作员工名称
        */
        private String operatorName;
            @JsonProperty(value = "status")
        /**
        * 状态
        */
        private Long status;
            @JsonProperty(value = "order_biz_type")
        /**
        * 单据业务类型
        */
        private Long orderBizType;
            @JsonProperty(value = "business_time")
        /**
        * 业务时间
        */
        private Date businessTime;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "vendor_id")
        /**
        * 供应商ID
        */
        private Long vendorId;
            @JsonProperty(value = "vendor_name")
        /**
        * 供应商名称
        */
        private String vendorName;
            @JsonProperty(value = "change_total_cost")
        /**
        * 变更总金额
        */
        private Long changeTotalCost;
            @JsonProperty(value = "created_at")
        /**
        * 创建时间
        */
        private Date createdAt;
            @JsonProperty(value = "updated_at")
        /**
        * 更新时间
        */
        private Date updatedAt;
            @JsonProperty(value = "warehouse_name")
        /**
        * 仓库名称
        */
        private String warehouseName;
            @JsonProperty(value = "source_order_no")
        /**
        * 来源单据单号
        */
        private String sourceOrderNo;
    
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

            public void setAdminId(Long adminId) {
            this.adminId = adminId;
        }

        public Long getAdminId() {
            return this.adminId;
        }

            public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getOperatorName() {
            return this.operatorName;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setOrderBizType(Long orderBizType) {
            this.orderBizType = orderBizType;
        }

        public Long getOrderBizType() {
            return this.orderBizType;
        }

            public void setBusinessTime(Date businessTime) {
            this.businessTime = businessTime;
        }

        public Date getBusinessTime() {
            return this.businessTime;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setVendorId(Long vendorId) {
            this.vendorId = vendorId;
        }

        public Long getVendorId() {
            return this.vendorId;
        }

            public void setVendorName(String vendorName) {
            this.vendorName = vendorName;
        }

        public String getVendorName() {
            return this.vendorName;
        }

            public void setChangeTotalCost(Long changeTotalCost) {
            this.changeTotalCost = changeTotalCost;
        }

        public Long getChangeTotalCost() {
            return this.changeTotalCost;
        }

            public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }

        public Date getCreatedAt() {
            return this.createdAt;
        }

            public void setUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Date getUpdatedAt() {
            return this.updatedAt;
        }

            public void setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
        }

        public String getWarehouseName() {
            return this.warehouseName;
        }

            public void setSourceOrderNo(String sourceOrderNo) {
            this.sourceOrderNo = sourceOrderNo;
        }

        public String getSourceOrderNo() {
            return this.sourceOrderNo;
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