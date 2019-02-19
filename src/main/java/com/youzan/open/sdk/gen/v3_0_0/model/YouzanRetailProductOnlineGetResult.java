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

public class YouzanRetailProductOnlineGetResult implements APIResult {

    @JsonProperty(value = "online_vo")
    /**
     * 网店商品实体信息
     */
    private OnlineProductVO onlineVo;

    public void setOnlineVo(OnlineProductVO onlineVo) {
        this.onlineVo = onlineVo;
    }

    public OnlineProductVO getOnlineVo() {
        return this.onlineVo;
    }

    public static class OnlineProductVO {
            @JsonProperty(value = "id")
        /**
        * 网店商品id
        */
        private Long id;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "alias")
        /**
        * 商品别名
        */
        private String alias;
            @JsonProperty(value = "title")
        /**
        * 标题
        */
        private String title;
            @JsonProperty(value = "price")
        /**
        * 价格 单位：分
        */
        private Long price;
            @JsonProperty(value = "origin")
        /**
        * 原价
        */
        private String origin;
            @JsonProperty(value = "postage")
        /**
        * 运费 单位：分
        */
        private Long postage;
            @JsonProperty(value = "content")
        /**
        * 商品模版详情内容
        */
        private String content;
            @JsonProperty(value = "components")
        /**
        * 商品模版json串
        */
        private String components;
            @JsonProperty(value = "components_extra_id")
        /**
        * 商品模版id
        */
        private Long componentsExtraId;
            @JsonProperty(value = "created_time")
        /**
        * 创建时间
        */
        private Long createdTime;
            @JsonProperty(value = "update_time")
        /**
        * 更新时间
        */
        private Long updateTime;
            @JsonProperty(value = "is_display")
        /**
        * 是否上架（1上架 0下架）
        */
        private Long isDisplay;
            @JsonProperty(value = "goods_type")
        /**
        * 商品类型 0：普通商品
        */
        private Long goodsType;
            @JsonProperty(value = "goods_no")
        /**
        * 商品编码
        */
        private String goodsNo;
            @JsonProperty(value = "is_virtual")
        /**
        * 是否虚拟商品，0否, 2 虚拟商品， 3 电子卡券
        */
        private Long isVirtual;
            @JsonProperty(value = "quota")
        /**
        * 每人限购多少件。0代表无限购，默认为0
        */
        private Long quota;
            @JsonProperty(value = "messages")
        /**
        * 商品留言
        */
        private String messages;
            @JsonProperty(value = "is_lock")
        /**
        * 是否锁定 1:是;0:否; 2,活动冻结
        */
        private Long isLock;
            @JsonProperty(value = "start_sold_time")
        /**
        * 定时上架时间
        */
        private Long startSoldTime;
            @JsonProperty(value = "join_level_discount")
        /**
        * 是否参加会员折扣 1参加；0不参加 ，默认：0 不参加
        */
        private Long joinLevelDiscount;
            @JsonProperty(value = "delivery_template_id")
        /**
        * 运费模版id
        */
        private Long deliveryTemplateId;
            @JsonProperty(value = "goods_platform")
        /**
        * 商品参与平台 0：普通商品
        */
        private Long goodsPlatform;
            @JsonProperty(value = "tag")
        /**
        * 分组信息
        */
        private String tag;
            @JsonProperty(value = "total_stock")
        /**
        * 库存总量
        */
        private Long totalStock;
            @JsonProperty(value = "picture")
        /**
        * 商品主图片地址
        */
        private String picture;
            @JsonProperty(value = "sold_time")
        /**
        * 开卖时间: 0 立即开售, 1 定时开售
        */
        private Long soldTime;
            @JsonProperty(value = "sub_title")
        /**
        * 商品子标题
        */
        private Long subTitle;
            @JsonProperty(value = "purchase_right")
        /**
        * 是否设置商品购买权限
        */
        private Boolean purchaseRight;
            @JsonProperty(value = "pre_sale")
        /**
        * 是否预售
        */
        private Boolean preSale;
            @JsonProperty(value = "total_sold_num")
        /**
        * 商品销量
        */
        private Long totalSoldNum;
            @JsonProperty(value = "pre_sale_info")
        /**
        * 商品预售信息
        */
        private ItemPreSaleOpenModel preSaleInfo;
            @JsonProperty(value = "ump_tags")
        /**
        * 可购买该商品的用户标签id列表
        */
        private Number[] umpTags;
            @JsonProperty(value = "virtual_extral")
        /**
        * 虚拟商品扩展信息
        */
        private ItemVirtualOpenModel virtualExtral;
            @JsonProperty(value = "ump_level")
        /**
        * 可购买该商品的会员等级id列表
        */
        private Number[] umpLevel;
            @JsonProperty(value = "sku_center_id")
        /**
        * 无规格商品关联的商品库商品
        */
        private Long skuCenterId;
            @JsonProperty(value = "item_sku_image_model")
        /**
        * 规格图片信息
        */
        private ItemSkuImageModel[] itemSkuImageModel;
            @JsonProperty(value = "stocks")
        /**
        * 商品规格信息
        */
        private ItemSkuModel[] stocks;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
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

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getOrigin() {
            return this.origin;
        }

