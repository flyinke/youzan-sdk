package com.youzan.open.sdk.gen.v1_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanLogisticsLocalMultipleUpdateParams implements APIParams, FileParams  {

    /**
     * 商家最长预约时间，和ahead_max_type配对使用，默认0
     */
    private Integer aheadMax;
    /**
     * 商家最长预约时间类型   目前默认单位：day 日，目前只支持day
     */
    private String aheadMaxType;
    /**
     * 商家预约下单提前时间，和ahead_min_type配对使用，默认0
     */
    private Integer aheadMin;
    /**
     * 商家预约下单提前时间类型   目前默认单位：day 日；hour 小时；minute分钟
     */
    private String aheadMinType;
    /**
     * 多区域对象信息，参数为list对象的json字符串
     */
    private String areaParamList;
    /**
     * 是否开启定时达功能，true:开启，false:关闭
     */
    private Boolean isOpen;
    /**
     * 多网点id，单门店不填，该值默认就是0
     */
    private Long offlineId;
    /**
     * 买家配送时段，定时达不开启可以不传，参数为list对象的json字符串。start_time和end_time用来配置支持的配送时段，后面的switchs是开关，是7位的二进制数，对应每个星期的七天（周一开始周日结束）
比如1100000，就代表start和end定义的配送时段在周一和周二生效
     */
    private String timeBucket;
    /**
     * 买家可选的送达时间细分 day 天；meal 上午下午晚上； hour 小时；halfhour 半小时
     */
    private String timeSpan;

    public void setAheadMax(Integer aheadMax) {
        this.aheadMax = aheadMax;
    }

    public Integer getAheadMax() {
        return this.aheadMax;
    }

    public void setAheadMaxType(String aheadMaxType) {
        this.aheadMaxType = aheadMaxType;
    }

    public String getAheadMaxType() {
        return this.aheadMaxType;
    }

    public void setAheadMin(Integer aheadMin) {
        this.aheadMin = aheadMin;
    }

    public Integer getAheadMin() {
        return this.aheadMin;
    }

    public void setAheadMinType(String aheadMinType) {
        this.aheadMinType = aheadMinType;
    }

    public String getAheadMinType() {
        return this.aheadMinType;
    }

    public void setAreaParamList(String areaParamList) {
        this.areaParamList = areaParamList;
    }

    public String getAreaParamList() {
        return this.areaParamList;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getIsOpen() {
        return this.isOpen;
    }

    public void setOfflineId(Long offlineId) {
        this.offlineId = offlineId;
    }

    public Long getOfflineId() {
        return this.offlineId;
    }

    public void setTimeBucket(String timeBucket) {
        this.timeBucket = timeBucket;
    }

    public String getTimeBucket() {
        return this.timeBucket;
    }

    public void setTimeSpan(String timeSpan) {
        this.timeSpan = timeSpan;
    }

    public String getTimeSpan() {
        return this.timeSpan;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (aheadMax != null) {
            params.put("ahead_max", aheadMax);
        }
        if (aheadMaxType != null) {
            params.put("ahead_max_type", aheadMaxType);
        }
        if (aheadMin != null) {
            params.put("ahead_min", aheadMin);
        }
        if (aheadMinType != null) {
            params.put("ahead_min_type", aheadMinType);
        }
        if (areaParamList != null) {
            params.put("area_param_list", areaParamList);
        }
        if (isOpen != null) {
            params.put("is_open", isOpen);
        }
        if (offlineId != null) {
            params.put("offline_id", offlineId);
        }
        if (timeBucket != null) {
            params.put("time_bucket", timeBucket);
        }
        if (timeSpan != null) {
            params.put("time_span", timeSpan);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}