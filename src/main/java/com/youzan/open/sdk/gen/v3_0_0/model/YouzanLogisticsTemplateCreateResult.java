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

public class YouzanLogisticsTemplateCreateResult implements APIResult {

    @JsonProperty(value = "templateId")
    /**
     * 运费模板id
     */
    private Long templateId;

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getTemplateId() {
        return this.templateId;
    }


}