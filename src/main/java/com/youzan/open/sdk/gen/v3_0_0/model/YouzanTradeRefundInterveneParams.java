package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanTradeRefundInterveneParams implements APIParams, FileParams  {

    /**
     * 退款ID
     */
    private String refundId;
    /**
     * 申请理由
     */
    private String remark;
    /**
     * 退款版本
     */
    private Long version;

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getRefundId() {
        return this.refundId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getVersion() {
        return this.version;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (refundId != null) {
            params.put("refund_id", refundId);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (version != null) {
            params.put("version", version);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}