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

public class YouzanTradeRefundRefuseParams implements APIParams, FileParams  {

    /**
     * 退款ID，退款查询接口可查询到，如https://www.youzanyun.com/apilist/detail/group_trade/trade_advanced/youzan.trade.refund.search
     */
    private String refundId;
    /**
     * 拒绝理由
     */
    private String remark;
    /**
     * 退款版本号，退款查询接口可查询到，如https://www.youzanyun.com/apilist/detail/group_trade/trade_advanced/youzan.trade.refund.search
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