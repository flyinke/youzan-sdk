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

public class YouzanRetailProductCategoriesSearchResult implements APIResult {

    @JsonProperty(value = "category_vo")
    /**
     * 分类详情列表
     */
    private CategoryVO[] categoryVo;

    public void setCategoryVo(CategoryVO[] categoryVo) {
        this.categoryVo = categoryVo;
    }

    public CategoryVO[] getCategoryVo() {
        return this.categoryVo;
    }

    public static class CategoryVO {
            @JsonProperty(value = "id")
        /**
        * 唯一性序列号
        */
        private Long id;
            @JsonProperty(value = "kdt_id")
        /**
        * 关联的商户id
        */
        private Long kdtId;
            @JsonProperty(value = "parent_id")
        /**
        * 父级节点的id
        */
        private Long parentId;
            @JsonProperty(value = "name")
        /**
        * 类目名称
        */
        private String name;
            @JsonProperty(value = "type")
        /**
        * 类型：1 根节点 ，2树枝节点 3叶子节点
        */
        private Long type;
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

            public void setParentId(Long parentId) {
            this.parentId = parentId;
        }

        public Long getParentId() {
            return this.parentId;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
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


}