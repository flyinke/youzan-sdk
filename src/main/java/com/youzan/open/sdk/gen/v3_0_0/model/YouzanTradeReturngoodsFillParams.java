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

public class YouzanTradeReturngoodsFillParams implements APIParams, FileParams  {

    /**
     * 物流公司编号: 查询youzan.logistics.express.get接口获取
     */
    private Long logisticsCompanyCode;
    /**
     * 物流公司运单号
     */
    private String logisticsWaybillNo;
    /**
     * 退款ID
     */
    private String refundId;
    /**
     * 退款版本号
     */
    private Long version;

    public void setLogisticsCompanyCode(Long logisticsCompanyCode) {
        this.logisticsCompanyCode = logisticsCompanyCode;
    }

    public Long getLogisticsCompanyCode() {
        return this.logisticsCompanyCode;
    }

    public void setLogisticsWaybillNo(String logisticsWaybillNo) {
        this.logisticsWaybillNo = logisticsWaybillNo;
    }

    public String getLogisticsWaybillNo() {
        return this.logisticsWaybillNo;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getRefundId() {
        return this.refundId;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getVersion() {
        return this.version;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (logisticsCompanyCode != null) {
            params.put("logistics_company_code", logisticsCompanyCode);
        }
        if (logisticsWaybillNo != null) {
            params.put("logistics_waybill_no", logisticsWaybillNo);
        }
        if (refundId != null) {
            params.put("refund_id", refundId);
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