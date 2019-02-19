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

public class YouzanLogisticsGoodsexpressGetResult implements APIResult {

    @JsonProperty(value = "com")
    /**
     * 物流公司编号
     */
    private String com;
    @JsonProperty(value = "created_time")
    /**
     * 每条跟踪信息的时间
     */
    private Long createdTime;
    @JsonProperty(value = "express_id")
    /**
     * 物流id
     */
    private Long expressId;
    @JsonProperty(value = "kdt_id")
    /**
     * 店铺Id
     */
    private Long kdtId;
    @JsonProperty(value = "data")
    /**
     * 投递的数据
     */
    private String data;
    @JsonProperty(value = "nu")
    /**
     * 物流单号
     */
    private String nu;
    @JsonProperty(value = "ep_condition")
    /**
     * 条件
     */
    private String epCondition;
    @JsonProperty(value = "id")
    /**
     * 编号id
     */
    private Long id;
    @JsonProperty(value = "state")
    /**
     * 0：在途 1：揽件 2：疑难 3：签收 4：退签 5：派件 6：退回
     */
    private Long state;
    @JsonProperty(value = "message")
    /**
     * 信息
     */
    private String message;
    @JsonProperty(value = "order_id")
    /**
     * 订单id
     */
    private Long orderId;
    @JsonProperty(value = "status")
    /**
     * 查询结果状态:0：物流单暂无结果，1：查询成功，2：接口出现异常
     */
    private String status;
    @JsonProperty(value = "name")
    /**
     * 物流公司名称
     */
    private String name;

    public void setCom(String com) {
        this.com = com;
    }

    public String getCom() {
        return this.com;
    }
    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public Long getCreatedTime() {
        return this.createdTime;
    }
    public void setExpressId(Long expressId) {
        this.expressId = expressId;
    }

    public Long getExpressId() {
        return this.expressId;
    }
    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }
    public void setNu(String nu) {
        this.nu = nu;
    }

    public String getNu() {
        return this.nu;
    }
    public void setEpCondition(String epCondition) {
        this.epCondition = epCondition;
    }

    public String getEpCondition() {
        return this.epCondition;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
    public void setState(Long state) {
        this.state = state;
    }

    public Long getState() {
        return this.state;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return this.orderId;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


}