            public void setPostage(Long postage) {
            this.postage = postage;
        }

        public Long getPostage() {
            return this.postage;
        }

            public void setContent(String content) {
            this.content = content;
        }

        public String getContent() {
            return this.content;
        }

            public void setComponents(String components) {
            this.components = components;
        }

        public String getComponents() {
            return this.components;
        }

            public void setComponentsExtraId(Long componentsExtraId) {
            this.componentsExtraId = componentsExtraId;
        }

        public Long getComponentsExtraId() {
            return this.componentsExtraId;
        }

            public void setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
        }

        public Long getCreatedTime() {
            return this.createdTime;
        }

            public void setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
        }

        public Long getUpdateTime() {
            return this.updateTime;
        }

            public void setIsDisplay(Long isDisplay) {
            this.isDisplay = isDisplay;
        }

        public Long getIsDisplay() {
            return this.isDisplay;
        }

            public void setGoodsType(Long goodsType) {
            this.goodsType = goodsType;
        }

        public Long getGoodsType() {
            return this.goodsType;
        }

            public void setGoodsNo(String goodsNo) {
            this.goodsNo = goodsNo;
        }

        public String getGoodsNo() {
            return this.goodsNo;
        }

            public void setIsVirtual(Long isVirtual) {
            this.isVirtual = isVirtual;
        }

        public Long getIsVirtual() {
            return this.isVirtual;
        }

            public void setQuota(Long quota) {
            this.quota = quota;
        }

        public Long getQuota() {
            return this.quota;
        }

            public void setMessages(String messages) {
            this.messages = messages;
        }

        public String getMessages() {
            return this.messages;
        }

            public void setIsLock(Long isLock) {
            this.isLock = isLock;
        }

        public Long getIsLock() {
            return this.isLock;
        }

            public void setStartSoldTime(Long startSoldTime) {
            this.startSoldTime = startSoldTime;
        }

        public Long getStartSoldTime() {
            return this.startSoldTime;
        }

            public void setJoinLevelDiscount(Long joinLevelDiscount) {
            this.joinLevelDiscount = joinLevelDiscount;
        }

        public Long getJoinLevelDiscount() {
            return this.joinLevelDiscount;
        }

            public void setDeliveryTemplateId(Long deliveryTemplateId) {
            this.deliveryTemplateId = deliveryTemplateId;
        }

        public Long getDeliveryTemplateId() {
            return this.deliveryTemplateId;
        }

            public void setGoodsPlatform(Long goodsPlatform) {
            this.goodsPlatform = goodsPlatform;
        }

        public Long getGoodsPlatform() {
            return this.goodsPlatform;
        }

            public void setTag(String tag) {
            this.tag = tag;
        }

        public String getTag() {
            return this.tag;
        }

            public void setTotalStock(Long totalStock) {
            this.totalStock = totalStock;
        }

        public Long getTotalStock() {
            return this.totalStock;
        }

            public void setPicture(String picture) {
            this.picture = picture;
        }

        public String getPicture() {
            return this.picture;
        }

            public void setSoldTime(Long soldTime) {
            this.soldTime = soldTime;
        }

        public Long getSoldTime() {
            return this.soldTime;
        }

            public void setSubTitle(Long subTitle) {
            this.subTitle = subTitle;
        }

        public Long getSubTitle() {
            return this.subTitle;
        }

            public void setPurchaseRight(Boolean purchaseRight) {
            this.purchaseRight = purchaseRight;
        }

        public Boolean getPurchaseRight() {
            return this.purchaseRight;
        }

            public void setPreSale(Boolean preSale) {
            this.preSale = preSale;
        }

        public Boolean getPreSale() {
            return this.preSale;
        }

            public void setTotalSoldNum(Long totalSoldNum) {
            this.totalSoldNum = totalSoldNum;
        }

        public Long getTotalSoldNum() {
            return this.totalSoldNum;
        }

            public void setPreSaleInfo(ItemPreSaleOpenModel preSaleInfo) {
            this.preSaleInfo = preSaleInfo;
        }

        public ItemPreSaleOpenModel getPreSaleInfo() {
            return this.preSaleInfo;
        }

            public void setUmpTags(Number[] umpTags) {
            this.umpTags = umpTags;
        }

        public Number[] getUmpTags() {
            return this.umpTags;
        }

            public void setVirtualExtral(ItemVirtualOpenModel virtualExtral) {
            this.virtualExtral = virtualExtral;
        }

        public ItemVirtualOpenModel getVirtualExtral() {
            return this.virtualExtral;
        }

            public void setUmpLevel(Number[] umpLevel) {
            this.umpLevel = umpLevel;
        }

        public Number[] getUmpLevel() {
            return this.umpLevel;
        }

            public void setSkuCenterId(Long skuCenterId) {
            this.skuCenterId = skuCenterId;
        }

        public Long getSkuCenterId() {
            return this.skuCenterId;
        }

            public void setItemSkuImageModel(ItemSkuImageModel[] itemSkuImageModel) {
            this.itemSkuImageModel = itemSkuImageModel;
        }

        public ItemSkuImageModel[] getItemSkuImageModel() {
            return this.itemSkuImageModel;
        }

            public void setStocks(ItemSkuModel[] stocks) {
            this.stocks = stocks;
        }

        public ItemSkuModel[] getStocks() {
            return this.stocks;
        }

        }

    public static class ItemSkuImageModel {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "item_id")
        /**
        * 商品id
        */
        private Long itemId;
            @JsonProperty(value = "dict_id")
        /**
        * 规格项ID，第一级规格项
        */
        private Long dictId;
            @JsonProperty(value = "dict_value")
        /**
        * 规格项名称，第一级规格项
        */
        private String dictValue;
            @JsonProperty(value = "node_value_id")
        /**
        * 规格值ID
        */
        private Long nodeValueId;
            @JsonProperty(value = "image_url")
        /**
        * 图片
        */
        private String imageUrl;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setDictId(Long dictId) {
            this.dictId = dictId;
        }

        public Long getDictId() {
            return this.dictId;
        }

            public void setDictValue(String dictValue) {
            this.dictValue = dictValue;
        }

        public String getDictValue() {
            return this.dictValue;
        }

            public void setNodeValueId(Long nodeValueId) {
            this.nodeValueId = nodeValueId;
        }

        public Long getNodeValueId() {
            return this.nodeValueId;
        }

            public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        }

    public static class ItemSkuModel {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺Id
        */
        private Long kdtId;
            @JsonProperty(value = "item_id")
        /**
        * 网店商品Id
        */
        private Long itemId;
            @JsonProperty(value = "price")
        /**
        * 售价，单位：分
        */
        private Long price;
            @JsonProperty(value = "stock_num")
        /**
        * 库存数量
        */
        private Long stockNum;
            @JsonProperty(value = "sku_no")
        /**
        * 商品规格编码
        */
        private String skuNo;
            @JsonProperty(value = "s1")
        /**
        * 第一个规格值id
        */
        private Long s1;
            @JsonProperty(value = "s2")
        /**
        * 第二个规格值id
        */
        private Long s2;
            @JsonProperty(value = "s3")
        /**
        * 第三个规格值id
        */
        private Long s3;
            @JsonProperty(value = "s4")
        /**
        * 第四个规格值id
        */
        private Long s4;
            @JsonProperty(value = "s5")
        /**
        * 第五个规格值id
        */
        private Long s5;
            @JsonProperty(value = "created_time")
        /**
        * 创建时间
        */
        private Long createdTime;
            @JsonProperty(value = "updateTime")
        /**
        * 更新时间
        */
        private Long updateTime;
            @JsonProperty(value = "name")
        /**
        * 规格名称
        */
        private Long name;
            @JsonProperty(value = "sku_center_id")
        /**
        * 规格关联的商品库商品
        */
        private Long skuCenterId;
            @JsonProperty(value = "cost_price")
        /**
        * 成本价
        */
        private Long costPrice;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setStockNum(Long stockNum) {
            this.stockNum = stockNum;
        }

        public Long getStockNum() {
            return this.stockNum;
        }

            public void setSkuNo(String skuNo) {
            this.skuNo = skuNo;
        }

        public String getSkuNo() {
            return this.skuNo;
        }

            public void setS1(Long s1) {
            this.s1 = s1;
        }

        public Long getS1() {
            return this.s1;
        }

            public void setS2(Long s2) {
            this.s2 = s2;
        }

        public Long getS2() {
            return this.s2;
        }

            public void setS3(Long s3) {
            this.s3 = s3;
        }

        public Long getS3() {
            return this.s3;
        }

            public void setS4(Long s4) {
            this.s4 = s4;
        }

        public Long getS4() {
            return this.s4;
        }

            public void setS5(Long s5) {
            this.s5 = s5;
        }

        public Long getS5() {
            return this.s5;
        }

            public void setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
        }

        public Long getCreatedTime() {
            return this.createdTime;
        }

            public void setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
        }

        public Long getUpdateTime() {
            return this.updateTime;
        }

            public void setName(Long name) {
            this.name = name;
        }

        public Long getName() {
            return this.name;
        }

            public void setSkuCenterId(Long skuCenterId) {
            this.skuCenterId = skuCenterId;
        }

        public Long getSkuCenterId() {
            return this.skuCenterId;
        }

            public void setCostPrice(Long costPrice) {
            this.costPrice = costPrice;
        }

        public Long getCostPrice() {
            return this.costPrice;
        }

        }

    public static class ItemVirtualOpenModel {
            @JsonProperty(value = "item_validity_start")
        /**
        * 虚拟商品有效期开始时间
        */
        private String itemValidityStart;
            @JsonProperty(value = "item_validity_end")
        /**
        * 虚拟商品有效期结束时间
        */
        private String itemValidityEnd;
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
        private Boolean holidaysAvailable;
    
            public void setItemValidityStart(String itemValidityStart) {
            this.itemValidityStart = itemValidityStart;
        }

        public String getItemValidityStart() {
            return this.itemValidityStart;
        }

            public void setItemValidityEnd(String itemValidityEnd) {
            this.itemValidityEnd = itemValidityEnd;
        }

        public String getItemValidityEnd() {
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

            public void setHolidaysAvailable(Boolean holidaysAvailable) {
            this.holidaysAvailable = holidaysAvailable;
        }

        public Boolean getHolidaysAvailable() {
            return this.holidaysAvailable;
        }

        }

    public static class ItemPreSaleOpenModel {
            @JsonProperty(value = "presale_end")
        /**
        * 预售结束时间
        */
        private String presaleEnd;
            @JsonProperty(value = "etd_start")
        /**
        * 发货开始时间
        */
        private String etdStart;
            @JsonProperty(value = "etd_end")
        /**
        * 发货结束时间
        */
        private String etdEnd;
            @JsonProperty(value = "etd_type")
        /**
        * 发货类型: 0, xxx 时间开始发货, 1, 付款 n 天后发货。
        */
        private Long etdType;
            @JsonProperty(value = "etd_days")
        /**
        * 付款成功 后发货天数。
        */
        private Long etdDays;
    
            public void setPresaleEnd(String presaleEnd) {
            this.presaleEnd = presaleEnd;
        }

        public String getPresaleEnd() {
            return this.presaleEnd;
        }

            public void setEtdStart(String etdStart) {
            this.etdStart = etdStart;
        }

        public String getEtdStart() {
            return this.etdStart;
        }

            public void setEtdEnd(String etdEnd) {
            this.etdEnd = etdEnd;
        }

        public String getEtdEnd() {
            return this.etdEnd;
        }

            public void setEtdType(Long etdType) {
            this.etdType = etdType;
        }

        public Long getEtdType() {
            return this.etdType;
        }

            public void setEtdDays(Long etdDays) {
            this.etdDays = etdDays;
        }

        public Long getEtdDays() {
            return this.etdDays;
        }

        }


}