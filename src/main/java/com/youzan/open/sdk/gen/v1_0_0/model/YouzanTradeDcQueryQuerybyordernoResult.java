package com.youzan.open.sdk.gen.v1_0_0.model;

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

public class YouzanTradeDcQueryQuerybyordernoResult implements APIResult {

    @JsonProperty(value = "deliveryOrders")
    /**
     * 发货单
     */
    private DeliveryOrderDTO[] deliveryOrders;

    public void setDeliveryOrders(DeliveryOrderDTO[] deliveryOrders) {
        this.deliveryOrders = deliveryOrders;
    }

    public DeliveryOrderDTO[] getDeliveryOrders() {
        return this.deliveryOrders;
    }

    public static class DeliveryOrderDTO {
            @JsonProperty(value = "deliveryNo")
        /**
        * 货单号
        */
        private String deliveryNo;
            @JsonProperty(value = "orderNo")
        /**
        * 订单号
        */
        private String orderNo;
            @JsonProperty(value = "kdtId")
        /**
        * 店铺Id
        */
        private Long kdtId;
            @JsonProperty(value = "deliveryPointId")
        /**
        * 出货点Id
        */
        private Long deliveryPointId;
            @JsonProperty(value = "status")
        /**
        * 货单状态
        */
        private Long status;
            @JsonProperty(value = "distType")
        /**
        * 配送方式
        */
        private Long distType;
            @JsonProperty(value = "extend")
        /**
        * 扩展信息
        */
        private String extend;
            @JsonProperty(value = "createTime")
        /**
        * 发货时间
        */
        private Date createTime;
            @JsonProperty(value = "updateTime")
        /**
        * 货单更新时间
        */
        private Date updateTime;
            @JsonProperty(value = "deliveryFee")
        /**
        * 应付运费
        */
        private Long deliveryFee;
            @JsonProperty(value = "realDeliveryFee")
        /**
        * 实付运费
        */
        private Long realDeliveryFee;
            @JsonProperty(value = "remark")
        /**
        * 货单备注
        */
        private String remark;
            @JsonProperty(value = "distOrderDTOs")
        /**
        * 配送单
        */
        private DistOrderDTO[] distOrderDTOs;
            @JsonProperty(value = "deliveryOrderItems")
        /**
        * 发货单明细
        */
        private DeliveryOrderItemDTO[] deliveryOrderItems;
            @JsonProperty(value = "operationLogs")
        /**
        * 操作记录
        */
        private OperationLogDTO[] operationLogs;
    
            public void setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        public String getDeliveryNo() {
            return this.deliveryNo;
        }

            public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderNo() {
            return this.orderNo;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setDeliveryPointId(Long deliveryPointId) {
            this.deliveryPointId = deliveryPointId;
        }

        public Long getDeliveryPointId() {
            return this.deliveryPointId;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setDistType(Long distType) {
            this.distType = distType;
        }

        public Long getDistType() {
            return this.distType;
        }

            public void setExtend(String extend) {
            this.extend = extend;
        }

        public String getExtend() {
            return this.extend;
        }

            public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }

        public Date getCreateTime() {
            return this.createTime;
        }

            public void setUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
        }

        public Date getUpdateTime() {
            return this.updateTime;
        }

            public void setDeliveryFee(Long deliveryFee) {
            this.deliveryFee = deliveryFee;
        }

        public Long getDeliveryFee() {
            return this.deliveryFee;
        }

            public void setRealDeliveryFee(Long realDeliveryFee) {
            this.realDeliveryFee = realDeliveryFee;
        }

        public Long getRealDeliveryFee() {
            return this.realDeliveryFee;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setDistOrderDTOs(DistOrderDTO[] distOrderDTOs) {
            this.distOrderDTOs = distOrderDTOs;
        }

        public DistOrderDTO[] getDistOrderDTOs() {
            return this.distOrderDTOs;
        }

            public void setDeliveryOrderItems(DeliveryOrderItemDTO[] deliveryOrderItems) {
            this.deliveryOrderItems = deliveryOrderItems;
        }

        public DeliveryOrderItemDTO[] getDeliveryOrderItems() {
            return this.deliveryOrderItems;
        }

            public void setOperationLogs(OperationLogDTO[] operationLogs) {
            this.operationLogs = operationLogs;
        }

        public OperationLogDTO[] getOperationLogs() {
            return this.operationLogs;
        }

        }

