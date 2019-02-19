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

public class YouzanTradeQrlabelSearchResult implements APIResult {

    @JsonProperty(value = "total_results")
    /**
     * 返回记录总数
     */
    private QrTotalResult totalResults;
    @JsonProperty(value = "qrlabels")
    /**
     * 二维码标签列表
     */
    private TradeCashierQrLabel[] qrlabels;

    public void setTotalResults(QrTotalResult totalResults) {
        this.totalResults = totalResults;
    }

    public QrTotalResult getTotalResults() {
        return this.totalResults;
    }
    public void setQrlabels(TradeCashierQrLabel[] qrlabels) {
        this.qrlabels = qrlabels;
    }

    public TradeCashierQrLabel[] getQrlabels() {
        return this.qrlabels;
    }

    public static class TradeCashierQrLabel {
            @JsonProperty(value = "nou_quota_count")
        /**
        * 关联的自助二维码数量
        */
        private Long nouQuotaCount;
            @JsonProperty(value = "label_name")
        /**
        * 标签名称
        */
        private String labelName;
            @JsonProperty(value = "create_time")
        /**
        * 标签创建日期
        */
        private String createTime;
            @JsonProperty(value = "modify_time")
        /**
        * 标签修改日期
        */
        private String modifyTime;
            @JsonProperty(value = "quota_count")
        /**
        * 关联的定额二维码数量
        */
        private Long quotaCount;
            @JsonProperty(value = "id")
        /**
        * 标签编号
        */
        private String id;
    
            public void setNouQuotaCount(Long nouQuotaCount) {
            this.nouQuotaCount = nouQuotaCount;
        }

        public Long getNouQuotaCount() {
            return this.nouQuotaCount;
        }

            public void setLabelName(String labelName) {
            this.labelName = labelName;
        }

        public String getLabelName() {
            return this.labelName;
        }

            public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateTime() {
            return this.createTime;
        }

            public void setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
        }

        public String getModifyTime() {
            return this.modifyTime;
        }

            public void setQuotaCount(Long quotaCount) {
            this.quotaCount = quotaCount;
        }

        public Long getQuotaCount() {
            return this.quotaCount;
        }

            public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }

        }

    public static class QrTotalResult {
            @JsonProperty(value = "total")
        /**
        * 结果总数
        */
        private Integer total;
    
            public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getTotal() {
            return this.total;
        }

        }


}