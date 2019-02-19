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

public class YouzanMeiStockWarehouseListResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 仓库列表
     */
    private MeiWareHouseInfo[] response;

    public void setResponse(MeiWareHouseInfo[] response) {
        this.response = response;
    }

    public MeiWareHouseInfo[] getResponse() {
        return this.response;
    }

    public static class MeiWareHouseInfo {
            @JsonProperty(value = "ware_house_id")
        /**
        * 仓库id
        */
        private Long wareHouseId;
            @JsonProperty(value = "ware_house_name")
        /**
        * 仓库名称
        */
        private String wareHouseName;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "dept_id")
        /**
        * 分店ID
        */
        private Long deptId;
            @JsonProperty(value = "adrress")
        /**
        * 地址
        */
        private String adrress;
    
            public void setWareHouseId(Long wareHouseId) {
            this.wareHouseId = wareHouseId;
        }

        public Long getWareHouseId() {
            return this.wareHouseId;
        }

            public void setWareHouseName(String wareHouseName) {
            this.wareHouseName = wareHouseName;
        }

        public String getWareHouseName() {
            return this.wareHouseName;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setDeptId(Long deptId) {
            this.deptId = deptId;
        }

        public Long getDeptId() {
            return this.deptId;
        }

            public void setAdrress(String adrress) {
            this.adrress = adrress;
        }

        public String getAdrress() {
            return this.adrress;
        }

        }


}