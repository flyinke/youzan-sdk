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

public class YouzanLogisticsLocalGetResult implements APIResult {

    @JsonProperty(value = "aheadMaxType")
    /**
     * 最多提前几天下订单, 类型, 默认 DAY
     */
    private String aheadMaxType;
    @JsonProperty(value = "lng")
    /**
     * 径度
     */
    private Long lng;
    @JsonProperty(value = "kdtId")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "aheadMin")
    /**
     * 订单开始的偏移量
     */
    private Long aheadMin;
    @JsonProperty(value = "deliveryFee")
    /**
     * 配送费用
     */
    private Long deliveryFee;
    @JsonProperty(value = "isOpen")
    /**
     * 开启定时达功能
     */
    private Boolean isOpen;
    @JsonProperty(value = "aheadMinType")
    /**
     * 订单结束的偏移量   目前默认单位：DAY 日；HOUR 小时；HALFHOUR分钟
     */
    private String aheadMinType;
    @JsonProperty(value = "polygon")
    /**
     * 多边形区域配置
     */
    private String polygon;
    @JsonProperty(value = "scopeType")
    /**
     * 0：简单 1：半径 2：自定义
     */
    private Long scopeType;
    @JsonProperty(value = "scope")
    /**
     * 本地配送范围(里）
     */
    private Long scope;
    @JsonProperty(value = "attachPic")
    /**
     * 配送区域图片
     */
    private String attachPic;
    @JsonProperty(value = "startFee")
    /**
     * 订单起送金额
     */
    private Long startFee;
    @JsonProperty(value = "aheadMax")
    /**
     * 最多提前几天下订单, 仅限当天：0
     */
    private Long aheadMax;
    @JsonProperty(value = "timeSpan")
    /**
     * 送达时间细分 DAY 天；MEAL 上午下午晚上； HOUR 小时；HALFHOUR 半小时
     */
    private String timeSpan;
    @JsonProperty(value = "timeBucket")
    /**
     * 营业时间周期，2进制表示7天的开关，第一位是周一
     */
    private LogisticsLocalDeliveryTimeBucketParam[] timeBucket;
    @JsonProperty(value = "lat")
    /**
     * 纬度
     */
    private Long lat;
    @JsonProperty(value = "desc")
    /**
     * 配送区域介绍
     */
    private String desc;

    public void setAheadMaxType(String aheadMaxType) {
        this.aheadMaxType = aheadMaxType;
    }

    public String getAheadMaxType() {
        return this.aheadMaxType;
    }
    public void setLng(Long lng) {
        this.lng = lng;
    }

    public Long getLng() {
        return this.lng;
    }
    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setAheadMin(Long aheadMin) {
        this.aheadMin = aheadMin;
    }

    public Long getAheadMin() {
        return this.aheadMin;
    }
    public void setDeliveryFee(Long deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Long getDeliveryFee() {
        return this.deliveryFee;
    }
    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getIsOpen() {
        return this.isOpen;
    }
    public void setAheadMinType(String aheadMinType) {
        this.aheadMinType = aheadMinType;
    }

    public String getAheadMinType() {
        return this.aheadMinType;
    }
    public void setPolygon(String polygon) {
        this.polygon = polygon;
    }

    public String getPolygon() {
        return this.polygon;
    }
    public void setScopeType(Long scopeType) {
        this.scopeType = scopeType;
    }

    public Long getScopeType() {
        return this.scopeType;
    }
    public void setScope(Long scope) {
        this.scope = scope;
    }

    public Long getScope() {
        return this.scope;
    }
    public void setAttachPic(String attachPic) {
        this.attachPic = attachPic;
    }

    public String getAttachPic() {
        return this.attachPic;
    }
    public void setStartFee(Long startFee) {
        this.startFee = startFee;
    }

    public Long getStartFee() {
        return this.startFee;
    }
    public void setAheadMax(Long aheadMax) {
        this.aheadMax = aheadMax;
    }

    public Long getAheadMax() {
        return this.aheadMax;
    }
    public void setTimeSpan(String timeSpan) {
        this.timeSpan = timeSpan;
    }

    public String getTimeSpan() {
        return this.timeSpan;
    }
    public void setTimeBucket(LogisticsLocalDeliveryTimeBucketParam[] timeBucket) {
        this.timeBucket = timeBucket;
    }

    public LogisticsLocalDeliveryTimeBucketParam[] getTimeBucket() {
        return this.timeBucket;
    }
    public void setLat(Long lat) {
        this.lat = lat;
    }

    public Long getLat() {
        return this.lat;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public static class LogisticsLocalDeliveryTimeBucketParam {
    
        }


}