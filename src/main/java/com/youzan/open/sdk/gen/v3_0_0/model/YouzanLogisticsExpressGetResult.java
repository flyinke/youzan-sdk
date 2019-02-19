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

public class YouzanLogisticsExpressGetResult implements APIResult {

    @JsonProperty(value = "allExpress")
    /**
     * 所有物流公司地址
     */
    private LogisticsExpressOpenApiModel[] allExpress;

    public void setAllExpress(LogisticsExpressOpenApiModel[] allExpress) {
        this.allExpress = allExpress;
    }

    public LogisticsExpressOpenApiModel[] getAllExpress() {
        return this.allExpress;
    }

    public static class LogisticsExpressOpenApiModel {
            @JsonProperty(value = "id")
        /**
        * 物流公司编号
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 物流公司名称
        */
        private String name;
            @JsonProperty(value = "display")
        /**
        * 是否显示 0显示 1不显示
        */
        private Long display;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setDisplay(Long display) {
            this.display = display;
        }

        public Long getDisplay() {
            return this.display;
        }

        }


}