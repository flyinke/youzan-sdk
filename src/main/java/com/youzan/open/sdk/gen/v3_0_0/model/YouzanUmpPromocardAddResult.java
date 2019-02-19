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

public class YouzanUmpPromocardAddResult implements APIResult {

    @JsonProperty(value = "promocard")
    /**
     * 新建优惠券信息
     */
    private UmpPromotionCard promocard;

    public void setPromocard(UmpPromotionCard promocard) {
        this.promocard = promocard;
    }

    public UmpPromotionCard getPromocard() {
        return this.promocard;
    }

    public static class GoodsSku {
            @JsonProperty(value = "outer_id")
        /**
        * 商家编码（商家为Sku设置的外部编号）
        */
        private String outerId;
            @JsonProperty(value = "sku_id")
        /**
        * Sku的ID，sku_id 在系统里<span style="color: #ff0000;">并不是唯一的</span>，结合商品ID一起使用才是唯一的。
        */
        private Long skuId;
            @JsonProperty(value = "sku_unique_code")
        /**
        * Sku在系统中的唯一编号，可以在开发者的系统中用作 Sku 的唯一ID，但不能用于调用接口
        */
        private String skuUniqueCode;
            @JsonProperty(value = "num_iid")
        /**
        * Sku所属商品的数字编号
        */
        private Long numIid;
            @JsonProperty(value = "quantity")
        /**
        * 属于这个Sku的商品的数量
        */
        private Long quantity;
            @JsonProperty(value = "properties_name")
        /**
        * Sku所对应的销售属性的中文名字串，格式如：pid1:vid1:pid_name1:vid_name1;pid2:vid2:pid_name2:vid_name2……
        */
        private String propertiesName;
            @JsonProperty(value = "properties_name_json")
        /**
        * Sku所对应的销售属性的Json字符串（需另行解析），
				该字段内容与properties_name字段除了格式不一样，内容完全一致。
				由于产品规格信息难以避免涉及到‘:’、‘,’、‘;’这些与解析规则冲突的字符，所以增加该字段。
				</br>格式定义：
<pre>

[
	{
		"kid": "20000",
		"vid": "3275069",
		"k": "品牌",
		"v": "盈讯"
	},
	{
		"kid": "1753146",
		"vid": "3485013",
		"k": "型号",
		"v": "F908"
	}
	.....
        */
        private String propertiesNameJson;
            @JsonProperty(value = "with_hold_quantity")
        /**
        * 商品在付款减库存的状态下，该Sku上未付款的订单数量
        */
        private Long withHoldQuantity;
            @JsonProperty(value = "price")
        /**
        * 商品的这个Sku的价格；精确到2位小数；单位：元
        */
        private Float price;
            @JsonProperty(value = "created")
        /**
        * Sku创建日期，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date created;
            @JsonProperty(value = "modified")
        /**
        * Sku最后修改日期，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date modified;
            @JsonProperty(value = "stock_locked")
        /**
        * Sku库存是否锁定 0:未锁定 1:锁定
        */
        private Long stockLocked;
    
            public void setOuterId(String outerId) {
            this.outerId = outerId;
        }

        public String getOuterId() {
            return this.outerId;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setSkuUniqueCode(String skuUniqueCode) {
            this.skuUniqueCode = skuUniqueCode;
        }

        public String getSkuUniqueCode() {
            return this.skuUniqueCode;
        }

            public void setNumIid(Long numIid) {
            this.numIid = numIid;
        }

        public Long getNumIid() {
            return this.numIid;
        }

            public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public Long getQuantity() {
            return this.quantity;
        }

            public void setPropertiesName(String propertiesName) {
            this.propertiesName = propertiesName;
        }

        public String getPropertiesName() {
            return this.propertiesName;
        }

            public void setPropertiesNameJson(String propertiesNameJson) {
            this.propertiesNameJson = propertiesNameJson;
        }

        public String getPropertiesNameJson() {
            return this.propertiesNameJson;
        }

            public void setWithHoldQuantity(Long withHoldQuantity) {
            this.withHoldQuantity = withHoldQuantity;
        }

        public Long getWithHoldQuantity() {
            return this.withHoldQuantity;
        }

            public void setPrice(Float price) {
            this.price = price;
        }

        public Float getPrice() {
            return this.price;
        }

            public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }

            public void setModified(Date modified) {
            this.modified = modified;
        }

