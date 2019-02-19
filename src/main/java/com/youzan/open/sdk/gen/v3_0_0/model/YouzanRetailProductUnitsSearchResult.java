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

public class YouzanRetailProductUnitsSearchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private Paginator paginator;
    @JsonProperty(value = "items")
    /**
     * 单位实体信息
     */
    private UnitDictVO[] items;

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }
    public void setItems(UnitDictVO[] items) {
        this.items = items;
    }

    public UnitDictVO[] getItems() {
        return this.items;
    }

    public static class UnitDictVO {
            @JsonProperty(value = "id")
        /**
        * 单位id
        */
        private Long id;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "name")
        /**
        * 单位名称
        */
        private String name;
            @JsonProperty(value = "status")
        /**
        * 单位是否启用状态。
1表示启用，0表示禁用
        */
        private Long status;
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

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
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


}