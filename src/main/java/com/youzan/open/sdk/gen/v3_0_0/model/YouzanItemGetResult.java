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

public class YouzanItemGetResult implements APIResult {

    @JsonProperty(value = "item")
    /**
     * 返回的商品详情
     */
    private ItemDetailOpenModel item;

    public void setItem(ItemDetailOpenModel item) {
        this.item = item;
    }

    public ItemDetailOpenModel getItem() {
        return this.item;
    }

    public static class FenxiaoExtendOpenModel {
            @JsonProperty(value = "supplier_kdt_id")
        /**
        * 供货店铺Id
        */
        private Long supplierKdtId;
            @JsonProperty(value = "supplier_goods_id")
        /**
        * 供货商品Id
        */
        private Long supplierGoodsId;
    
            public void setSupplierKdtId(Long supplierKdtId) {
            this.supplierKdtId = supplierKdtId;
        }

        public Long getSupplierKdtId() {
            return this.supplierKdtId;
        }

            public void setSupplierGoodsId(Long supplierGoodsId) {
            this.supplierGoodsId = supplierGoodsId;
        }

        public Long getSupplierGoodsId() {
            return this.supplierGoodsId;
        }

        }

    public static class ItemGroupOpenModel {
            @JsonProperty(value = "id")
        /**
        * id
        */
        private Long id;
            @JsonProperty(value = "type")
        /**
        * 分组类型
        */
        private Long type;
            @JsonProperty(value = "alias")
        /**
        * 别名
        */
        private String alias;
            @JsonProperty(value = "tag_url")
        /**
        * 分组链接
        */
        private String tagUrl;
            @JsonProperty(value = "share_url")
        /**
        * 分享链接
        */
        private String shareUrl;
            @JsonProperty(value = "item_num")
        /**
        * 商品数量
        */
        private Long itemNum;
            @JsonProperty(value = "created")
        /**
        * 创建时间
        */
        private String created;
            @JsonProperty(value = "desc")
        /**
        * 描述
        */
        private String desc;
            @JsonProperty(value = "name")
        /**
        * 分组名称
        */
        private String name;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getAlias() {
            return this.alias;
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

            public void setItemNum(Long itemNum) {
            this.itemNum = itemNum;
        }

        public Long getItemNum() {
            return this.itemNum;
        }

            public void setCreated(String created) {
            this.created = created;
        }

        public String getCreated() {
            return this.created;
        }

            public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        }

    public static class ItemHotelOpenModel {
            @JsonProperty(value = "service_tel_code")
        /**
        * 客服电话区号
        */
        private String serviceTelCode;
            @JsonProperty(value = "service_tel")
        /**
        * 客服电话
        */
        private String serviceTel;
    
            public void setServiceTelCode(String serviceTelCode) {
            this.serviceTelCode = serviceTelCode;
        }

        public String getServiceTelCode() {
            return this.serviceTelCode;
        }

            public void setServiceTel(String serviceTel) {
            this.serviceTel = serviceTel;
        }

        public String getServiceTel() {
            return this.serviceTel;
        }

        }

    public static class DeliveryTemplateOpenModel {
            @JsonProperty(value = "delivery_template_id")
        /**
        * 运费模板ID
        */
        private Long deliveryTemplateId;
            @JsonProperty(value = "delivery_template_fee")
        /**
        * 运费的范围
        */
        private String deliveryTemplateFee;
            @JsonProperty(value = "delivery_template_name")
        /**
        * 运费模板名称
        */
        private String deliveryTemplateName;
            @JsonProperty(value = "delivery_template_valuationType")
        /**
        * 运费模版的计算类型，1 按件 2 按重量 3 按体积
        */
        private Long deliveryTemplateValuationtype;
    
            public void setDeliveryTemplateId(Long deliveryTemplateId) {
            this.deliveryTemplateId = deliveryTemplateId;
        }

        public Long getDeliveryTemplateId() {
            return this.deliveryTemplateId;
        }

            public void setDeliveryTemplateFee(String deliveryTemplateFee) {
            this.deliveryTemplateFee = deliveryTemplateFee;
        }

        public String getDeliveryTemplateFee() {
            return this.deliveryTemplateFee;
        }

            public void setDeliveryTemplateName(String deliveryTemplateName) {
            this.deliveryTemplateName = deliveryTemplateName;
        }

        public String getDeliveryTemplateName() {
            return this.deliveryTemplateName;
        }

            public void setDeliveryTemplateValuationtype(Long deliveryTemplateValuationtype) {
            this.deliveryTemplateValuationtype = deliveryTemplateValuationtype;
        }

        public Long getDeliveryTemplateValuationtype() {
            return this.deliveryTemplateValuationtype;
        }

        }

