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

public class YouzanTradesQrGetParams implements APIParams, FileParams  {

    /**
     * 交易创建结束时间
     */
    private Date endCreated;
    /**
     * 需要返回的交易对象字段，如tid,qr_url,qr_name等
     */
    private String fields;
    /**
     * 页码
     */
    private Long pageNo;
    /**
     * 每页条数
     */
    private Long pageSize;
    /**
     * 二维码编号
     */
    private String qrId;
    /**
     * 网点编号
     */
    private String shopId;
    /**
     * 网点类型
     */
    private String shopType;
    /**
     * 交易创建开始时间
     */
    private Date startCreated;
    /**
     * 状态,WAIT_RECEIVED（待收款）; TRADE_RECEIVED（已收款）;TRADE_EXPIRED（已过期)
     */
    private String status;

    public void setEndCreated(Date endCreated) {
        this.endCreated = endCreated;
    }

    public Date getEndCreated() {
        return this.endCreated;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setQrId(String qrId) {
        this.qrId = qrId;
    }

    public String getQrId() {
        return this.qrId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopId() {
        return this.shopId;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getShopType() {
        return this.shopType;
    }

    public void setStartCreated(Date startCreated) {
        this.startCreated = startCreated;
    }

    public Date getStartCreated() {
        return this.startCreated;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (endCreated != null) {
            params.put("end_created", endCreated);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (qrId != null) {
            params.put("qr_id", qrId);
        }
        if (shopId != null) {
            params.put("shop_id", shopId);
        }
        if (shopType != null) {
            params.put("shop_type", shopType);
        }
        if (startCreated != null) {
            params.put("start_created", startCreated);
        }
        if (status != null) {
            params.put("status", status);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}