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

public class YouzanMeiMemberlevelUpdateParams implements APIParams, FileParams  {

    /**
     * 要更新的等级的等级id
     */
    private Long levelId;
    /**
     * 等级名称
     */
    private String levelName;
    /**
     * 权益列表
     */
    private String levelRightSettings;
    /**
     * 成长值
     */
    private Long levelValue;
    /**
     * 美业token
     */
    private String mToken;

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

    public void setLevelRightSettings(String levelRightSettings) {
        this.levelRightSettings = levelRightSettings;
    }

    public String getLevelRightSettings() {
        return this.levelRightSettings;
    }

    public void setLevelValue(Long levelValue) {
        this.levelValue = levelValue;
    }

    public Long getLevelValue() {
        return this.levelValue;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (levelId != null) {
            params.put("level_id", levelId);
        }
        if (levelName != null) {
            params.put("level_name", levelName);
        }
        if (levelRightSettings != null) {
            params.put("level_right_settings", levelRightSettings);
        }
        if (levelValue != null) {
            params.put("level_value", levelValue);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }

    public static class MeiLevelRightSetting {
            private Long enable;
            private Long value;
            private String name;
            private Long levelRightType;
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