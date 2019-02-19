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

public class YouzanShopBasicGetResult implements APIResult {

    @JsonProperty(value = "sid")
    /**
     * 店铺ID
     */
    private Long sid;
    @JsonProperty(value = "name")
    /**
     * 店铺名称
     */
    private String name;
    @JsonProperty(value = "logo")
    /**
     * 店铺LOGO
     */
    private String logo;
    @JsonProperty(value = "url")
    /**
     * 店铺地址
     */
    private String url;
    @JsonProperty(value = "physical_url")
    /**
     * 门店地址
     */
    private String physicalUrl;
    @JsonProperty(value = "cert_type")
    /**
     * 认证类型（0 未认证 2 企业认证 3/4 个人认证 6/7/8/9 官方认证）
     */
    private Long certType;

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getSid() {
        return this.sid;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return this.logo;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
    public void setPhysicalUrl(String physicalUrl) {
        this.physicalUrl = physicalUrl;
    }

    public String getPhysicalUrl() {
        return this.physicalUrl;
    }
    public void setCertType(Long certType) {
        this.certType = certType;
    }

    public Long getCertType() {
        return this.certType;
    }


}