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

public class YouzanMultistoreGoodsDeliveryUpdateParams implements APIParams, FileParams  {

    /**
     * 网点id
     */
    private Long offlineId;
    /**
     * 商品配送方式,json字符串,结构如：{"335438058":{"express":1,"local_delivery":0,"self_fetch":0}} 其中 express 为快递；local_delivery 为同城送；self_fetch 为到店自提。1为开启0为关闭。
     */
    private String settings;

    public void setOfflineId(Long offlineId) {
        this.offlineId = offlineId;
    }

    public Long getOfflineId() {
        return this.offlineId;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    public String getSettings() {
        return this.settings;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (offlineId != null) {
            params.put("offline_id", offlineId);
        }
        if (settings != null) {
            params.put("settings", settings);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}