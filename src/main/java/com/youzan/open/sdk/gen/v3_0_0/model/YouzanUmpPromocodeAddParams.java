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

public class YouzanUmpPromocodeAddParams implements APIParams, FileParams  {

    /**
     * 如果 is_at_least 为 1，该字段表示订单必须满这个价格，优惠码才可用。单位：元，精确到分
     */
    private Float atLeast;
    /**
     * 通用优惠码必须为6至12个字符数字组合
     */
    private String code;
    /**
     * 优惠码类型，unique:表示一卡一码；general：表示通用码
     */
    private String codeType;
    /**
     * 使用说明
     */
    private String description;
    /**
     * 优惠码结束时间，时间格式：yyyy-MM-dd HH:mm:ss
     */
    private Date endAt;
    /**
     * 是否到期前4天发送提醒，0 表示不发送，1 表示发送
     */
    private Long expireNotice;
    /**
     * 是否设置满多少元可用，0 表示不限制，1 表示限制
     */
    private Long isAtLeast;
    /**
     * 是否仅原价购买商品时可用，0 表示否，1 表示是
     */
    private Long isForbidPreference;
    /**
     * 是否可分享领取链接，0 表示否，1 表示是
     */
    private Long isShare;
    /**
     * 是否同步微信卡券，0 表示否，1 表示是
     */
    private Long isSyncWeixin;
    /**
     * 领取优惠码要给用户打上的标签的ID，多个用半角逗号分隔
     */
    private String markTagIds;
    /**
     * 每人限领个数，取值范围是1-10
     */
    private Long quota;
    /**
     * 可用范围的类型，可选值：PART（部分商品可用，或指定商品可用）ALL（全部商品可用）
     */
    private String rangeType;
    /**
     * 同步微信卡券时填写，微信卡券的手机号
     */
    private String servicePhone;
    /**
     * 如果 range_type 为 PART，需要指定可用商品ID，多个用半角逗号分隔
     */
    private String specifyItemIds;
    /**
     * 优惠码生效时间，时间格式：yyyy-MM-dd HH:mm:ss
     */
    private Date startAt;
    /**
     * 优惠码标题
     */
    private String title;
    /**
     * 总库存
     */
    private Long total;
    /**
     * 优惠码面额。单位：元，精确到分
     */
    private Float value;
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

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getCodeType() {
        return this.codeType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
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
        if (code != null) {
            params.put("code", code);
        }
        if (codeType != null) {
            params.put("code_type", codeType);
        }
        if (description != null) {
            params.put("description", description);
        }
        if (endAt != null) {
            params.put("end_at", endAt);
        }
        if (expireNotice != null) {
            params.put("expire_notice", expireNotice);
        }
        if (isAtLeast != null) {
            params.put("is_at_least", isAtLeast);
        }
        if (isForbidPreference != null) {
            params.put("is_forbid_preference", isForbidPreference);
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