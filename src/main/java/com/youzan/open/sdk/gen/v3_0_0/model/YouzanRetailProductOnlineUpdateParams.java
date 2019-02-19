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

public class YouzanRetailProductOnlineUpdateParams implements APIParams, FileParams  {

    /**
     * 无规格组合商品组合明细，如：[{"related_combine_num":1000,"related_combine_price":12300,"related_combine_sku_id":7568911}]
     */
    private String combineParams;
    /**
     * 商品详情额外组件(固定值：-1)
     */
    private Long componentsExtraId;
    /**
     * 运费模板id（统一运费传0）
     */
    private Long deliveryTemplateId;
    /**
     * 电子卡券-电子凭证自定义推迟时间
     */
    private Long effectiveDelayHours;
    /**
     * 电子卡券-电子凭证生效类型，0 立即生效， 1 自定义推迟时间， 2 隔天生
     */
    private Long effectiveType;
    /**
     * 付款成功 后发货天数, 默认0。
     */
    private Long etdDays;
    /**
     * 预计发货开始时间, 字符串格式的时间
     */
    private String etdStart;
    /**
     * 发货类型: 0, xxx 时间开始发货(默认), 1, 付款 n 天后发货
     */
    private Long etdType;
    /**
     * 活动冻结结束时间, 时间戳, 单位毫秒
     */
    private Long freezingEndtime;
    /**
     * 商品编号
     */
    private String goodsNo;
    /**
     * 商品参与平台 0：普通商品。仅支持普通商品
     */
    private Long goodsPlatform;
    /**
     * 商品类型：0：普通商品，1: 拍卖商品, 3：ump降价拍，10:分销商品；20：会员卡商品；25：批发商品；30：收银台商品；35：酒店商品。仅支持普通商品
     */
    private Long goodsType;
    /**
     * 页面不显示商品库存: 0, 显示; 1, 不显示
     */
    private Long hideStock;
    /**
     * 电子卡券-节假日是否可用
     */
    private Boolean holidaysAvailable;
    /**
     * 是否删除
     */
    private Long isDelete;
    /**
     * 是否上架
0：未发布，草稿状态（wap看不到） 1：发布 （正常状态）
     */
    private Long isDisplay;
    /**
     * 是否虚拟商品，0否, 2 虚拟商品， 3 电子卡券
     */
    private Long isVirtual;
    /**
     * 网店商品id
     */
    private Long itemId;
    /**
     * 商品重量信息
     */
    private String itemSkuExtendParamList;
    /**
     * 有sku规格情况下，
商品的计量属性
     */
    private String itemSkuMeasProps;
    /**
     * 虚拟商品有效期结束时间,1970-01-01 开始的秒数,留空表示长期有效
     */
    private Long itemValidityEnd;
    /**
     * 虚拟商品有效期开始时间,1970-01-01 开始的秒数,留空表示长期有效
     */
    private Long itemValidityStart;
    /**
     * 商品重量, 没有sku规格情况下
     */
    private Long itemWeight;
    /**
     * 是否参加会员折扣，默认：0 不参加
     */
    private Long joinLevelDiscount;
    /**
     * 标记
     */
    private Long mark;
    /**
     * 留言信息，json
     */
    private String messages;
    /**
     * 序号
     */
    private Long num;
    /**
     * 显示在原价那里的信息
     */
    private String origin;
    /**
     * 图片地址,注意 图片地址必须是符合以下规则的json，且必须已https开头。
（例如：[{"url":"https://img.youzan.com/upload_files/2016/05/16/FjvGju7UwGfol_yAXK3RzxOGelt0.png","id":"642430978","width":"300","height":"299"},{"url":"https://img.youzan.com/upload_files/2016/05/20/FgNkCcgqoGd_fMDPPCas1UIX3aCM.jpg","id":"644360875","width":"640","height":"379"}]）
     */
    private String picture;
    /**
     * 照片高度
     */
    private Long pictureHeight;
    /**
     * 运费，单位：分（运费模版不为0的情况下、使用该字段计算运费）
     */
    private Long postage;
    /**
     * 是否预售
     */
    private Boolean preSale;
    /**
     * 价格（多规格商品，商品价格不得小于各个规格价格），单位：分
     */
    private Long price;
    /**
     * 是否限购
     */
    private Boolean purchaseRight;
    /**
     * 用户购买限额
     */
    private Long quota;
    /**
     * 无规格商品关联商品库商品
     */
    private Long relateSkuId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 销售类型：1单个销售，2组合销售
     */
    private Long sellType;
    /**
     * 规格图片所属规格项id
     */
    private Long skuImgDictId;
    /**
     * 规格图片所属规格项名称
     */
    private String skuImgDictValue;
    /**
     * 规格图片是否展示
     */
    private Boolean skuImgIsShow;
    /**
     * 规格图片父级id
     */
    private Long skuImgParentId;
    /**
     * sku图片信息
     */
    private String skuImgUrls;
    /**
     * 当前商品镜像的key
     */
    private String snapKey;
    /**
     * 开卖时间: 0 立即开售, 1 定时开售
     */
    private Long soldTime;
    /**
     * 请求来源（例：OPEN_XXXXX）
     */
    private String source;
    /**
     * 加星
     */
    private Long star;
    /**
     * 定时上架时间
     */
    private Long startSoldTime;
    /**
     * 多规格商品库存信息
注意：
实物商品至少关联一个商品库商品
当实物商品存在部分规格不关联的情况时，sku售价传0.01元，库存值传0。
例如：[{"sku_id":0,"related_sku_id":2250523,"price":100,"sell_stock_count":0,"sold_num":0,"cost_price":null,"sku_no":"P171011010602432","name":"测绘0333","skus":[{"k":"颜色","v":"粉色","kid":1,"vid":40172}],"k1":"颜色","v1":"粉色"},{"sku_id":0,"related_sku_id":2250523,"price":100,"sell_stock_count":12,"sold_num":0,"cost_price":null,"sku_no":"P171010025662807","name":"测试删除2","skus":[{"k":"颜色","v":"红色","kid":1,"vid":1215}],"k1":"颜色","v1":"红色"}]
     */
    private String stocks;
    /**
     * 子标题	
     */
    private String subTitle;
    /**
     * 商品分类，tagIds 的json 格式
     */
    private String tag;
    /**
     * 商品名称
     */
    private String title;
    /**
     * 总库存	
     */
    private Long totalStock;
    /**
     * 允许购买的粉丝等级
     */
    private String umpLevel;
    /**
     * 允许购买的粉丝标签
     */
    private String umpTags;
    /**
     * 视频id
     */
    private Long videoId;

