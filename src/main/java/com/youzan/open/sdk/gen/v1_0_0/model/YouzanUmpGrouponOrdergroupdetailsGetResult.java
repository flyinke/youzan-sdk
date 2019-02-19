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

public class YouzanUmpGrouponOrdergroupdetailsGetResult implements APIResult {

    @JsonProperty(value = "order_group_detail")
    /**
     * 订单拼团详情
     */
    private OrderGroupDetail[] orderGroupDetail;

    public void setOrderGroupDetail(OrderGroupDetail[] orderGroupDetail) {
        this.orderGroupDetail = orderGroupDetail;
    }

    public OrderGroupDetail[] getOrderGroupDetail() {
        return this.orderGroupDetail;
    }

    public static class GroupOnGroupJoin {
            @JsonProperty(value = "id")
        /**
        * 唯一标示
        */
        private Long id;
            @JsonProperty(value = "tid")
        /**
        * 订单号
        */
        private String tid;
            @JsonProperty(value = "sid")
        /**
        * 店铺ID
        */
        private Long sid;
            @JsonProperty(value = "activity_id")
        /**
        * 拼团活动ID
        */
        private Long activityId;
            @JsonProperty(value = "group_id")
        /**
        * 成团活动ID
        */
        private Long groupId;
            @JsonProperty(value = "fans_id")
        /**
        * 粉丝ID
        */
        private Long fansId;
            @JsonProperty(value = "buyer_id")
        /**
        * 买家ID
        */
        private Long buyerId;
            @JsonProperty(value = "refund_state")
        /**
        * 退款状态；0：没有退款、1：退款成功、2：退款失败
        */
        private Long refundState;
            @JsonProperty(value = "refund_reason")
        /**
        * 退款原因
        */
        private String refundReason;
            @JsonProperty(value = "refund_fail_msg")
        /**
        * 退款失败原因
        */
        private String refundFailMsg;
            @JsonProperty(value = "pay_state")
        /**
        * 支付状态；0：未支付；1：支付成功
        */
        private Long payState;
            @JsonProperty(value = "pay_time")
        /**
        * 支付成功时间
        */
        private Date payTime;
            @JsonProperty(value = "item_id")
        /**
        * 商品编码
        */
        private Long itemId;
            @JsonProperty(value = "sku_id")
        /**
        * SKU编码
        */
        private Long skuId;
            @JsonProperty(value = "discount_fee")
        /**
        * 拼团优惠金额，单位：分
        */
        private Long discountFee;
            @JsonProperty(value = "head_extra_discount_fee")
        /**
        * 团长额外优惠金额，单位：分
        */
        private Long headExtraDiscountFee;
            @JsonProperty(value = "is_agency_receive")
        /**
        * 是否代收
        */
        private Boolean isAgencyReceive;
            @JsonProperty(value = "created_time")
        /**
        * 创建时间
        */
        private Date createdTime;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setTid(String tid) {
            this.tid = tid;
        }

        public String getTid() {
            return this.tid;
        }

            public void setSid(Long sid) {
            this.sid = sid;
        }

        public Long getSid() {
            return this.sid;
        }

            public void setActivityId(Long activityId) {
            this.activityId = activityId;
        }

        public Long getActivityId() {
            return this.activityId;
        }

            public void setGroupId(Long groupId) {
            this.groupId = groupId;
        }

        public Long getGroupId() {
            return this.groupId;
        }

            public void setFansId(Long fansId) {
            this.fansId = fansId;
        }

        public Long getFansId() {
            return this.fansId;
        }

            public void setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
        }

        public Long getBuyerId() {
            return this.buyerId;
        }

            public void setRefundState(Long refundState) {
            this.refundState = refundState;
        }

        public Long getRefundState() {
            return this.refundState;
        }

            public void setRefundReason(String refundReason) {
            this.refundReason = refundReason;
        }

        public String getRefundReason() {
            return this.refundReason;
        }

            public void setRefundFailMsg(String refundFailMsg) {
            this.refundFailMsg = refundFailMsg;
        }

        public String getRefundFailMsg() {
            return this.refundFailMsg;
        }

            public void setPayState(Long payState) {
            this.payState = payState;
        }

        public Long getPayState() {
            return this.payState;
        }

            public void setPayTime(Date payTime) {
            this.payTime = payTime;
        }