        public Date getModified() {
            return this.modified;
        }

            public void setStockLocked(Long stockLocked) {
            this.stockLocked = stockLocked;
        }

        public Long getStockLocked() {
            return this.stockLocked;
        }

        }

    public static class UmpPromotionCard {
            @JsonProperty(value = "group_id")
        /**
        * 优惠券的ID
        */
        private Long groupId;
            @JsonProperty(value = "range_type")
        /**
        * 可用范围的类型，可选值：
						<br>PART（部分商品可用，或指定商品可用）
						<br>ALL（全部商品可用）
        */
        private String rangeType;
            @JsonProperty(value = "title")
        /**
        * 优惠券标题
        */
        private String title;
            @JsonProperty(value = "value")
        /**
        * 优惠券面额。如果 is_random 为 1，则该字段表示随机金额的下限。单位：元，精确到分
        */
        private Float value;
            @JsonProperty(value = "is_random")
        /**
        * 是否是随机优惠券，0 表示不随机，1 表示随机
        */
        private Long isRandom;
            @JsonProperty(value = "value_random_to")
        /**
        * 如果 is_random 为 1，则该字段表示随机金额的上限。单位：元，精确到分
        */
        private Float valueRandomTo;
            @JsonProperty(value = "need_user_level")
        /**
        * 是否限制领用者的等级，0 表示不限制，大于 0 表示领用者必须是这个等级ID
        */
        private Long needUserLevel;
            @JsonProperty(value = "user_level_name")
        /**
        * 限制领用者等级的名称
        */
        private String userLevelName;
            @JsonProperty(value = "quota")
        /**
        * 每人限领个数，为 0 则表示不限制
        */
        private Long quota;
            @JsonProperty(value = "is_at_least")
        /**
        * 是否设置满多少元可用，0 表示不限制，1 表示限制
        */
        private Long isAtLeast;
            @JsonProperty(value = "at_least")
        /**
        * 如果 is_at_least 为 1，该字段表示订单必须满这个价格，优惠券才可用。单位：元，精确到分
        */
        private Float atLeast;
            @JsonProperty(value = "total")
        /**
        * 总库存
        */
        private Long total;
            @JsonProperty(value = "stock")
        /**
        * 剩余可用库存
        */
        private Long stock;
            @JsonProperty(value = "start_at")
        /**
        * 优惠券生效时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date startAt;
            @JsonProperty(value = "end_at")
        /**
        * 优惠券结束时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date endAt;
            @JsonProperty(value = "expire_notice")
        /**
        * 是否到期前4天发送提醒，0 表示不发送，1 表示发送
        */
        private Long expireNotice;
            @JsonProperty(value = "description")
        /**
        * 使用说明
        */
        private String description;
            @JsonProperty(value = "is_forbid_preference")
        /**
        * 是否仅原价购买商品时可用，0 表示否，1 表示是
        */
        private Long isForbidPreference;
            @JsonProperty(value = "is_sync_weixin")
        /**
        * 是否同步微信卡券，0 表示否，1 表示是
        */
        private Long isSyncWeixin;
            @JsonProperty(value = "status")
        /**
        * 优惠券状态，0 表示有效，1 表示失效，2 表示微信卡券审核中
        */
        private Long status;
            @JsonProperty(value = "is_expired")
        /**
        * 优惠券是否已过期，0 表示未过期，1 表示已过期
        */
        private Long isExpired;
            @JsonProperty(value = "is_ongoing")
        /**
        * 优惠券是否进行中，0 表示不在进行中，1 表示进行中
        */
        private Long isOngoing;
            @JsonProperty(value = "is_share")
        /**
        * 是否可分享领取链接，0 表示否，1 表示是
        */
        private Long isShare;
            @JsonProperty(value = "fetch_url")
        /**
        * 优惠券领取链接
        */
        private String fetchUrl;
            @JsonProperty(value = "mark_tags")
        /**
        * 用户标签
        */
        private CrmUserTag[] markTags;
            @JsonProperty(value = "specify_items")
        /**
        * 商品数据结构
        */
        private GoodsDetail[] specifyItems;
            @JsonProperty(value = "stat_fetch_user_num")
        /**
        * 领取优惠券的人数
        */
        private Long statFetchUserNum;
            @JsonProperty(value = "stat_fetch_num")
        /**
        * 领取优惠券的次数
        */
        private Long statFetchNum;
            @JsonProperty(value = "stat_use_num")
        /**
        * 使用优惠券的次数
        */
        private Long statUseNum;
            @JsonProperty(value = "created")
        /**
        * 优惠券创建时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date created;
            @JsonProperty(value = "weixin_color")
        /**
        * 同步微信卡券，选择的卡券颜色的值
        */
        private String weixinColor;
            @JsonProperty(value = "weixin_color_rgb")
        /**
        * 同步微信卡券，选择的卡券颜色的RGB值
        */
        private String weixinColorRgb;
            @JsonProperty(value = "weixin_title")
        /**
        * 同步微信卡券，卡券的标题
        */
        private String weixinTitle;
            @JsonProperty(value = "weixin_sub_title")
        /**
        * 同步微信卡券，卡券的副标题
        */
        private String weixinSubTitle;
            @JsonProperty(value = "service_phone")
        /**
        * 同步微信卡券，卡券的客服电话
        */
        private String servicePhone;
            @JsonProperty(value = "can_give_friend")
        /**
        * 同步微信卡券，设置是否可以转赠，1 为可转赠，0 为不可转赠
        */
        private Long canGiveFriend;
    
