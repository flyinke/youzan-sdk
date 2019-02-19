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

public class YouzanLogisticsTemplateSearchResult implements APIResult {

    @JsonProperty(value = "object")
    /**
     * 店铺全部物流模板
     */
    private DeliveryTemplateModelPaginatorResult object;

    public void setObject(DeliveryTemplateModelPaginatorResult object) {
        this.object = object;
    }

    public DeliveryTemplateModelPaginatorResult getObject() {
        return this.object;
    }

    public static class ValuationRuleModel {
            @JsonProperty(value = "regions")
        /**
        * 区域id列表
        */
        private Number[] regions;
            @JsonProperty(value = "firstAmount")
        /**
        * 首件个数
        */
        private Long firstAmount;
            @JsonProperty(value = "firstFee")
        /**
        * 首件费用
        */
        private Long firstFee;
            @JsonProperty(value = "additionalAmount")
        /**
        * 续件个数
        */
        private Long additionalAmount;
            @JsonProperty(value = "additionalFee")
        /**
        * 续件费用
        */
        private Long additionalFee;
    
            public void setRegions(Number[] regions) {
            this.regions = regions;
        }

        public Number[] getRegions() {
            return this.regions;
        }

            public void setFirstAmount(Long firstAmount) {
            this.firstAmount = firstAmount;
        }

        public Long getFirstAmount() {
            return this.firstAmount;
        }

            public void setFirstFee(Long firstFee) {
            this.firstFee = firstFee;
        }

        public Long getFirstFee() {
            return this.firstFee;
        }

            public void setAdditionalAmount(Long additionalAmount) {
            this.additionalAmount = additionalAmount;
        }

        public Long getAdditionalAmount() {
            return this.additionalAmount;
        }

            public void setAdditionalFee(Long additionalFee) {
            this.additionalFee = additionalFee;
        }

        public Long getAdditionalFee() {
            return this.additionalFee;
        }

        }

    public static class CountryOpenApiModel {
            @JsonProperty(value = "countryId")
        /**
        * 区县id
        */
        private Long countryId;
            @JsonProperty(value = "ruleId")
        /**
        * 规则id
        */
        private Long ruleId;
    
            public void setCountryId(Long countryId) {
            this.countryId = countryId;
        }

        public Long getCountryId() {
            return this.countryId;
        }

            public void setRuleId(Long ruleId) {
            this.ruleId = ruleId;
        }

        public Long getRuleId() {
            return this.ruleId;
        }

        }

    public static class LogisticsDeliveryTemplateModel {
            @JsonProperty(value = "id")
        /**
        * 运费模板id
        */
        private Long id;
            @JsonProperty(value = "kdtId")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "name")
        /**
        * 运费模板名称
        */
        private String name;
            @JsonProperty(value = "payType")
        /**
        * 付费类型，1 买家付费 2 卖家付费
        */
        private Long payType;
            @JsonProperty(value = "valuationType")
        /**
        * 计算类型，1 按件 2 按重量 3 按体积
        */
        private Long valuationType;
            @JsonProperty(value = "useCount")
        /**
        * 使用次数
        */
        private Long useCount;
            @JsonProperty(value = "isCopyOf")
        /**
        * 复制于哪个模板
        */
        private Long isCopyOf;
            @JsonProperty(value = "isFreeDelivery")
        /**
        * 是否包邮 0 否 1 全部 2 部分
        */
        private Long isFreeDelivery;
            @JsonProperty(value = "valuationRules")
        /**
        * 运费规则
        */
        private ValuationRuleModel[] valuationRules;
            @JsonProperty(value = "openRegionRules")
        /**
        * 地区规则
        */
        private RegionRuleOpenApiModel[] openRegionRules;
            @JsonProperty(value = "createdAt")
        /**
        * 创建时间
        */
        private Long createdAt;
            @JsonProperty(value = "updatedAt")
        /**
        * 更新时间
        */
        private Long updatedAt;
            @JsonProperty(value = "deletedAt")
        /**
        * 删除时间
        */
        private Long deletedAt;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setPayType(Long payType) {
            this.payType = payType;
        }

        public Long getPayType() {
            return this.payType;
        }

            public void setValuationType(Long valuationType) {
            this.valuationType = valuationType;
        }

        public Long getValuationType() {
            return this.valuationType;
        }

            public void setUseCount(Long useCount) {
            this.useCount = useCount;
        }

        public Long getUseCount() {
            return this.useCount;
        }

            public void setIsCopyOf(Long isCopyOf) {
            this.isCopyOf = isCopyOf;
        }

        public Long getIsCopyOf() {
            return this.isCopyOf;
        }

            public void setIsFreeDelivery(Long isFreeDelivery) {
            this.isFreeDelivery = isFreeDelivery;
        }

