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

public class YouzanMeiPromoterCreateParams implements APIParams, FileParams  {

    /**
     * 美业token
     */
    private String mToken;
    /**
     * 要创建的推广员列表
     */
    private String promoters;

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setPromoters(String promoters) {
        this.promoters = promoters;
    }

    public String getPromoters() {
        return this.promoters;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (promoters != null) {
            params.put("promoters", promoters);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }

    public static class MeiPromoter {
            private String phone;
            private String nickname;
            private Long pid;
            private Long profit;
    
            public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return this.phone;
        }
            public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getNickname() {
            return this.nickname;
        }
            public void setPid(Long pid) {
            this.pid = pid;
        }

        public Long getPid() {
            return this.pid;
        }
            public void setProfit(Long profit) {
            this.profit = profit;
        }

        public Long getProfit() {
            return this.profit;
        }
        }

}