            public void setGroupId(Long groupId) {
            this.groupId = groupId;
        }

        public Long getGroupId() {
            return this.groupId;
        }

            public void setRangeType(String rangeType) {
            this.rangeType = rangeType;
        }

        public String getRangeType() {
            return this.rangeType;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setValue(Float value) {
            this.value = value;
        }

        public Float getValue() {
            return this.value;
        }

            public void setIsRandom(Long isRandom) {
            this.isRandom = isRandom;
        }

        public Long getIsRandom() {
            return this.isRandom;
        }

            public void setValueRandomTo(Float valueRandomTo) {
            this.valueRandomTo = valueRandomTo;
        }

        public Float getValueRandomTo() {
            return this.valueRandomTo;
        }

            public void setNeedUserLevel(Long needUserLevel) {
            this.needUserLevel = needUserLevel;
        }

        public Long getNeedUserLevel() {
            return this.needUserLevel;
        }

            public void setUserLevelName(String userLevelName) {
            this.userLevelName = userLevelName;
        }

        public String getUserLevelName() {
            return this.userLevelName;
        }

            public void setQuota(Long quota) {
            this.quota = quota;
        }

        public Long getQuota() {
            return this.quota;
        }

            public void setIsAtLeast(Long isAtLeast) {
            this.isAtLeast = isAtLeast;
        }

        public Long getIsAtLeast() {
            return this.isAtLeast;
        }

            public void setAtLeast(Float atLeast) {
            this.atLeast = atLeast;
        }

        public Float getAtLeast() {
            return this.atLeast;
        }

            public void setTotal(Long total) {
            this.total = total;
        }

        public Long getTotal() {
            return this.total;
        }

            public void setStock(Long stock) {
            this.stock = stock;
        }

        public Long getStock() {
            return this.stock;
        }

            public void setStartAt(Date startAt) {
            this.startAt = startAt;
        }

        public Date getStartAt() {
            return this.startAt;
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

            public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

            public void setIsForbidPreference(Long isForbidPreference) {
            this.isForbidPreference = isForbidPreference;
        }

        public Long getIsForbidPreference() {
            return this.isForbidPreference;
        }

            public void setIsSyncWeixin(Long isSyncWeixin) {
            this.isSyncWeixin = isSyncWeixin;
        }

        public Long getIsSyncWeixin() {
            return this.isSyncWeixin;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setIsExpired(Long isExpired) {
            this.isExpired = isExpired;
        }

        public Long getIsExpired() {
            return this.isExpired;
        }

            public void setIsOngoing(Long isOngoing) {
            this.isOngoing = isOngoing;
        }

        public Long getIsOngoing() {
            return this.isOngoing;
        }

            public void setIsShare(Long isShare) {
            this.isShare = isShare;
        }

        public Long getIsShare() {
            return this.isShare;
        }

            public void setFetchUrl(String fetchUrl) {
            this.fetchUrl = fetchUrl;
        }

        public String getFetchUrl() {
            return this.fetchUrl;
        }

            public void setMarkTags(CrmUserTag[] markTags) {
            this.markTags = markTags;
        }

        public CrmUserTag[] getMarkTags() {
            return this.markTags;
        }

            public void setSpecifyItems(GoodsDetail[] specifyItems) {
            this.specifyItems = specifyItems;
        }

        public GoodsDetail[] getSpecifyItems() {
            return this.specifyItems;
        }

            public void setStatFetchUserNum(Long statFetchUserNum) {
            this.statFetchUserNum = statFetchUserNum;
        }

        public Long getStatFetchUserNum() {
            return this.statFetchUserNum;
        }

            public void setStatFetchNum(Long statFetchNum) {
            this.statFetchNum = statFetchNum;
        }

        public Long getStatFetchNum() {
            return this.statFetchNum;
        }

            public void setStatUseNum(Long statUseNum) {
            this.statUseNum = statUseNum;
        }

        public Long getStatUseNum() {
            return this.statUseNum;
        }

            public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
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

            public void setWeixinTitle(String weixinTitle) {
            this.weixinTitle = weixinTitle;
        }

        public String getWeixinTitle() {
            return this.weixinTitle;
        }

            public void setWeixinSubTitle(String weixinSubTitle) {
            this.weixinSubTitle = weixinSubTitle;
        }

        public String getWeixinSubTitle() {
            return this.weixinSubTitle;
        }

            public void setServicePhone(String servicePhone) {
            this.servicePhone = servicePhone;
        }

        public String getServicePhone() {
            return this.servicePhone;
        }

            public void setCanGiveFriend(Long canGiveFriend) {
            this.canGiveFriend = canGiveFriend;
        }

        public Long getCanGiveFriend() {
            return this.canGiveFriend;
        }

        }

    public static class GoodsTag {
            @JsonProperty(value = "id")
        /**
        * 商品标签的ID
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 商品标签的名称
        */
        private String name;
            @JsonProperty(value = "type")
        /**
        * 商品标签类型，0 自定义，1 未分类，2 最新，3 最热，4 隐藏
        */
        private Long type;
            @JsonProperty(value = "created")
        /**
        * 商品标签创建时间
        */
        private String created;
            @JsonProperty(value = "item_num")
        /**
        * 商品标签内的商品数量
        */
        private Long itemNum;
            @JsonProperty(value = "tag_url")
        /**
        * 商品标签的展示的URL地址
        */
        private String tagUrl;
            @JsonProperty(value = "share_url")
        /**
        * 分享出去的商品标签展示地址
        */
        private String shareUrl;
            @JsonProperty(value = "desc")
        /**
        * 商品标签描述
        */
        private String desc;
    
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

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setCreated(String created) {
            this.created = created;
        }

        public String getCreated() {
            return this.created;
        }

            public void setItemNum(Long itemNum) {
            this.itemNum = itemNum;
        }

        public Long getItemNum() {
            return this.itemNum;
        }

            public void setTagUrl(String tagUrl) {
            this.tagUrl = tagUrl;
        }

        public String getTagUrl() {
            return this.tagUrl;
        }

            public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
        }

        public String getShareUrl() {
            return this.shareUrl;
        }

            public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }

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

    public static class GoodsImage {
            @JsonProperty(value = "id")
        /**
        * 商品图片的ID
        */
        private Long id;
            @JsonProperty(value = "created")
        /**
        * 图片创建时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date created;
            @JsonProperty(value = "url")
        /**
        * 图片链接地址
        */
        private String url;
            @JsonProperty(value = "thumbnail")
        /**
        * 图片缩略图链接地址
        */
        private String thumbnail;
            @JsonProperty(value = "medium")
        /**
        * 中号大小图片链接地址
        */
        private String medium;
            @JsonProperty(value = "combine")
        /**
        * 组合图片链接地址
        */
        private String combine;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }

            public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return this.url;
        }

