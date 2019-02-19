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

public class YouzanMeiCardListParams implements APIParams, FileParams  {

    /**
     * 查询的卡列表
     */
    private String cardAliases;
    /**
     * 卡名称
     */
    private String cardName;
    /**
     * 卡类型
     */
    private Long cardType;
    /**
     * 是否删除
     */
    private Long delete;
    /**
     * 分店信息
     */
    private Long deptId;
    /**
     * 是否上架销售
     */
    private Long display;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 查询的页数
     */
    private Long page;
    /**
     * 美业显示的条目数量，最多200
     */
    private Long pageSize;
    /**
     * 是否在网店展示
     */
    private Long wapShow;

    public void setCardAliases(String cardAliases) {
        this.cardAliases = cardAliases;
    }

    public String getCardAliases() {
        return this.cardAliases;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return this.cardName;
    }

    public void setCardType(Long cardType) {
        this.cardType = cardType;
    }

    public Long getCardType() {
        return this.cardType;
    }

    public void setDelete(Long delete) {
        this.delete = delete;
    }

    public Long getDelete() {
        return this.delete;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptId() {
        return this.deptId;
    }

    public void setDisplay(Long display) {
        this.display = display;
    }

    public Long getDisplay() {
        return this.display;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
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

    public void setWapShow(Long wapShow) {
        this.wapShow = wapShow;
    }

    public Long getWapShow() {
        return this.wapShow;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (cardAliases != null) {
            params.put("card_aliases", cardAliases);
        }
        if (cardName != null) {
            params.put("card_name", cardName);
        }
        if (cardType != null) {
            params.put("card_type", cardType);
        }
        if (delete != null) {
            params.put("delete", delete);
        }
        if (deptId != null) {
            params.put("dept_id", deptId);
        }
        if (display != null) {
            params.put("display", display);
        }
        if (keyword != null) {
            params.put("keyword", keyword);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (page != null) {
            params.put("page", page);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (wapShow != null) {
            params.put("wap_show", wapShow);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}