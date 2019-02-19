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

public class YouzanRetailOpenCategoryQueryResult implements APIResult {

    @JsonProperty(value = "categorys")
    /**
     * 类目信息
     */
    private Category[] categorys;
    @JsonProperty(value = "paginator")
    /**
     * 分页信息	
     */
    private Paginator paginator;

    public void setCategorys(Category[] categorys) {
        this.categorys = categorys;
    }

    public Category[] getCategorys() {
        return this.categorys;
    }
    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }

    public static class Category {
            @JsonProperty(value = "name")
        /**
        * 类目名称
        */
        private String name;
            @JsonProperty(value = "category_id")
        /**
        * 类目id
        */
        private Long categoryId;
            @JsonProperty(value = "parent_id")
        /**
        * 父级分类id
        */
        private Long parentId;
    
            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
        }

        public Long getCategoryId() {
            return this.categoryId;
        }

            public void setParentId(Long parentId) {
            this.parentId = parentId;
        }

        public Long getParentId() {
            return this.parentId;
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