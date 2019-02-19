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

public class YouzanScrmCardUpdateParams implements APIParams, FileParams  {

    /**
     * 编辑会员卡所需的会员卡信息
     */
    private String cardUpdate;

    public void setCardUpdate(String cardUpdate) {
        this.cardUpdate = cardUpdate;
    }

    public String getCardUpdate() {
        return this.cardUpdate;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (cardUpdate != null) {
            params.put("card_update", cardUpdate);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}