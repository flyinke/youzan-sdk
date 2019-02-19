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

public class YouzanMeiReservationTechnicianListResult implements APIResult {

    @JsonProperty(value = "resources")
    /**
     * 技师信息
     */
    private MeiResource[] resources;

    public void setResources(MeiResource[] resources) {
        this.resources = resources;
    }

    public MeiResource[] getResources() {
        return this.resources;
    }

    public static class MeiResource {
            @JsonProperty(value = "name")
        /**
        * 资源名称
        */
        private String name;
            @JsonProperty(value = "resource_type")
        /**
        * 资源类型
1 技师（目前只有这一种类型）
        */
        private Long resourceType;
            @JsonProperty(value = "resource_id")
        /**
        * 资源id
        */
        private Long resourceId;
            @JsonProperty(value = "tags")
        /**
        * 资源标签，可以用来表示分组
        */
        private String[] tags;
    
            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setResourceType(Long resourceType) {
            this.resourceType = resourceType;
        }

        public Long getResourceType() {
            return this.resourceType;
        }

            public void setResourceId(Long resourceId) {
            this.resourceId = resourceId;
        }

        public Long getResourceId() {
            return this.resourceId;
        }

            public void setTags(String[] tags) {
            this.tags = tags;
        }

        public String[] getTags() {
            return this.tags;
        }

        }


}