    public static class DeliveryOrderItemDTO {
            @JsonProperty(value = "deliveryNo")
        /**
        * 货单号
        */
        private String deliveryNo;
            @JsonProperty(value = "orderNo")
        /**
        * 订单号
        */
        private String orderNo;
            @JsonProperty(value = "kdtId")
        /**
        * 店铺Id
        */
        private Long kdtId;
            @JsonProperty(value = "itemId")
        /**
        * 订单商品id
        */
        private Long itemId;
            @JsonProperty(value = "num")
        /**
        * 订单商品id
        */
        private Long num;
            @JsonProperty(value = "weight")
        /**
        * 发货商品数量
        */
        private Long weight;
            @JsonProperty(value = "deliveryStatus")
        /**
        * 商品发货状态
        */
        private Long deliveryStatus;
            @JsonProperty(value = "deliveryStatusDesc")
        /**
        * 商品发货状态描述
        */
        private String deliveryStatusDesc;
            @JsonProperty(value = "noNeedDeliveryReason")
        /**
        * 商品无需发货的原因
        */
        private String noNeedDeliveryReason;
    
            public void setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        public String getDeliveryNo() {
            return this.deliveryNo;
        }

            public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderNo() {
            return this.orderNo;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setWeight(Long weight) {
            this.weight = weight;
        }

        public Long getWeight() {
            return this.weight;
        }

            public void setDeliveryStatus(Long deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
        }

        public Long getDeliveryStatus() {
            return this.deliveryStatus;
        }

            public void setDeliveryStatusDesc(String deliveryStatusDesc) {
            this.deliveryStatusDesc = deliveryStatusDesc;
        }

        public String getDeliveryStatusDesc() {
            return this.deliveryStatusDesc;
        }

            public void setNoNeedDeliveryReason(String noNeedDeliveryReason) {
            this.noNeedDeliveryReason = noNeedDeliveryReason;
        }

        public String getNoNeedDeliveryReason() {
            return this.noNeedDeliveryReason;
        }

        }

    public static class LocalDeliveryDetail {
            @JsonProperty(value = "delivery_no")
        /**
        * 货单号
        */
        private String deliveryNo;
            @JsonProperty(value = "deduct_fee")
        /**
        * 违约金
        */
        private Long deductFee;
            @JsonProperty(value = "dist_status")
        /**
        * 同城送状态描述
  STATUS_NONE(Integer.valueOf(-1), "初始状态", false),
  STATUS_NORMAL(Integer.valueOf(0), "初始状态", false),
  STATUS_ORDERING(Integer.valueOf(1), "待接单", false),
  STATUS_TAKING(Integer.valueOf(2), "待取货", false),
  STATUS_SENDING(Integer.valueOf(3), "配送中", false),
  STATUS_DONE(Integer.valueOf(4), "已完成", true),
  STATUS_CANCEL(Integer.valueOf(5), "已取消", true),
  STATUS_CANCEL_EXCEPTION(Integer.valueOf(6), "取消异常", false),
  STATUS_OVERDUE(Integer.valueOf(7), "已过期", true);
        */
        private String distStatus;
            @JsonProperty(value = "dist_status_code")
        /**
        * 同城送状态码
  STATUS_NONE(Integer.valueOf(-1), "初始状态", false),
  STATUS_NORMAL(Integer.valueOf(0), "初始状态", false),
  STATUS_ORDERING(Integer.valueOf(1), "待接单", false),
  STATUS_TAKING(Integer.valueOf(2), "待取货", false),
  STATUS_SENDING(Integer.valueOf(3), "配送中", false),
  STATUS_DONE(Integer.valueOf(4), "已完成", true),
  STATUS_CANCEL(Integer.valueOf(5), "已取消", true),
  STATUS_CANCEL_EXCEPTION(Integer.valueOf(6), "取消异常", false),
  STATUS_OVERDUE(Integer.valueOf(7), "已过期", true);
        */
        private Long distStatusCode;
            @JsonProperty(value = "dist_lng")
        /**
        * 配送员经度
        */
        private String distLng;
            @JsonProperty(value = "dist_lat")
        /**
        * 配送员纬度
        */
        private String distLat;
            @JsonProperty(value = "tip")
        /**
        * 配送员小费
        */
        private Long tip;
            @JsonProperty(value = "delivery_fee")
        /**
        * 配送费
        */
        private Long deliveryFee;
            @JsonProperty(value = "distance")
        /**
        * 配送员距离
        */
        private String distance;
            @JsonProperty(value = "create_time")
        /**
        * 发单时间
        */
        private String createTime;
            @JsonProperty(value = "accept_time")
        /**
        * 接单时间
        */
        private String acceptTime;
            @JsonProperty(value = "fetch_time")
        /**
        * 取货时间
        */
        private String fetchTime;
            @JsonProperty(value = "finish_time")
        /**
        * 送达时间
        */
        private String finishTime;
            @JsonProperty(value = "cancel_time")
        /**
        * 取消时间
        */
        private String cancelTime;
            @JsonProperty(value = "cancel_reason")
        /**
        * 取消原因
        */
        private String cancelReason;
            @JsonProperty(value = "expire_time")
        /**
        * 过期时间
        */
        private String expireTime;
    
