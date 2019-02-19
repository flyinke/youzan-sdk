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

public class YouzanLogisticsSettingUpdateParams implements APIParams, FileParams  {

    /**
     * 计费类型
     */
    private Long calcType;
    /**
     * 是否支持快递
     */
    private Boolean isExpress;
    /**
     * 是否支持同城
     */
    private Boolean isLocal;
    /**
     * 是否支持自提
     */
    private Boolean isSelf;
    /**
     * 门店id 可不传，预留字段
     */
    private Long offlineId;

    public void setCalcType(Long calcType) {
        this.calcType = calcType;
    }

    public Long getCalcType() {
        return this.calcType;
    }

    public void setIsExpress(Boolean isExpress) {
        this.isExpress = isExpress;
    }

    public Boolean getIsExpress() {
        return this.isExpress;
    }

    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    public Boolean getIsLocal() {
        return this.isLocal;
    }

    public void setIsSelf(Boolean isSelf) {
        this.isSelf = isSelf;
    }

    public Boolean getIsSelf() {
        return this.isSelf;
    }

    public void setOfflineId(Long offlineId) {
        this.offlineId = offlineId;
    }

    public Long getOfflineId() {
        return this.offlineId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (calcType != null) {
            params.put("calc_type", calcType);
        }
        if (isExpress != null) {
            params.put("is_express", isExpress);
        }
        if (isLocal != null) {
            params.put("is_local", isLocal);
        }
        if (isSelf != null) {
            params.put("is_self", isSelf);
        }
        if (offlineId != null) {
            params.put("offline_id", offlineId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}