    public static class SkuImageOpenModel {
            @JsonProperty(value = "v_id")
        /**
        * 规格值ID
        */
        private Long vId;
            @JsonProperty(value = "k_id")
        /**
        * 规格项ID，第一级规格项
        */
        private Long kId;
            @JsonProperty(value = "img_url")
        /**
        * SKU图片链接
        */
        private String imgUrl;
    
            public void setVId(Long vId) {
            this.vId = vId;
        }

        public Long getVId() {
            return this.vId;
        }

            public void setKId(Long kId) {
            this.kId = kId;
        }

        public Long getKId() {
            return this.kId;
        }

            public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getImgUrl() {
            return this.imgUrl;
        }

        }

    public static class ItemDetailOpenModel {
            @JsonProperty(value = "item_id")
        /**
        * 商品id
        */
        private Long itemId;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "title")
        /**
        * 标题
        */
        private String title;
            @JsonProperty(value = "desc")
        /**
        * 商品内容
        */
        private String desc;
            @JsonProperty(value = "origin_price")
        /**
        * 商品划线价格，可以自定义。例如 促销价：888
        */
        private String originPrice;
            @JsonProperty(value = "buy_quota")
        /**
        * 每人限购多少件。0代表无限购，默认为0
        */
        private Long buyQuota;
            @JsonProperty(value = "created")
        /**
        * 创建时间
        */
        private String created;
            @JsonProperty(value = "alias")
        /**
        * 短地址
        */
        private String alias;
            @JsonProperty(value = "cid")
        /**
        * 商品分类的叶子类目id
        */
        private Long cid;
            @JsonProperty(value = "tag_ids")
        /**
        * 商品标签id列表
        */
        private Number[] tagIds;
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
            @JsonProperty(value = "quantity")
        /**
        * 总库存
        */
        private Long quantity;
            @JsonProperty(value = "sold_num")
        /**
        * 总销量
        */
        private Long soldNum;
            @JsonProperty(value = "price")
        /**
        * 价格(分)
        */
        private Long price;
            @JsonProperty(value = "item_type")
        /**
        * 商品类型
0：普通商品
3：UMP降价拍
5：外卖商品
10：分销商品
20：会员卡商品
21：礼品卡商品
22：团购券
25：批发商品
30：收银台商品
31：知识付费商品
35：酒店商品
40：美业商品
60：虚拟商品
61：电子卡券
        */
        private Long itemType;
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
            @JsonProperty(value = "auto_listing_time")
        /**
        * 商品定时上架（定时开售）的时间。没设置则为空
        */
        private String autoListingTime;
            @JsonProperty(value = "join_level_discount")
        /**
        * 是否参加会员折扣
        */
        private Boolean joinLevelDiscount;
            @JsonProperty(value = "purchase_right")
        /**
        * 是否设置商品购买权限
        */
        private Boolean purchaseRight;
            @JsonProperty(value = "post_type")
        /**
        * 运费类型
        */
        private Long postType;
            @JsonProperty(value = "post_fee")
        /**
        * 运费
        */
        private Long postFee;
            @JsonProperty(value = "item_no")
        /**
        * 商品货号（商家为商品设置的外部编号，可与商家外部系统对接）
        */
        private String itemNo;
            @JsonProperty(value = "presale_extend")
        /**
        * 商品预售信息
        */
        private ItemPreSaleOpenModel presaleExtend;
            @JsonProperty(value = "fenxiao_extend")
        /**
        * 商品分销信息
        */
        private FenxiaoExtendOpenModel fenxiaoExtend;
            @JsonProperty(value = "hotel_extend")
        /**
        * 商品酒店扩展信息
        */
        private ItemHotelOpenModel hotelExtend;
            @JsonProperty(value = "virtual_extend")
        /**
        * 虚拟商品扩展信息
        */
        private ItemVirtualOpenModel virtualExtend;
            @JsonProperty(value = "delivery_template_info")
        /**
        * 运费模板信息
        */
        private DeliveryTemplateOpenModel deliveryTemplateInfo;
            @JsonProperty(value = "skus")
        /**
        * 商品规格库存信息
        */
        private ItemSkuOpenModel[] skus;
            @JsonProperty(value = "item_imgs")
        /**
        * 图片信息
        */
        private ItemImageOpenModel[] itemImgs;
            @JsonProperty(value = "item_tags")
        /**
        * 分组信息
        */
        private ItemGroupOpenModel[] itemTags;
            @JsonProperty(value = "messages")
        /**
        * 商品留言
        */
        private String messages;
            @JsonProperty(value = "template")
        /**
        * 商品详情模板信息
        */
        private TemplateOpenModel template;
            @JsonProperty(value = "purchase_rightList")
        /**
        * 购买权限信息
        */
        private PurchaseRightOpenModel purchaseRightlist;
            @JsonProperty(value = "sku_images")
        /**
        * open api商品SKU图片模型
        */
        private SkuImageOpenModel[] skuImages;
            @JsonProperty(value = "num")
        /**
        * 商家排序字段
        */
        private Long num;
            @JsonProperty(value = "sell_point")
        /**
        * 商品卖点
        */
        private String sellPoint;
    
            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
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