            public void setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        public String getDeliveryNo() {
            return this.deliveryNo;
        }

            public void setDeductFee(Long deductFee) {
            this.deductFee = deductFee;
        }

        public Long getDeductFee() {
            return this.deductFee;
        }

            public void setDistStatus(String distStatus) {
            this.distStatus = distStatus;
        }

        public String getDistStatus() {
            return this.distStatus;
        }

            public void setDistStatusCode(Long distStatusCode) {
            this.distStatusCode = distStatusCode;
        }

        public Long getDistStatusCode() {
            return this.distStatusCode;
        }

            public void setDistLng(String distLng) {
            this.distLng = distLng;
        }

        public String getDistLng() {
            return this.distLng;
        }

            public void setDistLat(String distLat) {
            this.distLat = distLat;
        }

        public String getDistLat() {
            return this.distLat;
        }

            public void setTip(Long tip) {
            this.tip = tip;
        }

        public Long getTip() {
            return this.tip;
        }

            public void setDeliveryFee(Long deliveryFee) {
            this.deliveryFee = deliveryFee;
        }

        public Long getDeliveryFee() {
            return this.deliveryFee;
        }

            public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDistance() {
            return this.distance;
        }

            public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateTime() {
            return this.createTime;
        }

            public void setAcceptTime(String acceptTime) {
            this.acceptTime = acceptTime;
        }

        public String getAcceptTime() {
            return this.acceptTime;
        }

            public void setFetchTime(String fetchTime) {
            this.fetchTime = fetchTime;
        }

        public String getFetchTime() {
            return this.fetchTime;
        }

            public void setFinishTime(String finishTime) {
            this.finishTime = finishTime;
        }

        public String getFinishTime() {
            return this.finishTime;
        }

            public void setCancelTime(String cancelTime) {
            this.cancelTime = cancelTime;
        }

        public String getCancelTime() {
            return this.cancelTime;
        }

            public void setCancelReason(String cancelReason) {
            this.cancelReason = cancelReason;
        }

        public String getCancelReason() {
            return this.cancelReason;
        }

            public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }

        public String getExpireTime() {
            return this.expireTime;
        }

        }

    public static class ExpressDetail {
            @JsonProperty(value = "express_company_name")
        /**
        * 物流公司名称
        */
        private String expressCompanyName;
            @JsonProperty(value = "express_progress_info")
        /**
        * 物流进度详情
        */
        private String expressProgressInfo;
            @JsonProperty(value = "express_status")
        /**
        * 物流状态
        */
        private String expressStatus;
            @JsonProperty(value = "com")
        /**
        * 物流公司编码
        */
        private String com;
    
            public void setExpressCompanyName(String expressCompanyName) {
            this.expressCompanyName = expressCompanyName;
        }

        public String getExpressCompanyName() {
            return this.expressCompanyName;
        }

            public void setExpressProgressInfo(String expressProgressInfo) {
            this.expressProgressInfo = expressProgressInfo;
        }

        public String getExpressProgressInfo() {
            return this.expressProgressInfo;
        }

            public void setExpressStatus(String expressStatus) {
            this.expressStatus = expressStatus;
        }

        public String getExpressStatus() {
            return this.expressStatus;
        }

            public void setCom(String com) {
            this.com = com;
        }

        public String getCom() {
            return this.com;
        }

        }

