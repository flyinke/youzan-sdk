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

public class YouzanUsersWeixinFollowersPullResult implements APIResult {

    @JsonProperty(value = "users")
    /**
     * 搜索到的微信粉丝用户列表
     */
    private CrmWeixinFans[] users;
    @JsonProperty(value = "has_next")
    /**
     * 是否有下一页数据
     */
    private Boolean hasNext;
    @JsonProperty(value = "last_fans_id")
    /**
     * 当前列表中最后一个粉丝编码
     */
    private Long lastFansId;

    public void setUsers(CrmWeixinFans[] users) {
        this.users = users;
    }

    public CrmWeixinFans[] getUsers() {
        return this.users;
    }
    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Boolean getHasNext() {
        return this.hasNext;
    }
    public void setLastFansId(Long lastFansId) {
        this.lastFansId = lastFansId;
    }

    public Long getLastFansId() {
        return this.lastFansId;
    }

    public static class CrmUserTag {
            @JsonProperty(value = "id")
        /**
        * 标签ID
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 标签名
        */
        private String name;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        }

    public static class CrmFansLevel {
            @JsonProperty(value = "level_id")
        /**
        * 会员等级编码
        */
        private Long levelId;
            @JsonProperty(value = "level_name")
        /**
        * 会员等级名
        */
        private String levelName;
    
            public void setLevelId(Long levelId) {
            this.levelId = levelId;
        }

        public Long getLevelId() {
            return this.levelId;
        }

            public void setLevelName(String levelName) {
            this.levelName = levelName;
        }

        public String getLevelName() {
            return this.levelName;
        }

        }

    public static class CrmWeixinFans {
            @JsonProperty(value = "user_id")
        /**
        * 微信粉丝用户ID
        */
        private Long userId;
            @JsonProperty(value = "weixin_openid")
        /**
        * 微信粉丝用户的openid，可用于微信Api
        */
        private String weixinOpenid;
            @JsonProperty(value = "nick")
        /**
        * 微信粉丝用户的昵称
        */
        private String nick;
            @JsonProperty(value = "avatar")
        /**
        * 微信粉丝用户的头像Url
        */
        private String avatar;
            @JsonProperty(value = "follow_time")
        /**
        * 关注时间
        */
        private Date followTime;
            @JsonProperty(value = "sex")
        /**
        * 性别。可选值：m(男)，f(女)。未知则为空
        */
        private String sex;
            @JsonProperty(value = "province")
        /**
        * 所在身份
        */
        private String province;
            @JsonProperty(value = "city")
        /**
        * 所在城市
        */
        private String city;
            @JsonProperty(value = "points")
        /**
        * 当前积分
        */
        private Long points;
            @JsonProperty(value = "traded_num")
        /**
        * 成交订单笔数
        */
        private Long tradedNum;
            @JsonProperty(value = "traded_money")
        /**
        * 成交订单总额。单位：元
        */
        private Float tradedMoney;
            @JsonProperty(value = "tags")
        /**
        * 用户标签
        */
        private CrmUserTag[] tags;
            @JsonProperty(value = "level_info")
        /**
        * 粉丝会员等级的数据结构
        */
        private CrmFansLevel levelInfo;
            @JsonProperty(value = "is_follow")
        /**
        * 是否关注
        */
        private Boolean isFollow;
            @JsonProperty(value = "union_id")
        /**
        * 微信粉丝用户的unionid，可用于微信Api
        */
        private String unionId;
    
            public void setUserId(Long userId) {
            this.userId = userId;
        }

        public Long getUserId() {
            return this.userId;
        }

            public void setWeixinOpenid(String weixinOpenid) {
            this.weixinOpenid = weixinOpenid;
        }

        public String getWeixinOpenid() {
            return this.weixinOpenid;
        }

            public void setNick(String nick) {
            this.nick = nick;
        }

        public String getNick() {
            return this.nick;
        }

            public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getAvatar() {
            return this.avatar;
        }

            public void setFollowTime(Date followTime) {
            this.followTime = followTime;
        }

        public Date getFollowTime() {
            return this.followTime;
        }

            public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSex() {
            return this.sex;
        }

            public void setProvince(String province) {
            this.province = province;
        }

        public String getProvince() {
            return this.province;
        }

            public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return this.city;
        }

            public void setPoints(Long points) {
            this.points = points;
        }

        public Long getPoints() {
            return this.points;
        }

            public void setTradedNum(Long tradedNum) {
            this.tradedNum = tradedNum;
        }

        public Long getTradedNum() {
            return this.tradedNum;
        }

            public void setTradedMoney(Float tradedMoney) {
            this.tradedMoney = tradedMoney;
        }

        public Float getTradedMoney() {
            return this.tradedMoney;
        }

            public void setTags(CrmUserTag[] tags) {
            this.tags = tags;
        }

        public CrmUserTag[] getTags() {
            return this.tags;
        }

            public void setLevelInfo(CrmFansLevel levelInfo) {
            this.levelInfo = levelInfo;
        }

        public CrmFansLevel getLevelInfo() {
            return this.levelInfo;
        }

            public void setIsFollow(Boolean isFollow) {
            this.isFollow = isFollow;
        }

        public Boolean getIsFollow() {
            return this.isFollow;
        }

            public void setUnionId(String unionId) {
            this.unionId = unionId;
        }

        public String getUnionId() {
            return this.unionId;
        }

        }


}