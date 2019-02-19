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

public class YouzanTradesSoldGetParams implements APIParams, FileParams  {

    /**
     * 购买方式
     */
    private String buyWay;
    /**
     * 有赞买家账号ID
     */
    private Long buyerId;
    /**
     * 买家昵称
     */
    private String buyerNick;
    /**
     * 交易创建结束时间，例:2017-01-01 12:00:00; 开始时间和结束时间的跨度不能大于3个月; 结束时间必须大于开始时间; 开始时间和结束时间必须成对出现
     */
    private Date endCreated;
    /**
     * 交易状态更新的结束时间，例:2017-01-01 12:00:00; 开始时间和结束时间的跨度不能大于3个月; 结束时间必须大于开始时间; 开始时间和结束时间必须成对出现
如使用更新时间搜索，则无法与其他检索字段一同使用（除了status, store_id）, 包括type,buy_way,fans_id等检索规则，直接跳过
     */
    private Date endUpdate;
    /**
     * 粉丝ID
     */
    private Long fansId;
    /**
     * 粉丝类型，店铺微信自有粉丝fans_type=1
     */
    private Long fansType;
    /**
     * 需要返回的交易对象字段，如tid,title,receiver_city等
     */
    private String fields;
    /**
     * 搜索关键词，可使用以下信息进行搜索
1.订单号
2.收货人手机号
3.收货人昵称
4.团编号
     */
    private String keyword;
    /**
     * 页码，从1开始
     */
    private Long pageNo;
    /**
     * 每页条数，最大不能超过100，建议使用默认分页
     */
    private Long pageSize;
    /**
     * .
     */
    private Long senderId;
    /**
     * 交易创建的开始时间 例:2017-01-01 12:00:00; 开始时间和结束时间的跨度不能大于3个月; 结束时间必须大于开始时间; 开始时间和结束时间必须成对出现
     */
    private Date startCreated;
    /**
     * 交易状态更新的开始时间 例:2017-01-01 12:00:00; 开始时间和结束时间的跨度不能大于3个月; 结束时间必须大于开始时间; 开始时间和结束时间必须成对出现
如使用更新时间搜索，则无法与其他检索字段一同使用（除了status, store_id）, 包括type,buy_way,fans_id等检索规则，直接跳过
     */
    private Date startUpdate;
    /**
     * 订单状态，一次只能查询一种状态 待付款：WAIT_BUYER_PAY 待发货：WAIT_SELLER_SEND_GOODS 等待买家确认：WAIT_BUYER_CONFIRM_GOODS 订单完成：TRADE_SUCCESS 订单关闭：TRADE_CLOSED 退款中：TRADE_REFUNDING
     */
    private String status;
    /**
     * 门店id
     */
    private Long storeId;
    /**
     * 交易类型。取值范围：
ALL => 所有订单
FEEDBACK => 维权订单
SELF_FETCH => 到店自提订单
COD  => 货到付款订单
PEER_PAY => 代付的订单
GIFT => 送礼的订单
GROUP => 拼团订单
MULTISTORE => 多门店订单
STAR => 加星订单
LOCAL_EXPRESS => 同城配送
QRCODE => 收银台订单
     */
    private String type;
    /**
     * 是否启用has_next的分页方式
     */
    private Boolean useHasNext;
    /**
     * app版本
     */
    private String version;
    /**
     * 是否返回子订单
     */
    private Boolean withChilds;
    /**
     * 是否返回订单标记
     */
    private Boolean withSource;

    public void setBuyWay(String buyWay) {
        this.buyWay = buyWay;
    }

    public String getBuyWay() {
        return this.buyWay;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setEndCreated(Date endCreated) {
        this.endCreated = endCreated;
    }

    public Date getEndCreated() {
        return this.endCreated;
    }

    public void setEndUpdate(Date endUpdate) {
        this.endUpdate = endUpdate;
    }

    public Date getEndUpdate() {
        return this.endUpdate;
    }

    public void setFansId(Long fansId) {
        this.fansId = fansId;
    }

    public Long getFansId() {
        return this.fansId;
    }

    public void setFansType(Long fansType) {
        this.fansType = fansType;
    }

    public Long getFansType() {
        return this.fansType;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getSenderId() {
        return this.senderId;
    }

    public void setStartCreated(Date startCreated) {
        this.startCreated = startCreated;
    }

    public Date getStartCreated() {
        return this.startCreated;
    }

    public void setStartUpdate(Date startUpdate) {
        this.startUpdate = startUpdate;
    }

    public Date getStartUpdate() {
        return this.startUpdate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setUseHasNext(Boolean useHasNext) {
        this.useHasNext = useHasNext;
    }

    public Boolean getUseHasNext() {
        return this.useHasNext;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return this.version;
    }

    public void setWithChilds(Boolean withChilds) {
        this.withChilds = withChilds;
    }

    public Boolean getWithChilds() {
        return this.withChilds;
    }

    public void setWithSource(Boolean withSource) {
        this.withSource = withSource;
    }

    public Boolean getWithSource() {
        return this.withSource;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (buyWay != null) {
            params.put("buy_way", buyWay);
        }
        if (buyerId != null) {
            params.put("buyer_id", buyerId);
        }
        if (buyerNick != null) {
            params.put("buyer_nick", buyerNick);
        }
        if (endCreated != null) {
            params.put("end_created", endCreated);
        }
        if (endUpdate != null) {
            params.put("end_update", endUpdate);
        }
        if (fansId != null) {
            params.put("fans_id", fansId);
        }
        if (fansType != null) {
            params.put("fans_type", fansType);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        if (keyword != null) {
            params.put("keyword", keyword);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (senderId != null) {
            params.put("sender_id", senderId);
        }
        if (startCreated != null) {
            params.put("start_created", startCreated);
        }
        if (startUpdate != null) {
            params.put("start_update", startUpdate);
        }
        if (status != null) {
            params.put("status", status);
        }
        if (storeId != null) {
            params.put("store_id", storeId);
        }
        if (type != null) {
            params.put("type", type);
        }
        if (useHasNext != null) {
            params.put("use_has_next", useHasNext);
        }
        if (version != null) {
            params.put("version", version);
        }
        if (withChilds != null) {
            params.put("with_childs", withChilds);
        }
        if (withSource != null) {
            params.put("with_source", withSource);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}