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

public class YouzanTradeReturngoodsAgreeParams implements APIParams, FileParams  {

    /**
     * 收货地址
     */
    private String address;
    /**
     * 收货手机号
     */
    private String mobile;
    /**
     * 收货人
     */
    private String name;
    /**
     * 邮编
     */
    private Long post;
    /**
     * 退款ID，退款查询接口可查询到，如https://www.youzanyun.com/apilist/detail/group_trade/trade_advanced/youzan.trade.refund.search
     */
    private String refundId;
    /**
     * 说明
     */
    private String remark;
    /**
     * 收货电话
     */
    private String tel;
    /**
     * 退款版本号，退款查询接口可查询到，如https://www.youzanyun.com/apilist/detail/group_trade/trade_advanced/youzan.trade.refund.search
     */
    private Long version;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPost(Long post) {
        this.post = post;
    }

    public Long getPost() {
        return this.post;
    }

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

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getVersion() {
        return this.version;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (address != null) {
            params.put("address", address);
        }
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (post != null) {
            params.put("post", post);
        }
        if (refundId != null) {
            params.put("refund_id", refundId);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (tel != null) {
            params.put("tel", tel);
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