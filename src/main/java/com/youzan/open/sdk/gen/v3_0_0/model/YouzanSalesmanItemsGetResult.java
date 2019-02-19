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

public class YouzanSalesmanItemsGetResult implements APIResult {

    @JsonProperty(value = "items")
    /**
     * 商品设置信息
     */
    private SalesmanTradeGoods[] items;

    public void setItems(SalesmanTradeGoods[] items) {
        this.items = items;
    }

    public SalesmanTradeGoods[] getItems() {
        return this.items;
    }

    public static class SalesmanTradeGoods {
            @JsonProperty(value = "is_join")
        /**
        * 商品是否参与推广0:不参与1参与
        */
        private Long isJoin;
            @JsonProperty(value = "num_iid")
        /**
        * 商品ID
        */
        private String numIid;
            @JsonProperty(value = "ii_rate")
        /**
        * 商品邀请奖励提成比例(%)
        */
        private String iiRate;
            @JsonProperty(value = "i_rate")
        /**
        * 商品提成比例(%)
        */
        private String iRate;
    
            public void setIsJoin(Long isJoin) {
            this.isJoin = isJoin;
        }

        public Long getIsJoin() {
            return this.isJoin;
        }

            public void setNumIid(String numIid) {
            this.numIid = numIid;
        }

        public String getNumIid() {
            return this.numIid;
        }

            public void setIiRate(String iiRate) {
            this.iiRate = iiRate;
        }

        public String getIiRate() {
            return this.iiRate;
        }

            public void setIRate(String iRate) {
            this.iRate = iRate;
        }

        public String getIRate() {
            return this.iRate;
        }

        }


}