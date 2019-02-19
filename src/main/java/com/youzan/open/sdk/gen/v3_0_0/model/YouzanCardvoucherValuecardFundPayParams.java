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

public class YouzanCardvoucherValuecardFundPayParams implements APIParams, FileParams  {

    /**
     * 支付金额（单位：分）
     */
    private Long amount;
    /**
     * 用户buyerId，与手机号码二选一
     */
    private Long buyerId;
    /**
     * 用于支付的卡号列表，目前仅支持一张卡。
可通过以下接口获取用户可用储值卡列表，以及卡内余额
youzan.cardvoucher.valuecard.info.bysup.query
     */
    private String cardNos;
    /**
     * 商品名称（长度必须小于24）
     */
    private String goodsName;
    /**
     * 用户手机号码，与buyerId 二选一
     */
    private String mobile;
    /**
     * 操作人姓名。如果是商家发起支付，请填写商家操作人姓名。如果是用户发起，请填写用户姓名（长度必须小于24）
     */
    private String operator;
    /**
     * 支付请求号，唯一标识一次支付请求，请确保唯一（长度必须小于24）
     */
    private String payRequestNo;
    /**
     * 支付描述（长度必须小于100）
     */
    private String remark;

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getAmount() {
        return this.amount;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }

    public void setCardNos(String cardNos) {
        this.cardNos = cardNos;
    }

    public String getCardNos() {
        return this.cardNos;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsName() {
        return this.goodsName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setPayRequestNo(String payRequestNo) {
        this.payRequestNo = payRequestNo;
    }

    public String getPayRequestNo() {
        return this.payRequestNo;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (amount != null) {
            params.put("amount", amount);
        }
        if (buyerId != null) {
            params.put("buyer_id", buyerId);
        }
        if (cardNos != null) {
            params.put("card_nos", cardNos);
        }
        if (goodsName != null) {
            params.put("goods_name", goodsName);
        }
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        if (operator != null) {
            params.put("operator", operator);
        }
        if (payRequestNo != null) {
            params.put("pay_request_no", payRequestNo);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}