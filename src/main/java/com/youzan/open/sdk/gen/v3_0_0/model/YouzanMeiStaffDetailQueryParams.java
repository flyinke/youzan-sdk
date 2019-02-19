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

public class YouzanMeiStaffDetailQueryParams implements APIParams, FileParams  {

    /**
     * 部门ID
     */
    private Long deptId;
    /**
     * 美业Token
     */
    private String mToken;
    /**
     * 员工ID
     */
    private Long yzUid;

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptId() {
        return this.deptId;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (deptId != null) {
            params.put("dept_id", deptId);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (yzUid != null) {
            params.put("yz_uid", yzUid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}