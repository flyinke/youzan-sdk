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

public class YouzanMeiOrderCreateResult implements APIResult {

    @JsonProperty(value = "resp")
    /**
     * 订单保存响应体
     */
    private OrderSaveResp resp;

    public void setResp(OrderSaveResp resp) {
        this.resp = resp;
    }

    public OrderSaveResp getResp() {
        return this.resp;
    }

    public static class OrderSaveResp {
            @JsonProperty(value = "yz_uid")
        /**
        * 订单创建者id
        */
        private Long yzUid;
            @JsonProperty(value = "order_no")
        /**
        * 订单编号
        */
        private String orderNo;
    
            public void setYzUid(Long yzUid) {
            this.yzUid = yzUid;
        }

        public Long getYzUid() {
            return this.yzUid;
        }

            public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderNo() {
            return this.orderNo;
        }

        }


}