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

public class YouzanUsersWeixinFollowerGetsParams implements APIParams, FileParams  {

    /**
     * 微信粉丝用户ID，多个用逗号分隔。调用时，参数 weixin_openids 和 fans_ids 选其一即可。采取拼接批量获取，一般限制都是50
     */
    private String fansIds;
    /**
     * 需要返回的微信粉丝对象字段，如nick,avatar等。可选值：CrmWeixinFans微信粉丝结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
     */
    private String fields;
    /**
     * 微信粉丝用户的openid，多个用逗号分隔
     */
    private String weixinOpenids;

    public void setFansIds(String fansIds) {
        this.fansIds = fansIds;
    }

    public String getFansIds() {
        return this.fansIds;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setWeixinOpenids(String weixinOpenids) {
        this.weixinOpenids = weixinOpenids;
    }

    public String getWeixinOpenids() {
        return this.weixinOpenids;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (fansIds != null) {
            params.put("fans_ids", fansIds);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        if (weixinOpenids != null) {
            params.put("weixin_openids", weixinOpenids);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}