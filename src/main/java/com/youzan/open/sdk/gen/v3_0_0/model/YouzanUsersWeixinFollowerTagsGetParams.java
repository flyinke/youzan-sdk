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

public class YouzanUsersWeixinFollowerTagsGetParams implements APIParams, FileParams  {

    /**
     * 微信粉丝用户ID。调用时，参数 weixin_openid 和 fans_id 选其一即可
     */
    private String fansId;
    /**
     * 微信粉丝用户的openid
     */
    private String weixinOpenid;

    public void setFansId(String fansId) {
        this.fansId = fansId;
    }

    public String getFansId() {
        return this.fansId;
    }

    public void setWeixinOpenid(String weixinOpenid) {
        this.weixinOpenid = weixinOpenid;
    }

    public String getWeixinOpenid() {
        return this.weixinOpenid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (fansId != null) {
            params.put("fans_id", fansId);
        }
        if (weixinOpenid != null) {
            params.put("weixin_openid", weixinOpenid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}