    public void setCombineParams(String combineParams) {
        this.combineParams = combineParams;
    }

    public String getCombineParams() {
        return this.combineParams;
    }

    public void setComponentsExtraId(Long componentsExtraId) {
        this.componentsExtraId = componentsExtraId;
    }

    public Long getComponentsExtraId() {
        return this.componentsExtraId;
    }

    public void setDeliveryTemplateId(Long deliveryTemplateId) {
        this.deliveryTemplateId = deliveryTemplateId;
    }

    public Long getDeliveryTemplateId() {
        return this.deliveryTemplateId;
    }

    public void setEffectiveDelayHours(Long effectiveDelayHours) {
        this.effectiveDelayHours = effectiveDelayHours;
    }

    public Long getEffectiveDelayHours() {
        return this.effectiveDelayHours;
    }

    public void setEffectiveType(Long effectiveType) {
        this.effectiveType = effectiveType;
    }

    public Long getEffectiveType() {
        return this.effectiveType;
    }

    public void setEtdDays(Long etdDays) {
        this.etdDays = etdDays;
    }

    public Long getEtdDays() {
        return this.etdDays;
    }

    public void setEtdStart(String etdStart) {
        this.etdStart = etdStart;
    }

    public String getEtdStart() {
        return this.etdStart;
    }

    public void setEtdType(Long etdType) {
        this.etdType = etdType;
    }

    public Long getEtdType() {
        return this.etdType;
    }

    public void setFreezingEndtime(Long freezingEndtime) {
        this.freezingEndtime = freezingEndtime;
    }

