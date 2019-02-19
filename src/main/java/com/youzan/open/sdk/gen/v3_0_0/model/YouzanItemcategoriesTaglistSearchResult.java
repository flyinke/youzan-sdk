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

public class YouzanItemcategoriesTaglistSearchResult implements APIResult {

    @JsonProperty(value = "tags")
    /**
     * 商品自定义标签列表
     */
    private GoodsTag[] tags;
    @JsonProperty(value = "total_results")
    /**
     * 结果总数
     */
    private Long totalResults;

    public void setTags(GoodsTag[] tags) {
        this.tags = tags;
    }

    public GoodsTag[] getTags() {
        return this.tags;
    }
    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public static class GoodsTag {
            @JsonProperty(value = "id")
        /**
        * 商品标签的ID
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 商品标签的名称
        */
        private String name;
            @JsonProperty(value = "type")
        /**
        * 商品标签类型，0 自定义，1 未分类，2 最新，3 最热，4 隐藏
        */
        private Long type;
            @JsonProperty(value = "created")
        /**
        * 商品标签创建时间
        */
        private String created;
            @JsonProperty(value = "item_num")
        /**
        * 商品标签内的商品数量
        */
        private Long itemNum;
            @JsonProperty(value = "tag_url")
        /**
        * 商品标签的展示的URL地址
        */
        private String tagUrl;
            @JsonProperty(value = "share_url")
        /**
        * 分享出去的商品标签展示地址
        */
        private String shareUrl;
            @JsonProperty(value = "desc")
        /**
        * 商品标签描述
        */
        private String desc;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
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

            public void setCreated(String created) {
            this.created = created;
        }

        public String getCreated() {
            return this.created;
        }

            public void setItemNum(Long itemNum) {
            this.itemNum = itemNum;
        }

        public Long getItemNum() {
            return this.itemNum;
        }

            public void setTagUrl(String tagUrl) {
            this.tagUrl = tagUrl;
        }

        public String getTagUrl() {
            return this.tagUrl;
        }

            public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
        }

        public String getShareUrl() {
            return this.shareUrl;
        }

            public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }

        }


}