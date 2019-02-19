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

public class YouzanRetailStockGoodsapplySearchResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 要货申请列表展示
     */
    private GoodsApplySearchPaginatorVO response;

    public void setResponse(GoodsApplySearchPaginatorVO response) {
        this.response = response;
    }

    public GoodsApplySearchPaginatorVO getResponse() {
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

    public static class InterBusinessOrderVO {
            @JsonProperty(value = "id")
        /**
        * 自增id
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
        * 连锁总部kdtId
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
        * 单据类型  1:调拨单   2:要货申请单  3:配送单
        */
        private Long type;
            @JsonProperty(value = "business_type")
        /**
        * 单据详细类型
11:库间调拨  12:库内调拨
21:要货申请单
31:配送单
        */
        private Long businessType;
            @JsonProperty(value = "from_kdt_id")
        /**
        * 出库仓库kdtId
        */
        private Long fromKdtId;
            @JsonProperty(value = "to_kdt_id")
        /**
        * 入库仓库kdtId
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
        private String adminId;
            @JsonProperty(value = "kdt_id_of_admin")
        /**
        * 申请人所在的店铺kdtId
        */
        private Long kdtIdOfAdmin;
            @JsonProperty(value = "warehosue_of_admin")
        /**
        * 申请店铺名称
        */
        private String warehosueOfAdmin;
            @JsonProperty(value = "status")
        /**
        * 单据状态 
1:待审核  2:待出库  3:待入库  4:已驳回  5:已关闭  6：已完成  7:出库执行中（处理中状态）  8:入库执行中（处理中状态）
        */
        private Long status;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "refused_reason")
        /**
        * 审核驳回原因
        */
        private String refusedReason;
            @JsonProperty(value = "version")
        /**
        * 版本乐观锁
        */
        private Long version;
            @JsonProperty(value = "business_order_items")
        /**
        * 调拨单明细返回信息
        */
        private InterBusinessOrderItemOfProdVO[] businessOrderItems;
            @JsonProperty(value = "extInfo")
        /**
        * 拓展信息
        */
        private String extInfo;
            @JsonProperty(value = "distribute_out_at")
        /**
        * 实际出库时间
        */
        private Date distributeOutAt;
            @JsonProperty(value = "checked_at")
        /**
        * 审核时间
        */
        private Date checkedAt;
            @JsonProperty(value = "in_biz_bill_no")
        /**
        * 入库单号
        */
        private String inBizBillNo;
            @JsonProperty(value = "out_biz_bill_no")
        /**
        * 出库单号
        */
        private String outBizBillNo;
    
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

            public void setAdminId(String adminId) {
            this.adminId = adminId;
        }

        public String getAdminId() {
            return this.adminId;
        }

            public void setKdtIdOfAdmin(Long kdtIdOfAdmin) {
            this.kdtIdOfAdmin = kdtIdOfAdmin;
        }

        public Long getKdtIdOfAdmin() {
            return this.kdtIdOfAdmin;
        }

            public void setWarehosueOfAdmin(String warehosueOfAdmin) {
            this.warehosueOfAdmin = warehosueOfAdmin;
        }

        public String getWarehosueOfAdmin() {
            return this.warehosueOfAdmin;
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

            public void setVersion(Long version) {
            this.version = version;
        }

        public Long getVersion() {
            return this.version;
        }

            public void setBusinessOrderItems(InterBusinessOrderItemOfProdVO[] businessOrderItems) {
            this.businessOrderItems = businessOrderItems;
        }

        public InterBusinessOrderItemOfProdVO[] getBusinessOrderItems() {
            return this.businessOrderItems;
        }

            public void setExtInfo(String extInfo) {
            this.extInfo = extInfo;
        }

        public String getExtInfo() {
            return this.extInfo;
        }

            public void setDistributeOutAt(Date distributeOutAt) {
            this.distributeOutAt = distributeOutAt;
        }

        public Date getDistributeOutAt() {
            return this.distributeOutAt;
        }

            public void setCheckedAt(Date checkedAt) {
            this.checkedAt = checkedAt;
        }

        public Date getCheckedAt() {
            return this.checkedAt;
        }

            public void setInBizBillNo(String inBizBillNo) {
            this.inBizBillNo = inBizBillNo;
        }

        public String getInBizBillNo() {
            return this.inBizBillNo;
        }

            public void setOutBizBillNo(String outBizBillNo) {
            this.outBizBillNo = outBizBillNo;
        }

        public String getOutBizBillNo() {
            return this.outBizBillNo;
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

    public static class GoodsApplySearchPaginatorVO {
            @JsonProperty(value = "to_check_num")
        /**
        * 待审核订单数量
        */
        private Long toCheckNum;
            @JsonProperty(value = "to_out_num")
        /**
        * 待出库订单数量
        */
        private Long toOutNum;
            @JsonProperty(value = "to_in_num")
        /**
        * 待入库订单数量
        */
        private Long toInNum;
            @JsonProperty(value = "refused_num")
        /**
        * 驳回订单数量
        */
        private Long refusedNum;
            @JsonProperty(value = "items")
        /**
        * 库间单据信息
        */
        private InterBusinessOrderVO[] items;
            @JsonProperty(value = "paginator")
        /**
        * 
        */
        private Paginator paginator;
    
            public void setToCheckNum(Long toCheckNum) {
            this.toCheckNum = toCheckNum;
        }

        public Long getToCheckNum() {
            return this.toCheckNum;
        }

            public void setToOutNum(Long toOutNum) {
            this.toOutNum = toOutNum;
        }

        public Long getToOutNum() {
            return this.toOutNum;
        }

            public void setToInNum(Long toInNum) {
            this.toInNum = toInNum;
        }

        public Long getToInNum() {
            return this.toInNum;
        }

            public void setRefusedNum(Long refusedNum) {
            this.refusedNum = refusedNum;
        }

        public Long getRefusedNum() {
            return this.refusedNum;
        }

            public void setItems(InterBusinessOrderVO[] items) {
            this.items = items;
        }

        public InterBusinessOrderVO[] getItems() {
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