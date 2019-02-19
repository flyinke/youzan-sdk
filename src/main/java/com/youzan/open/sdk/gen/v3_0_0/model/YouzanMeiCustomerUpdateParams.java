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

public class YouzanMeiCustomerUpdateParams implements APIParams, FileParams  {

    /**
     * 地区编码
     */
    private Long areaCode;
    /**
     * 头像链接
     */
    private String avatar;
    /**
     * 会员归属的门店id，如果不属于任何门店，则填写0
     */
    private Long belongDeptId;
    /**
     * 会员生日
     */
    private String birthday;
    /**
     * 营销顾问列表
     */
    private String consultantIds;
    /**
     * 联系电话
     */
    private String contactNumber;
    /**
     * 性别
0 未知
1 男
2 女
     */
    private Long gender;
    /**
     * 会员等级的别称，需要从等级列表中获取
     */
    private String levelAlias;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 会员名称
     */
    private String memberName;
    /**
     * 会员编号
     */
    private String memberNo;
    /**
     * 会员备注姓名
     */
    private String memoName;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 备注
     */
    private String remark;
    /**
     * 微信账号
     */
    private String wxAccount;
    /**
     * 会员id
     */
    private Long yzUid;

    public void setAreaCode(Long areaCode) {
        this.areaCode = areaCode;
    }

    public Long getAreaCode() {
        return this.areaCode;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setBelongDeptId(Long belongDeptId) {
        this.belongDeptId = belongDeptId;
    }

    public Long getBelongDeptId() {
        return this.belongDeptId;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setConsultantIds(String consultantIds) {
        this.consultantIds = consultantIds;
    }

    public String getConsultantIds() {
        return this.consultantIds;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public Long getGender() {
        return this.gender;
    }

    public void setLevelAlias(String levelAlias) {
        this.levelAlias = levelAlias;
    }

    public String getLevelAlias() {
        return this.levelAlias;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberNo() {
        return this.memberNo;
    }

    public void setMemoName(String memoName) {
        this.memoName = memoName;
    }

    public String getMemoName() {
        return this.memoName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setWxAccount(String wxAccount) {
        this.wxAccount = wxAccount;
    }

    public String getWxAccount() {
        return this.wxAccount;
    }

    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (areaCode != null) {
            params.put("area_code", areaCode);
        }
        if (avatar != null) {
            params.put("avatar", avatar);
        }
        if (belongDeptId != null) {
            params.put("belong_dept_id", belongDeptId);
        }
        if (birthday != null) {
            params.put("birthday", birthday);
        }
        if (consultantIds != null) {
            params.put("consultant_ids", consultantIds);
        }
        if (contactNumber != null) {
            params.put("contact_number", contactNumber);
        }
        if (gender != null) {
            params.put("gender", gender);
        }
        if (levelAlias != null) {
            params.put("level_alias", levelAlias);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (memberName != null) {
            params.put("member_name", memberName);
        }
        if (memberNo != null) {
            params.put("member_no", memberNo);
        }
        if (memoName != null) {
            params.put("memo_name", memoName);
        }
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (wxAccount != null) {
            params.put("wx_account", wxAccount);
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