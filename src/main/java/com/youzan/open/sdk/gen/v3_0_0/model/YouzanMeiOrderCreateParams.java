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

public class YouzanMeiOrderCreateParams implements APIParams, FileParams  {

    /**
     * 买家性别
     */
    private Long buyerGender;
    /**
     * 买家手机号
     */
    private String buyerMobile;
    /**
     * 买家姓名
     */
    private String buyerName;
    /**
     * 买家id
     */
    private Long buyerYzUid;
    /**
     * 分店id，只有在总店开单的时候需要传入，并且只能出入分店id
     */
    private String deptId;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 赠送列表
     */
    private String orderGiftItems;
    /**
     * 订单项列表
     */
    private String orderItems;
    /**
     * 优惠列表
     */
    private String promotions;
    /**
     * 备注
     */
    private String remark;
    /**
     * 预约单号，如果是预约单转开单的，需要填入该参数，这样当订单保存的时候，对应的预约单会被关闭掉
     */
    private String reserveOrderNo;
    /**
     * 订单类型。0:"普通",1,:"开卡购卡",2,:"充值",3,:"直接收款",4:"台卡",8:"产品订单"。默认是0.
     */
    private Long type;

    public void setBuyerGender(Long buyerGender) {
        this.buyerGender = buyerGender;
    }

    public Long getBuyerGender() {
        return this.buyerGender;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
    }

    public String getBuyerMobile() {
        return this.buyerMobile;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerName() {
        return this.buyerName;
    }

    public void setBuyerYzUid(Long buyerYzUid) {
        this.buyerYzUid = buyerYzUid;
    }

    public Long getBuyerYzUid() {
        return this.buyerYzUid;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptId() {
        return this.deptId;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setOrderGiftItems(String orderGiftItems) {
        this.orderGiftItems = orderGiftItems;
    }

    public String getOrderGiftItems() {
        return this.orderGiftItems;
    }

    public void setOrderItems(String orderItems) {
        this.orderItems = orderItems;
    }

    public String getOrderItems() {
        return this.orderItems;
    }

    public void setPromotions(String promotions) {
        this.promotions = promotions;
    }

    public String getPromotions() {
        return this.promotions;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setReserveOrderNo(String reserveOrderNo) {
        this.reserveOrderNo = reserveOrderNo;
    }

    public String getReserveOrderNo() {
        return this.reserveOrderNo;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (buyerGender != null) {
            params.put("buyer_gender", buyerGender);
        }
        if (buyerMobile != null) {
            params.put("buyer_mobile", buyerMobile);
        }
        if (buyerName != null) {
            params.put("buyer_name", buyerName);
        }
        if (buyerYzUid != null) {
            params.put("buyer_yz_uid", buyerYzUid);
        }
        if (deptId != null) {
            params.put("dept_id", deptId);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (orderGiftItems != null) {
            params.put("order_gift_items", orderGiftItems);
        }
        if (orderItems != null) {
            params.put("order_items", orderItems);
        }
        if (promotions != null) {
            params.put("promotions", promotions);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (reserveOrderNo != null) {
            params.put("reserve_order_no", reserveOrderNo);
        }
        if (type != null) {
            params.put("type", type);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }

    public static class OrderGiftItem {
            private Long giftItemTermTime;
            private String giftItemUnique;
            private Long giftItemValue;
            private Long giftType;
    
            public void setGiftItemTermTime(Long giftItemTermTime) {
            this.giftItemTermTime = giftItemTermTime;
        }

        public Long getGiftItemTermTime() {
            return this.giftItemTermTime;
        }
            public void setGiftItemUnique(String giftItemUnique) {
            this.giftItemUnique = giftItemUnique;
        }

        public String getGiftItemUnique() {
            return this.giftItemUnique;
        }
            public void setGiftItemValue(Long giftItemValue) {
            this.giftItemValue = giftItemValue;
        }

        public Long getGiftItemValue() {
            return this.giftItemValue;
        }
            public void setGiftType(Long giftType) {
            this.giftType = giftType;
        }

        public Long getGiftType() {
            return this.giftType;
        }
        }

}