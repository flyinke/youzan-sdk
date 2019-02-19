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

public class YouzanMeiPromoterGetResult implements APIResult {

    @JsonProperty(value = "order_count")
    /**
     * 订单数量
     */
    private Long orderCount;
    @JsonProperty(value = "created_at")
    /**
     * 创建时间
     */
    private Long createdAt;
    @JsonProperty(value = "pid")
    /**
     * id标识
     */
    private String pid;
    @JsonProperty(value = "invitation_count")
    /**
     * 邀请的下线分销员数量
     */
    private Long invitationCount;
    @JsonProperty(value = "from_source")
    /**
     * 来源
1. 自己申请 
2. 好友邀请 
3.手动添加
     */
    private Long fromSource;
    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "verify_at")
    /**
     * 通过审核时间
     */
    private Long verifyAt;
    @JsonProperty(value = "avatar_url")
    /**
     * 头像地址
     */
    private String avatarUrl;
    @JsonProperty(value = "parent_profit")
    /**
     * 贡献给上线的利润
     */
    private Long parentProfit;
    @JsonProperty(value = "phone")
    /**
     * 联系电话
     */
    private String phone;
    @JsonProperty(value = "nickname")
    /**
     * 昵称
     */
    private String nickname;
    @JsonProperty(value = "parent_pid")
    /**
     * 上线分销员的id
     */
    private String parentPid;
    @JsonProperty(value = "parent_phone")
    /**
     * 上线分销员的联系电话
     */
    private String parentPhone;
    @JsonProperty(value = "total_profit")
    /**
     * 获取的总推广收益
     */
    private Long totalProfit;
    @JsonProperty(value = "parent_nickname")
    /**
     * 上线分销员的昵称
     */
    private String parentNickname;
    @JsonProperty(value = "customer_count")
    /**
     * 名下绑定的顾客数量
     */
    private Long customerCount;

    public void setOrderCount(Long orderCount) {
        this.orderCount = orderCount;
    }

    public Long getOrderCount() {
        return this.orderCount;
    }
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPid() {
        return this.pid;
    }
    public void setInvitationCount(Long invitationCount) {
        this.invitationCount = invitationCount;
    }

    public Long getInvitationCount() {
        return this.invitationCount;
    }
    public void setFromSource(Long fromSource) {
        this.fromSource = fromSource;
    }

    public Long getFromSource() {
        return this.fromSource;
    }
    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setVerifyAt(Long verifyAt) {
        this.verifyAt = verifyAt;
    }

    public Long getVerifyAt() {
        return this.verifyAt;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }
    public void setParentProfit(Long parentProfit) {
        this.parentProfit = parentProfit;
    }

    public Long getParentProfit() {
        return this.parentProfit;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return this.nickname;
    }
    public void setParentPid(String parentPid) {
        this.parentPid = parentPid;
    }

    public String getParentPid() {
        return this.parentPid;
    }
    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getParentPhone() {
        return this.parentPhone;
    }
    public void setTotalProfit(Long totalProfit) {
        this.totalProfit = totalProfit;
    }

    public Long getTotalProfit() {
        return this.totalProfit;
    }
    public void setParentNickname(String parentNickname) {
        this.parentNickname = parentNickname;
    }

    public String getParentNickname() {
        return this.parentNickname;
    }
    public void setCustomerCount(Long customerCount) {
        this.customerCount = customerCount;
    }

    public Long getCustomerCount() {
        return this.customerCount;
    }


}