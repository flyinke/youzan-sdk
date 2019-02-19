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

public class YouzanMeiCustomerGetResult implements APIResult {

    @JsonProperty(value = "birthday")
    /**
     * 生日，例如1989-12-21
     */
    private String birthday;
    @JsonProperty(value = "gender")
    /**
     * 性别
0 未知
1 男
2 女
     */
    private Long gender;
    @JsonProperty(value = "member_no")
    /**
     * 会员编号
     */
    private String memberNo;
    @JsonProperty(value = "level_alias")
    /**
     * 等级别名
     */
    private String levelAlias;
    @JsonProperty(value = "created_at")
    /**
     * 创建时间
     */
    private Long createdAt;
    @JsonProperty(value = "remark")
    /**
     * 备注
     */
    private String remark;
    @JsonProperty(value = "belong_dept_id")
    /**
     * 附属门店id。如果是0 则表示不属于任何门店
     */
    private Long belongDeptId;
    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "updated_at")
    /**
     * 更新时间
     */
    private Long updatedAt;
    @JsonProperty(value = "member")
    /**
     * 是否是会员。1表示是会员
     */
    private Long member;
    @JsonProperty(value = "customer_source")
    /**
     * 来源id
     */
    private Long customerSource;
    @JsonProperty(value = "level")
    /**
     * 等级id
     */
    private Long level;
    @JsonProperty(value = "area_code")
    /**
     * 地区编码
     */
    private Long areaCode;
    @JsonProperty(value = "mobile")
    /**
     * 手机号
     */
    private String mobile;
    @JsonProperty(value = "memo_name")
    /**
     * 会员备注姓名，商家对会员的备注名称。例如张总
     */
    private String memoName;
    @JsonProperty(value = "consultant_ids")
    /**
     * 营销顾问id列表
     */
    private Number[] consultantIds;
    @JsonProperty(value = "avatar")
    /**
     * 头像url
     */
    private String avatar;
    @JsonProperty(value = "member_name")
    /**
     * 会员名称，例如张三
     */
    private String memberName;
    @JsonProperty(value = "yz_uid")
    /**
     * 会员id
     */
    private Long yzUid;
    @JsonProperty(value = "contact_number")
    /**
     * 联系电话
     */
    private String contactNumber;
    @JsonProperty(value = "level_name")
    /**
     * 等级名称
     */
    private String levelName;
    @JsonProperty(value = "wx_account")
    /**
     * 微信账号
     */
    private String wxAccount;
    @JsonProperty(value = "name")
    /**
     * 会员名称。买家自己写的名字，例如如花
     */
    private String name;
    @JsonProperty(value = "growth")
    /**
     * 成长值
     */
    private Long growth;
    @JsonProperty(value = "source_id")
    /**
     * 用户来源id
     */
    private Long sourceId;
    @JsonProperty(value = "customer_source_name")
    /**
     * 来源名称
     */
    private String customerSourceName;

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return this.birthday;
    }
    public void setGender(Long gender) {
        this.gender = gender;
    }

    public Long getGender() {
        return this.gender;
    }
    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberNo() {
        return this.memberNo;
    }
    public void setLevelAlias(String levelAlias) {
        this.levelAlias = levelAlias;
    }

    public String getLevelAlias() {
        return this.levelAlias;
    }
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }
    public void setBelongDeptId(Long belongDeptId) {
        this.belongDeptId = belongDeptId;
    }

    public Long getBelongDeptId() {
        return this.belongDeptId;
    }
    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getUpdatedAt() {
        return this.updatedAt;
    }
    public void setMember(Long member) {
        this.member = member;
    }

    public Long getMember() {
        return this.member;
    }
    public void setCustomerSource(Long customerSource) {
        this.customerSource = customerSource;
    }

    public Long getCustomerSource() {
        return this.customerSource;
    }
    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getLevel() {
        return this.level;
    }
    public void setAreaCode(Long areaCode) {
        this.areaCode = areaCode;
    }

    public Long getAreaCode() {
        return this.areaCode;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }
    public void setMemoName(String memoName) {
        this.memoName = memoName;
    }

    public String getMemoName() {
        return this.memoName;
    }
    public void setConsultantIds(Number[] consultantIds) {
        this.consultantIds = consultantIds;
    }

    public Number[] getConsultantIds() {
        return this.consultantIds;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return this.avatar;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberName() {
        return this.memberName;
    }
    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getLevelName() {
        return this.levelName;
    }
    public void setWxAccount(String wxAccount) {
        this.wxAccount = wxAccount;
    }

    public String getWxAccount() {
        return this.wxAccount;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setGrowth(Long growth) {
        this.growth = growth;
    }

    public Long getGrowth() {
        return this.growth;
    }
    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Long getSourceId() {
        return this.sourceId;
    }
    public void setCustomerSourceName(String customerSourceName) {
        this.customerSourceName = customerSourceName;
    }

    public String getCustomerSourceName() {
        return this.customerSourceName;
    }


}