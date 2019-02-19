package com.youzan.open.sdk.gen.v1_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanTradeDcDeliveryDelivermultiissueParams implements APIParams, FileParams  {

    /**
     * 发货信息
deliveryType：发货方式 
枚举如下:
 EXPRESS_SYSTEM_CALL(11, "快递 - 系统呼叫快递"),
  EXPRESS_MERCHANT_CALL(12, "快递 - 商家呼叫快递"),
  EXPRESS_NO_EXPRESS(13, "快递 - 无需物流"),
  EXPRESS_WAY_BILL(14, "快递 - 电子面单"),

  LOCAL_DELIVERY_MERCHANT_CALL(21, "同城送 - 商家呼叫三方配送"),
  LOCAL_DELIVERY_MERCHANT_DIST(22, "同城送 - 商家自主配送"),
  LOCAL_DELIVERY_SYSTEM_CALL(23, "同城送 - 系统呼叫三方配送"),

  SELF_FETCH(24, "自提 - 核销提货"),
  SELF_FETCH_VERIFY(92, "自提 - 无码提货"),
  SELF_FETCH_WITH_CODE(91, "自提 - 有码提货");

周期购一次性发多期目前仅支持:
12
13
22
expressNo:快递单号
expressId:物流公司id
（当发货方式为13和22时expressNo和expressId可为空)



     */
    private String deliveryInfos;
    /**
     * 要发多少期。
该期次要与发货信息里面的list长度一致
     */
    private Long deliveryIssue;
    /**
     * 商品id
     */
    private Long itemId;
    /**
     * 请求的唯一标识
     */
    private String requestId;
    /**
     * 订单号
     */
    private String tid;

    public void setDeliveryInfos(String deliveryInfos) {
        this.deliveryInfos = deliveryInfos;
    }

    public String getDeliveryInfos() {
        return this.deliveryInfos;
    }

    public void setDeliveryIssue(Long deliveryIssue) {
        this.deliveryIssue = deliveryIssue;
    }

    public Long getDeliveryIssue() {
        return this.deliveryIssue;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (deliveryInfos != null) {
            params.put("delivery_infos", deliveryInfos);
        }
        if (deliveryIssue != null) {
            params.put("delivery_issue", deliveryIssue);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (requestId != null) {
            params.put("request_id", requestId);
        }
        if (tid != null) {
            params.put("tid", tid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}