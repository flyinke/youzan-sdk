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

public class YouzanTradeDcQueryMultiperioddetailResult implements APIResult {

    @JsonProperty(value = "tid")
    /**
     * 订单号
     */
    private String tid;
    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "item_id")
    /**
     * 商品id
     */
    private Long itemId;
    @JsonProperty(value = "total_issue")
    /**
     * 总期数
     */
    private Long totalIssue;
    @JsonProperty(value = "dist_time_dim")
    /**
     * 配送时间维度
  DAY(0, "每日一期"),
  WEEK(1, "每周一期"),
  MONTH(2, "每月一期");
     */
    private Long distTimeDim;
    @JsonProperty(value = "dist_time_dim_str")
    /**
     * 配送时间维度desc
     */
    private String distTimeDimStr;
    @JsonProperty(value = "dist_time_mode")
    /**
     * 配送时间模式:
WeekDeliverTimeEnum:
MONDAY(1, "每周一"),
  TUESDAY(2, "每周二"),
  WEDNESDAY(3, "每周三"),
  THURSDAY(4, "每周四"),
  FRIDAY(5, "每周五"),
  SATURDAY(6, "每周六"),
  SUNDAY(7, "每周日");

DayDeliveryTimeEnum:
EVERY_DAY(0, "每天送达"),
  WEEK_DAY(1, "工作日送达"),
  WEEK_END(2, "周末每天送达"),
  EVERY_ANOTHER_DAY(3, "隔天送达");

     */
    private Long distTimeMode;
    @JsonProperty(value = "dist_time_mode_str")
    /**
     * 配送时间模式描述
     */
    private String distTimeModeStr;
    @JsonProperty(value = "delivery_time")
    /**
     * 买家下单时选择的送达时间
     */
    private Date deliveryTime;
    @JsonProperty(value = "extend")
    /**
     * 扩展信息
     */
    private String extend;
    @JsonProperty(value = "max_postpone_sum")
    /**
     * 最大顺延次数
     */
    private Long maxPostponeSum;
    @JsonProperty(value = "lead_time_dto")
    /**
     * 配送提前期
     */
    private LeadTimeDTO leadTimeDto;

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }
    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }
    public void setTotalIssue(Long totalIssue) {
        this.totalIssue = totalIssue;
    }

    public Long getTotalIssue() {
        return this.totalIssue;
    }
    public void setDistTimeDim(Long distTimeDim) {
        this.distTimeDim = distTimeDim;
    }

    public Long getDistTimeDim() {
        return this.distTimeDim;
    }
    public void setDistTimeDimStr(String distTimeDimStr) {
        this.distTimeDimStr = distTimeDimStr;
    }

    public String getDistTimeDimStr() {
        return this.distTimeDimStr;
    }
    public void setDistTimeMode(Long distTimeMode) {
        this.distTimeMode = distTimeMode;
    }

    public Long getDistTimeMode() {
        return this.distTimeMode;
    }
    public void setDistTimeModeStr(String distTimeModeStr) {
        this.distTimeModeStr = distTimeModeStr;
    }

    public String getDistTimeModeStr() {
        return this.distTimeModeStr;
    }
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getDeliveryTime() {
        return this.deliveryTime;
    }
    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getExtend() {
        return this.extend;
    }
    public void setMaxPostponeSum(Long maxPostponeSum) {
        this.maxPostponeSum = maxPostponeSum;
    }

    public Long getMaxPostponeSum() {
        return this.maxPostponeSum;
    }
    public void setLeadTimeDto(LeadTimeDTO leadTimeDto) {
        this.leadTimeDto = leadTimeDto;
    }

    public LeadTimeDTO getLeadTimeDto() {
        return this.leadTimeDto;
    }

    public static class LeadTimeDTO {
            @JsonProperty(value = "lead_day")
        /**
        * 提前天数
        */
        private Long leadDay;
            @JsonProperty(value = "lead_hour")
        /**
        * 截止几点之前下单
        */
        private Long leadHour;
    
            public void setLeadDay(Long leadDay) {
            this.leadDay = leadDay;
        }

        public Long getLeadDay() {
            return this.leadDay;
        }

            public void setLeadHour(Long leadHour) {
            this.leadHour = leadHour;
        }

        public Long getLeadHour() {
            return this.leadHour;
        }

        }


}