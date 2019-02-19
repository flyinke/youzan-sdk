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

public class YouzanItemsCustomGetResult implements APIResult {

    @JsonProperty(value = "items")
    /**
     * 搜索到的商品列表
     */
    private ItemListOpenModel[] items;
    @JsonProperty(value = "count")
    /**
     * 商品总数量
     */
    private Long count;

    public void setItems(ItemListOpenModel[] items) {
        this.items = items;
    }

    public ItemListOpenModel[] getItems() {
        return this.items;
    }
    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return this.count;
    }

    public static class ItemListOpenModel {
            @JsonProperty(value = "item_id")
        /**
        * 商品的数字id
        */
        private Long itemId;
            @JsonProperty(value = "alias")
        /**
        * 商品别名，是一串字符
        */
        private String alias;
            @JsonProperty(value = "title")
        /**
        * 商品标题
        */
        private String title;
            @JsonProperty(value = "price")
        /**
        * 价格，单位分
        */
        private Long price;
            @JsonProperty(value = "item_type")
        /**
        * 商品类型
        */
        private Long itemType;
            @JsonProperty(value = "item_no")
        /**
        * 商家编码，商家给商品设置的商家编码。
        */
        private String itemNo;
            @JsonProperty(value = "quantity")
        /**
        * 总库存
        */
        private Long quantity;
            @JsonProperty(value = "post_type")
        /**
        * 运费类型，1 是统一运费，2是运费模板
        */
        private Long postType;
            @JsonProperty(value = "post_fee")
        /**
        * 运费，单位分。当post_type为1时的运费
        */
        private Long postFee;
            @JsonProperty(value = "created_time")
        /**
        * 创建时间
        */
        private String createdTime;
            @JsonProperty(value = "update_time")
        /**
        * 更新时间
        */
        private String updateTime;
            @JsonProperty(value = "detail_url")
        /**
        * 商品详情链接
        */
        private String detailUrl;
            @JsonProperty(value = "delivery_template")
        /**
        * 运费模板信息
        */
        private DeliveryTemplateOpenModel deliveryTemplate;
            @JsonProperty(value = "num")
        /**
        * 商家排序字段
        */
        private Long num;
            @JsonProperty(value = "item_imgs")
        /**
        * 图片信息
        */
        private ItemImageOpenModel[] itemImgs;
            @JsonProperty(value = "origin")
        /**
        * 商品划线价
        */
        private String origin;
            @JsonProperty(value = "classId")
        /**
        * 默认为"youzan_goods_selling"
        */
        private String classId;
            @JsonProperty(value = "image")
        /**
        * 图片链接
        */
        private String image;
            @JsonProperty(value = "shareIcon")
        /**
        * 同image
        */
        private String shareIcon;
            @JsonProperty(value = "shareTitle")
        /**
        * 商品标题
        */
        private String shareTitle;
            @JsonProperty(value = "shareDetail")
        /**
        * 同price
        */
        private Long shareDetail;
    
            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
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

            public void setItemType(Long itemType) {
            this.itemType = itemType;
        }

        public Long getItemType() {
            return this.itemType;
        }

            public void setItemNo(String itemNo) {
            this.itemNo = itemNo;
        }

        public String getItemNo() {
            return this.itemNo;
        }

            public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public Long getQuantity() {
            return this.quantity;
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

            public void setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
        }

        public String getCreatedTime() {
            return this.createdTime;
        }

            public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getUpdateTime() {
            return this.updateTime;
        }

            public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }

        public String getDetailUrl() {
            return this.detailUrl;
        }

            public void setDeliveryTemplate(DeliveryTemplateOpenModel deliveryTemplate) {
            this.deliveryTemplate = deliveryTemplate;
        }

        public DeliveryTemplateOpenModel getDeliveryTemplate() {
            return this.deliveryTemplate;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setItemImgs(ItemImageOpenModel[] itemImgs) {
            this.itemImgs = itemImgs;
        }

        public ItemImageOpenModel[] getItemImgs() {
            return this.itemImgs;
        }

            public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getOrigin() {
            return this.origin;
        }

            public void setClassId(String classId) {
            this.classId = classId;
        }

        public String getClassId() {
            return this.classId;
        }

            public void setImage(String image) {
            this.image = image;
        }

        public String getImage() {
            return this.image;
        }

            public void setShareIcon(String shareIcon) {
            this.shareIcon = shareIcon;
        }

        public String getShareIcon() {
            return this.shareIcon;
        }

            public void setShareTitle(String shareTitle) {
            this.shareTitle = shareTitle;
        }

        public String getShareTitle() {
            return this.shareTitle;
        }

            public void setShareDetail(Long shareDetail) {
            this.shareDetail = shareDetail;
        }

        public Long getShareDetail() {
            return this.shareDetail;
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


}