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

public class YouzanUmpPromocardAddParams implements APIParams, FileParams  {

    /**
     * 如果 is_at_least 为 1，该字段表示订单必须满这个价格，优惠券才可用。单位：元，精确到分
     */
    private Float atLeast;
    /**
     * 同步微信卡券时，设置是否可以转赠，1 为可转赠，0 为不可转赠
     */
    private Long canGiveFriend;
    /**
     * 优惠使用时间类型，1 表示固定活动时间（配合start_at和end_at 这两个字段使用）；2 表示延迟类型，几天后几天内有效（配合fixed_term和fixed_begin_term 这两个字段使用）
     */
    private Long dateType;
    /**
     * 使用说明
     */
    private String description;
    /**
     * 折扣（示例：88 8.8折）
     */
    private Long discount;
    /**
     * 优惠券结束时间，时间格式：yyyy-MM-dd HH:mm:ss
     */
    private Date endAt;
    /**
     * 是否到期前4天发送提醒，0 表示不发送，1 表示发送
     */
    private Long expireNotice;
    /**
     * 延迟开始的时间，如传入1，表示优惠券延迟1天生效；date_type=2时使用。
     */
    private Long fixedBeginTerm;
    /**
     * 固定时长，如传入1，表示优惠券1天内有效；date_type=2时使用。
     */
    private Long fixedTerm;
    /**
     * 是否设置满多少元可用，0 表示不限制，1 表示限制
     */
    private Long isAtLeast;
    /**
     * 是否仅原价购买商品时可用，0 表示否，1 表示是
     */
    private Long isForbidPreference;
    /**
     * 是否是随机优惠券，0 表示不随机，1 表示随机
     */
    private Long isRandom;
    /**
     * 是否可分享领取链接，0 表示否，1 表示是
     */
    private Long isShare;
    /**
     * 是否同步微信卡券，0 表示否，1 表示是
     */
    private Long isSyncWeixin;
    /**
     * 领取优惠券要给用户打上的标签的ID，多个用半角逗号分隔
     */
    private String markTagIds;
    /**
     * 是否限制领用者的等级，0 表示不限制，大于 0 表示领用者必须是这个等级ID
     */
    private Long needUserLevel;
    /**
     * 优惠属性，1表示优惠，2表示折扣
     */
    private Long preferentialType;
    /**
     * 每人限领个数，为 0 则表示不限制
     */
    private Long quota;
    /**
     * 可用范围的类型，可选值：PART（部分商品可用，或指定商品可用）ALL（全部商品可用）
     */
    private String rangeType;
    /**
     * 同步微信卡券时，卡券的客服电话
     */
    private String servicePhone;
    /**
     * 如果 range_type 为 PART，需要指定可用商品ID，多个用半角逗号分隔
     */
    private String specifyItemIds;
    /**
     * 优惠券生效时间，时间格式：yyyy-MM-dd HH:mm:ss
     */
    private Date startAt;
    /**
     * 优惠券标题
     */
    private String title;
    /**
     * 总库存
     */
    private Long total;
    /**
     * 优惠券面额。如果 is_random 为 1，则该字段表示随机金额的下限。单位：元，精确到分
     */
    private Float value;
    /**
     * 如果 is_random 为 1，则该字段表示随机金额的上限。单位：元，精确到分
     */
    private Float valueRandomTo;
    /**
     * 同步微信卡券时，选择的卡券颜色的值。例如：Color010
     */
    private String weixinColor;
    /**
     * 同步微信卡券时，选择的卡券颜色的RGB值。例如：	#55bd47
     */
    private String weixinColorRgb;
    /**
     * 同步微信卡券时，卡券的副标题，长度：18个字
     */
    private String weixinSubTitle;
    /**
     * 同步微信卡券时，卡券的标题，长度：9个字
     */
    private String weixinTitle;

    public void setAtLeast(Float atLeast) {
        this.atLeast = atLeast;
    }

    public Float getAtLeast() {
        return this.atLeast;
    }

    public void setCanGiveFriend(Long canGiveFriend) {
        this.canGiveFriend = canGiveFriend;
    }

    public Long getCanGiveFriend() {
        return this.canGiveFriend;
    }

    public void setDateType(Long dateType) {
        this.dateType = dateType;
    }

