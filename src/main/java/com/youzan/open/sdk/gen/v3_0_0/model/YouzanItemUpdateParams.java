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

public class YouzanItemUpdateParams implements APIParams, FileParams  {

    /**
     * 开始出售时间 (时间戳格式)，如1541548800，单位秒；默认为0，表示立即出售。
     */
    private Long autoListingTime;
    /**
     * 每人限购多少件。0代表无限购，默认为0
     */
    private Long buyQuota;
    /**
     * 商品分类的叶子类目id，可通过类目列表接口 https://open.youzan.com/apilist/detail/group_item/item_category/youzan.itemcategories.get 查询获得 。
     */
    private Long cid;
    /**
     * 运费模版id，可通过运费模板接口 https://open.youzan.com/apilist/detail/group_trade/logistics/youzan.logistics.template.search 查询获得
     */
    private Long deliveryTemplateId;
    /**
     * 商品描述。字数要大于5个字符，小于25000个字符 ,可以包含图片（上传有赞的图片），受违禁词控制。 格式如： <p>详情描述测试</p><p><img data-origin-width="800" data-origin-height="800" src="https://img.yzcdn.cn/test.jpg" /></p>
     */
    private String desc;
    /**
     * 付款成功 后发货天数, 默认0
     */
    private Long etdDays;
    /**
     * 预计发货结束时间。只支持全款预售，精确到日，格式2018-10-26 00:00:00
     */
    private String etdEnd;
    /**
     * 预计发货开始时间。只支持全款预售，精确到日，格式2018-10-26 00:00:00
     */
    private String etdStart;
    /**
     * 发货类型: 0, xxx 时间开始发货, 1, 付款 n 天后发货。
     */
    private Long etdType;
    /**
     * 是否隐藏商品库存。在商品展示时不显示商品的库存，默认0 显示库存，设置为1 不显示库存
     */
    private Long hideStock;
    /**
     * 酒店扩展信息，按以下格式：
{
"service_tel_code":"0571",//服务电话区号
"service_tel":"4790043"//服务电话
}
     */
    private String hotelExtra;
    /**
     * 图片id列表，用逗号分隔。可以通过 youzan.materials.storage.platform.img.upload 上传图片接口去上传图片后获取图片id （image_ids填了就是新增的图片，remove_image_ids是删除。要覆盖的以前的图片就把原来的删除，再增加新的，所以需要保存ids）
     */
    private String imageIds;
    /**
     * 是否上架商品。默认1 上架商品，设置为0 不上架商品，放入仓库
     */
    private Long isDisplay;
    /**
     * 是否为二手商品
     */
    private Boolean isUsed;
    /**
     * 商品ID,可以通过列表接口如youzan.items.onsale.get （查询出售中商品）和 youzan.items.inventory.get （查询仓库中商品）获取到
     */
    private Long itemId;
    /**
     * 商品编码（商家微商城后台发布商品时，为商品设置的外部编号）
     */
    private String itemNo;
    /**
     * 商品重量，没有SKU时用
     */
    private Long itemWeight;
    /**
     * 是否参加会员折扣。默认1，设置为1 参加会员折扣
     */
    private Long joinLevelDiscount;
    /**
     * 商品留言，"messages":"[{"datetime":0,"name":"手机","multiple":0,"type":"tel","required":1},{"datetime":0,"name":"邮件","multiple":0,"type":"email","required":1},{"datetime":0,"name":"留言","multiple":0,"type":"text","required":1},{"datetime":0,"name":"日期","multiple":0,"type":"date","required":1},{"datetime":1,"name":"时间","multiple":0,"type":"time","required":1},{"datetime":0,"name":"身份证","multiple":0,"type":"id_no","required":0},{"datetime":0,"name":"图片","multiple":0,"type":"image","required":1}]"

字段解释：
multiple 设置字段是否多行，1多行， 0单行；
required 是否必填 ，1必填， 0 可选；
datetime 如果设定是时间字段，值为1 ，其它都为0 ；
     */
    private String messages;
    /**
     * 商家自定义的序号
     */
    private Long num;
    /**
     * 显示在“原价”一栏中的信息
     */
    private String originPrice;
    /**
     * 运费，单位分，如传入500表示5元
     */
    private Long postFee;
    /**
     * 是否预售，是true ，否 false
     */
    private Boolean preSale;
    /**
     * 预售结束时间，只支持全款预售，精确到日，格式2018-10-26 00:00:00
     */
    private String preSaleEnd;
    /**
     * 价格，单位分，如传入11100表示111元
     */
    private Long price;
    /**
     * 是否设置商品购买权限
     */
    private Boolean purchaseRight;
    /**
     * 总库存
     */
    private Long quantity;
    /**
     * 要删除的商品图片id列表，英文逗号分隔，格式如"1,2"
     */
    private String removeImageIds;
    /**
     * 商品卖点信息，建议60个字以内
     */
    private String sellPoint;
    /**
     * SKU图片，仅支持第一级规格，
参数一定要与sku_stocks参数匹配，
如sku_stocks参数是这样的
[ { "price":10000, "quantity":100, "item_no":"MOYU-1", "skus":[ { "k":"颜色", "v":"绿色", }, { "k":"尺寸", "v":"l", }, { "k":"内存", "v":"1024G", } ] }, { "price":10000, "quantity":100, "item_no":"MOYU-2","skus":[ { "k":"颜色", "v":"绿色", }, { "k":"尺寸", "v":"l", }, { "k":"内存", "v":"16G", } ] } ]
颜色就是第一级规格。它下面的规格只有“绿色”这一项，sku_images应该与之一一对应，如下
[{"v":"绿色","img_url":"www.youzan.com"}]
请务必按此格式传参数，不然校验通不过，无法新增商品

     */
    private String skuImages;
    /**
     * 新接口重新组装成一个大JSON，传入一定要按照这个格式
     [
     {
     "price":10000,
     "quantity":100,
      "item_no":"ATC-002",
     "skus":[
     {
     "k":"颜色",
     "kid":1,
     "v":"绿色",
     "vid":1217
     },
     {
     "k":"尺寸",
     "kid":2,
     "v":"l",
     "vid":1367
     },
     {
     "k":"内存",
     "kid":41,
     "v":"1024G",
     "vid":303435
     }
     ]
     },
     {
     "price":10000,
     "quantity":100,
     "item_no":"ATC-002",
     "skus":[
     {
     "k":"颜色",
     "kid":1,
     "v":"绿色",
     "vid":1217
     },
     {
     "k":"尺寸",
     "kid":2,
     "v":"l",
     "vid":1367
     },
     {
     "k":"内存",
     "kid":41,
     "v":"16G",
     "vid":6356
     }
     ]
     }
     ]
注意：sku_stocks数量=规格1数量 * 规格2数量 * 规格3数量
     */
    private String skuStocks;
    /**
     * 带有SKU时用
按如下格式
    100,200
并且和SKU对应
     */
    private String skuWeight;
    /**
     * 是否标品，true表示是，false表示否
     */
    private Boolean standard;
    /**
     * 分组列表，字符串类型，分组id以逗号分割，默认只允许传入店铺下其他以及列表中隐藏分组
     */
    private String tagIds;
    /**
     * 商品页模板，可通过 https://open.youzan.com/apilist/detail/group_item/item/youzan.item.template.list.search 获得
     */
    private Long templateId;
    /**
     * 商品标题。不能超过100字，受违禁词控制
     */
    private String title;
    /**
     * 允许购买的粉丝等级，用逗号分隔
     */
    private String umpLevel;
    /**
     * 允许购买的粉丝标签，用,号分隔
     */
    private String umpTags;
    /**
     * 虚拟信息扩展信息，一定要按如下JSON格式，否则校验不通过
{
	"item_id":122111,
	"item_validity_start":2322222,//虚拟商品有效期开始时间, 1970-01-01 开始的秒数,留空表示长期有效
	"item_validity_end":2322222,//虚拟商品有效期结束时间,1970-01-01 开始的秒数,留空表示长期有效
	"effective_type":1,//电子凭证生效类型，0 立即生效， 1 自定义推迟时间， 2 隔天生效
	"effective_delay_hours":1,//电子凭证自定义推迟时间
	"holidays_available":true//节假日是否可用
}
     */
    private String virtualExtra;

