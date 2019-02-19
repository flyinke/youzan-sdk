package com.youzan.open.sdk.gen.v1_0_0.model;

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

public class YouzanUmpLimitdiscountGetResult implements APIResult {

    @JsonProperty(value = "id")
    /**
     * 限时折扣活动id
     */
    private Long id;
    @JsonProperty(value = "name")
    /**
     * 限时折扣活动名称
     */
    private String name;
    @JsonProperty(value = "start_at")
    /**
     * 活动开始时间
     */
    private Date startAt;
    @JsonProperty(value = "end_at")
    /**
     * 活动结束时间
     */
    private Date endAt;
    @JsonProperty(value = "valid")
    /**
     * 活动是否有效，true：有效；false：已失效
     */
    private Boolean valid;
    @JsonProperty(value = "desc")
    /**
     * 活动标签
     */
    private String desc;
    @JsonProperty(value = "create_at")
    /**
     * 活动创建时间
     */
    private Date createAt;
    @JsonProperty(value = "update_at")
    /**
     * 活动最新更新时间
     */
    private Date updateAt;
    @JsonProperty(value = "period")
    /**
     * 活动周期重复参数
     */
    private PeriodDTO period;

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
    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getStartAt() {
        return this.startAt;
    }
    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Date getEndAt() {
        return this.endAt;
    }
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Boolean getValid() {
        return this.valid;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getCreateAt() {
        return this.createAt;
    }
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getUpdateAt() {
        return this.updateAt;
    }
    public void setPeriod(PeriodDTO period) {
        this.period = period;
    }

    public PeriodDTO getPeriod() {
        return this.period;
    }

    public static class PeriodDTO {
            @JsonProperty(value = "type")
        /**
        * 重复类型；每天:daily; 每周:weekly; 每月:monthly；
        */
        private String type;
            @JsonProperty(value = "days")
        /**
        * 按周、月重复时有值，按月时1-31，按周时0-6，周日是0
        */
        private Number[] days;
            @JsonProperty(value = "start_at")
        /**
        * 开始时间，格式：HH:mm
        */
        private String startAt;
            @JsonProperty(value = "end_at")
        /**
        * 结束时间，格式：HH:mm
        */
        private String endAt;
    
            public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

            public void setDays(Number[] days) {
            this.days = days;
        }

        public Number[] getDays() {
            return this.days;
        }

            public void setStartAt(String startAt) {
            this.startAt = startAt;
        }

        public String getStartAt() {
            return this.startAt;
        }

            public void setEndAt(String endAt) {
            this.endAt = endAt;
        }

        public String getEndAt() {
            return this.endAt;
        }

        }


}