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

public class YouzanMeiStockGetResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 库存信息列表
     */
    private MeiInventoryInfoDTO[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiInventoryInfoDTO[] items) {
        this.items = items;
    }

    public MeiInventoryInfoDTO[] getItems() {
        return this.items;
    }

    public static class MeiPaginator {
            @JsonProperty(value = "total_count")
        /**
        * 总记录数
        */
        private Long totalCount;
            @JsonProperty(value = "page")
        /**
        * 第几页
        */
        private Long page;
            @JsonProperty(value = "page_size")
        /**
        * 每页显示的记录数
        */
        private Long pageSize;
    
            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
        }

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

        }

    public static class MeiInventoryInfoDTO {
            @JsonProperty(value = "available_delivery_quantity")
        /**
        * 可用库存
        */
        private Long availableDeliveryQuantity;
            @JsonProperty(value = "item_id")
        /**
        * 商品ID
        */
        private Long itemId;
            @JsonProperty(value = "physical_quantity")
        /**
        * 物理库存
        */
        private Long physicalQuantity;
            @JsonProperty(value = "ware_house_name")
        /**
        * 仓库名称
        */
        private String wareHouseName;
            @JsonProperty(value = "ware_house_id")
        /**
        * 仓库ID
        */
        private Long wareHouseId;
            @JsonProperty(value = "sku_id")
        /**
        * 规格ID
        */
        private Long skuId;
            @JsonProperty(value = "dept_id")
        /**
        * 店铺ID
        */
        private Long deptId;
            @JsonProperty(value = "to_delivery_quantity")
        /**
        * 锁定库存
        */
        private Long toDeliveryQuantity;
            @JsonProperty(value = "negative_quantity")
        /**
        * 负库存
        */
        private Long negativeQuantity;
    
            public void setAvailableDeliveryQuantity(Long availableDeliveryQuantity) {
            this.availableDeliveryQuantity = availableDeliveryQuantity;
        }

        public Long getAvailableDeliveryQuantity() {
            return this.availableDeliveryQuantity;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setPhysicalQuantity(Long physicalQuantity) {
            this.physicalQuantity = physicalQuantity;
        }

        public Long getPhysicalQuantity() {
            return this.physicalQuantity;
        }

            public void setWareHouseName(String wareHouseName) {
            this.wareHouseName = wareHouseName;
        }

        public String getWareHouseName() {
            return this.wareHouseName;
        }

            public void setWareHouseId(Long wareHouseId) {
            this.wareHouseId = wareHouseId;
        }

        public Long getWareHouseId() {
            return this.wareHouseId;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setDeptId(Long deptId) {
            this.deptId = deptId;
        }

        public Long getDeptId() {
            return this.deptId;
        }

            public void setToDeliveryQuantity(Long toDeliveryQuantity) {
            this.toDeliveryQuantity = toDeliveryQuantity;
        }

        public Long getToDeliveryQuantity() {
            return this.toDeliveryQuantity;
        }

            public void setNegativeQuantity(Long negativeQuantity) {
            this.negativeQuantity = negativeQuantity;
        }

        public Long getNegativeQuantity() {
            return this.negativeQuantity;
        }

        }


}