        public Date getPayTime() {
            return this.payTime;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setDiscountFee(Long discountFee) {
            this.discountFee = discountFee;
        }

        public Long getDiscountFee() {
            return this.discountFee;
        }

            public void setHeadExtraDiscountFee(Long headExtraDiscountFee) {
            this.headExtraDiscountFee = headExtraDiscountFee;
        }

        public Long getHeadExtraDiscountFee() {
            return this.headExtraDiscountFee;
        }

            public void setIsAgencyReceive(Boolean isAgencyReceive) {
            this.isAgencyReceive = isAgencyReceive;
        }

        public Boolean getIsAgencyReceive() {
            return this.isAgencyReceive;
        }

            public void setCreatedTime(Date createdTime) {
            this.createdTime = createdTime;
        }

        public Date getCreatedTime() {
            return this.createdTime;
        }

        }

    public static class OrderGroupDetail {
            @JsonProperty(value = "group")
        /**
        * 拼团团信息
        */
        private GroupOnGroup group;
            @JsonProperty(value = "group_join")
        /**
        * 参团订单信息
        */
        private GroupOnGroupJoin groupJoin;
    
            public void setGroup(GroupOnGroup group) {
            this.group = group;
        }

        public GroupOnGroup getGroup() {
            return this.group;
        }

            public void setGroupJoin(GroupOnGroupJoin groupJoin) {
            this.groupJoin = groupJoin;
        }

        public GroupOnGroupJoin getGroupJoin() {
            return this.groupJoin;
        }

        }

    public static class GroupOnGroup {
            @JsonProperty(value = "id")
        /**
        * 团ID，唯一标示
        */
        private Long id;
            @JsonProperty(value = "group_no")
        /**
        * 团编号，唯一
        */
        private String groupNo;
            @JsonProperty(value = "tid")
        /**
        * 成团订单编号，即团长订单号
        */
        private String tid;
            @JsonProperty(value = "sid")
        /**
        * 店铺ID
        */
        private Long sid;
            @JsonProperty(value = "activity_id")
        /**
        * 商家创建的拼团活动ID
        */
        private Long activityId;
            @JsonProperty(value = "state")
        /**
        * 拼团状态；0：进行中、1：成功、2：失败
        */
        private Long state;
            @JsonProperty(value = "alias")
        /**
        * 成团别名，即邀请码
        */
        private String alias;
            @JsonProperty(value = "join_num")
        /**
        * 已参团的人数
        */
        private Long joinNum;
            @JsonProperty(value = "start_time")
        /**
        * 成团开始时间戳
        */
        private Date startTime;
            @JsonProperty(value = "receive_state")
        /**
        * 团代收状态。0：不代收；1：可选代收；2：强制代收
        */
        private Long receiveState;
            @JsonProperty(value = "remain_join_num")
        /**
        * 拼团成功剩余的人数
        */
        private Long remainJoinNum;
            @JsonProperty(value = "created_time")
        /**
        * 创建时间
        */
        private Date createdTime;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setGroupNo(String groupNo) {
            this.groupNo = groupNo;
        }

        public String getGroupNo() {
            return this.groupNo;
        }

            public void setTid(String tid) {
            this.tid = tid;
        }

        public String getTid() {
            return this.tid;
        }

            public void setSid(Long sid) {
            this.sid = sid;
        }

        public Long getSid() {
            return this.sid;
        }

            public void setActivityId(Long activityId) {
            this.activityId = activityId;
        }

        public Long getActivityId() {
            return this.activityId;
        }

            public void setState(Long state) {
            this.state = state;
        }

        public Long getState() {
            return this.state;
        }

            public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getAlias() {
            return this.alias;
        }

            public void setJoinNum(Long joinNum) {
            this.joinNum = joinNum;
        }

        public Long getJoinNum() {
            return this.joinNum;
        }

            public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public Date getStartTime() {
            return this.startTime;
        }

            public void setReceiveState(Long receiveState) {
            this.receiveState = receiveState;
        }

        public Long getReceiveState() {
            return this.receiveState;
        }

            public void setRemainJoinNum(Long remainJoinNum) {
            this.remainJoinNum = remainJoinNum;
        }

        public Long getRemainJoinNum() {
            return this.remainJoinNum;
        }

            public void setCreatedTime(Date createdTime) {
            this.createdTime = createdTime;
        }

        public Date getCreatedTime() {
            return this.createdTime;
        }

        }


}