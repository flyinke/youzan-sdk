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

public class YouzanScrmCardCreateParams implements APIParams, FileParams  {

    /**
     * 创建会员卡所需的会员卡信息
     */
    private String cardCreate;

    public void setCardCreate(String cardCreate) {
        this.cardCreate = cardCreate;
    }

    public String getCardCreate() {
        return this.cardCreate;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (cardCreate != null) {
            params.put("card_create", cardCreate);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}