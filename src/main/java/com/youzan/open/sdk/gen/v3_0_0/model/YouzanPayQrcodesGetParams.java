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

public class YouzanPayQrcodesGetParams implements APIParams, FileParams  {

    /**
     * 是否不返回二维码图片，1即不返回qr_code数据
     */
    private String ignoreQrcode;
    /**
     * 标签 json格式字符串,例如:[1,2],表示有两个标签
     */
    private String labelIds;
    /**
     * 当前页码
     */
    private Long pageNo;
    /**
     * 每页条数
     */
    private Long pageSize;
    /**
     * 二维码类型，不指定类型则全部返回
     */
    private String qrType;
    /**
     * 网点编号
     */
    private String shopId;
    /**
     * 网点类型
     */
    private String shopType;

    public void setIgnoreQrcode(String ignoreQrcode) {
        this.ignoreQrcode = ignoreQrcode;
    }

    public String getIgnoreQrcode() {
        return this.ignoreQrcode;
    }

    public void setLabelIds(String labelIds) {
        this.labelIds = labelIds;
    }

    public String getLabelIds() {
        return this.labelIds;
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

    public void setQrType(String qrType) {
        this.qrType = qrType;
    }

    public String getQrType() {
        return this.qrType;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopId() {
        return this.shopId;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getShopType() {
        return this.shopType;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (ignoreQrcode != null) {
            params.put("ignore_qrcode", ignoreQrcode);
        }
        if (labelIds != null) {
            params.put("label_ids", labelIds);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (qrType != null) {
            params.put("qr_type", qrType);
        }
        if (shopId != null) {
            params.put("shop_id", shopId);
        }
        if (shopType != null) {
            params.put("shop_type", shopType);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}