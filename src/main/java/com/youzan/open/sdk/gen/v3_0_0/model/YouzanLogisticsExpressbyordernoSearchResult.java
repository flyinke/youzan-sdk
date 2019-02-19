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

public class YouzanLogisticsExpressbyordernoSearchResult implements APIResult {

    @JsonProperty(value = "orderExpressList")
    /**
     * 物流详情列表
     */
    private LogisticsGoodsOrderExpressModel[] orderExpressList;

    public void setOrderExpressList(LogisticsGoodsOrderExpressModel[] orderExpressList) {
        this.orderExpressList = orderExpressList;
    }

    public LogisticsGoodsOrderExpressModel[] getOrderExpressList() {
        return this.orderExpressList;
    }

    public static class LogisticsGoodsOrderExpressModel {
            @JsonProperty(value = "id")
        /**
        * id
        */
        private Long id;
            @JsonProperty(value = "nu")
        /**
        * 物流单号
        */
        private String nu;
            @JsonProperty(value = "com")
        /**
        * 物流公司编号
        */
        private String com;
            @JsonProperty(value = "message")
        /**
        * 无意义，请忽略
        */
        private String message;
            @JsonProperty(value = "ep_condition")
        /**
        * 无意义，请忽略
        */
        private String epCondition;
            @JsonProperty(value = "status")
        /**
        * 查询结果状态
        */
        private String status;
            @JsonProperty(value = "state")
        /**
        * 0：在途 1：揽件 2：疑难 3：签收 4：退签 5：派件 6：退回
        */
        private Long state;
            @JsonProperty(value = "data")
        /**
        * 投递的数据
        */
        private String data;
            @JsonProperty(value = "created_time")
        /**
        * 每条跟踪信息的时间
        */
        private Long createdTime;
            @JsonProperty(value = "express_id")
        /**
        * 物流id
        */
        private Long expressId;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setNu(String nu) {
            this.nu = nu;
        }

        public String getNu() {
            return this.nu;
        }

            public void setCom(String com) {
            this.com = com;
        }

        public String getCom() {
            return this.com;
        }

            public void setMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }

            public void setEpCondition(String epCondition) {
            this.epCondition = epCondition;
        }

        public String getEpCondition() {
            return this.epCondition;
        }

            public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }

            public void setState(Long state) {
            this.state = state;
        }

        public Long getState() {
            return this.state;
        }

            public void setData(String data) {
            this.data = data;
        }

        public String getData() {
            return this.data;
        }

            public void setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
        }

        public Long getCreatedTime() {
            return this.createdTime;
        }

            public void setExpressId(Long expressId) {
            this.expressId = expressId;
        }

        public Long getExpressId() {
            return this.expressId;
        }

        }


}