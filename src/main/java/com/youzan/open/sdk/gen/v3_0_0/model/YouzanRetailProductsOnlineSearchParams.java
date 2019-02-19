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

public class YouzanRetailProductsOnlineSearchParams implements APIParams, FileParams  {

    /**
     * 分组查询
     */
    private String groupIds;
    /**
     * 上下架状态（0:下架 1:上架）
     */
    private String isDisplays;
    /**
     * 商品名称或商品编码
     */
    private String nameOrSkuNo;
    /**
     * 查询页面
     */
    private Long pageNo;
    /**
     * 一页数量（最大50）
     */
    private Long pageSize;
    /**
     * 售罄状态售罄状态
 (
   *0: 在售, 对内表示sold_status in (0, 1, 3)
   * 1: 售罄或部分售罄,对内表示 sold_status in (2, 3)
   * 2： 全部，等同于不填
   * 3: 有赞出售中，对内表示 1 出售中, 3 部分售罄
   * 4. 有赞全部，对内表示：1, 2 全部售罄, 3
   * 5. 全部售罄：对内: sold_status = 2
   * 6. 部分售罄：对内： sold_status = 3）
     */
    private Long showSoldOut;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;

    public void setGroupIds(String groupIds) {
        this.groupIds = groupIds;
    }

    public String getGroupIds() {
        return this.groupIds;
    }

    public void setIsDisplays(String isDisplays) {
        this.isDisplays = isDisplays;
    }

    public String getIsDisplays() {
        return this.isDisplays;
    }

    public void setNameOrSkuNo(String nameOrSkuNo) {
        this.nameOrSkuNo = nameOrSkuNo;
    }

    public String getNameOrSkuNo() {
        return this.nameOrSkuNo;
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

    public void setShowSoldOut(Long showSoldOut) {
        this.showSoldOut = showSoldOut;
    }

    public Long getShowSoldOut() {
        return this.showSoldOut;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (groupIds != null) {
            params.put("group_ids", groupIds);
        }
        if (isDisplays != null) {
            params.put("is_displays", isDisplays);
        }
        if (nameOrSkuNo != null) {
            params.put("name_or_sku_no", nameOrSkuNo);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (showSoldOut != null) {
            params.put("show_sold_out", showSoldOut);
        }
        if (source != null) {
            params.put("source", source);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}