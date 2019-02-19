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

public class YouzanMeiCustomerFiletemplateGetResult implements APIResult {

    @JsonProperty(value = "kdt_id")
    /**
     * 店铺Id
     */
    private Long kdtId;
    @JsonProperty(value = "secret_file_template")
    /**
     * 私密档案模板
     */
    private MeiMemberFileTemplateItem[] secretFileTemplate;
    @JsonProperty(value = "base_file_template")
    /**
     * 基础档案模板
     */
    private MeiMemberFileTemplateItem[] baseFileTemplate;

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setSecretFileTemplate(MeiMemberFileTemplateItem[] secretFileTemplate) {
        this.secretFileTemplate = secretFileTemplate;
    }

    public MeiMemberFileTemplateItem[] getSecretFileTemplate() {
        return this.secretFileTemplate;
    }
    public void setBaseFileTemplate(MeiMemberFileTemplateItem[] baseFileTemplate) {
        this.baseFileTemplate = baseFileTemplate;
    }

    public MeiMemberFileTemplateItem[] getBaseFileTemplate() {
        return this.baseFileTemplate;
    }

    public static class MeiMemberFileTemplateItem {
            @JsonProperty(value = "id")
        /**
        * 档案条目id
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 档案条目名称
        */
        private String name;
            @JsonProperty(value = "type")
        /**
        * 档案条目类型
1 文本
2 日期
3 图片
        */
        private Long type;
    
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

        }


}