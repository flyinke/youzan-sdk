package com.youzan.open.sdk.gen.v2_0_0.model;

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

    @JsonProperty(value = "multiPeriodDetailOpenDTO")
    /**
     * 周期购多期发货明细
     */
    private MultiPeriodDetailOpenDTO multiPeriodDetailOpenDTO;

    public void setMultiPeriodDetailOpenDTO(MultiPeriodDetailOpenDTO multiPeriodDetailOpenDTO) {
        this.multiPeriodDetailOpenDTO = multiPeriodDetailOpenDTO;
    }

    public MultiPeriodDetailOpenDTO getMultiPeriodDetailOpenDTO() {
        return this.multiPeriodDetailOpenDTO;
    }

    public static class MultiPeriodDetailOpenDTO {
            @JsonProperty(value = "tid")
        /**
        * 主订单ID
        */
        private String tid;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "oid")
        /**
        * 子订单ID
        */
        private Long oid;
            @JsonProperty(value = "total_issue")
        /**
        * 总期数
        */
        private Long totalIssue;
            @JsonProperty(value = "dist_time_dim")
        /**
        * 配送时间维度
        */
        private Long distTimeDim;
            @JsonProperty(value = "dist_time_dim_str")
        /**
        * 配送时间维度描述
        */
        private String distTimeDimStr;
            @JsonProperty(value = "dist_time_mode")
        /**
        * 配送时间模式
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
            @JsonProperty(value = "lead_time")
        /**
        * 配送提前期
        */
        private LeadTimeDTO leadTime;
    
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

            public void setOid(Long oid) {
            this.oid = oid;
        }

        public Long getOid() {
            return this.oid;
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

            public void setLeadTime(LeadTimeDTO leadTime) {
            this.leadTime = leadTime;
        }

        public LeadTimeDTO getLeadTime() {
            return this.leadTime;
        }

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