            public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getThumbnail() {
            return this.thumbnail;
        }

            public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getMedium() {
            return this.medium;
        }

            public void setCombine(String combine) {
            this.combine = combine;
        }

        public String getCombine() {
            return this.combine;
        }

        }

    public static class GoodsQrcode {
            @JsonProperty(value = "id")
        /**
        * 商品二维码的ID
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 二维码的名称
        */
        private String name;
            @JsonProperty(value = "desc")
        /**
        * 二维码的描述
        */
        private String desc;
            @JsonProperty(value = "created")
        /**
        * 商品二维码创建时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date created;
            @JsonProperty(value = "type")
        /**
        * 商品二维码类型。可选值：<br>
GOODS_SCAN_FOLLOW(扫码关注后购买商品) <br>
GOODS_SCAN_FOLLOW_DECREASE(扫码关注后减优惠额) <br>
GOODS_SCAN_FOLLOW_DISCOUNT(扫码关注后折扣) <br>
GOODS_SCAN_DECREASE(扫码直接减优惠额) <br>
GOODS_SCAN_DISCOUNT(扫码直接折扣) <br>
        */
        private String type;
            @JsonProperty(value = "discount")
        /**
        * 折扣，格式：9.0；单位：折，精确到小数点后 1 位。如果没有折扣，则为 0
        */
        private String discount;
            @JsonProperty(value = "decrease")
        /**
        * 减金额优惠，格式：5.00；单位：元；精确到：分。如果没有减额优惠，则为 0
        */
        private Float decrease;
            @JsonProperty(value = "link_url")
        /**
        * 扫码直接购买的二维码基于这个url生成。如果不是扫码直接购买的类型，则为空
        */
        private String linkUrl;
            @JsonProperty(value = "weixin_qrcode_url")
        /**
        * 扫码关注购买的二维码图片地址。如果不是扫码关注购买的类型，则为空
        */
        private String weixinQrcodeUrl;
    
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