    public Long getDateType() {
        return this.dateType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Long getDiscount() {
        return this.discount;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Date getEndAt() {
        return this.endAt;
    }

    public void setExpireNotice(Long expireNotice) {
        this.expireNotice = expireNotice;
    }

    public Long getExpireNotice() {
        return this.expireNotice;
    }

    public void setFixedBeginTerm(Long fixedBeginTerm) {
        this.fixedBeginTerm = fixedBeginTerm;
    }

    public Long getFixedBeginTerm() {
        return this.fixedBeginTerm;
    }

    public void setFixedTerm(Long fixedTerm) {
        this.fixedTerm = fixedTerm;
    }

    public Long getFixedTerm() {
        return this.fixedTerm;
    }

    public void setIsAtLeast(Long isAtLeast) {
        this.isAtLeast = isAtLeast;
    }

    public Long getIsAtLeast() {
        return this.isAtLeast;
    }

    public void setIsForbidPreference(Long isForbidPreference) {
        this.isForbidPreference = isForbidPreference;
    }

    public Long getIsForbidPreference() {
        return this.isForbidPreference;
    }

    public void setIsRandom(Long isRandom) {
        this.isRandom = isRandom;
    }

    public Long getIsRandom() {
        return this.isRandom;
    }

    public void setIsShare(Long isShare) {
        this.isShare = isShare;
    }

    public Long getIsShare() {
        return this.isShare;
    }

    public void setIsSyncWeixin(Long isSyncWeixin) {
        this.isSyncWeixin = isSyncWeixin;
    }

    public Long getIsSyncWeixin() {
        return this.isSyncWeixin;
    }

    public void setMarkTagIds(String markTagIds) {
        this.markTagIds = markTagIds;
    }

    public String getMarkTagIds() {
        return this.markTagIds;
    }

    public void setNeedUserLevel(Long needUserLevel) {
        this.needUserLevel = needUserLevel;
    }

    public Long getNeedUserLevel() {
        return this.needUserLevel;
    }

    public void setPreferentialType(Long preferentialType) {
        this.preferentialType = preferentialType;
    }

    public Long getPreferentialType() {
        return this.preferentialType;
    }

    public void setQuota(Long quota) {
        this.quota = quota;
    }

    public Long getQuota() {
        return this.quota;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }

    public String getRangeType() {
        return this.rangeType;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public String getServicePhone() {
        return this.servicePhone;
    }

    public void setSpecifyItemIds(String specifyItemIds) {
        this.specifyItemIds = specifyItemIds;
    }

    public String getSpecifyItemIds() {
        return this.specifyItemIds;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getStartAt() {
        return this.startAt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Float getValue() {
        return this.value;
    }

    public void setValueRandomTo(Float valueRandomTo) {
        this.valueRandomTo = valueRandomTo;
    }

    public Float getValueRandomTo() {
        return this.valueRandomTo;
    }

    public void setWeixinColor(String weixinColor) {
        this.weixinColor = weixinColor;
    }

    public String getWeixinColor() {
        return this.weixinColor;
    }

    public void setWeixinColorRgb(String weixinColorRgb) {
        this.weixinColorRgb = weixinColorRgb;
    }

    public String getWeixinColorRgb() {
        return this.weixinColorRgb;
    }

    public void setWeixinSubTitle(String weixinSubTitle) {
        this.weixinSubTitle = weixinSubTitle;
    }

    public String getWeixinSubTitle() {
        return this.weixinSubTitle;
    }

    public void setWeixinTitle(String weixinTitle) {
        this.weixinTitle = weixinTitle;
    }

    public String getWeixinTitle() {
        return this.weixinTitle;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (atLeast != null) {
            params.put("at_least", atLeast);
        }
        if (canGiveFriend != null) {
            params.put("can_give_friend", canGiveFriend);
        }
        if (dateType != null) {
            params.put("date_type", dateType);
        }
        if (description != null) {
            params.put("description", description);
        }
        if (discount != null) {
            params.put("discount", discount);
        }
        if (endAt != null) {
            params.put("end_at", endAt);
        }
        if (expireNotice != null) {
            params.put("expire_notice", expireNotice);
        }
        if (fixedBeginTerm != null) {
            params.put("fixed_begin_term", fixedBeginTerm);
        }
        if (fixedTerm != null) {
            params.put("fixed_term", fixedTerm);
        }
        if (isAtLeast != null) {
            params.put("is_at_least", isAtLeast);
        }
        if (isForbidPreference != null) {
            params.put("is_forbid_preference", isForbidPreference);
        }
        if (isRandom != null) {
            params.put("is_random", isRandom);
        }
        if (isShare != null) {
            params.put("is_share", isShare);
        }
        if (isSyncWeixin != null) {
            params.put("is_sync_weixin", isSyncWeixin);
        }
        if (markTagIds != null) {
            params.put("mark_tag_ids", markTagIds);
        }
        if (needUserLevel != null) {
            params.put("need_user_level", needUserLevel);
        }
        if (preferentialType != null) {
            params.put("preferential_type", preferentialType);
        }
        if (quota != null) {
            params.put("quota", quota);
        }
        if (rangeType != null) {
            params.put("range_type", rangeType);
        }
        if (servicePhone != null) {
            params.put("service_phone", servicePhone);
        }
        if (specifyItemIds != null) {
            params.put("specify_item_ids", specifyItemIds);
        }
        if (startAt != null) {
            params.put("start_at", startAt);
        }
        if (title != null) {
            params.put("title", title);
        }
        if (total != null) {
            params.put("total", total);
        }
        if (value != null) {
            params.put("value", value);
        }
        if (valueRandomTo != null) {
            params.put("value_random_to", valueRandomTo);
        }
        if (weixinColor != null) {
            params.put("weixin_color", weixinColor);
        }
        if (weixinColorRgb != null) {
            params.put("weixin_color_rgb", weixinColorRgb);
        }
        if (weixinSubTitle != null) {
            params.put("weixin_sub_title", weixinSubTitle);
        }
        if (weixinTitle != null) {
            params.put("weixin_title", weixinTitle);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}