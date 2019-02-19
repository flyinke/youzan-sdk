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

public class YouzanMeiCustomerSettingUpdateParams implements APIParams, FileParams  {

    /**
     * 美业token
     */
    private String mToken;
    /**
     * 具体设置内容。
当type=1时，key值为dept，value：
0 可以查看店铺中所有会员
1 可以不能查看其它分店会员
2 仅可以查看本店铺创建的会员
     */
    private String settings;
    /**
     * 配置类型。
1 会员查看权限配置
     */
    private Long type;

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    public String getSettings() {
        return this.settings;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (settings != null) {
            params.put("settings", settings);
        }
        if (type != null) {
            params.put("type", type);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}