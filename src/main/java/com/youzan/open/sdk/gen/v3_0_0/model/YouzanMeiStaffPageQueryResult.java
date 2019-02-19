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

public class YouzanMeiStaffPageQueryResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private mei_paginator paginator;
    @JsonProperty(value = "items")
    /**
     * 员工信息
     */
    private mei_staff_info items;

    public void setPaginator(mei_paginator paginator) {
        this.paginator = paginator;
    }

    public mei_paginator getPaginator() {
        return this.paginator;
    }
    public void setItems(mei_staff_info items) {
        this.items = items;
    }

    public mei_staff_info getItems() {
        return this.items;
    }

    public static class mei_role {
            @JsonProperty(value = "role_id")
        /**
        * 角色id
        */
        private Long roleId;
            @JsonProperty(value = "role_name")
        /**
        * 角色名称
        */
        private String roleName;
    
            public void setRoleId(Long roleId) {
            this.roleId = roleId;
        }

        public Long getRoleId() {
            return this.roleId;
        }

            public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public String getRoleName() {
            return this.roleName;
        }

        }

    public static class mei_paginator {
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

    public static class mei_staff_info {
            @JsonProperty(value = "roles")
        /**
        * 角色信息
        */
        private mei_role[] roles;
            @JsonProperty(value = "mobile")
        /**
        * 联系电话
        */
        private String mobile;
            @JsonProperty(value = "dept_name")
        /**
        * 分店名称
        */
        private String deptName;
            @JsonProperty(value = "remark")
        /**
        * 备注信息
        */
        private String remark;
            @JsonProperty(value = "real_name")
        /**
        * 员工姓名
        */
        private String realName;
            @JsonProperty(value = "yz_uid")
        /**
        * 账号id
        */
        private Long yzUid;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "dept_id")
        /**
        * 分店id
        */
        private Long deptId;
            @JsonProperty(value = "created_at")
        /**
        * 创建时间，是从1970年开始的毫秒值
        */
        private Long createdAt;
            @JsonProperty(value = "updated_at")
        /**
        * 更新时间，是从1970年开始的毫秒值
        */
        private Long updatedAt;
            @JsonProperty(value = "account")
        /**
        * 员工账号
        */
        private String account;
            @JsonProperty(value = "status")
        /**
        * 员工状态
        */
        private Long status;
    
            public void setRoles(mei_role[] roles) {
            this.roles = roles;
        }

        public mei_role[] getRoles() {
            return this.roles;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

            public void setDeptName(String deptName) {
            this.deptName = deptName;
        }

        public String getDeptName() {
            return this.deptName;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setRealName(String realName) {
            this.realName = realName;
        }

        public String getRealName() {
            return this.realName;
        }

            public void setYzUid(Long yzUid) {
            this.yzUid = yzUid;
        }

        public Long getYzUid() {
            return this.yzUid;
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

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Long getUpdatedAt() {
            return this.updatedAt;
        }

            public void setAccount(String account) {
            this.account = account;
        }

        public String getAccount() {
            return this.account;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

        }


}