    public static class OperationLogDTO {
            @JsonProperty(value = "deliveryNo")
        /**
        * 发货单号
        */
        private String deliveryNo;
            @JsonProperty(value = "distId")
        /**
        * 配送单号
        */
        private String distId;
            @JsonProperty(value = "orderNo")
        /**
        * 订单号
        */
        private String orderNo;
            @JsonProperty(value = "kdtId")
        /**
        * 店铺Id
        */
        private Long kdtId;
            @JsonProperty(value = "operatorId")
        /**
        * 操作人Id
        */
        private Long operatorId;
            @JsonProperty(value = "operatorName")
        /**
        * 操作人姓名
        */
        private String operatorName;
            @JsonProperty(value = "operatorPhone")
        /**
        * 操作人手机号
        */
        private String operatorPhone;
            @JsonProperty(value = "action")
        /**
        * 操作的动作
        */
        private String action;
            @JsonProperty(value = "note")
        /**
        * 备注信息
        */
        private String note;
            @JsonProperty(value = "role")
        /**
        * 操作人角色
        */
        private String role;
            @JsonProperty(value = "roleDesc")
        /**
        * 操作人角色描述
        */
        private String roleDesc;
            @JsonProperty(value = "createTime")
        /**
        * 日志创建时间
        */
        private Date createTime;
    
            public void setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        public String getDeliveryNo() {
            return this.deliveryNo;
        }

            public void setDistId(String distId) {
            this.distId = distId;
        }

        public String getDistId() {
            return this.distId;
        }

            public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderNo() {
            return this.orderNo;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setOperatorId(Long operatorId) {
            this.operatorId = operatorId;
        }

        public Long getOperatorId() {
            return this.operatorId;
        }

            public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getOperatorName() {
            return this.operatorName;
        }

            public void setOperatorPhone(String operatorPhone) {
            this.operatorPhone = operatorPhone;
        }

        public String getOperatorPhone() {
            return this.operatorPhone;
        }

            public void setAction(String action) {
            this.action = action;
        }

        public String getAction() {
            return this.action;
        }

            public void setNote(String note) {
            this.note = note;
        }

        public String getNote() {
            return this.note;
        }

            public void setRole(String role) {
            this.role = role;
        }

        public String getRole() {
            return this.role;
        }

            public void setRoleDesc(String roleDesc) {
            this.roleDesc = roleDesc;
        }

        public String getRoleDesc() {
            return this.roleDesc;
        }

            public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }

        public Date getCreateTime() {
            return this.createTime;
        }

        }

    public static class DistOrderItemDTO {
            @JsonProperty(value = "dist_id")
        /**
        * 配送单号
        */
        private String distId;
            @JsonProperty(value = "delivery_no")
        /**
        * 货单号
        */
        private String deliveryNo;
            @JsonProperty(value = "tid")
        /**
        * 主订单ID
        */
        private String tid;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "oid")
        /**
        * 子订单ID
        */
        private Long oid;
            @JsonProperty(value = "num")
        /**
        * 数量
        */
        private Long num;
            @JsonProperty(value = "weight")
        /**
        * 重量
        */
        private Long weight;
    
            public void setDistId(String distId) {
            this.distId = distId;
        }

        public String getDistId() {
            return this.distId;
        }

            public void setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        public String getDeliveryNo() {
            return this.deliveryNo;
        }

            public void setTid(String tid) {
            this.tid = tid;
        }

