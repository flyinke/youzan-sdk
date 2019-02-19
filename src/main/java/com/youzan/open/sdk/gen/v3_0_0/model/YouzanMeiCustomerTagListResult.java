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

public class YouzanMeiCustomerTagListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 标签信息列表
     */
    private MeiMemberTagResp[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiMemberTagResp[] items) {
        this.items = items;
    }

    public MeiMemberTagResp[] getItems() {
        return this.items;
    }

    public static class MeiMemberTagResp {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "updated_at")
        /**
        * 上次更新时间
        */
        private Long updatedAt;
            @JsonProperty(value = "name")
        /**
        * 标签名字
        */
        private String name;
            @JsonProperty(value = "tag_id")
        /**
        * 标签ID
        */
        private Long tagId;
            @JsonProperty(value = "status")
        /**
        * 标签状态 0:删除 1正常
        */
        private Long status;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Long getUpdatedAt() {
            return this.updatedAt;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setTagId(Long tagId) {
            this.tagId = tagId;
        }

        public Long getTagId() {
            return this.tagId;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
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