            public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }

            public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }

            public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

            public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getDiscount() {
            return this.discount;
        }

            public void setDecrease(Float decrease) {
            this.decrease = decrease;
        }

        public Float getDecrease() {
            return this.decrease;
        }

            public void setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
        }

        public String getLinkUrl() {
            return this.linkUrl;
        }

            public void setWeixinQrcodeUrl(String weixinQrcodeUrl) {
            this.weixinQrcodeUrl = weixinQrcodeUrl;
        }

        public String getWeixinQrcodeUrl() {
            return this.weixinQrcodeUrl;
        }

        }

    public static class GoodsDetail {
            @JsonProperty(value = "num_iid")
        /**
        * 商品数字编号
        */
        private Long numIid;
            @JsonProperty(value = "alias")
        /**
        * 商品别称
        */
        private String alias;
            @JsonProperty(value = "title")
        /**
        * 商品标题
        */
        private String title;
            @JsonProperty(value = "cid")
        /**
        * 商品分类的叶子类目id，可参考API：kdt.itemcategories.get
        */
        private Long cid;
            @JsonProperty(value = "promotion_cid")
        /**
        * 商品推广栏目id，可参考API：kdt.itemcategories.promotions.get
        */
        private Long promotionCid;
            @JsonProperty(value = "tag_ids")
        /**
        * 商品标签id串，结构如：1234,1342,...，可参考API：kdt.itemcategories.tags.get
        */
        private String tagIds;
            @JsonProperty(value = "desc")
        /**
        * 商品描述
        */
        private String desc;
            @JsonProperty(value = "origin_price")
        /**
        * 显示在“原价”一栏中的信息
        */
        private String originPrice;
            @JsonProperty(value = "outer_id")
        /**
        * 商品货号（商家为商品设置的外部编号，可与商家外部系统对接）
        */
        private String outerId;
            @JsonProperty(value = "outer_buy_url")
        /**
        * 商品外部购买链接
        */
        private String outerBuyUrl;
            @JsonProperty(value = "buy_quota")
        /**
        * 每人限购多少件。0代表无限购，默认为0
        */
        private Long buyQuota;
            @JsonProperty(value = "created")
        /**
        * 商品的发布时间
        */
        private Date created;
            @JsonProperty(value = "is_virtual")
        /**
        * 是否为虚拟商品
        */
        private Boolean isVirtual;
            @JsonProperty(value = "virtual_type")
        /**
        * 普通商品0，电子卡券3
        */
        private Long virtualType;
            @JsonProperty(value = "item_validity_start")
        /**
        * 长期有效，留空；非空表示自定义有效期的开始时间
        */
        private Long itemValidityStart;
            @JsonProperty(value = "item_validity_end")
        /**
        * 长期有效，留空；非空表示自定义有效期的开始时间
        */
        private Long itemValidityEnd;
            @JsonProperty(value = "effective_type")
        /**
        * 电子凭证生效类型，0 立即生效， 1 自定义推迟时间， 2 隔天生效
        */
        private Long effectiveType;
            @JsonProperty(value = "effective_delay_hours")
        /**
        * 电子凭证自定义推迟时间
        */
        private Long effectiveDelayHours;
            @JsonProperty(value = "holidays_available")
        /**
        * 节假日是否可用
        */
        private Long holidaysAvailable;
            @JsonProperty(value = "is_listing")
        /**
        * 商品上架状态。true 为已上架，false 为已下架
        */
        private Boolean isListing;
            @JsonProperty(value = "is_lock")
        /**
        * 商品是否锁定。true 为已锁定，false 为未锁定
        */
        private Boolean isLock;
            @JsonProperty(value = "is_used")
        /**
        * 是否为二手商品
        */
        private Boolean isUsed;
            @JsonProperty(value = "product_type")
        /**
        * 是否为二手商品
        */
        private String productType;
            @JsonProperty(value = "auto_listing_time")
        /**
        * 商品定时上架（定时开售）的时间。没设置则为空
        */
        private Date autoListingTime;
            @JsonProperty(value = "detail_url")
        /**
        * 适合wap应用的商品详情url
        */
        private String detailUrl;
            @JsonProperty(value = "share_url")
        /**
        * 分享出去的商品详情url
        */
        private String shareUrl;
            @JsonProperty(value = "pic_url")
        /**
        * 商品主图片地址
        */
        private String picUrl;
            @JsonProperty(value = "pic_thumb_url")
        /**
        * 商品主图片缩略图地址
        */
        private String picThumbUrl;
            @JsonProperty(value = "num")
        /**
        * 商品数量
        */
        private Long num;
            @JsonProperty(value = "sold_num")
        /**
        * 商品销量
        */
        private Long soldNum;
            @JsonProperty(value = "price")
        /**
        * 商品价格，格式：5.00；单位：元；精确到：分
        */
        private Float price;
            @JsonProperty(value = "post_type")
        /**
        * 运费类型。<br>1：统一邮费；<br>2：运费模版;
        */
        private Long postType;
            @JsonProperty(value = "post_fee")
        /**
        * 运费（针对“统一运费”），格式：5.00；单位：元；精确到：分
        */
        private Float postFee;
            @JsonProperty(value = "delivery_template_fee")
        /**
        * 运费（针对“运费模版”），格式：5.00；单位：元；精确到：分<br>若存在运费区间，中间用逗号隔开，如 “5.00,9.00”
        */
        private String deliveryTemplateFee;
            @JsonProperty(value = "delivery_template_id")
        /**
        * 运费模版id
        */
        private Long deliveryTemplateId;
            @JsonProperty(value = "delivery_template_name")
        /**
        * 运费模版名称
        */
        private String deliveryTemplateName;
            @JsonProperty(value = "skus")
        /**
        * Sku数据结构
        */
        private GoodsSku[] skus;
            @JsonProperty(value = "item_imgs")
        /**
        * 商品图片数据结构
        */
        private GoodsImage[] itemImgs;
            @JsonProperty(value = "item_qrcodes")
        /**
        * 商品二维码数据结构
        */
        private GoodsQrcode[] itemQrcodes;
            @JsonProperty(value = "item_tags")
        /**
        * 商品标签数据结构
        */
        private GoodsTag[] itemTags;
            @JsonProperty(value = "item_type")
        /**
        * 商品类型。<br>0：普通商品；<br>10：分销商品;
        */
        private Long itemType;
            @JsonProperty(value = "is_supplier_item")
        /**
        * 是否是供货商商品。
        */
        private Boolean isSupplierItem;
            @JsonProperty(value = "like_count")
        /**
        * 商品点赞数
        */
        private Long likeCount;
            @JsonProperty(value = "template_id")
        /**
        * 模板id
        */
        private Long templateId;
            @JsonProperty(value = "template_title")
        /**
        * 模板名称
        */
        private String templateTitle;
            @JsonProperty(value = "join_level_discount")
        /**
        * 是否参加会员折扣
        */
        private Boolean joinLevelDiscount;
            @JsonProperty(value = "messages")
        /**
        * 商品留言
        */
        private Object messages;
            @JsonProperty(value = "order")
        /**
        * 商品序号
        */
        private Long order;
            @JsonProperty(value = "purchase_right")
        /**
        * 是否设置商品购买权限
        */
        private Long purchaseRight;
            @JsonProperty(value = "ump_tags")
        /**
        * 可购买该商品的用户标签id列表
        */
        private Object umpTags;
            @JsonProperty(value = "ump_level")
        /**
        * 可购买该商品的会员等级id列表
        */
        private Object umpLevel;
            @JsonProperty(value = "ump_tags_text")
        /**
        * 可购买该商品的用户标签名称列表
        */
        private Object umpTagsText;
            @JsonProperty(value = "ump_level_text")
        /**
        * 可购买该商品的会员等级名称列表
        */
        private Object umpLevelText;
            @JsonProperty(value = "stock_locked")
        /**
        * 商品库存是否锁定 0:未锁定 1:锁定，如果商品有SKU该字段恒为0
        */
        private Long stockLocked;
    
            public void setNumIid(Long numIid) {
            this.numIid = numIid;
        }

        public Long getNumIid() {
            return this.numIid;
        }

            public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getAlias() {
            return this.alias;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setCid(Long cid) {
            this.cid = cid;
        }

        public Long getCid() {
            return this.cid;
        }

            public void setPromotionCid(Long promotionCid) {
            this.promotionCid = promotionCid;
        }

        public Long getPromotionCid() {
            return this.promotionCid;
        }

            public void setTagIds(String tagIds) {
            this.tagIds = tagIds;
        }

        public String getTagIds() {
            return this.tagIds;
        }

            public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }

            public void setOriginPrice(String originPrice) {
            this.originPrice = originPrice;
        }

        public String getOriginPrice() {
            return this.originPrice;
        }

            public void setOuterId(String outerId) {
            this.outerId = outerId;
        }

        public String getOuterId() {
            return this.outerId;
        }

            public void setOuterBuyUrl(String outerBuyUrl) {
            this.outerBuyUrl = outerBuyUrl;
        }

        public String getOuterBuyUrl() {
            return this.outerBuyUrl;
        }

            public void setBuyQuota(Long buyQuota) {
            this.buyQuota = buyQuota;
        }

        public Long getBuyQuota() {
            return this.buyQuota;
        }

            public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }

            public void setIsVirtual(Boolean isVirtual) {
            this.isVirtual = isVirtual;
        }

        public Boolean getIsVirtual() {
            return this.isVirtual;
        }

            public void setVirtualType(Long virtualType) {
            this.virtualType = virtualType;
        }

        public Long getVirtualType() {
            return this.virtualType;
        }

            public void setItemValidityStart(Long itemValidityStart) {
            this.itemValidityStart = itemValidityStart;
        }

        public Long getItemValidityStart() {
            return this.itemValidityStart;
        }

            public void setItemValidityEnd(Long itemValidityEnd) {
            this.itemValidityEnd = itemValidityEnd;
        }

        public Long getItemValidityEnd() {
            return this.itemValidityEnd;
        }

            public void setEffectiveType(Long effectiveType) {
            this.effectiveType = effectiveType;
        }

        public Long getEffectiveType() {
            return this.effectiveType;
        }

            public void setEffectiveDelayHours(Long effectiveDelayHours) {
            this.effectiveDelayHours = effectiveDelayHours;
        }

        public Long getEffectiveDelayHours() {
            return this.effectiveDelayHours;
        }

            public void setHolidaysAvailable(Long holidaysAvailable) {
            this.holidaysAvailable = holidaysAvailable;
        }

        public Long getHolidaysAvailable() {
            return this.holidaysAvailable;
        }

            public void setIsListing(Boolean isListing) {
            this.isListing = isListing;
        }

        public Boolean getIsListing() {
            return this.isListing;
        }

            public void setIsLock(Boolean isLock) {
            this.isLock = isLock;
        }

        public Boolean getIsLock() {
            return this.isLock;
        }

            public void setIsUsed(Boolean isUsed) {
            this.isUsed = isUsed;
        }

        public Boolean getIsUsed() {
            return this.isUsed;
        }

            public void setProductType(String productType) {
            this.productType = productType;
        }

        public String getProductType() {
            return this.productType;
        }

            public void setAutoListingTime(Date autoListingTime) {
            this.autoListingTime = autoListingTime;
        }

        public Date getAutoListingTime() {
            return this.autoListingTime;
        }

            public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }

        public String getDetailUrl() {
            return this.detailUrl;
        }

            public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
        }

        public String getShareUrl() {
            return this.shareUrl;
        }

            public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getPicUrl() {
            return this.picUrl;
        }

            public void setPicThumbUrl(String picThumbUrl) {
            this.picThumbUrl = picThumbUrl;
        }

        public String getPicThumbUrl() {
            return this.picThumbUrl;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setSoldNum(Long soldNum) {
            this.soldNum = soldNum;
        }

        public Long getSoldNum() {
            return this.soldNum;
        }

            public void setPrice(Float price) {
            this.price = price;
        }

        public Float getPrice() {
            return this.price;
        }

            public void setPostType(Long postType) {
            this.postType = postType;
        }

        public Long getPostType() {
            return this.postType;
        }

            public void setPostFee(Float postFee) {
            this.postFee = postFee;
        }

        public Float getPostFee() {
            return this.postFee;
        }

            public void setDeliveryTemplateFee(String deliveryTemplateFee) {
            this.deliveryTemplateFee = deliveryTemplateFee;
        }

        public String getDeliveryTemplateFee() {
            return this.deliveryTemplateFee;
        }

            public void setDeliveryTemplateId(Long deliveryTemplateId) {
            this.deliveryTemplateId = deliveryTemplateId;
        }

        public Long getDeliveryTemplateId() {
            return this.deliveryTemplateId;
        }

            public void setDeliveryTemplateName(String deliveryTemplateName) {
            this.deliveryTemplateName = deliveryTemplateName;
        }

        public String getDeliveryTemplateName() {
            return this.deliveryTemplateName;
        }

            public void setSkus(GoodsSku[] skus) {
            this.skus = skus;
        }

        public GoodsSku[] getSkus() {
            return this.skus;
        }

            public void setItemImgs(GoodsImage[] itemImgs) {
            this.itemImgs = itemImgs;
        }

        public GoodsImage[] getItemImgs() {
            return this.itemImgs;
        }

            public void setItemQrcodes(GoodsQrcode[] itemQrcodes) {
            this.itemQrcodes = itemQrcodes;
        }

        public GoodsQrcode[] getItemQrcodes() {
            return this.itemQrcodes;
        }

            public void setItemTags(GoodsTag[] itemTags) {
            this.itemTags = itemTags;
        }

        public GoodsTag[] getItemTags() {
            return this.itemTags;
        }

            public void setItemType(Long itemType) {
            this.itemType = itemType;
        }

        public Long getItemType() {
            return this.itemType;
        }

            public void setIsSupplierItem(Boolean isSupplierItem) {
            this.isSupplierItem = isSupplierItem;
        }

        public Boolean getIsSupplierItem() {
            return this.isSupplierItem;
        }

            public void setLikeCount(Long likeCount) {
            this.likeCount = likeCount;
        }

        public Long getLikeCount() {
            return this.likeCount;
        }

            public void setTemplateId(Long templateId) {
            this.templateId = templateId;
        }

        public Long getTemplateId() {
            return this.templateId;
        }

            public void setTemplateTitle(String templateTitle) {
            this.templateTitle = templateTitle;
        }

        public String getTemplateTitle() {
            return this.templateTitle;
        }

            public void setJoinLevelDiscount(Boolean joinLevelDiscount) {
            this.joinLevelDiscount = joinLevelDiscount;
        }

        public Boolean getJoinLevelDiscount() {
            return this.joinLevelDiscount;
        }

            public void setMessages(Object messages) {
            this.messages = messages;
        }

        public Object getMessages() {
            return this.messages;
        }

            public void setOrder(Long order) {
            this.order = order;
        }

        public Long getOrder() {
            return this.order;
        }

            public void setPurchaseRight(Long purchaseRight) {
            this.purchaseRight = purchaseRight;
        }

        public Long getPurchaseRight() {
            return this.purchaseRight;
        }

            public void setUmpTags(Object umpTags) {
            this.umpTags = umpTags;
        }

        public Object getUmpTags() {
            return this.umpTags;
        }

            public void setUmpLevel(Object umpLevel) {
            this.umpLevel = umpLevel;
        }

        public Object getUmpLevel() {
            return this.umpLevel;
        }

            public void setUmpTagsText(Object umpTagsText) {
            this.umpTagsText = umpTagsText;
        }

        public Object getUmpTagsText() {
            return this.umpTagsText;
        }

            public void setUmpLevelText(Object umpLevelText) {
            this.umpLevelText = umpLevelText;
        }

        public Object getUmpLevelText() {
            return this.umpLevelText;
        }

            public void setStockLocked(Long stockLocked) {
            this.stockLocked = stockLocked;
        }

        public Long getStockLocked() {
            return this.stockLocked;
        }

        }


}