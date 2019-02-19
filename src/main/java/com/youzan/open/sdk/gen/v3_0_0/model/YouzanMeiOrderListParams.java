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

public class YouzanMeiOrderListParams implements APIParams, FileParams  {

    /**
     * 开始时间。可不传，默认为空
     */
    private Long beginTime;
    /**
     * 结束时间。可不传，默认为空
     */
    private Long endTime;
    /**
     * 搜索词
     */
    private String keyword;
    /**
     * 搜索词类型 
1, "根据手机号搜索" 
2, "根据订单编号搜索" 
3, "根据yzUid搜索" 
4, "根据父退款单号搜索"
5, "收货人姓名"
6, "收货人电话"
7, "收货人电话后4位"
8, "订单备注"
9, "订单商品名称"
10, "会员编号"
     */
    private Long keywordType;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 订单状态 
30 待付款
32 待发货
34 待收货
40 已完成
99 取消
     */
    private Long orderStatus;
    /**
     * 订单类型 0, "普通" 1, "开卡购卡" 2, "充值" 3, "直接收款" 4, "台卡" 8, "产品订单"
     */
    private Long orderType;
    /**
     * 页码
     */
    private Long page;
    /**
     * 每页显示的条目数量
     */
    private Long pageSize;
    /**
     * 支付类型 0, "所有" 1, "现金" 2, "微信" 3, "支付宝" 4, "会员余额" 5, "刷卡" 6, "E卡" 7, "标记支付"
     */
    private Long payType;
    /**
     * 客户id。可不传，默认为空
     */
    private Long yzUid;

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public Long getBeginTime() {
        return this.beginTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeywordType(Long keywordType) {
        this.keywordType = keywordType;
    }

    public Long getKeywordType() {
        return this.keywordType;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Long getOrderType() {
        return this.orderType;
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

    public void setPayType(Long payType) {
        this.payType = payType;
    }

    public Long getPayType() {
        return this.payType;
    }

    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (beginTime != null) {
            params.put("begin_time", beginTime);
        }
        if (endTime != null) {
            params.put("end_time", endTime);
        }
        if (keyword != null) {
            params.put("keyword", keyword);
        }
        if (keywordType != null) {
            params.put("keyword_type", keywordType);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (orderStatus != null) {
            params.put("order_status", orderStatus);
        }
        if (orderType != null) {
            params.put("order_type", orderType);
        }
        if (page != null) {
            params.put("page", page);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (payType != null) {
            params.put("pay_type", payType);
        }
        if (yzUid != null) {
            params.put("yz_uid", yzUid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}