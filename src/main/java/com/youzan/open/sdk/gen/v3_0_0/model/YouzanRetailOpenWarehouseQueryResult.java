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

public class YouzanRetailOpenWarehouseQueryResult implements APIResult {

    @JsonProperty(value = "warehouses")
    /**
     * 仓库列表
     */
    private warehouses[] warehouses;
    @JsonProperty(value = "paginator")
    /**
     * 分页信息	
     */
    private Paginator[] paginator;

    public void setWarehouses(warehouses[] warehouses) {
        this.warehouses = warehouses;
    }

    public warehouses[] getWarehouses() {
        return this.warehouses;
    }
    public void setPaginator(Paginator[] paginator) {
        this.paginator = paginator;
    }

    public Paginator[] getPaginator() {
        return this.paginator;
    }

    public static class warehouses {
            @JsonProperty(value = "warehouses_id")
        /**
        * 仓库唯一ID
        */
        private String warehousesId;
            @JsonProperty(value = "address")
        /**
        * 仓库地址
        */
        private String address;
            @JsonProperty(value = "contact_name")
        /**
        * 联系人姓名
        */
        private String contactName;
            @JsonProperty(value = "contact_phone")
        /**
        * 联系人电话
        */
        private String contactPhone;
            @JsonProperty(value = "lat")
        /**
        * 维度
        */
        private String lat;
            @JsonProperty(value = "lng")
        /**
        * 经度
        */
        private String lng;
            @JsonProperty(value = "name")
        /**
        * 仓库名称
        */
        private String name;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "status")
        /**
        * 仓库状态 0：启用 1：停用
        */
        private Long status;
            @JsonProperty(value = "type")
        /**
        * 仓库类型 1：独立仓 2：门店仓
        */
        private Long type;
            @JsonProperty(value = "warehouse_code")
        /**
        * 仓库编码
        */
        private String warehouseCode;
    
            public void setWarehousesId(String warehousesId) {
            this.warehousesId = warehousesId;
        }

        public String getWarehousesId() {
            return this.warehousesId;
        }

            public void setAddress(String address) {
            this.address = address;
        }

        public String getAddress() {
            return this.address;
        }

            public void setContactName(String contactName) {
            this.contactName = contactName;
        }

        public String getContactName() {
            return this.contactName;
        }

            public void setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
        }

        public String getContactPhone() {
            return this.contactPhone;
        }

            public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLat() {
            return this.lat;
        }

            public void setLng(String lng) {
            this.lng = lng;
        }

        public String getLng() {
            return this.lng;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
        }

        public String getWarehouseCode() {
            return this.warehouseCode;
        }

        }

    public static class Paginator {
            @JsonProperty(value = "page")
        /**
        * 当前页码
        */
        private Long page;
            @JsonProperty(value = "pageSize")
        /**
        * 每页数量
        */
        private Long pageSize;
            @JsonProperty(value = "totalCount")
        /**
        * 总数
        */
        private Long totalCount;
    
            public void setPage(Long page) {
            this.page = page;
        }

        public Long getPage() {
            return this.page;
        }

            public void setPageSize(Long pageSize) {
            this.pageSize = pageSize;
        }

        public Long getPageSize() {
            return this.pageSize;
        }

            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
        }

        }


}