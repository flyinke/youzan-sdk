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

public class YouzanMeiPromoterCustomerListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 绑定的顾客列表
     */
    private MeiPromoterCustomer[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiPromoterCustomer[] items) {
        this.items = items;
    }

    public MeiPromoterCustomer[] getItems() {
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

    public static class MeiPromoterCustomer {
            @JsonProperty(value = "order_count")
        /**
        * 下单次数
        */
        private Long orderCount;
            @JsonProperty(value = "is_member")
        /**
        * 是否是会员
0 不是
1 是
        */
        private Long isMember;
            @JsonProperty(value = "bind_mode")
        /**
        * 绑定方式
0:浏览绑定
1:会员激活绑定
2:下单绑定 
3:手动添加
        */
        private Long bindMode;
            @JsonProperty(value = "created_at")
        /**
        * 创建时间
        */
        private Long createdAt;
            @JsonProperty(value = "memo_name")
        /**
        * 备注名
        */
        private String memoName;
            @JsonProperty(value = "pid")
        /**
        * 绑定的推广员的id
        */
        private String pid;
            @JsonProperty(value = "member_name")
        /**
        * 会员名
        */
        private String memberName;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "avatar_url")
        /**
        * 头像链接
        */
        private String avatarUrl;
            @JsonProperty(value = "updated_at")
        /**
        * 更新时间
        */
        private Long updatedAt;
            @JsonProperty(value = "nickname")
        /**
        * 昵称
        */
        private String nickname;
            @JsonProperty(value = "name")
        /**
        * 姓名
        */
        private String name;
            @JsonProperty(value = "total_profit")
        /**
        * 总共贡献的收益
        */
        private Long totalProfit;
            @JsonProperty(value = "dept_id")
        /**
        * 分店id
        */
        private Long deptId;
            @JsonProperty(value = "customer_id")
        /**
        * 顾客id
        */
        private Long customerId;
            @JsonProperty(value = "status")
        /**
        * 状态
0 未生效
1 已生效
        */
        private Long status;
    
            public void setOrderCount(Long orderCount) {
            this.orderCount = orderCount;
        }

        public Long getOrderCount() {
            return this.orderCount;
        }

            public void setIsMember(Long isMember) {
            this.isMember = isMember;
        }

        public Long getIsMember() {
            return this.isMember;
        }

            public void setBindMode(Long bindMode) {
            this.bindMode = bindMode;
        }

        public Long getBindMode() {
            return this.bindMode;
        }

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setMemoName(String memoName) {
            this.memoName = memoName;
        }

        public String getMemoName() {
            return this.memoName;
        }

            public void setPid(String pid) {
            this.pid = pid;
        }

        public String getPid() {
            return this.pid;
        }

            public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public String getMemberName() {
            return this.memberName;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getAvatarUrl() {
            return this.avatarUrl;
        }

            public void setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Long getUpdatedAt() {
            return this.updatedAt;
        }

            public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getNickname() {
            return this.nickname;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setTotalProfit(Long totalProfit) {
            this.totalProfit = totalProfit;
        }

        public Long getTotalProfit() {
            return this.totalProfit;
        }

            public void setDeptId(Long deptId) {
            this.deptId = deptId;
        }

        public Long getDeptId() {
            return this.deptId;
        }

            public void setCustomerId(Long customerId) {
            this.customerId = customerId;
        }

        public Long getCustomerId() {
            return this.customerId;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

        }


}