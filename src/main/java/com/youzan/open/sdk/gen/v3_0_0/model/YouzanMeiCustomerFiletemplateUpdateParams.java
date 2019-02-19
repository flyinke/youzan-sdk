package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanMeiCustomerFiletemplateUpdateParams implements APIParams, FileParams  {

    /**
     * 基础档案信息，不传入的条目将会被删除
     */
    private String baseFileTemplate;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 私密档案信息，不传入的条目将会被删除
     */
    private String secretFileTemplate;

    public void setBaseFileTemplate(String baseFileTemplate) {
        this.baseFileTemplate = baseFileTemplate;
    }

    public String getBaseFileTemplate() {
        return this.baseFileTemplate;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setSecretFileTemplate(String secretFileTemplate) {
        this.secretFileTemplate = secretFileTemplate;
    }

    public String getSecretFileTemplate() {
        return this.secretFileTemplate;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (baseFileTemplate != null) {
            params.put("base_file_template", baseFileTemplate);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (secretFileTemplate != null) {
            params.put("secret_file_template", secretFileTemplate);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }

    public static class MeiMemberFileTemplateItem {
            private Long id;
            private String name;
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