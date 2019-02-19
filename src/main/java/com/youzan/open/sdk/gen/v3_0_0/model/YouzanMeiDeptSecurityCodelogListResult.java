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

public class YouzanMeiDeptSecurityCodelogListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 操作记录列表
     */
    private MeiSecurityCodeLogItem[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiSecurityCodeLogItem[] items) {
        this.items = items;
    }

    public MeiSecurityCodeLogItem[] getItems() {
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

    public static class MeiSecurityCodeLogItem {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "code_id")
        /**
        * 安全码id
        */
        private Long codeId;
            @JsonProperty(value = "yz_uid")
        /**
        * 操作者账号id
        */
        private Long yzUid;
            @JsonProperty(value = "user_name")
        /**
        * 操作者姓名
        */
        private String userName;
            @JsonProperty(value = "dept_name")
        /**
        * 操作者所在店铺
        */
        private String deptName;
            @JsonProperty(value = "role")
        /**
        * 操作者角色
        */
        private String role;
            @JsonProperty(value = "updated_at")
        /**
        * 操作时间
        */
        private Long updatedAt;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setCodeId(Long codeId) {
            this.codeId = codeId;
        }

        public Long getCodeId() {
            return this.codeId;
        }

            public void setYzUid(Long yzUid) {
            this.yzUid = yzUid;
        }

        public Long getYzUid() {
            return this.yzUid;
        }

            public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return this.userName;
        }

            public void setDeptName(String deptName) {
            this.deptName = deptName;
        }

        public String getDeptName() {
            return this.deptName;
        }

            public void setRole(String role) {
            this.role = role;
        }

        public String getRole() {
            return this.role;
        }

            public void setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        }


}