    public Long getFreezingEndtime() {
        return this.freezingEndtime;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsNo() {
        return this.goodsNo;
    }

    public void setGoodsPlatform(Long goodsPlatform) {
        this.goodsPlatform = goodsPlatform;
    }

    public Long getGoodsPlatform() {
        return this.goodsPlatform;
    }

    public void setGoodsType(Long goodsType) {
        this.goodsType = goodsType;
    }

    public Long getGoodsType() {
        return this.goodsType;
    }

    public void setHideStock(Long hideStock) {
        this.hideStock = hideStock;
    }

    public Long getHideStock() {
        return this.hideStock;
    }

    public void setHolidaysAvailable(Boolean holidaysAvailable) {
        this.holidaysAvailable = holidaysAvailable;
    }

    public Boolean getHolidaysAvailable() {
        return this.holidaysAvailable;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }

    public Long getIsDelete() {
        return this.isDelete;
    }

    public void setIsDisplay(Long isDisplay) {
        this.isDisplay = isDisplay;
    }

    public Long getIsDisplay() {
        return this.isDisplay;
    }

    public void setIsVirtual(Long isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Long getIsVirtual() {
        return this.isVirtual;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemSkuExtendParamList(String itemSkuExtendParamList) {
        this.itemSkuExtendParamList = itemSkuExtendParamList;
    }

    public String getItemSkuExtendParamList() {
        return this.itemSkuExtendParamList;
    }

    public void setItemSkuMeasProps(String itemSkuMeasProps) {
        this.itemSkuMeasProps = itemSkuMeasProps;
    }

    public String getItemSkuMeasProps() {
        return this.itemSkuMeasProps;
    }

    public void setItemValidityEnd(Long itemValidityEnd) {
        this.itemValidityEnd = itemValidityEnd;
    }

    public Long getItemValidityEnd() {
        return this.itemValidityEnd;
    }

    public void setItemValidityStart(Long itemValidityStart) {
        this.itemValidityStart = itemValidityStart;
    }

    public Long getItemValidityStart() {
        return this.itemValidityStart;
    }

    public void setItemWeight(Long itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Long getItemWeight() {
        return this.itemWeight;
    }

    public void setJoinLevelDiscount(Long joinLevelDiscount) {
        this.joinLevelDiscount = joinLevelDiscount;
    }

    public Long getJoinLevelDiscount() {
        return this.joinLevelDiscount;
    }

    public void setMark(Long mark) {
        this.mark = mark;
    }

    public Long getMark() {
        return this.mark;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getMessages() {
        return this.messages;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNum() {
        return this.num;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPictureHeight(Long pictureHeight) {
        this.pictureHeight = pictureHeight;
    }

    public Long getPictureHeight() {
        return this.pictureHeight;
    }

    public void setPostage(Long postage) {
        this.postage = postage;
    }

    public Long getPostage() {
        return this.postage;
    }

    public void setPreSale(Boolean preSale) {
        this.preSale = preSale;
    }

    public Boolean getPreSale() {
        return this.preSale;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPurchaseRight(Boolean purchaseRight) {
        this.purchaseRight = purchaseRight;
    }

    public Boolean getPurchaseRight() {
        return this.purchaseRight;
    }

    public void setQuota(Long quota) {
        this.quota = quota;
    }

    public Long getQuota() {
        return this.quota;
    }

    public void setRelateSkuId(Long relateSkuId) {
        this.relateSkuId = relateSkuId;
    }

    public Long getRelateSkuId() {
        return this.relateSkuId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setSellType(Long sellType) {
        this.sellType = sellType;
    }

    public Long getSellType() {
        return this.sellType;
    }

    public void setSkuImgDictId(Long skuImgDictId) {
        this.skuImgDictId = skuImgDictId;
    }

    public Long getSkuImgDictId() {
        return this.skuImgDictId;
    }

    public void setSkuImgDictValue(String skuImgDictValue) {
        this.skuImgDictValue = skuImgDictValue;
    }

    public String getSkuImgDictValue() {
        return this.skuImgDictValue;
    }

    public void setSkuImgIsShow(Boolean skuImgIsShow) {
        this.skuImgIsShow = skuImgIsShow;
    }

    public Boolean getSkuImgIsShow() {
        return this.skuImgIsShow;
    }

    public void setSkuImgParentId(Long skuImgParentId) {
        this.skuImgParentId = skuImgParentId;
    }

    public Long getSkuImgParentId() {
        return this.skuImgParentId;
    }

    public void setSkuImgUrls(String skuImgUrls) {
        this.skuImgUrls = skuImgUrls;
    }

    public String getSkuImgUrls() {
        return this.skuImgUrls;
    }

    public void setSnapKey(String snapKey) {
        this.snapKey = snapKey;
    }

    public String getSnapKey() {
        return this.snapKey;
    }

    public void setSoldTime(Long soldTime) {
        this.soldTime = soldTime;
    }

    public Long getSoldTime() {
        return this.soldTime;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setStar(Long star) {
        this.star = star;
    }

    public Long getStar() {
        return this.star;
    }

    public void setStartSoldTime(Long startSoldTime) {
        this.startSoldTime = startSoldTime;
    }

    public Long getStartSoldTime() {
        return this.startSoldTime;
    }

    public void setStocks(String stocks) {
        this.stocks = stocks;
    }

    public String getStocks() {
        return this.stocks;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTotalStock(Long totalStock) {
        this.totalStock = totalStock;
    }

    public Long getTotalStock() {
        return this.totalStock;
    }

    public void setUmpLevel(String umpLevel) {
        this.umpLevel = umpLevel;
    }

    public String getUmpLevel() {
        return this.umpLevel;
    }

    public void setUmpTags(String umpTags) {
        this.umpTags = umpTags;
    }

    public String getUmpTags() {
        return this.umpTags;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public Long getVideoId() {
        return this.videoId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (combineParams != null) {
            params.put("combine_params", combineParams);
        }
        if (componentsExtraId != null) {
            params.put("components_extra_id", componentsExtraId);
        }
        if (deliveryTemplateId != null) {
            params.put("delivery_template_id", deliveryTemplateId);
        }
        if (effectiveDelayHours != null) {
            params.put("effective_delay_hours", effectiveDelayHours);
        }
        if (effectiveType != null) {
            params.put("effective_type", effectiveType);
        }
        if (etdDays != null) {
            params.put("etd_days", etdDays);
        }
        if (etdStart != null) {
            params.put("etd_start", etdStart);
        }
        if (etdType != null) {
            params.put("etd_type", etdType);
        }
        if (freezingEndtime != null) {
            params.put("freezing_endtime", freezingEndtime);
        }
        if (goodsNo != null) {
            params.put("goods_no", goodsNo);
        }
        if (goodsPlatform != null) {
            params.put("goods_platform", goodsPlatform);
        }
        if (goodsType != null) {
            params.put("goods_type", goodsType);
        }
        if (hideStock != null) {
            params.put("hide_stock", hideStock);
        }
        if (holidaysAvailable != null) {
            params.put("holidays_available", holidaysAvailable);
        }
        if (isDelete != null) {
            params.put("is_delete", isDelete);
        }
        if (isDisplay != null) {
            params.put("is_display", isDisplay);
        }
        if (isVirtual != null) {
            params.put("is_virtual", isVirtual);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (itemSkuExtendParamList != null) {
            params.put("item_sku_extend_param_list", itemSkuExtendParamList);
        }
        if (itemSkuMeasProps != null) {
            params.put("item_sku_meas_props", itemSkuMeasProps);
        }
        if (itemValidityEnd != null) {
            params.put("item_validity_end", itemValidityEnd);
        }
        if (itemValidityStart != null) {
            params.put("item_validity_start", itemValidityStart);
        }
        if (itemWeight != null) {
            params.put("item_weight", itemWeight);
        }
        if (joinLevelDiscount != null) {
            params.put("join_level_discount", joinLevelDiscount);
        }
        if (mark != null) {
            params.put("mark", mark);
        }
        if (messages != null) {
            params.put("messages", messages);
        }
        if (num != null) {
            params.put("num", num);
        }
        if (origin != null) {
            params.put("origin", origin);
        }
        if (picture != null) {
            params.put("picture", picture);
        }
        if (pictureHeight != null) {
            params.put("picture_height", pictureHeight);
        }
        if (postage != null) {
            params.put("postage", postage);
        }
        if (preSale != null) {
            params.put("pre_sale", preSale);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (purchaseRight != null) {
            params.put("purchase_right", purchaseRight);
        }
        if (quota != null) {
            params.put("quota", quota);
        }
        if (relateSkuId != null) {
            params.put("relate_sku_id", relateSkuId);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (sellType != null) {
            params.put("sell_type", sellType);
        }
        if (skuImgDictId != null) {
            params.put("sku_img_dict_id", skuImgDictId);
        }
        if (skuImgDictValue != null) {
            params.put("sku_img_dict_value", skuImgDictValue);
        }
        if (skuImgIsShow != null) {
            params.put("sku_img_is_show", skuImgIsShow);
        }
        if (skuImgParentId != null) {
            params.put("sku_img_parent_id", skuImgParentId);
        }
        if (skuImgUrls != null) {
            params.put("sku_img_urls", skuImgUrls);
        }
        if (snapKey != null) {
            params.put("snap_key", snapKey);
        }
        if (soldTime != null) {
            params.put("sold_time", soldTime);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (star != null) {
            params.put("star", star);
        }
        if (startSoldTime != null) {
            params.put("start_sold_time", startSoldTime);
        }
        if (stocks != null) {
            params.put("stocks", stocks);
        }
        if (subTitle != null) {
            params.put("sub_title", subTitle);
        }
        if (tag != null) {
            params.put("tag", tag);
        }
        if (title != null) {
            params.put("title", title);
        }
        if (totalStock != null) {
            params.put("total_stock", totalStock);
        }
        if (umpLevel != null) {
            params.put("ump_level", umpLevel);
        }
        if (umpTags != null) {
            params.put("ump_tags", umpTags);
        }
        if (videoId != null) {
            params.put("video_id", videoId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}