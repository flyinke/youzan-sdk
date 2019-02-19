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

public class YouzanMeiStaffUpdateParams implements APIParams, FileParams  {

    /**
     * 账号
     */
    private String account;
    /**
     * 部门ID
     */
    private Long deptId;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 旧部门ID
     */
    private Long oldDeptId;
    /**
     * 职位ID 2 高级管理员 3 店长 4 普通职员 5 手艺人 7 总部财务 8 驻店财务 9 营销顾问  总店的员工只能选择2 分店员工除了2其他都可以选 
     */
    private Long positionId;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 角色ID列表
     */
    private String roles;
    /**
     * 员工ID
     */
    private Long yzUid;

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return this.account;
    }

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

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setOldDeptId(Long oldDeptId) {
        this.oldDeptId = oldDeptId;
    }

    public Long getOldDeptId() {
        return this.oldDeptId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getPositionId() {
        return this.positionId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getRoles() {
        return this.roles;
    }

    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (account != null) {
            params.put("account", account);
        }
        if (deptId != null) {
            params.put("dept_id", deptId);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        if (oldDeptId != null) {
            params.put("old_dept_id", oldDeptId);
        }
        if (positionId != null) {
            params.put("position_id", positionId);
        }
        if (realName != null) {
            params.put("real_name", realName);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (roles != null) {
            params.put("roles", roles);
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