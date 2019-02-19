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

public class YouzanDatacenterPspagesourceFetchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 推广链接数据分页信息
     */
    private Paginator paginator;
    @JsonProperty(value = "items")
    /**
     * 推广链接数据详细信息
     */
    private YunPsPageSourceModel[] items;

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }
    public void setItems(YunPsPageSourceModel[] items) {
        this.items = items;
    }

    public YunPsPageSourceModel[] getItems() {
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

    public static class YunPsPageSourceModel {
            @JsonProperty(value = "id")
        /**
        * 监控链接ID
        */
        private Long id;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "dcps")
        /**
        * 追踪ID
        */
        private String dcps;
            @JsonProperty(value = "ps_name")
        /**
        * 监控链接名称
        */
        private String psName;
            @JsonProperty(value = "source_id")
        /**
        * 渠道ID
        */
        private Long sourceId;
            @JsonProperty(value = "page_id")
        /**
        * 微页面ID
        */
        private Long pageId;
            @JsonProperty(value = "page_name")
        /**
        * 微页面名称
        */
        private String pageName;
            @JsonProperty(value = "page_type")
        /**
        * 微页面类型
        */
        private String pageType;
            @JsonProperty(value = "page_alias")
        /**
        * 微页面别名
        */
        private String pageAlias;
            @JsonProperty(value = "ps_location")
        /**
        * 推广位置
        */
        private String psLocation;
            @JsonProperty(value = "ps_cost")
        /**
        * 推广花费
        */
        private Long psCost;
            @JsonProperty(value = "tag_id")
        /**
        * 标签ID
        */
        private Long tagId;
            @JsonProperty(value = "start_date")
        /**
        * 推广开始时间
        */
        private String startDate;
            @JsonProperty(value = "end_date")
        /**
        * 推广结束时间
        */
        private String endDate;
            @JsonProperty(value = "ps_note")
        /**
        * 备注
        */
        private String psNote;
            @JsonProperty(value = "ps_status")
        /**
        * 推广状态1:推广中;2:推广结束
        */
        private Long psStatus;
            @JsonProperty(value = "fans_tag_name")
        /**
        * 粉丝标签名称
        */
        private String fansTagName;
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

            public void setDcps(String dcps) {
            this.dcps = dcps;
        }

        public String getDcps() {
            return this.dcps;
        }

            public void setPsName(String psName) {
            this.psName = psName;
        }

        public String getPsName() {
            return this.psName;
        }

            public void setSourceId(Long sourceId) {
            this.sourceId = sourceId;
        }

        public Long getSourceId() {
            return this.sourceId;
        }

            public void setPageId(Long pageId) {
            this.pageId = pageId;
        }

        public Long getPageId() {
            return this.pageId;
        }

            public void setPageName(String pageName) {
            this.pageName = pageName;
        }

        public String getPageName() {
            return this.pageName;
        }

            public void setPageType(String pageType) {
            this.pageType = pageType;
        }

        public String getPageType() {
            return this.pageType;
        }

            public void setPageAlias(String pageAlias) {
            this.pageAlias = pageAlias;
        }

        public String getPageAlias() {
            return this.pageAlias;
        }

            public void setPsLocation(String psLocation) {
            this.psLocation = psLocation;
        }

        public String getPsLocation() {
            return this.psLocation;
        }

            public void setPsCost(Long psCost) {
            this.psCost = psCost;
        }

        public Long getPsCost() {
            return this.psCost;
        }

            public void setTagId(Long tagId) {
            this.tagId = tagId;
        }

        public Long getTagId() {
            return this.tagId;
        }

            public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getStartDate() {
            return this.startDate;
        }

            public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public String getEndDate() {
            return this.endDate;
        }

            public void setPsNote(String psNote) {
            this.psNote = psNote;
        }

        public String getPsNote() {
            return this.psNote;
        }

            public void setPsStatus(Long psStatus) {
            this.psStatus = psStatus;
        }

        public Long getPsStatus() {
            return this.psStatus;
        }

            public void setFansTagName(String fansTagName) {
            this.fansTagName = fansTagName;
        }

        public String getFansTagName() {
            return this.fansTagName;
        }

            public void setCreateAt(String createAt) {
            this.createAt = createAt;
        }

        public String getCreateAt() {
            return this.createAt;
        }

        }


}