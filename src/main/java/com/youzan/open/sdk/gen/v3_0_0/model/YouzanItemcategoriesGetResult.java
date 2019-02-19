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

public class YouzanItemcategoriesGetResult implements APIResult {

    @JsonProperty(value = "categories")
    /**
     * 商品自定义标签列表
     */
    private Categories[] categories;

    public void setCategories(Categories[] categories) {
        this.categories = categories;
    }

    public Categories[] getCategories() {
        return this.categories;
    }

    public static class Categories {
            @JsonProperty(value = "cid")
        /**
        * 节点
        */
        private Long cid;
            @JsonProperty(value = "parent_cid")
        /**
        * 父节点
        */
        private Long parentCid;
            @JsonProperty(value = "name")
        /**
        * 名称
        */
        private String name;
            @JsonProperty(value = "is_parent")
        /**
        * 是否为父节点
        */
        private Boolean isParent;
            @JsonProperty(value = "sub_categories")
        /**
        * 分类
        */
        private SubCategories[] subCategories;
    
            public void setCid(Long cid) {
            this.cid = cid;
        }

        public Long getCid() {
            return this.cid;
        }

            public void setParentCid(Long parentCid) {
            this.parentCid = parentCid;
        }

        public Long getParentCid() {
            return this.parentCid;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setIsParent(Boolean isParent) {
            this.isParent = isParent;
        }

        public Boolean getIsParent() {
            return this.isParent;
        }

            public void setSubCategories(SubCategories[] subCategories) {
            this.subCategories = subCategories;
        }

        public SubCategories[] getSubCategories() {
            return this.subCategories;
        }

        }

    public static class SubCategories {
            @JsonProperty(value = "cid")
        /**
        * 节点id
        */
        private Long cid;
            @JsonProperty(value = "parent_cid")
        /**
        * 父节点id
        */
        private Long parentCid;
            @JsonProperty(value = "name")
        /**
        * 名称
        */
        private String name;
            @JsonProperty(value = "is_parent")
        /**
        * 是否为父节点
        */
        private Boolean isParent;
            @JsonProperty(value = "sub_categories")
        /**
        * 子节点
        */
        private SubCategories[] subCategories;
    
            public void setCid(Long cid) {
            this.cid = cid;
        }

        public Long getCid() {
            return this.cid;
        }

            public void setParentCid(Long parentCid) {
            this.parentCid = parentCid;
        }

        public Long getParentCid() {
            return this.parentCid;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setIsParent(Boolean isParent) {
            this.isParent = isParent;
        }

        public Boolean getIsParent() {
            return this.isParent;
        }

            public void setSubCategories(SubCategories[] subCategories) {
            this.subCategories = subCategories;
        }

        public SubCategories[] getSubCategories() {
            return this.subCategories;
        }

        }


}