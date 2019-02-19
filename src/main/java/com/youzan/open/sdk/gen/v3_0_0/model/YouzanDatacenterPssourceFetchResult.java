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

public class YouzanDatacenterPssourceFetchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 渠道列表分页信息
     */
    private Paginator paginator;
    @JsonProperty(value = "items")
    /**
     * 渠道详细信息
     */
    private YunPsSourceModel[] items;

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }
    public void setItems(YunPsSourceModel[] items) {
        this.items = items;
    }

    public YunPsSourceModel[] getItems() {
        return this.items;
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

    public static class YunPsSourceModel {
            @JsonProperty(value = "id")
        /**
        * 渠道Id
        */
        private Long id;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "source_name")
        /**
        * 渠道名称
        */
        private String sourceName;
            @JsonProperty(value = "origin")
        /**
        * 渠道来源
        */
        private String origin;
            @JsonProperty(value = "default_tag")
        /**
        * 0:默认渠道;1:自定义渠道
        */
        private Long defaultTag;
            @JsonProperty(value = "create_at")
        /**
        * 创建时间
        */
        private String createAt;
    
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

            public void setSourceName(String sourceName) {
            this.sourceName = sourceName;
        }

        public String getSourceName() {
            return this.sourceName;
        }

            public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getOrigin() {
            return this.origin;
        }

            public void setDefaultTag(Long defaultTag) {
            this.defaultTag = defaultTag;
        }

        public Long getDefaultTag() {
            return this.defaultTag;
        }

            public void setCreateAt(String createAt) {
            this.createAt = createAt;
        }

        public String getCreateAt() {
            return this.createAt;
        }

        }


}