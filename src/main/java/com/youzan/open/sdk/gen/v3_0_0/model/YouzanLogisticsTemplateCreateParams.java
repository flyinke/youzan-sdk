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

public class YouzanLogisticsTemplateCreateParams implements APIParams, FileParams  {

    /**
     * 模板名称
     */
    private String name;
    /**
     * 付费类型：1，买家付费
     */
    private Long payType;
    /**
     * 运费规则 json格式，转换成 List<ValuationRule>
     */
    private String valuationRules;
    /**
     * 计算类型：1，按件，2，按重量
     */
    private Long valuationType;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPayType(Long payType) {
        this.payType = payType;
    }

    public Long getPayType() {
        return this.payType;
    }

    public void setValuationRules(String valuationRules) {
        this.valuationRules = valuationRules;
    }

    public String getValuationRules() {
        return this.valuationRules;
    }

    public void setValuationType(Long valuationType) {
        this.valuationType = valuationType;
    }

    public Long getValuationType() {
        return this.valuationType;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (name != null) {
            params.put("name", name);
        }
        if (payType != null) {
            params.put("pay_type", payType);
        }
        if (valuationRules != null) {
            params.put("valuation_rules", valuationRules);
        }
        if (valuationType != null) {
            params.put("valuation_type", valuationType);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}