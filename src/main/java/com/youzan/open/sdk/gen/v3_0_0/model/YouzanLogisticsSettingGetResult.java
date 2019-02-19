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

public class YouzanLogisticsSettingGetResult implements APIResult {

    @JsonProperty(value = "kdtId")
    /**
     * 店铺Id
     */
    private Long kdtId;
    @JsonProperty(value = "offlineId")
    /**
     * 门店id
     */
    private Long offlineId;
    @JsonProperty(value = "isLocalInTime")
    /**
     * 是否支持同城定时达
     */
    private Boolean isLocalInTime;
    @JsonProperty(value = "isExpress")
    /**
     * 是否支持快递
     */
    private Boolean isExpress;
    @JsonProperty(value = "isSelf")
    /**
     * 是否支持自提
     */
    private Boolean isSelf;
    @JsonProperty(value = "isLocal")
    /**
     * 是否支持同城
     */
    private Boolean isLocal;

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setOfflineId(Long offlineId) {
        this.offlineId = offlineId;
    }

    public Long getOfflineId() {
        return this.offlineId;
    }
    public void setIsLocalInTime(Boolean isLocalInTime) {
        this.isLocalInTime = isLocalInTime;
    }

    public Boolean getIsLocalInTime() {
        return this.isLocalInTime;
    }
    public void setIsExpress(Boolean isExpress) {
        this.isExpress = isExpress;
    }

    public Boolean getIsExpress() {
        return this.isExpress;
    }
    public void setIsSelf(Boolean isSelf) {
        this.isSelf = isSelf;
    }

    public Boolean getIsSelf() {
        return this.isSelf;
    }
    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    public Boolean getIsLocal() {
        return this.isLocal;
    }


}