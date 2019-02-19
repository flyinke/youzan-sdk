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

public class YouzanUsersWeixinFollowersInfoSearchResult implements APIResult {

    @JsonProperty(value = "total_results")
    /**
     * 搜索到的微信粉丝用户总数
     */
    private Long totalResults;
    @JsonProperty(value = "users")
    /**
     * 搜索到的微信粉丝用户详细信息列表
     */
    private WeixinFansCustomerInfo[] users;

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
    public void setUsers(WeixinFansCustomerInfo[] users) {
        this.users = users;
    }

    public WeixinFansCustomerInfo[] getUsers() {
        return this.users;
    }

    public static class WeixinFansCustomerInfo {
            @JsonProperty(value = "user_id")
        /**
        * 微信粉丝用户ID
        */
        private Long userId;
            @JsonProperty(value = "weixin_open_id")
        /**
        * 微信粉丝用户的openid，可用于微信Api
        */
        private String weixinOpenId;
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
        private Long followTime;
            @JsonProperty(value = "sex")
        /**
        * 性别。可选值：m(男)，f(女)。未知则为空
        */
        private String sex;
            @JsonProperty(value = "city")
        /**
        * 所在城市
        */
        private String city;
            @JsonProperty(value = "province")
        /**
        * 所在身份
        */
        private String province;
            @JsonProperty(value = "country")
        /**
        * 所在国家
        */
        private String country;
            @JsonProperty(value = "points")
        /**
        * 当前积分（当入参fields字段传入"points"枚举值才会返回该字段。）
        */
        private Long points;
            @JsonProperty(value = "traded_num")
        /**
        * 成交订单笔数（当入参fields字段传入"trade"枚举值才会返回该字段。）
        */
        private Long tradedNum;
            @JsonProperty(value = "trade_money")
        /**
        * 成交订单总额。单位：元。（当入参fields字段传入"trade"枚举值才会返回该字段。）
        */
        private Float tradeMoney;
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
    
            public void setUserId(Long userId) {
            this.userId = userId;
        }

        public Long getUserId() {
            return this.userId;
        }

            public void setWeixinOpenId(String weixinOpenId) {
            this.weixinOpenId = weixinOpenId;
        }

        public String getWeixinOpenId() {
            return this.weixinOpenId;
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

            public void setFollowTime(Long followTime) {
            this.followTime = followTime;
        }

        public Long getFollowTime() {
            return this.followTime;
        }

            public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSex() {
            return this.sex;
        }

            public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return this.city;
        }

            public void setProvince(String province) {
            this.province = province;
        }

        public String getProvince() {
            return this.province;
        }

            public void setCountry(String country) {
            this.country = country;
        }

        public String getCountry() {
            return this.country;
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

            public void setTradeMoney(Float tradeMoney) {
            this.tradeMoney = tradeMoney;
        }

        public Float getTradeMoney() {
            return this.tradeMoney;
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


}