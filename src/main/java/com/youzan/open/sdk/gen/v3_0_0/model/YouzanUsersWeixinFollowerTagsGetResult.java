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

public class YouzanUsersWeixinFollowerTagsGetResult implements APIResult {

    @JsonProperty(value = "tags")
    /**
     * 该粉丝的标签集合
     */
    private CrmFansTag[] tags;

    public void setTags(CrmFansTag[] tags) {
        this.tags = tags;
    }

    public CrmFansTag[] getTags() {
        return this.tags;
    }

    public static class CrmFansTag {
            @JsonProperty(value = "tag_id")
        /**
        * 标签ID
        */
        private Long tagId;
            @JsonProperty(value = "tag_name")
        /**
        * 标签名
        */
        private String tagName;
    
            public void setTagId(Long tagId) {
            this.tagId = tagId;
        }

        public Long getTagId() {
            return this.tagId;
        }

            public void setTagName(String tagName) {
            this.tagName = tagName;
        }

        public String getTagName() {
            return this.tagName;
        }

        }


}