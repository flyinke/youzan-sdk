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

public class YouzanMeiStockCreateParams implements APIParams, FileParams  {

    /**
     * 入库时间
     */
    private Long ioTime;
    /**
     * 入库商品信息
     */
    private String items;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 操作人id 可空
     */
    private Long operatorId;
    /**
     * 操作人 可空 
     */
    private String operatorName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 仓库ID
     */
    private Long wareHouseId;

    public void setIoTime(Long ioTime) {
        this.ioTime = ioTime;
    }

    public Long getIoTime() {
        return this.ioTime;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getItems() {
        return this.items;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Long getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorName() {
        return this.operatorName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setWareHouseId(Long wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public Long getWareHouseId() {
        return this.wareHouseId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (ioTime != null) {
            params.put("io_time", ioTime);
        }
        if (items != null) {
            params.put("items", items);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (operatorId != null) {
            params.put("operator_id", operatorId);
        }
        if (operatorName != null) {
            params.put("operator_name", operatorName);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (wareHouseId != null) {
            params.put("ware_house_id", wareHouseId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}