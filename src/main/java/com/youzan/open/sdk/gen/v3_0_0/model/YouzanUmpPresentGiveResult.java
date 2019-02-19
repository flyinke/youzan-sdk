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

public class YouzanUmpPresentGiveResult implements APIResult {

    @JsonProperty(value = "is_success")
    /**
     * 是否领取成功 
     */
    private Boolean isSuccess;
    @JsonProperty(value = "present_id")
    /**
     * 赠品ID
     */
    private Long presentId;
    @JsonProperty(value = "present_name")
    /**
     * 赠品名
     */
    private String presentName;
    @JsonProperty(value = "receive_address")
    /**
     * 赠品领取链接
     */
    private String receiveAddress;

    public void setIsSuccess (Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess () {
        return this.isSuccess;
    }
    public void setPresentId(Long presentId) {
        this.presentId = presentId;
    }

    public Long getPresentId() {
        return this.presentId;
    }
    public void setPresentName(String presentName) {
        this.presentName = presentName;
    }

    public String getPresentName() {
        return this.presentName;
    }
    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getReceiveAddress() {
        return this.receiveAddress;
    }


}