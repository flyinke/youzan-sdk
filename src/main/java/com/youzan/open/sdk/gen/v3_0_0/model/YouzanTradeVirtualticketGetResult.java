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

public class YouzanTradeVirtualticketGetResult implements APIResult {

    @JsonProperty(value = "code")
    /**
     * 虚拟号
     */
    private String code;
    @JsonProperty(value = "tickets")
    /**
     * 电子卡券列表
     */
    private tickets[] tickets;
    @JsonProperty(value = "create_time")
    /**
     * 创建时间
     */
    private Date createTime;
    @JsonProperty(value = "image_url")
    /**
     * 商品图片地址
     */
    private String imageUrl;
    @JsonProperty(value = "item_price")
    /**
     * 商品价格
     */
    private Float itemPrice;
    @JsonProperty(value = "state")
    /**
     * 状态值；
NOT_VERIFIED：未核销
VERIFIED：已核销
EXPIRED：已过期(ps.业务含义已过期,未核销的卡券且过了有效期的结束时间)
REFUNDING：退款中
     */
    private String state;
    @JsonProperty(value = "title")
    /**
     * 商品名称
     */
    private String title;
    @JsonProperty(value = "tid")
    /**
     * 订单号
     */
    private String tid;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
    public void setTickets(tickets[] tickets) {
        this.tickets = tickets;
    }

    public tickets[] getTickets() {
        return this.tickets;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
    public void setItemPrice(Float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Float getItemPrice() {
        return this.itemPrice;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }

    public static class tickets {
            @JsonProperty(value = "ticket_state")
        /**
        * 卡券状态
        */
        private String ticketState;
            @JsonProperty(value = "ticket_code")
        /**
        * 电子卡券编码
        */
        private String ticketCode;
            @JsonProperty(value = "verify_time")
        /**
        * 核销时间
        */
        private Date verifyTime;
    
            public void setTicketState(String ticketState) {
            this.ticketState = ticketState;
        }

        public String getTicketState() {
            return this.ticketState;
        }

            public void setTicketCode(String ticketCode) {
            this.ticketCode = ticketCode;
        }

        public String getTicketCode() {
            return this.ticketCode;
        }

            public void setVerifyTime(Date verifyTime) {
            this.verifyTime = verifyTime;
        }

        public Date getVerifyTime() {
            return this.verifyTime;
        }

        }


}