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

public class YouzanItemHotelRoomSetParams implements APIParams, FileParams  {

    /**
     * 开始日期,格式 yyyy-mm-dd
     */
    private String beginDate;
    /**
     * 结束日期,格式 yyyy-mm-dd
     */
    private String endDate;
    /**
     * 商品Id
     */
    private Long itemId;
    /**
     * 价格;单位元,精确到小数后2位
     */
    private Float price;
    /**
     * 规格ID,无规格商品不用填写
     */
    private Long skuId;
    /**
     * 一段时间内指定某几天设置,不填写默认全设置，多个逗号分隔；周一:1,周二:2,周三:3,周四:4,周五:5,周六:6,周日:7
     */
    private String specialWeeks;
    /**
     * 开关房: 1开启 0关闭
     */
    private Long status;
    /**
     * 库存数量
     */
    private Long stockNum;

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getBeginDate() {
        return this.beginDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSpecialWeeks(String specialWeeks) {
        this.specialWeeks = specialWeeks;
    }

    public String getSpecialWeeks() {
        return this.specialWeeks;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }

    public Long getStockNum() {
        return this.stockNum;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (beginDate != null) {
            params.put("begin_date", beginDate);
        }
        if (endDate != null) {
            params.put("end_date", endDate);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        if (specialWeeks != null) {
            params.put("special_weeks", specialWeeks);
        }
        if (status != null) {
            params.put("status", status);
        }
        if (stockNum != null) {
            params.put("stock_num", stockNum);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}