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

public class YouzanMeiMemberlevelGetResult implements APIResult {

    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "level_name")
    /**
     * 等级名称
     */
    private String levelName;
    @JsonProperty(value = "level_id")
    /**
     * 等级id
     */
    private Long levelId;
    @JsonProperty(value = "level_alias")
    /**
     * 等级别名
     */
    private String levelAlias;
    @JsonProperty(value = "level_right_settings")
    /**
     * 权益列表
     */
    private MeiLevelRightSetting[] levelRightSettings;

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getLevelName() {
        return this.levelName;
    }
    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    public Long getLevelId() {
        return this.levelId;
    }
    public void setLevelAlias(String levelAlias) {
        this.levelAlias = levelAlias;
    }

    public String getLevelAlias() {
        return this.levelAlias;
    }
    public void setLevelRightSettings(MeiLevelRightSetting[] levelRightSettings) {
        this.levelRightSettings = levelRightSettings;
    }

    public MeiLevelRightSetting[] getLevelRightSettings() {
        return this.levelRightSettings;
    }

    public static class MeiLevelRightSetting {
            @JsonProperty(value = "enable")
        /**
        * 是否启用
        */
        private Long enable;
            @JsonProperty(value = "value")
        /**
        * 权限项的具体值，比如折扣值
        */
        private Long value;
            @JsonProperty(value = "name")
        /**
        * 名称，在自定义权限中使用
        */
        private String name;
            @JsonProperty(value = "level_right_type")
        /**
        * 权益分类。1 通用类权益；2 折扣权益；3 自定义权益
        */
        private Long levelRightType;
            @JsonProperty(value = "member_right_type")
        /**
        * 会员权益分类。200 "等级商品折扣"；201 "等级服务折扣"；202  "等级产品包邮"；203  "等级生日祝福"；204 "等级自定义权限"
        */
        private Long memberRightType;
    
            public void setEnable(Long enable) {
            this.enable = enable;
        }

        public Long getEnable() {
            return this.enable;
        }

            public void setValue(Long value) {
            this.value = value;
        }

        public Long getValue() {
            return this.value;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setLevelRightType(Long levelRightType) {
            this.levelRightType = levelRightType;
        }

        public Long getLevelRightType() {
            return this.levelRightType;
        }

            public void setMemberRightType(Long memberRightType) {
            this.memberRightType = memberRightType;
        }

        public Long getMemberRightType() {
            return this.memberRightType;
        }

        }


}