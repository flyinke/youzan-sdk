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

public class YouzanMeiGoodsServingListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 商品列表
     */
    private MeiGoodsInfoResp[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiGoodsInfoResp[] items) {
        this.items = items;
    }

    public MeiGoodsInfoResp[] getItems() {
        return this.items;
    }

    public static class MeiGoodsSkuTreeResponse {
            @JsonProperty(value = "id")
        /**
        * 规格ID
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 规格名称
        */
        private String name;
            @JsonProperty(value = "leaf_list")
        /**
        * 商品规格项信息
        */
        private MeiGoodsSkuLeafResponse[] leafList;
    
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

            public void setLeafList(MeiGoodsSkuLeafResponse[] leafList) {
            this.leafList = leafList;
        }

        public MeiGoodsSkuLeafResponse[] getLeafList() {
            return this.leafList;
        }

        }

    public static class MeiGoodsSaleInfoResp {
            @JsonProperty(value = "shelve_num")
        /**
        * 上架店铺数量
        */
        private Long shelveNum;
            @JsonProperty(value = "sold_num")
        /**
        * 销量
        */
        private Long soldNum;
            @JsonProperty(value = "on_shelve")
        /**
        * 下架状态
        */
        private Long onShelve;
            @JsonProperty(value = "sold_out")
        /**
        * 是否售罄 1否 2部分 3全部售罄
        */
        private Long soldOut;
    
            public void setShelveNum(Long shelveNum) {
            this.shelveNum = shelveNum;
        }

        public Long getShelveNum() {
            return this.shelveNum;
        }

            public void setSoldNum(Long soldNum) {
            this.soldNum = soldNum;
        }

        public Long getSoldNum() {
            return this.soldNum;
        }

            public void setOnShelve(Long onShelve) {
            this.onShelve = onShelve;
        }

        public Long getOnShelve() {
            return this.onShelve;
        }

            public void setSoldOut(Long soldOut) {
            this.soldOut = soldOut;
        }

        public Long getSoldOut() {
            return this.soldOut;
        }

        }

    public static class MeiTagResponseDTO {
            @JsonProperty(value = "tag_id")
        /**
        * 标签ID
        */
        private Long tagId;
            @JsonProperty(value = "name")
        /**
        * 标签名称
        */
        private String name;
    
            public void setTagId(Long tagId) {
            this.tagId = tagId;
        }

        public Long getTagId() {
            return this.tagId;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        }

    public static class MeiPaginator {
            @JsonProperty(value = "total_count")
        /**
        * 总记录数
        */
        private Long totalCount;
            @JsonProperty(value = "page")
        /**
        * 第几页
        */
        private Long page;
            @JsonProperty(value = "page_size")
        /**
        * 每页显示的记录数
        */
        private Long pageSize;
    
            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
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

        }

    public static class MeiSkuNameResponseDTO {
            @JsonProperty(value = "kid")
        /**
        * 规格项目Id
        */
        private Long kid;
            @JsonProperty(value = "kname")
        /**
        * 规格项目名称
        */
        private String kname;
            @JsonProperty(value = "vid")
        /**
        * 规格Id
        */
        private Long vid;
            @JsonProperty(value = "vname")
        /**
        * 规格名称
        */
        private String vname;
    
            public void setKid(Long kid) {
            this.kid = kid;
        }

        public Long getKid() {
            return this.kid;
        }

            public void setKname(String kname) {
            this.kname = kname;
        }

        public String getKname() {
            return this.kname;
        }

            public void setVid(Long vid) {
            this.vid = vid;
        }

        public Long getVid() {
            return this.vid;
        }

            public void setVname(String vname) {
            this.vname = vname;
        }

        public String getVname() {
            return this.vname;
        }

        }

    public static class MeiGoodsPictureResponseDTO {
            @JsonProperty(value = "image_url")
        /**
        * 图片URL
        */
        private String imageUrl;
            @JsonProperty(value = "width")
        /**
        * 图片宽度
        */
        private Long width;
            @JsonProperty(value = "height")
        /**
        * 图片高度
        */
        private Long height;
    
            public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

            public void setWidth(Long width) {
            this.width = width;
        }

        public Long getWidth() {
            return this.width;
        }

            public void setHeight(Long height) {
            this.height = height;
        }

        public Long getHeight() {
            return this.height;
        }

        }

    public static class MeiGoodsProductInfo {
            @JsonProperty(value = "postage")
        /**
        * 邮费
        */
        private Long postage;
            @JsonProperty(value = "quantityUnitId")
        /**
        * 单位ID
        */
        private Long quantityUnitId;
            @JsonProperty(value = "quantityUnitName")
        /**
        * 单位名称
        */
        private String quantityUnitName;
    
            public void setPostage(Long postage) {
            this.postage = postage;
        }

        public Long getPostage() {
            return this.postage;
        }

            public void setQuantityUnitId(Long quantityUnitId) {
            this.quantityUnitId = quantityUnitId;
        }

        public Long getQuantityUnitId() {
            return this.quantityUnitId;
        }

            public void setQuantityUnitName(String quantityUnitName) {
            this.quantityUnitName = quantityUnitName;
        }

        public String getQuantityUnitName() {
            return this.quantityUnitName;
        }

        }

    public static class MeiCategoryResponseDTO {
            @JsonProperty(value = "id")
        /**
        * 分类ID
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 分类名称
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

    public static class MeiSkuInfoResponseDTO {
            @JsonProperty(value = "price")
        /**
        * 价格
        */
        private Long price;
            @JsonProperty(value = "sku_id")
        /**
        * 规格ID
        */
        private Long skuId;
            @JsonProperty(value = "sku_code")
        /**
        * 条形码
        */
        private String skuCode;
            @JsonProperty(value = "name_list")
        /**
        * 商品规格项信息
        */
        private MeiSkuNameResponseDTO[] nameList;
            @JsonProperty(value = "cost_price")
        /**
        * 成本价
        */
        private Long costPrice;
    
            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setSkuCode(String skuCode) {
            this.skuCode = skuCode;
        }

        public String getSkuCode() {
            return this.skuCode;
        }

            public void setNameList(MeiSkuNameResponseDTO[] nameList) {
            this.nameList = nameList;
        }

        public MeiSkuNameResponseDTO[] getNameList() {
            return this.nameList;
        }

            public void setCostPrice(Long costPrice) {
            this.costPrice = costPrice;
        }

        public Long getCostPrice() {
            return this.costPrice;
        }

        }

    public static class MeiGoodsStockResponseDTO {
            @JsonProperty(value = "goods_id")
        /**
        * 商品ID
        */
        private Long goodsId;
            @JsonProperty(value = "stock_num")
        /**
        * 库存数量
        */
        private Long stockNum;
            @JsonProperty(value = "goods_sku_stock_list")
        /**
        * 商品库存信息
        */
        private MeiGoodsSkuStockResponseDTO[] goodsSkuStockList;
    
            public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public Long getGoodsId() {
            return this.goodsId;
        }

            public void setStockNum(Long stockNum) {
            this.stockNum = stockNum;
        }

        public Long getStockNum() {
            return this.stockNum;
        }

            public void setGoodsSkuStockList(MeiGoodsSkuStockResponseDTO[] goodsSkuStockList) {
            this.goodsSkuStockList = goodsSkuStockList;
        }

        public MeiGoodsSkuStockResponseDTO[] getGoodsSkuStockList() {
            return this.goodsSkuStockList;
        }

        }

    public static class MeiGoodsInfoResp {
            @JsonProperty(value = "item_id")
        /**
        * 服务/产品 ID
        */
        private Long itemId;
            @JsonProperty(value = "goods_id")
        /**
        * 商品ID
        */
        private Long goodsId;
            @JsonProperty(value = "sn")
        /**
        * 条形码
        */
        private String sn;
            @JsonProperty(value = "title")
        /**
        * 商品名称
        */
        private String title;
            @JsonProperty(value = "create_time")
        /**
        * 创建时间
        */
        private Long createTime;
            @JsonProperty(value = "update_time")
        /**
        * 更新时间
        */
        private Long updateTime;
            @JsonProperty(value = "promotion_link")
        /**
        * 推广链接
        */
        private String promotionLink;
            @JsonProperty(value = "short_memo")
        /**
        * 服务简介
        */
        private String shortMemo;
            @JsonProperty(value = "memo")
        /**
        * 服务详情
        */
        private String memo;
            @JsonProperty(value = "price")
        /**
        * 最低价格
        */
        private Long price;
            @JsonProperty(value = "original_text")
        /**
        * 价格标签
        */
        private String originalText;
            @JsonProperty(value = "goods_type")
        /**
        * 商品类型  1 服务 2 产品
        */
        private Long goodsType;
            @JsonProperty(value = "sku_tree_list")
        /**
        * 商品规格信息
        */
        private MeiGoodsSkuTreeResponse[] skuTreeList;
            @JsonProperty(value = "goods_picture_list")
        /**
        * 商品图片信息
        */
        private MeiGoodsPictureResponseDTO[] goodsPictureList;
            @JsonProperty(value = "sku_info_list")
        /**
        * 商品规格信息
        */
        private MeiSkuInfoResponseDTO[] skuInfoList;
            @JsonProperty(value = "sale_info")
        /**
        * 售卖属性
        */
        private MeiGoodsSaleInfoResp saleInfo;
            @JsonProperty(value = "stock")
        /**
        * 商品库存信息
        */
        private MeiGoodsStockResponseDTO stock;
            @JsonProperty(value = "category")
        /**
        * 商品分类信息
        */
        private MeiCategoryResponseDTO category;
            @JsonProperty(value = "tag_list")
        /**
        * 商品标签信息
        */
        private MeiTagResponseDTO[] tagList;
            @JsonProperty(value = "product")
        /**
        * 美业商品产品信息
        */
        private MeiGoodsProductInfo product;
            @JsonProperty(value = "cost_price")
        /**
        * 成本价
        */
        private Long costPrice;
    
            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public Long getGoodsId() {
            return this.goodsId;
        }

            public void setSn(String sn) {
            this.sn = sn;
        }

        public String getSn() {
            return this.sn;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setCreateTime(Long createTime) {
            this.createTime = createTime;
        }

        public Long getCreateTime() {
            return this.createTime;
        }

            public void setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
        }

        public Long getUpdateTime() {
            return this.updateTime;
        }

            public void setPromotionLink(String promotionLink) {
            this.promotionLink = promotionLink;
        }

        public String getPromotionLink() {
            return this.promotionLink;
        }

            public void setShortMemo(String shortMemo) {
            this.shortMemo = shortMemo;
        }

        public String getShortMemo() {
            return this.shortMemo;
        }

            public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getMemo() {
            return this.memo;
        }

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setOriginalText(String originalText) {
            this.originalText = originalText;
        }

        public String getOriginalText() {
            return this.originalText;
        }

            public void setGoodsType(Long goodsType) {
            this.goodsType = goodsType;
        }

        public Long getGoodsType() {
            return this.goodsType;
        }

            public void setSkuTreeList(MeiGoodsSkuTreeResponse[] skuTreeList) {
            this.skuTreeList = skuTreeList;
        }

        public MeiGoodsSkuTreeResponse[] getSkuTreeList() {
            return this.skuTreeList;
        }

            public void setGoodsPictureList(MeiGoodsPictureResponseDTO[] goodsPictureList) {
            this.goodsPictureList = goodsPictureList;
        }

        public MeiGoodsPictureResponseDTO[] getGoodsPictureList() {
            return this.goodsPictureList;
        }

            public void setSkuInfoList(MeiSkuInfoResponseDTO[] skuInfoList) {
            this.skuInfoList = skuInfoList;
        }

        public MeiSkuInfoResponseDTO[] getSkuInfoList() {
            return this.skuInfoList;
        }

            public void setSaleInfo(MeiGoodsSaleInfoResp saleInfo) {
            this.saleInfo = saleInfo;
        }

        public MeiGoodsSaleInfoResp getSaleInfo() {
            return this.saleInfo;
        }

            public void setStock(MeiGoodsStockResponseDTO stock) {
            this.stock = stock;
        }

        public MeiGoodsStockResponseDTO getStock() {
            return this.stock;
        }

            public void setCategory(MeiCategoryResponseDTO category) {
            this.category = category;
        }

        public MeiCategoryResponseDTO getCategory() {
            return this.category;
        }

            public void setTagList(MeiTagResponseDTO[] tagList) {
            this.tagList = tagList;
        }

        public MeiTagResponseDTO[] getTagList() {
            return this.tagList;
        }

            public void setProduct(MeiGoodsProductInfo product) {
            this.product = product;
        }

        public MeiGoodsProductInfo getProduct() {
            return this.product;
        }

            public void setCostPrice(Long costPrice) {
            this.costPrice = costPrice;
        }

        public Long getCostPrice() {
            return this.costPrice;
        }

        }

    public static class MeiGoodsSkuLeafResponse {
            @JsonProperty(value = "id")
        /**
        * 规格项ID
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 规格项名称
        */
        private String name;
            @JsonProperty(value = "imageUrl")
        /**
        * 规格项图片
        */
        private String imageUrl;
    
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

            public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        }

    public static class MeiGoodsSkuStockResponseDTO {
            @JsonProperty(value = "sku_id")
        /**
        * 规格ID
        */
        private Long skuId;
            @JsonProperty(value = "stock_num")
        /**
        * 库存数量
        */
        private Long stockNum;
            @JsonProperty(value = "total_sold_num")
        /**
        * 总销量
        */
        private Long totalSoldNum;
    
            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setStockNum(Long stockNum) {
            this.stockNum = stockNum;
        }

        public Long getStockNum() {
            return this.stockNum;
        }

            public void setTotalSoldNum(Long totalSoldNum) {
            this.totalSoldNum = totalSoldNum;
        }

        public Long getTotalSoldNum() {
            return this.totalSoldNum;
        }

        }


}