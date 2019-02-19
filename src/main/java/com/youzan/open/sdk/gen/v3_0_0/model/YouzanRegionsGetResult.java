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

public class YouzanRegionsGetResult implements APIResult {

    @JsonProperty(value = "regions")
    /**
     * 区域地名列表信息
     */
    private CommonRegion[] regions;

    public void setRegions(CommonRegion[] regions) {
        this.regions = regions;
    }

    public CommonRegion[] getRegions() {
        return this.regions;
    }

    public static class CommonRegion {
            @JsonProperty(value = "parent_id")
        /**
        * 上级区域ID
        */
        private Long parentId;
            @JsonProperty(value = "id")
        /**
        * 区域ID
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 区域全称
        */
        private String name;
    
            public void setParentId(Long parentId) {
            this.parentId = parentId;
        }

        public Long getParentId() {
            return this.parentId;
        }

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

        }


}