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

public class YouzanShopGetResult implements APIResult {

    @JsonProperty(value = "name")
    /**
     * 店铺名字
     */
    private String name;
    @JsonProperty(value = "logo")
    /**
     * 店铺LOGO
     */
    private String logo;
    @JsonProperty(value = "intro")
    /**
     * 店铺简介
     */
    private String intro;
    @JsonProperty(value = "id")
    /**
     * 店铺id
     */
    private Long id;

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
    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIntro() {
        return this.intro;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


}