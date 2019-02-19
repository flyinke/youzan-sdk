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

public class YouzanItemTemplateListSearchResult implements APIResult {

    @JsonProperty(value = "temps")
    /**
     * 商品详情模板
     */
    private ItemDetailTempOpenModel temps;

    public void setTemps(ItemDetailTempOpenModel temps) {
        this.temps = temps;
    }

    public ItemDetailTempOpenModel getTemps() {
        return this.temps;
    }

    public static class ItemDetailTempOpenModel {
            @JsonProperty(value = "detailTempId")
        /**
        * 模板Id
        */
        private Long detailTempId;
            @JsonProperty(value = "title")
        /**
        * 标题
        */
        private String title;
            @JsonProperty(value = "alias")
        /**
        * 短地址
        */
        private String alias;
            @JsonProperty(value = "components")
        /**
        * 
        */
        private String components;
            @JsonProperty(value = "createdTime")
        /**
        * 创建时间
        */
        private String createdTime;
    
            public void setDetailTempId(Long detailTempId) {
            this.detailTempId = detailTempId;
        }

        public Long getDetailTempId() {
            return this.detailTempId;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getAlias() {
            return this.alias;
        }

            public void setComponents(String components) {
            this.components = components;
        }

        public String getComponents() {
            return this.components;
        }

            public void setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
        }

        public String getCreatedTime() {
            return this.createdTime;
        }

        }


}