        public String getTid() {
            return this.tid;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setOid(Long oid) {
            this.oid = oid;
        }

        public Long getOid() {
            return this.oid;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setWeight(Long weight) {
            this.weight = weight;
        }

        public Long getWeight() {
            return this.weight;
        }

        }

    public static class LocalDeliveryInfo {
            @JsonProperty(value = "dist_name")
        /**
        * 配送员姓名
        */
        private String distName;
            @JsonProperty(value = "dist_mobile")
        /**
        * 配送员手机号
        */
        private String distMobile;
            @JsonProperty(value = "dist_company_id")
        /**
        * 配送公司
        */
        private Long distCompanyId;
            @JsonProperty(value = "dist_company_name")
        /**
        * 配送公司名称
        */
        private String distCompanyName;
            @JsonProperty(value = "local_delivery_detail")
        /**
        * 同城送配送信息详情
        */
        private LocalDeliveryDetail localDeliveryDetail;
    
            public void setDistName(String distName) {
            this.distName = distName;
        }

        public String getDistName() {
            return this.distName;
        }

            public void setDistMobile(String distMobile) {
            this.distMobile = distMobile;
        }

        public String getDistMobile() {
            return this.distMobile;
        }

            public void setDistCompanyId(Long distCompanyId) {
            this.distCompanyId = distCompanyId;
        }

        public Long getDistCompanyId() {
            return this.distCompanyId;
        }

            public void setDistCompanyName(String distCompanyName) {
            this.distCompanyName = distCompanyName;
        }

        public String getDistCompanyName() {
            return this.distCompanyName;
        }

            public void setLocalDeliveryDetail(LocalDeliveryDetail localDeliveryDetail) {
            this.localDeliveryDetail = localDeliveryDetail;
        }

        public LocalDeliveryDetail getLocalDeliveryDetail() {
            return this.localDeliveryDetail;
        }

        }

    public static class DistOrderDTO {
            @JsonProperty(value = "tid")
        /**
        * 主订单ID
        */
        private String tid;
            @JsonProperty(value = "dist_id")
        /**
        * 配送单id
        */
        private String distId;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "delivery_type")
        /**
        * 发货类型
        */
        private Long deliveryType;
            @JsonProperty(value = "delivery_no")
        /**
        * 发货单号
        */
        private String deliveryNo;
            @JsonProperty(value = "delivery_point_id")
        /**
        * 出货点id
        */
        private Long deliveryPointId;
            @JsonProperty(value = "extend")
        /**
        * 扩展字段
        */
        private String extend;
            @JsonProperty(value = "local_delivery_info")
        /**
        * 同城送配送信息
        */
        private LocalDeliveryInfo localDeliveryInfo;
            @JsonProperty(value = "dist_order_items")
        /**
        * 配送单明细
        */
        private DistOrderItemDTO[] distOrderItems;
            @JsonProperty(value = "status")
        /**
        * 配送单状态
 NON_DELIVERY("NonDeliver", 0, "未发货"),
  DELIVERING("delivering", 1, "发货中"),
  DELIVERED("delivered", 2, "已发货"),
  CANCELED("canceled", 3, "已取消");
        */
        private Long status;
            @JsonProperty(value = "express_info")
        /**
        * 物流快递信息
        */
        private ExpressInfo expressInfo;
    
            public void setTid(String tid) {
            this.tid = tid;
        }

        public String getTid() {
            return this.tid;
        }

            public void setDistId(String distId) {
            this.distId = distId;
        }

        public String getDistId() {
            return this.distId;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setDeliveryType(Long deliveryType) {
            this.deliveryType = deliveryType;
        }

        public Long getDeliveryType() {
            return this.deliveryType;
        }

            public void setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        public String getDeliveryNo() {
            return this.deliveryNo;
        }

            public void setDeliveryPointId(Long deliveryPointId) {
            this.deliveryPointId = deliveryPointId;
        }

        public Long getDeliveryPointId() {
            return this.deliveryPointId;
        }

            public void setExtend(String extend) {
            this.extend = extend;
        }

        public String getExtend() {
            return this.extend;
        }

            public void setLocalDeliveryInfo(LocalDeliveryInfo localDeliveryInfo) {
            this.localDeliveryInfo = localDeliveryInfo;
        }

        public LocalDeliveryInfo getLocalDeliveryInfo() {
            return this.localDeliveryInfo;
        }

            public void setDistOrderItems(DistOrderItemDTO[] distOrderItems) {
            this.distOrderItems = distOrderItems;
        }

        public DistOrderItemDTO[] getDistOrderItems() {
            return this.distOrderItems;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setExpressInfo(ExpressInfo expressInfo) {
            this.expressInfo = expressInfo;
        }

        public ExpressInfo getExpressInfo() {
            return this.expressInfo;
        }

        }

    public static class ExpressInfo {
            @JsonProperty(value = "express_no")
        /**
        * 物流单号
        */
        private String expressNo;
            @JsonProperty(value = "express_id")
        /**
        * 物流公司id
        */
        private Long expressId;
            @JsonProperty(value = "express_detail")
        /**
        * 快递发货->物流详情
        */
        private ExpressDetail expressDetail;
    
            public void setExpressNo(String expressNo) {
            this.expressNo = expressNo;
        }

        public String getExpressNo() {
            return this.expressNo;
        }

            public void setExpressId(Long expressId) {
            this.expressId = expressId;
        }

        public Long getExpressId() {
            return this.expressId;
        }

            public void setExpressDetail(ExpressDetail expressDetail) {
            this.expressDetail = expressDetail;
        }

        public ExpressDetail getExpressDetail() {
            return this.expressDetail;
        }

        }


}