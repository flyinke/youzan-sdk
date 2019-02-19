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

public class YouzanRetailStockGoodsapplyGetResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 要货申请单据详情
     */
    private GoodsApplyOrderVO response;

    public void setResponse(GoodsApplyOrderVO response) {
        this.response = response;
    }

    public GoodsApplyOrderVO getResponse() {
        return this.response;
    }

    public static class GoodsApplyOrderVO {
            @JsonProperty(value = "checked_at")
        /**
        * 审核时间
        */
        private Date checkedAt;
            @JsonProperty(value = "kdt_id")
        /**
        * 总部的kdtId
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
1.调拨单
2.要货申请单
3.配送单
        */
        private Long type;
            @JsonProperty(value = "business_type")
        /**
        * 单据详细类型
11.库间调拨单
12.库内调拨单
21.要货申请单
31.配送单
        */
        private Long businessType;
            @JsonProperty(value = "from_kdt_id")
        /**
        * 出库仓库id
        */
        private Long fromKdtId;
            @JsonProperty(value = "to_kdt_id")
        /**
        * 入库仓库id
        */
        private Long toKdtId;
            @JsonProperty(value = "from_kdt_name")
        /**
        * 出库仓库名称
        */
        private String fromKdtName;
            @JsonProperty(value = "to_kdt_name")
        /**
        * 入库仓库名称
        */
        private String toKdtName;
            @JsonProperty(value = "operator_name")
        /**
        * 创建人名称
        */
        private String operatorName;
            @JsonProperty(value = "admin_id")
        /**
        * 创建人id
        */
        private Long adminId;
            @JsonProperty(value = "warehouse_of_admin")
        /**
        * 创建人仓库名称
        */
        private String warehouseOfAdmin;
            @JsonProperty(value = "status")
        /**
        * 单据状态 
1.待审核  2:待出库  3:待入库
4.已驳回  5:已关闭  6已完成
7:出库执行中  8:入库执行中
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
            @JsonProperty(value = "version")
        /**
        * 记录版本号
        */
        private Long version;
            @JsonProperty(value = "out_biz_bill_no")
        /**
        * 出库单据单据号
        */
        private String outBizBillNo;
            @JsonProperty(value = "in_biz_bill_no")
        /**
        * 入库单据单据号
        */
        private String inBizBillNo;
            @JsonProperty(value = "ext_info")
        /**
        * 拓展信息，json字符串
        */
        private String extInfo;
            @JsonProperty(value = "business_order_items")
        /**
        * 库间单明细信息
        */
        private InterBusinessOrderItemVO[] businessOrderItems;
    
            public void setCheckedAt(Date checkedAt) {
            this.checkedAt = checkedAt;
        }

        public Date getCheckedAt() {
            return this.checkedAt;
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

            public void setWarehouseOfAdmin(String warehouseOfAdmin) {
            this.warehouseOfAdmin = warehouseOfAdmin;
        }

        public String getWarehouseOfAdmin() {
            return this.warehouseOfAdmin;
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

            public void setOutBizBillNo(String outBizBillNo) {
            this.outBizBillNo = outBizBillNo;
        }

        public String getOutBizBillNo() {
            return this.outBizBillNo;
        }

            public void setInBizBillNo(String inBizBillNo) {
            this.inBizBillNo = inBizBillNo;
        }

        public String getInBizBillNo() {
            return this.inBizBillNo;
        }

            public void setExtInfo(String extInfo) {
            this.extInfo = extInfo;
        }

        public String getExtInfo() {
            return this.extInfo;
        }

            public void setBusinessOrderItems(InterBusinessOrderItemVO[] businessOrderItems) {
            this.businessOrderItems = businessOrderItems;
        }

        public InterBusinessOrderItemVO[] getBusinessOrderItems() {
            return this.businessOrderItems;
        }

        }

    public static class InterBusinessOrderItemVO {
            @JsonProperty(value = "id")
        /**
        * 自增id
        */
        private Long id;
            @JsonProperty(value = "kdt_id")
        /**
        * 总部的kdtId
        */
        private Long kdtId;
            @JsonProperty(value = "biz_bill_no")
        /**
        * 业务单据号
        */
        private String bizBillNo;
            @JsonProperty(value = "type")
        /**
        * 单据类型  1.调拨单  2.要货申请单  3.配送单
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
            @JsonProperty(value = "pre_out_num")
        /**
        * 预发数量
        */
        private Long preOutNum;
            @JsonProperty(value = "unit_price")
        /**
        * 成本单价
        */
        private Long unitPrice;
            @JsonProperty(value = "total_price")
        /**
        * 成本总价
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
        * 规格信息
        */
        private String specifications;
            @JsonProperty(value = "sku_no")
        /**
        * 商品编码
        */
        private String skuNo;
            @JsonProperty(value = "unit")
        /**
        * 单位
        */
        private String unit;
            @JsonProperty(value = "version")
        /**
        * 记录乐观锁
        */
        private String version;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
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

            public void setPreOutNum(Long preOutNum) {
            this.preOutNum = preOutNum;
        }

        public Long getPreOutNum() {
            return this.preOutNum;
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

            public void setVersion(String version) {
            this.version = version;
        }

        public String getVersion() {
            return this.version;
        }

        }


}