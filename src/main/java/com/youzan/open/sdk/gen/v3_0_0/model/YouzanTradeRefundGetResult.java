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

public class YouzanTradeRefundGetResult implements APIResult {

    @JsonProperty(value = "tid")
    /**
     * 订单号
     */
    private String tid;
    @JsonProperty(value = "item_id")
    /**
     * 将废弃，请使用下文中 oid 字段（订单明细字段，对应 youzan.trade.get 3.0接口中的oid ）
     */
    private Long itemId;
    @JsonProperty(value = "refund_id")
    /**
     * 退款id
     */
    private String refundId;
    @JsonProperty(value = "status")
    /**
     * 退款状态:
WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意)，
WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货)，
WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货)，
SELLER_REFUSE_BUYER(卖家拒绝退款)，
CLOSED(退款关闭)，
SUCCESS(退款成功)。
     */
    private String status;
    @JsonProperty(value = "cs_status")
    /**
     * 客满介入状态：
1（客满未介入），2（客满介入中）。
     */
    private Long csStatus;
    @JsonProperty(value = "return_goods")
    /**
     * 是否退货:
false（仅退款），true（退货退款）。
     */
    private Boolean returnGoods;
    @JsonProperty(value = "desc")
    /**
     * 退款申请说明
     */
    private String desc;
    @JsonProperty(value = "created")
    /**
     * 退款申请时间
     */
    private Date created;
    @JsonProperty(value = "modified")
    /**
     * 退款申请修改时间
     */
    private Date modified;
    @JsonProperty(value = "version")
    /**
     * 退款版本号，用于退款的相关操作。
     */
    private Long version;
    @JsonProperty(value = "reason")
    /**
     * 仅退款-未收到货申请原因:11(质量问题), 12(拍错/多拍/不喜欢), 13(商品描述不符), 14(假货), 15(商家发错货), 16(商品破损/少件), 17(其他);
仅退款-已收到货申请原因:51(多买/买错/不想要), 52(快递无记录), 53(少货/空包裹), 54(未按约定时间发货), 55(快递一直未送达), 56(其他);
退货退款-申请原因:101(商品破损/少件), 102(商家发错货), 103(商品描述不符), 104(拍错/多拍/不喜欢), 105(质量问题), 107(其他);
     */
    private Long reason;
    @JsonProperty(value = "refund_fee")
    /**
     * 申请退款的金额
     */
    private Float refundFee;
    @JsonProperty(value = "logistics")
    /**
     * 退货物流信息
     */
    private TradeRefundLogistics logistics;
    @JsonProperty(value = "refund_type")
    /**
     * 退款类型：
BUYER_APPLY_REFUND(买家申请退款)，SELLER_REFUND（商家主动退款），SYSTEM_REFUND（一键退款，特殊类型退款）
     */
    private String refundType;
    @JsonProperty(value = "oid")
    /**
     * 订单明细id
     */
    private String oid;

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }
    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getRefundId() {
        return this.refundId;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
    public void setCsStatus(Long csStatus) {
        this.csStatus = csStatus;
    }

    public Long getCsStatus() {
        return this.csStatus;
    }
    public void setReturnGoods(Boolean returnGoods) {
        this.returnGoods = returnGoods;
    }

    public Boolean getReturnGoods() {
        return this.returnGoods;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return this.created;
    }
    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getModified() {
        return this.modified;
    }
    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getVersion() {
        return this.version;
    }
    public void setReason(Long reason) {
        this.reason = reason;
    }

    public Long getReason() {
        return this.reason;
    }
    public void setRefundFee(Float refundFee) {
        this.refundFee = refundFee;
    }

    public Float getRefundFee() {
        return this.refundFee;
    }
    public void setLogistics(TradeRefundLogistics logistics) {
        this.logistics = logistics;
    }

    public TradeRefundLogistics getLogistics() {
        return this.logistics;
    }
    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    public String getRefundType() {
        return this.refundType;
    }
    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getOid() {
        return this.oid;
    }

    public static class TradeRefundLogistics {
            @JsonProperty(value = "logistics_no")
        /**
        * 物流单号
        */
        private String logisticsNo;
            @JsonProperty(value = "company_code")
        /**
        * 物流公司编号
        */
        private String companyCode;
            @JsonProperty(value = "receiver")
        /**
        * 收件人
        */
        private String receiver;
            @JsonProperty(value = "mobile")
        /**
        * 收件人手机号
        */
        private String mobile;
            @JsonProperty(value = "telephone")
        /**
        * 收件人座机
        */
        private String telephone;
            @JsonProperty(value = "address")
        /**
        * 收货地址
        */
        private String address;
    
            public void setLogisticsNo(String logisticsNo) {
            this.logisticsNo = logisticsNo;
        }

        public String getLogisticsNo() {
            return this.logisticsNo;
        }

            public void setCompanyCode(String companyCode) {
            this.companyCode = companyCode;
        }

        public String getCompanyCode() {
            return this.companyCode;
        }

            public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public String getReceiver() {
            return this.receiver;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

            public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getTelephone() {
            return this.telephone;
        }

            public void setAddress(String address) {
            this.address = address;
        }

        public String getAddress() {
            return this.address;
        }

        }


}