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

public class YouzanMeiCustomerListParams implements APIParams, FileParams  {

    /**
     * 按照归属门店进行过滤
0 表示不归属任何门店的会员
其他数字表示门店id
     */
    private String belongDeptIds;
    /**
     * 按照生日过滤
     */
    private Long birthdayNumberMax;
    /**
     * 按照生日过滤
     */
    private Long birthdayNumberMin;
    /**
     * 按照持有的卡id过滤。
需要拉取到所有的卡列表后的，使用里面的卡id
     */
    private Long cardId;
    /**
     * 按照营销顾问id过滤
     */
    private Long consultantId;
    /**
     * 按照积分范围过滤
     */
    private Long currentPointsMax;
    /**
     * 按照积分范围过滤
     */
    private Long currentPointsMin;
    /**
     * 1 表示按照降序排列
2 表示按照升序排列
     */
    private Long desc;
    /**
     * 过滤的关键词
     */
    private String keyword;
    /**
     * 关键词过滤的类型
1 表示关键词是手机号
2 表示关键词是会员名称
     */
    private Long keywordType;
    /**
     * 过滤消费频次。
d 表示天
w 表示周
m 表示月
y 表示年
例如1d 表示1天内没有消费；1w 表示一周内没有消费；1m 表示一个月内没有消费；1y 表示一年内没有消费
     */
    private String lastTrade;
    /**
     * 过滤等级。需要拉取到等级列表后使用获取到的对应等级的id
     */
    private Long levelId;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 排序字段
0 对创建时间排序
1 对购次排序
2 对购买均价排序
3 对最后购买时间排序
4 对总价排序
     */
    private Long orderByType;
    /**
     * 第几页
     */
    private Long page;
    /**
     * 每页的显示条目，最大200
     */
    private Long pageSize;
    /**
     * 按照来源过滤。
需要先拉取来源列表后，在使用里面的来源id
     */
    private Long source;
    /**
     * 按照标签过滤，需要拉取到标签列表后使用其中的id进行过滤
     */
    private String tagIds;
    /**
     * 过滤交易次数。
例如 3 表示消费3次以内
     */
    private Long tradeCount;

    public void setBelongDeptIds(String belongDeptIds) {
        this.belongDeptIds = belongDeptIds;
    }

    public String getBelongDeptIds() {
        return this.belongDeptIds;
    }

    public void setBirthdayNumberMax(Long birthdayNumberMax) {
        this.birthdayNumberMax = birthdayNumberMax;
    }

    public Long getBirthdayNumberMax() {
        return this.birthdayNumberMax;
    }

    public void setBirthdayNumberMin(Long birthdayNumberMin) {
        this.birthdayNumberMin = birthdayNumberMin;
    }

    public Long getBirthdayNumberMin() {
        return this.birthdayNumberMin;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getCardId() {
        return this.cardId;
    }

    public void setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
    }

    public Long getConsultantId() {
        return this.consultantId;
    }

    public void setCurrentPointsMax(Long currentPointsMax) {
        this.currentPointsMax = currentPointsMax;
    }

    public Long getCurrentPointsMax() {
        return this.currentPointsMax;
    }

    public void setCurrentPointsMin(Long currentPointsMin) {
        this.currentPointsMin = currentPointsMin;
    }

    public Long getCurrentPointsMin() {
        return this.currentPointsMin;
    }

    public void setDesc(Long desc) {
        this.desc = desc;
    }

    public Long getDesc() {
        return this.desc;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeywordType(Long keywordType) {
        this.keywordType = keywordType;
    }

    public Long getKeywordType() {
        return this.keywordType;
    }

    public void setLastTrade(String lastTrade) {
        this.lastTrade = lastTrade;
    }

    public String getLastTrade() {
        return this.lastTrade;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    public Long getLevelId() {
        return this.levelId;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setOrderByType(Long orderByType) {
        this.orderByType = orderByType;
    }

    public Long getOrderByType() {
        return this.orderByType;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPage() {
        return this.page;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setSource(Long source) {
        this.source = source;
    }

    public Long getSource() {
        return this.source;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getTagIds() {
        return this.tagIds;
    }

    public void setTradeCount(Long tradeCount) {
        this.tradeCount = tradeCount;
    }

    public Long getTradeCount() {
        return this.tradeCount;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (belongDeptIds != null) {
            params.put("belong_dept_ids", belongDeptIds);
        }
        if (birthdayNumberMax != null) {
            params.put("birthday_number_max", birthdayNumberMax);
        }
        if (birthdayNumberMin != null) {
            params.put("birthday_number_min", birthdayNumberMin);
        }
        if (cardId != null) {
            params.put("card_id", cardId);
        }
        if (consultantId != null) {
            params.put("consultant_id", consultantId);
        }
        if (currentPointsMax != null) {
            params.put("current_points_max", currentPointsMax);
        }
        if (currentPointsMin != null) {
            params.put("current_points_min", currentPointsMin);
        }
        if (desc != null) {
            params.put("desc", desc);
        }
        if (keyword != null) {
            params.put("keyword", keyword);
        }
        if (keywordType != null) {
            params.put("keyword_type", keywordType);
        }
        if (lastTrade != null) {
            params.put("last_trade", lastTrade);
        }
        if (levelId != null) {
            params.put("level_id", levelId);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (orderByType != null) {
            params.put("order_by_type", orderByType);
        }
        if (page != null) {
            params.put("page", page);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (tagIds != null) {
            params.put("tag_ids", tagIds);
        }
        if (tradeCount != null) {
            params.put("trade_count", tradeCount);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}