            public void setBuyQuota(Long buyQuota) {
            this.buyQuota = buyQuota;
        }

        public Long getBuyQuota() {
            return this.buyQuota;
        }

            public void setCreated(String created) {
            this.created = created;
        }

        public String getCreated() {
            return this.created;
        }

            public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getAlias() {
            return this.alias;
        }

            public void setCid(Long cid) {
            this.cid = cid;
        }

        public Long getCid() {
            return this.cid;
        }

            public void setTagIds(Number[] tagIds) {
            this.tagIds = tagIds;
        }

        public Number[] getTagIds() {
            return this.tagIds;
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

            public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public Long getQuantity() {
            return this.quantity;
        }

            public void setSoldNum(Long soldNum) {
            this.soldNum = soldNum;
        }

        public Long getSoldNum() {
            return this.soldNum;
        }

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setItemType(Long itemType) {
            this.itemType = itemType;
        }

        public Long getItemType() {
            return this.itemType;
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

            public void setAutoListingTime(String autoListingTime) {
            this.autoListingTime = autoListingTime;
        }

        public String getAutoListingTime() {
            return this.autoListingTime;
        }

            public void setJoinLevelDiscount(Boolean joinLevelDiscount) {
            this.joinLevelDiscount = joinLevelDiscount;
        }

        public Boolean getJoinLevelDiscount() {
            return this.joinLevelDiscount;
        }

            public void setPurchaseRight(Boolean purchaseRight) {
            this.purchaseRight = purchaseRight;
        }

        public Boolean getPurchaseRight() {
            return this.purchaseRight;
        }

            public void setPostType(Long postType) {
            this.postType = postType;
        }

        public Long getPostType() {
            return this.postType;
        }

            public void setPostFee(Long postFee) {
            this.postFee = postFee;
        }

        public Long getPostFee() {
            return this.postFee;
        }

            public void setItemNo(String itemNo) {
            this.itemNo = itemNo;
        }

        public String getItemNo() {
            return this.itemNo;
        }

            public void setPresaleExtend(ItemPreSaleOpenModel presaleExtend) {
            this.presaleExtend = presaleExtend;
        }

        public ItemPreSaleOpenModel getPresaleExtend() {
            return this.presaleExtend;
        }

            public void setFenxiaoExtend(FenxiaoExtendOpenModel fenxiaoExtend) {
            this.fenxiaoExtend = fenxiaoExtend;
        }

        public FenxiaoExtendOpenModel getFenxiaoExtend() {
            return this.fenxiaoExtend;
        }

            public void setHotelExtend(ItemHotelOpenModel hotelExtend) {
            this.hotelExtend = hotelExtend;
        }

        public ItemHotelOpenModel getHotelExtend() {
            return this.hotelExtend;
        }

            public void setVirtualExtend(ItemVirtualOpenModel virtualExtend) {
            this.virtualExtend = virtualExtend;
        }

        public ItemVirtualOpenModel getVirtualExtend() {
            return this.virtualExtend;
        }

            public void setDeliveryTemplateInfo(DeliveryTemplateOpenModel deliveryTemplateInfo) {
            this.deliveryTemplateInfo = deliveryTemplateInfo;
        }

        public DeliveryTemplateOpenModel getDeliveryTemplateInfo() {
            return this.deliveryTemplateInfo;
        }

            public void setSkus(ItemSkuOpenModel[] skus) {
            this.skus = skus;
        }

        public ItemSkuOpenModel[] getSkus() {
            return this.skus;
        }

            public void setItemImgs(ItemImageOpenModel[] itemImgs) {
            this.itemImgs = itemImgs;
        }

        public ItemImageOpenModel[] getItemImgs() {
            return this.itemImgs;
        }

            public void setItemTags(ItemGroupOpenModel[] itemTags) {
            this.itemTags = itemTags;
        }

        public ItemGroupOpenModel[] getItemTags() {
            return this.itemTags;
        }

            public void setMessages(String messages) {
            this.messages = messages;
        }

        public String getMessages() {
            return this.messages;
        }

            public void setTemplate(TemplateOpenModel template) {
            this.template = template;
        }

        public TemplateOpenModel getTemplate() {
            return this.template;
        }

            public void setPurchaseRightlist(PurchaseRightOpenModel purchaseRightlist) {
            this.purchaseRightlist = purchaseRightlist;
        }

        public PurchaseRightOpenModel getPurchaseRightlist() {
            return this.purchaseRightlist;
        }

            public void setSkuImages(SkuImageOpenModel[] skuImages) {
            this.skuImages = skuImages;
        }

        public SkuImageOpenModel[] getSkuImages() {
            return this.skuImages;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setSellPoint(String sellPoint) {
            this.sellPoint = sellPoint;
        }

        public String getSellPoint() {
            return this.sellPoint;
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

    public static class ItemSkuOpenModel {
            @JsonProperty(value = "item_id")
        /**
        * 商品ID
        */
        private Long itemId;
            @JsonProperty(value = "sku_id")
        /**
        * 规格ID
        */
        private Long skuId;
            @JsonProperty(value = "sku_unique_code")
        /**
        * 唯一编码，店铺Id和商品Id组合
        */
        private String skuUniqueCode;
            @JsonProperty(value = "properties_name_json")
        /**
        * Sku所对应的销售属性的Json字符串（需另行解析）。
       格式定义：
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
        */
        private String propertiesNameJson;
            @JsonProperty(value = "with_hold_quantity")
        /**
        * 商品在付款减库存的状态下，该Sku上未付款的订单数量
        */
        private Long withHoldQuantity;
            @JsonProperty(value = "price")
        /**
        * 商品的这个Sku的价格，单位 分
        */
        private Long price;
            @JsonProperty(value = "created")
        /**
        * Sku创建日期，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private String created;
            @JsonProperty(value = "modified")
        /**
        * Sku最后修改日期，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private String modified;
            @JsonProperty(value = "quantity")
        /**
        * 属于这个Sku的商品的数量
        */
        private Long quantity;
            @JsonProperty(value = "item_no")
        /**
        * 商家编码（商家为Sku设置的外部编号）
        */
        private String itemNo;
            @JsonProperty(value = "sold_num")
        /**
        * 属于这个Sku的销量
        */
        private Long soldNum;
            @JsonProperty(value = "cost_price")
        /**
        * 属于这个Sku的成本价
        */
        private Long costPrice;
    
            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
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

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setCreated(String created) {
            this.created = created;
        }

        public String getCreated() {
            return this.created;
        }

            public void setModified(String modified) {
            this.modified = modified;
        }

        public String getModified() {
            return this.modified;
        }

            public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public Long getQuantity() {
            return this.quantity;
        }

            public void setItemNo(String itemNo) {
            this.itemNo = itemNo;
        }

        public String getItemNo() {
            return this.itemNo;
        }

            public void setSoldNum(Long soldNum) {
            this.soldNum = soldNum;
        }

        public Long getSoldNum() {
            return this.soldNum;
        }

            public void setCostPrice(Long costPrice) {
            this.costPrice = costPrice;
        }

        public Long getCostPrice() {
            return this.costPrice;
        }

        }

    public static class TemplateOpenModel {
            @JsonProperty(value = "template_id")
        /**
        * 模板ID
        */
        private Long templateId;
            @JsonProperty(value = "template_title")
        /**
        * 模板名称
        */
        private String templateTitle;
    
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

        }

    public static class ItemImageOpenModel {
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
            @JsonProperty(value = "created")
        /**
        * 图片创建时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private String created;
            @JsonProperty(value = "id")
        /**
        * 图片ID
        */
        private Long id;
    
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

            public void setCreated(String created) {
            this.created = created;
        }

        public String getCreated() {
            return this.created;
        }

            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

        }

    public static class PurchaseRightOpenModel {
            @JsonProperty(value = "ump_tags")
        /**
        * 可购买该商品的用户标签id列表
        */
        private String[] umpTags;
            @JsonProperty(value = "ump_levels")
        /**
        * 可购买该商品的会员等级id列表
        */
        private String[] umpLevels;
            @JsonProperty(value = "ump_tags_text")
        /**
        * 可购买该商品的用户标签名称列表
        */
        private String[] umpTagsText;
            @JsonProperty(value = "ump_level_text")
        /**
        * 可购买该商品的会员等级名称列表
        */
        private String[] umpLevelText;
    
            public void setUmpTags(String[] umpTags) {
            this.umpTags = umpTags;
        }

        public String[] getUmpTags() {
            return this.umpTags;
        }

            public void setUmpLevels(String[] umpLevels) {
            this.umpLevels = umpLevels;
        }

        public String[] getUmpLevels() {
            return this.umpLevels;
        }

            public void setUmpTagsText(String[] umpTagsText) {
            this.umpTagsText = umpTagsText;
        }

        public String[] getUmpTagsText() {
            return this.umpTagsText;
        }

            public void setUmpLevelText(String[] umpLevelText) {
            this.umpLevelText = umpLevelText;
        }

        public String[] getUmpLevelText() {
            return this.umpLevelText;
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