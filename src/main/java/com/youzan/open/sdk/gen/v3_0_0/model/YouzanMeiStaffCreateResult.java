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

public class YouzanMeiStaffCreateResult implements APIResult {

    @JsonProperty(value = "real_name")
    /**
     * 员工姓名
     */
    private String realName;
    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "dept_id")
    /**
     * 分店id
     */
    private Long deptId;
    @JsonProperty(value = "yz_uid")
    /**
     * 员工账号id
     */
    private Long yzUid;
    @JsonProperty(value = "account")
    /**
     * 员工账号
     */
    private String account;
    @JsonProperty(value = "mobile")
    /**
     * 联系电话
     */
    private String mobile;
    @JsonProperty(value = "roles")
    /**
     * 角色列表
     */
    private mei_role[] roles;
    @JsonProperty(value = "position_id")
    /**
     * 职位ID
     */
    private Long positionId;

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return this.realName;
    }
    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptId() {
        return this.deptId;
    }
    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return this.account;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }
    public void setRoles(mei_role[] roles) {
        this.roles = roles;
    }

    public mei_role[] getRoles() {
        return this.roles;
    }
    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getPositionId() {
        return this.positionId;
    }

    public static class mei_role {
            @JsonProperty(value = "role_id")
        /**
        * 角色id
        */
        private Long roleId;
            @JsonProperty(value = "role_name")
        /**
        * 角色名称
        */
        private String roleName;
    
            public void setRoleId(Long roleId) {
            this.roleId = roleId;
        }

        public Long getRoleId() {
            return this.roleId;
        }

            public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public String getRoleName() {
            return this.roleName;
        }

        }


}