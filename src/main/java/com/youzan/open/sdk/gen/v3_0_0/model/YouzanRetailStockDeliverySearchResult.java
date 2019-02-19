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

public class YouzanRetailStockDeliverySearchResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 配送单据列表分页信息
     */
    private DeliveryPaginatorSearchVO response;

    public void setResponse(DeliveryPaginatorSearchVO response) {
        this.response = response;
    }

    public DeliveryPaginatorSearchVO getResponse() {
        return this.response;
    }

    public static class InterBusinessOrderItemOfProdVO {
            @JsonProperty(value = "kdt_id")
        /**
        * 总部kdtId
        */
        private Long kdtId;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 单据号
        */
        private String bizBillNo;
            @JsonProperty(value = "type")
        /**
        * 单据类型   1:调拨单   2:要货申请单   3:配送单
        */
        private Long type;
            @JsonProperty(value = "sku_id")
        /**
        * 商品skuId
        */
        private Long skuId;
            @JsonProperty(value = "apply_num")
        /**
        * 申请数量
        */
        private Long applyNum;
            @JsonProperty(value = "actual_out_num")
        /**
        * 实际出库数量
        */
        private Long actualOutNum;
            @JsonProperty(value = "actual_in_num")
        /**
        * 实际入库数量
        */
        private Long actualInNum;
            @JsonProperty(value = "unit_price")
        /**
        * 成本单价
        */
        private Long unitPrice;
            @JsonProperty(value = "total_price")
        /**
        * 成本总计
        */
        private Long totalPrice;
            @JsonProperty(value = "product_name")
        /**
        * 商品名称
        */
        private String productName;
            @JsonProperty(value = "product_picture")
        /**
        * 商品图片
        */
        private String productPicture;
            @JsonProperty(value = "specifications")
        /**
        * 规格描述
        */
        private String specifications;
            @JsonProperty(value = "sku_no")
        /**
        * 商品条码
        */
        private String skuNo;
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
    
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

            public void setApplyNum(Long applyNum) {
            this.applyNum = applyNum;
        }

        public Long getApplyNum() {
            return this.applyNum;
        }

            public void setActualOutNum(Long actualOutNum) {
            this.actualOutNum = actualOutNum;
        }

        public Long getActualOutNum() {
            return this.actualOutNum;
        }

            public void setActualInNum(Long actualInNum) {
            this.actualInNum = actualInNum;
        }

        public Long getActualInNum() {
            return this.actualInNum;
        }

            public void setUnitPrice(Long unitPrice) {
            this.unitPrice = unitPrice;
        }

        public Long getUnitPrice() {
            return this.unitPrice;
        }

            public void setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
        }

        public Long getTotalPrice() {
            return this.totalPrice;
        }

            public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductName() {
            return this.productName;
        }

            public void setProductPicture(String productPicture) {
            this.productPicture = productPicture;
        }

        public String getProductPicture() {
            return this.productPicture;
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

    public static class DeliverySearchVO {
            @JsonProperty(value = "id")
        /**
        * 自增ID
        */
        private Long id;
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
            @JsonProperty(value = "kdt_id")
        /**
        * 总部kdtId
        */
        private Long kdtId;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 单据号
        */
        private String bizBillNo;
            @JsonProperty(value = "idempotent_no")
        /**
        * 幂等单号
        */
        private String idempotentNo;
            @JsonProperty(value = "type")
        /**
        * 业务单据类型
1.调拨单   2.要货申请单
3.配送单
        */
        private Long type;
            @JsonProperty(value = "business_type")
        /**
        * 业务单据详细类型
11.库间调拨单  12.库内调拨单
21.要货申请单
31.配送单
        */
        private Long businessType;
            @JsonProperty(value = "from_kdt_id")
        /**
        * 出库仓库kdtId
        */
        private Long fromKdtId;
            @JsonProperty(value = "to_kdt_id")
        /**
        * 入库店铺kdtId
        */
        private Long toKdtId;
            @JsonProperty(value = "from_kdt_name")
        /**
        * 出库仓库名称
        */
        private String fromKdtName;
            @JsonProperty(value = "to_kdt_name")
        /**
        * 入库店铺名称
        */
        private String toKdtName;
            @JsonProperty(value = "operator_name")
        /**
        * 申请人名称
        */
        private String operatorName;
            @JsonProperty(value = "admin_id")
        /**
        * 申请人id
        */
        private Long adminId;
            @JsonProperty(value = "kdt_id_of_admin")
        /**
        * 申请店铺kdtId
        */
        private Long kdtIdOfAdmin;
            @JsonProperty(value = "warehsoue_of_admin")
        /**
        * 申请店铺名称
        */
        private String warehsoueOfAdmin;
            @JsonProperty(value = "status")
        /**
        * 状态
1.待审核  2.待出库  3.待入库  4.已驳回  5.已关闭  6.已完成  7.出库执行中  8.入库执行中
        */
        private Long status;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "refused_reason")
        /**
        * 驳回原因
        */
        private String refusedReason;
            @JsonProperty(value = "business_order_items")
        /**
        * 调拨单明细返回信息
        */
        private InterBusinessOrderItemOfProdVO[] businessOrderItems;
            @JsonProperty(value = "version")
        /**
        * 数据乐观锁
        */
        private Long version;
            @JsonProperty(value = "distributed_out_at")
        /**
        * 配送时间
        */
        private Date distributedOutAt;
            @JsonProperty(value = "source_order_nos")
        /**
        * 对应申请单号列表
        */
        private String[] sourceOrderNos;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
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

            public void setIdempotentNo(String idempotentNo) {
            this.idempotentNo = idempotentNo;
        }

        public String getIdempotentNo() {
            return this.idempotentNo;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setBusinessType(Long businessType) {
            this.businessType = businessType;
        }

        public Long getBusinessType() {
            return this.businessType;
        }

            public void setFromKdtId(Long fromKdtId) {
            this.fromKdtId = fromKdtId;
        }

        public Long getFromKdtId() {
            return this.fromKdtId;
        }

            public void setToKdtId(Long toKdtId) {
            this.toKdtId = toKdtId;
        }

        public Long getToKdtId() {
            return this.toKdtId;
        }

            public void setFromKdtName(String fromKdtName) {
            this.fromKdtName = fromKdtName;
        }

        public String getFromKdtName() {
            return this.fromKdtName;
        }

            public void setToKdtName(String toKdtName) {
            this.toKdtName = toKdtName;
        }

        public String getToKdtName() {
            return this.toKdtName;
        }

            public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getOperatorName() {
            return this.operatorName;
        }

            public void setAdminId(Long adminId) {
            this.adminId = adminId;
        }

        public Long getAdminId() {
            return this.adminId;
        }

            public void setKdtIdOfAdmin(Long kdtIdOfAdmin) {
            this.kdtIdOfAdmin = kdtIdOfAdmin;
        }

        public Long getKdtIdOfAdmin() {
            return this.kdtIdOfAdmin;
        }

            public void setWarehsoueOfAdmin(String warehsoueOfAdmin) {
            this.warehsoueOfAdmin = warehsoueOfAdmin;
        }

        public String getWarehsoueOfAdmin() {
            return this.warehsoueOfAdmin;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setRefusedReason(String refusedReason) {
            this.refusedReason = refusedReason;
        }

        public String getRefusedReason() {
            return this.refusedReason;
        }

            public void setBusinessOrderItems(InterBusinessOrderItemOfProdVO[] businessOrderItems) {
            this.businessOrderItems = businessOrderItems;
        }

        public InterBusinessOrderItemOfProdVO[] getBusinessOrderItems() {
            return this.businessOrderItems;
        }

            public void setVersion(Long version) {
            this.version = version;
        }

        public Long getVersion() {
            return this.version;
        }

            public void setDistributedOutAt(Date distributedOutAt) {
            this.distributedOutAt = distributedOutAt;
        }

        public Date getDistributedOutAt() {
            return this.distributedOutAt;
        }

            public void setSourceOrderNos(String[] sourceOrderNos) {
            this.sourceOrderNos = sourceOrderNos;
        }

        public String[] getSourceOrderNos() {
            return this.sourceOrderNos;
        }

        }

    public static class DeliveryPaginatorSearchVO {
            @JsonProperty(value = "items")
        /**
        * 配送单列表查询单个response
        */
        private DeliverySearchVO[] items;
            @JsonProperty(value = "paginator")
        /**
        * 
        */
        private Paginator paginator;
    
            public void setItems(DeliverySearchVO[] items) {
            this.items = items;
        }

        public DeliverySearchVO[] getItems() {
            return this.items;
        }

            public void setPaginator(Paginator paginator) {
            this.paginator = paginator;
        }

        public Paginator getPaginator() {
            return this.paginator;
        }

        }


}