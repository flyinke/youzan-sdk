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

public class YouzanMeiCustomerFileinfoGetResult implements APIResult {

    @JsonProperty(value = "file_infos")
    /**
     * 会员档案值
     */
    private MeiCustomerFileInfo[] fileInfos;

    public void setFileInfos(MeiCustomerFileInfo[] fileInfos) {
        this.fileInfos = fileInfos;
    }

    public MeiCustomerFileInfo[] getFileInfos() {
        return this.fileInfos;
    }

    public static class MeiCustomerFileInfoItem {
            @JsonProperty(value = "key")
        /**
        * 条目的key值
        */
        private String key;
            @JsonProperty(value = "value")
        /**
        * 条目的具体值
        */
        private String value;
    
            public void setKey(String key) {
            this.key = key;
        }

        public String getKey() {
            return this.key;
        }

            public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        }

    public static class MeiCustomerFileInfo {
            @JsonProperty(value = "name")
        /**
        * 档案名称
        */
        private String name;
            @JsonProperty(value = "id")
        /**
        * 档案id
        */
        private Long id;
            @JsonProperty(value = "type")
        /**
        * 档案类型。
1 文本 
2 日期
3 图片
        */
        private Long type;
            @JsonProperty(value = "value")
        /**
        * 档案值，单值档案有此条目
        */
        private String value;
            @JsonProperty(value = "value_list")
        /**
        * 会员档案条目
        */
        private MeiCustomerFileInfoItem[] valueList;
    
            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

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

            public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

            public void setValueList(MeiCustomerFileInfoItem[] valueList) {
            this.valueList = valueList;
        }

        public MeiCustomerFileInfoItem[] getValueList() {
            return this.valueList;
        }

        }


}