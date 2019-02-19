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

public class YouzanItemcategoriesTagsGetResult implements APIResult {

    @JsonProperty(value = "tags")
    /**
     * 分组返回信息
     */
    private ItemGroupOpenModel[] tags;

    public void setTags(ItemGroupOpenModel[] tags) {
        this.tags = tags;
    }

    public ItemGroupOpenModel[] getTags() {
        return this.tags;
    }

    public static class ItemGroupOpenModel {
            @JsonProperty(value = "id")
        /**
        * id
        */
        private Long id;
            @JsonProperty(value = "type")
        /**
        * 分组类型
        */
        private Long type;
            @JsonProperty(value = "alias")
        /**
        * 别名
        */
        private String alias;
            @JsonProperty(value = "tag_url")
        /**
        * 分组链接
        */
        private String tagUrl;
            @JsonProperty(value = "share_url")
        /**
        * 分享链接
        */
        private String shareUrl;
            @JsonProperty(value = "item_num")
        /**
        * 商品数量
        */
        private Long itemNum;
            @JsonProperty(value = "created")
        /**
        * 创建时间
        */
        private String created;
            @JsonProperty(value = "desc")
        /**
        * 描述
        */
        private String desc;
            @JsonProperty(value = "name")
        /**
        * 分组名称
        */
        private String name;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getAlias() {
            return this.alias;
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

            public void setItemNum(Long itemNum) {
            this.itemNum = itemNum;
        }

        public Long getItemNum() {
            return this.itemNum;
        }

            public void setCreated(String created) {
            this.created = created;
        }

        public String getCreated() {
            return this.created;
        }

            public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        }


}