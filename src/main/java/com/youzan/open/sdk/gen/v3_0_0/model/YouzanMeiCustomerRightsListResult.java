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

public class YouzanMeiCustomerRightsListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 权益列表
     */
    private MeiMemberRightsResp[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiMemberRightsResp[] items) {
        this.items = items;
    }

    public MeiMemberRightsResp[] getItems() {
        return this.items;
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

    public static class MeiMemberRightsResp {
            @JsonProperty(value = "right_name")
        /**
        * 权益名称
        */
        private String rightName;
            @JsonProperty(value = "source_name")
        /**
        * 来源名称
        */
        private String sourceName;
            @JsonProperty(value = "total_used")
        /**
        * 总使用次数
        */
        private Long totalUsed;
            @JsonProperty(value = "item_img")
        /**
        * 商品图片url
        */
        private String itemImg;
            @JsonProperty(value = "right_id")
        /**
        * 权益ID
        */
        private Long rightId;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "dept_id")
        /**
        * 分店ID
        */
        private Long deptId;
            @JsonProperty(value = "yz_uid")
        /**
        * 会员ID
        */
        private Long yzUid;
            @JsonProperty(value = "item_id")
        /**
        * 商品ID
        */
        private Long itemId;
            @JsonProperty(value = "item_alias")
        /**
        * 商品别名
        */
        private String itemAlias;
            @JsonProperty(value = "item_price")
        /**
        * 商品价格
        */
        private Long itemPrice;
            @JsonProperty(value = "item_type")
        /**
        * 商品类型
        */
        private Long itemType;
            @JsonProperty(value = "right_type")
        /**
        * 权益类型
        */
        private Long rightType;
            @JsonProperty(value = "source_id")
        /**
        * 来源ID 比如卡ID
        */
        private Long sourceId;
            @JsonProperty(value = "source_type")
        /**
        * 来源类型 1 卡 2 会员等级 3 直接导入 4 开单
        */
        private Long sourceType;
            @JsonProperty(value = "begin_time")
        /**
        * 权益开始时间
        */
        private Long beginTime;
            @JsonProperty(value = "end_time")
        /**
        * 权益结束时间
        */
        private Long endTime;
            @JsonProperty(value = "right_value")
        /**
        * 权益值
        */
        private Long rightValue;
            @JsonProperty(value = "right_remain_value")
        /**
        * 权益剩余值
        */
        private Long rightRemainValue;
            @JsonProperty(value = "gift")
        /**
        * 是否是赠送 1是 0否
        */
        private Long gift;
            @JsonProperty(value = "status")
        /**
        * 状态： -1:删除；0：无效；1：有效
        */
        private Long status;
            @JsonProperty(value = "created_at")
        /**
        * 权益创建时间
        */
        private Long createdAt;
            @JsonProperty(value = "update_at")
        /**
        * 权益更新时间
        */
        private Long updateAt;
            @JsonProperty(value = "active_at")
        /**
        * 权益激活时间
        */
        private Long activeAt;
            @JsonProperty(value = "average_price")
        /**
        * 单均价格
        */
        private Long averagePrice;
    
            public void setRightName(String rightName) {
            this.rightName = rightName;
        }

        public String getRightName() {
            return this.rightName;
        }

            public void setSourceName(String sourceName) {
            this.sourceName = sourceName;
        }

        public String getSourceName() {
            return this.sourceName;
        }

            public void setTotalUsed(Long totalUsed) {
            this.totalUsed = totalUsed;
        }

        public Long getTotalUsed() {
            return this.totalUsed;
        }

            public void setItemImg(String itemImg) {
            this.itemImg = itemImg;
        }

        public String getItemImg() {
            return this.itemImg;
        }

            public void setRightId(Long rightId) {
            this.rightId = rightId;
        }

        public Long getRightId() {
            return this.rightId;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setDeptId(Long deptId) {
            this.deptId = deptId;
        }

        public Long getDeptId() {
            return this.deptId;
        }

            public void setYzUid(Long yzUid) {
            this.yzUid = yzUid;
        }

        public Long getYzUid() {
            return this.yzUid;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setItemAlias(String itemAlias) {
            this.itemAlias = itemAlias;
        }

        public String getItemAlias() {
            return this.itemAlias;
        }

            public void setItemPrice(Long itemPrice) {
            this.itemPrice = itemPrice;
        }

        public Long getItemPrice() {
            return this.itemPrice;
        }

            public void setItemType(Long itemType) {
            this.itemType = itemType;
        }

        public Long getItemType() {
            return this.itemType;
        }

            public void setRightType(Long rightType) {
            this.rightType = rightType;
        }

        public Long getRightType() {
            return this.rightType;
        }

            public void setSourceId(Long sourceId) {
            this.sourceId = sourceId;
        }

        public Long getSourceId() {
            return this.sourceId;
        }

            public void setSourceType(Long sourceType) {
            this.sourceType = sourceType;
        }

        public Long getSourceType() {
            return this.sourceType;
        }

            public void setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
        }

        public Long getBeginTime() {
            return this.beginTime;
        }

            public void setEndTime(Long endTime) {
            this.endTime = endTime;
        }

        public Long getEndTime() {
            return this.endTime;
        }

            public void setRightValue(Long rightValue) {
            this.rightValue = rightValue;
        }

        public Long getRightValue() {
            return this.rightValue;
        }

            public void setRightRemainValue(Long rightRemainValue) {
            this.rightRemainValue = rightRemainValue;
        }

        public Long getRightRemainValue() {
            return this.rightRemainValue;
        }

            public void setGift(Long gift) {
            this.gift = gift;
        }

        public Long getGift() {
            return this.gift;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setUpdateAt(Long updateAt) {
            this.updateAt = updateAt;
        }

        public Long getUpdateAt() {
            return this.updateAt;
        }

            public void setActiveAt(Long activeAt) {
            this.activeAt = activeAt;
        }

        public Long getActiveAt() {
            return this.activeAt;
        }

            public void setAveragePrice(Long averagePrice) {
            this.averagePrice = averagePrice;
        }

        public Long getAveragePrice() {
            return this.averagePrice;
        }

        }


}