    public void setAutoListingTime(Long autoListingTime) {
        this.autoListingTime = autoListingTime;
    }

    public Long getAutoListingTime() {
        return this.autoListingTime;
    }

    public void setBuyQuota(Long buyQuota) {
        this.buyQuota = buyQuota;
    }

    public Long getBuyQuota() {
        return this.buyQuota;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setDeliveryTemplateId(Long deliveryTemplateId) {
        this.deliveryTemplateId = deliveryTemplateId;
    }

    public Long getDeliveryTemplateId() {
        return this.deliveryTemplateId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setEtdDays(Long etdDays) {
        this.etdDays = etdDays;
    }

    public Long getEtdDays() {
        return this.etdDays;
    }

    public void setEtdEnd(String etdEnd) {
        this.etdEnd = etdEnd;
    }

    public String getEtdEnd() {
        return this.etdEnd;
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

    public void setHideStock(Long hideStock) {
        this.hideStock = hideStock;
    }

    public Long getHideStock() {
        return this.hideStock;
    }

    public void setHotelExtra(String hotelExtra) {
        this.hotelExtra = hotelExtra;
    }

    public String getHotelExtra() {
        return this.hotelExtra;
    }

    public void setImageIds(String imageIds) {
        this.imageIds = imageIds;
    }

    public String getImageIds() {
        return this.imageIds;
    }

    public void setIsDisplay(Long isDisplay) {
        this.isDisplay = isDisplay;
    }

    public Long getIsDisplay() {
        return this.isDisplay;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    public Boolean getIsUsed() {
        return this.isUsed;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemNo() {
        return this.itemNo;
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

    public void setOriginPrice(String originPrice) {
        this.originPrice = originPrice;
    }

    public String getOriginPrice() {
        return this.originPrice;
    }

    public void setPostFee(Long postFee) {
        this.postFee = postFee;
    }

    public Long getPostFee() {
        return this.postFee;
    }

    public void setPreSale(Boolean preSale) {
        this.preSale = preSale;
    }

    public Boolean getPreSale() {
        return this.preSale;
    }

    public void setPreSaleEnd(String preSaleEnd) {
        this.preSaleEnd = preSaleEnd;
    }

    public String getPreSaleEnd() {
        return this.preSaleEnd;
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

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setRemoveImageIds(String removeImageIds) {
        this.removeImageIds = removeImageIds;
    }

    public String getRemoveImageIds() {
        return this.removeImageIds;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public String getSellPoint() {
        return this.sellPoint;
    }

    public void setSkuImages(String skuImages) {
        this.skuImages = skuImages;
    }

    public String getSkuImages() {
        return this.skuImages;
    }

    public void setSkuStocks(String skuStocks) {
        this.skuStocks = skuStocks;
    }

    public String getSkuStocks() {
        return this.skuStocks;
    }

    public void setSkuWeight(String skuWeight) {
        this.skuWeight = skuWeight;
    }

    public String getSkuWeight() {
        return this.skuWeight;
    }

    public void setStandard(Boolean standard) {
        this.standard = standard;
    }

    public Boolean getStandard() {
        return this.standard;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getTagIds() {
        return this.tagIds;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
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

    public void setVirtualExtra(String virtualExtra) {
        this.virtualExtra = virtualExtra;
    }

    public String getVirtualExtra() {
        return this.virtualExtra;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (autoListingTime != null) {
            params.put("auto_listing_time", autoListingTime);
        }
        if (buyQuota != null) {
            params.put("buy_quota", buyQuota);
        }
        if (cid != null) {
            params.put("cid", cid);
        }
        if (deliveryTemplateId != null) {
            params.put("delivery_template_id", deliveryTemplateId);
        }
        if (desc != null) {
            params.put("desc", desc);
        }
        if (etdDays != null) {
            params.put("etd_days", etdDays);
        }
        if (etdEnd != null) {
            params.put("etd_end", etdEnd);
        }
        if (etdStart != null) {
            params.put("etd_start", etdStart);
        }
        if (etdType != null) {
            params.put("etd_type", etdType);
        }
        if (hideStock != null) {
            params.put("hide_stock", hideStock);
        }
        if (hotelExtra != null) {
            params.put("hotel_extra", hotelExtra);
        }
        if (imageIds != null) {
            params.put("image_ids", imageIds);
        }
        if (isDisplay != null) {
            params.put("is_display", isDisplay);
        }
        if (isUsed != null) {
            params.put("is_used", isUsed);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (itemNo != null) {
            params.put("item_no", itemNo);
        }
        if (itemWeight != null) {
            params.put("item_weight", itemWeight);
        }
        if (joinLevelDiscount != null) {
            params.put("join_level_discount", joinLevelDiscount);
        }
        if (messages != null) {
            params.put("messages", messages);
        }
        if (num != null) {
            params.put("num", num);
        }
        if (originPrice != null) {
            params.put("origin_price", originPrice);
        }
        if (postFee != null) {
            params.put("post_fee", postFee);
        }
        if (preSale != null) {
            params.put("pre_sale", preSale);
        }
        if (preSaleEnd != null) {
            params.put("pre_sale_end", preSaleEnd);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (purchaseRight != null) {
            params.put("purchase_right", purchaseRight);
        }
        if (quantity != null) {
            params.put("quantity", quantity);
        }
        if (removeImageIds != null) {
            params.put("remove_image_ids", removeImageIds);
        }
        if (sellPoint != null) {
            params.put("sell_point", sellPoint);
        }
        if (skuImages != null) {
            params.put("sku_images", skuImages);
        }
        if (skuStocks != null) {
            params.put("sku_stocks", skuStocks);
        }
        if (skuWeight != null) {
            params.put("sku_weight", skuWeight);
        }
        if (standard != null) {
            params.put("standard", standard);
        }
        if (tagIds != null) {
            params.put("tag_ids", tagIds);
        }
        if (templateId != null) {
            params.put("template_id", templateId);
        }
        if (title != null) {
            params.put("title", title);
        }
        if (umpLevel != null) {
            params.put("ump_level", umpLevel);
        }
        if (umpTags != null) {
            params.put("ump_tags", umpTags);
        }
        if (virtualExtra != null) {
            params.put("virtual_extra", virtualExtra);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}