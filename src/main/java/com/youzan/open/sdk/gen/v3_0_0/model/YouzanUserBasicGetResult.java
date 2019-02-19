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

public class YouzanUserBasicGetResult implements APIResult {

    @JsonProperty(value = "user_id")
    /**
     * 用户ID
     */
    private Long userId;
    @JsonProperty(value = "nick_name")
    /**
     * 昵称
     */
    private String nickName;
    @JsonProperty(value = "avatar")
    /**
     * 图片地址
     */
    private String avatar;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return this.userId;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return this.nickName;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return this.avatar;
    }


}