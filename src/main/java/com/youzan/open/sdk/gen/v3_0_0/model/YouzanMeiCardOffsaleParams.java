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

public class YouzanMeiCardOffsaleParams implements APIParams, FileParams  {

    /**
     * 会员卡标识
     */
    private String cardAlias;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 要上架的门店列表
     */
    private String selectDeptIds;

    public void setCardAlias(String cardAlias) {
        this.cardAlias = cardAlias;
    }

    public String getCardAlias() {
        return this.cardAlias;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setSelectDeptIds(String selectDeptIds) {
        this.selectDeptIds = selectDeptIds;
    }

    public String getSelectDeptIds() {
        return this.selectDeptIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (cardAlias != null) {
            params.put("card_alias", cardAlias);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (selectDeptIds != null) {
            params.put("select_dept_ids", selectDeptIds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}