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

public class YouzanMeiReservationListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 预约单列表
     */
    private MeiReservationDetail[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiReservationDetail[] items) {
        this.items = items;
    }

    public MeiReservationDetail[] getItems() {
        return this.items;
    }

    public static class mei_reservation_item {
            @JsonProperty(value = "item_sku_name")
        /**
        * 预约项名称
        */
        private String itemSkuName;
            @JsonProperty(value = "item_id")
        /**
        * 预约项id
        */
        private Long itemId;
            @JsonProperty(value = "image_url")
        /**
        * 预约项的图片链接
        */
        private String imageUrl;
            @JsonProperty(value = "real_pay")
        /**
        * 如果已经支付，那么预约项的支付金额，单位：分
        */
        private Long realPay;
            @JsonProperty(value = "num")
        /**
        * 预约的数量
        */
        private Long num;
            @JsonProperty(value = "resource_type")
        /**
        * 预约的资源类型：
0 没有占用资源
1占用了技师资源
        */
        private Long resourceType;
            @JsonProperty(value = "goods_id")
        /**
        * 预约项的服务id
        */
        private Long goodsId;
            @JsonProperty(value = "reservation_item_id")
        /**
        * 预约项目id
        */
        private String reservationItemId;
            @JsonProperty(value = "item_name")
        /**
        * 预约项目名称
        */
        private String itemName;
            @JsonProperty(value = "sku_id")
        /**
        * 预约的服务的规格id
        */
        private Long skuId;
            @JsonProperty(value = "resource_id")
        /**
        * 预约项的资源id
0 表示没有使用预约资源
        */
        private Long resourceId;
            @JsonProperty(value = "origin_price")
        /**
        * 预约的项目的原价，单位：分
        */
        private Long originPrice;
            @JsonProperty(value = "resource_name")
        /**
        * 预约的资源名称，例如资源类型是技师，则这个为技师名称
        */
        private String resourceName;
    
            public void setItemSkuName(String itemSkuName) {
            this.itemSkuName = itemSkuName;
        }

        public String getItemSkuName() {
            return this.itemSkuName;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

            public void setRealPay(Long realPay) {
            this.realPay = realPay;
        }

        public Long getRealPay() {
            return this.realPay;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setResourceType(Long resourceType) {
            this.resourceType = resourceType;
        }

        public Long getResourceType() {
            return this.resourceType;
        }

            public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public Long getGoodsId() {
            return this.goodsId;
        }

            public void setReservationItemId(String reservationItemId) {
            this.reservationItemId = reservationItemId;
        }

        public String getReservationItemId() {
            return this.reservationItemId;
        }

            public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getItemName() {
            return this.itemName;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setResourceId(Long resourceId) {
            this.resourceId = resourceId;
        }

        public Long getResourceId() {
            return this.resourceId;
        }

            public void setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
        }

        public Long getOriginPrice() {
            return this.originPrice;
        }

            public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public String getResourceName() {
            return this.resourceName;
        }

        }

    public static class MeiReservationDetail {
            @JsonProperty(value = "order_no")
        /**
        * 预约单单号
        */
        private String orderNo;
            @JsonProperty(value = "need_pay")
        /**
        * 预约单是否需哟啊支付
0 不需要支付
1 需要支付
        */
        private Long needPay;
            @JsonProperty(value = "customer_name")
        /**
        * 顾客姓名
        */
        private String customerName;
            @JsonProperty(value = "cancel_source")
        /**
        * 取消来源
1 商家主动取消
2 买家主动取消
3 开单后取消
        */
        private Long cancelSource;
            @JsonProperty(value = "real_pay")
        /**
        * 实际支付金额，单位：分
        */
        private Long realPay;
            @JsonProperty(value = "mobile")
        /**
        * 预约人电话
        */
        private String mobile;
            @JsonProperty(value = "created_at")
        /**
        * 预约单创建时间
        */
        private Long createdAt;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "out_biz_no")
        /**
        * 外部业务单号，比如预约是由其他业务创建，那么这里就会放置该业务的单号
        */
        private String outBizNo;
            @JsonProperty(value = "yz_uid")
        /**
        * 买家的有赞账号id
        */
        private Long yzUid;
            @JsonProperty(value = "from_source")
        /**
        * 预约来源
1 商家发起的预约
2 买家发起的预约
        */
        private Long fromSource;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "cancel_reason")
        /**
        * 预约取消原因
        */
        private String cancelReason;
            @JsonProperty(value = "pay_status")
        /**
        * 支付状态
10 待支付
20 无需支付
30 已支付
        */
        private Long payStatus;
            @JsonProperty(value = "reservation_status")
        /**
        * 预约单状态
5 已创建
10 待服务
20 已开单
30 已完成
97 已取消（由外部业务取消）
98 已取消
        */
        private Long reservationStatus;
            @JsonProperty(value = "billed_at")
        /**
        * 开单时间
        */
        private Long billedAt;
            @JsonProperty(value = "arrange_at")
        /**
        * 到店时间
        */
        private Long arrangeAt;
            @JsonProperty(value = "out_biz_state")
        /**
        * 外部业务状态
        */
        private Long outBizState;
            @JsonProperty(value = "dept_id")
        /**
        * 分店id
        */
        private Long deptId;
            @JsonProperty(value = "cancel_at")
        /**
        * 取消时间
        */
        private Long cancelAt;
            @JsonProperty(value = "reservation_items")
        /**
        * 预约项
        */
        private mei_reservation_item[] reservationItems;
    
            public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderNo() {
            return this.orderNo;
        }

            public void setNeedPay(Long needPay) {
            this.needPay = needPay;
        }

        public Long getNeedPay() {
            return this.needPay;
        }

            public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerName() {
            return this.customerName;
        }

            public void setCancelSource(Long cancelSource) {
            this.cancelSource = cancelSource;
        }

        public Long getCancelSource() {
            return this.cancelSource;
        }

            public void setRealPay(Long realPay) {
            this.realPay = realPay;
        }

        public Long getRealPay() {
            return this.realPay;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setOutBizNo(String outBizNo) {
            this.outBizNo = outBizNo;
        }

        public String getOutBizNo() {
            return this.outBizNo;
        }

            public void setYzUid(Long yzUid) {
            this.yzUid = yzUid;
        }

        public Long getYzUid() {
            return this.yzUid;
        }

            public void setFromSource(Long fromSource) {
            this.fromSource = fromSource;
        }

        public Long getFromSource() {
            return this.fromSource;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setCancelReason(String cancelReason) {
            this.cancelReason = cancelReason;
        }

        public String getCancelReason() {
            return this.cancelReason;
        }

            public void setPayStatus(Long payStatus) {
            this.payStatus = payStatus;
        }

        public Long getPayStatus() {
            return this.payStatus;
        }

            public void setReservationStatus(Long reservationStatus) {
            this.reservationStatus = reservationStatus;
        }

        public Long getReservationStatus() {
            return this.reservationStatus;
        }

            public void setBilledAt(Long billedAt) {
            this.billedAt = billedAt;
        }

        public Long getBilledAt() {
            return this.billedAt;
        }

            public void setArrangeAt(Long arrangeAt) {
            this.arrangeAt = arrangeAt;
        }

        public Long getArrangeAt() {
            return this.arrangeAt;
        }

            public void setOutBizState(Long outBizState) {
            this.outBizState = outBizState;
        }

        public Long getOutBizState() {
            return this.outBizState;
        }

            public void setDeptId(Long deptId) {
            this.deptId = deptId;
        }

        public Long getDeptId() {
            return this.deptId;
        }

            public void setCancelAt(Long cancelAt) {
            this.cancelAt = cancelAt;
        }

        public Long getCancelAt() {
            return this.cancelAt;
        }

            public void setReservationItems(mei_reservation_item[] reservationItems) {
            this.reservationItems = reservationItems;
        }

        public mei_reservation_item[] getReservationItems() {
            return this.reservationItems;
        }

        }

    public static class MeiPaginator {
            @JsonProperty(value = "total_count")
        /**
        * 总记录数
        */
        private Long totalCount;
            @JsonProperty(value = "page")
        /**
        * 第几页
        */
        private Long page;
            @JsonProperty(value = "page_size")
        /**
        * 每页显示的记录数
        */
        private Long pageSize;
    
            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
        }

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

        }


}