        public Long getIsFreeDelivery() {
            return this.isFreeDelivery;
        }

            public void setValuationRules(ValuationRuleModel[] valuationRules) {
            this.valuationRules = valuationRules;
        }

        public ValuationRuleModel[] getValuationRules() {
            return this.valuationRules;
        }

            public void setOpenRegionRules(RegionRuleOpenApiModel[] openRegionRules) {
            this.openRegionRules = openRegionRules;
        }

        public RegionRuleOpenApiModel[] getOpenRegionRules() {
            return this.openRegionRules;
        }

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Long getUpdatedAt() {
            return this.updatedAt;
        }

            public void setDeletedAt(Long deletedAt) {
            this.deletedAt = deletedAt;
        }

        public Long getDeletedAt() {
            return this.deletedAt;
        }

        }

    public static class DeliveryTemplateModelListWithPaginatorVO {
            @JsonProperty(value = "paginator")
        /**
        * 
        */
        private Paginator paginator;
            @JsonProperty(value = "items")
        /**
        * 
        */
        private LogisticsDeliveryTemplateModel[] items;
    
            public void setPaginator(Paginator paginator) {
            this.paginator = paginator;
        }

        public Paginator getPaginator() {
            return this.paginator;
        }

            public void setItems(LogisticsDeliveryTemplateModel[] items) {
            this.items = items;
        }

        public LogisticsDeliveryTemplateModel[] getItems() {
            return this.items;
        }

        }

    public static class CityOpenApiModel {
            @JsonProperty(value = "cityId")
        /**
        * 城市id
        */
        private Long cityId;
            @JsonProperty(value = "ruleId")
        /**
        * 规则id
        */
        private Long ruleId;
    
            public void setCityId(Long cityId) {
            this.cityId = cityId;
        }

        public Long getCityId() {
            return this.cityId;
        }

            public void setRuleId(Long ruleId) {
            this.ruleId = ruleId;
        }

        public Long getRuleId() {
            return this.ruleId;
        }

        }

    public static class RegionRuleOpenApiModel {
            @JsonProperty(value = "city")
        /**
        * 市
        */
        private CityOpenApiModel[] city;
            @JsonProperty(value = "country")
        /**
        * 区
        */
        private CountryOpenApiModel[] country;
            @JsonProperty(value = "province")
        /**
        * 省
        */
        private ProvinceOpenApiModel[] province;
    
            public void setCity(CityOpenApiModel[] city) {
            this.city = city;
        }

        public CityOpenApiModel[] getCity() {
            return this.city;
        }

            public void setCountry(CountryOpenApiModel[] country) {
            this.country = country;
        }

        public CountryOpenApiModel[] getCountry() {
            return this.country;
        }

            public void setProvince(ProvinceOpenApiModel[] province) {
            this.province = province;
        }

        public ProvinceOpenApiModel[] getProvince() {
            return this.province;
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

    public static class ProvinceOpenApiModel {
            @JsonProperty(value = "provinceId")
        /**
        * 省级id
        */
        private Long provinceId;
            @JsonProperty(value = "ruleId")
        /**
        * 规则id
        */
        private Long ruleId;
    
            public void setProvinceId(Long provinceId) {
            this.provinceId = provinceId;
        }

        public Long getProvinceId() {
            return this.provinceId;
        }

            public void setRuleId(Long ruleId) {
            this.ruleId = ruleId;
        }

        public Long getRuleId() {
            return this.ruleId;
        }

        }

    public static class DeliveryTemplateModelPaginatorResult {
            @JsonProperty(value = "data")
        /**
        * 运费模板分页数据
        */
        private DeliveryTemplateModelListWithPaginatorVO data;
            @JsonProperty(value = "success")
        /**
        * 是否成功
        */
        private Boolean success;
            @JsonProperty(value = "code")
        /**
        * 本次调用返回code，一般为错误代码
        */
        private Long code;
            @JsonProperty(value = "message")
        /**
        * 本次调用返回的消息，一般为错误消息
        */
        private String message;
            @JsonProperty(value = "requestId")
        /**
        * 请求Id
        */
        private String requestId;
    
            public void setData(DeliveryTemplateModelListWithPaginatorVO data) {
            this.data = data;
        }

        public DeliveryTemplateModelListWithPaginatorVO getData() {
            return this.data;
        }

            public void setSuccess(Boolean success) {
            this.success = success;
        }

        public Boolean getSuccess() {
            return this.success;
        }

            public void setCode(Long code) {
            this.code = code;
        }

        public Long getCode() {
            return this.code;
        }

            public void setMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }

            public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public String getRequestId() {
            return this.requestId;
        }

        }


}