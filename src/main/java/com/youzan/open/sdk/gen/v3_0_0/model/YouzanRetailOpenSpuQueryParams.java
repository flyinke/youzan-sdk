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

public class YouzanRetailOpenSpuQueryParams implements APIParams, FileParams  {

    /**
     * 截止时间(小于等于)
     */
    private String createTimeEnd;
    /**
     * 起始时间(大于等于)
     */
    private String createTimeStart;
    /**
     * 页码信息
     */
    private Long pageNo;
    /**
     * 每页数量
     */
    private Long pageSize;
    /**
     * 零售调用来源(调用方和有赞约定的值)
     */
    private String retailSource;
    /**
     * 销售渠道
2=门店
4=网店
     */
    private String sellChannels;
    /**
     * spu编码列表[SPUxxx1,SPUxxx2]
     */
    private String spuCodes;

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public void setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public String getCreateTimeStart() {
        return this.createTimeStart;
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

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setSellChannels(String sellChannels) {
        this.sellChannels = sellChannels;
    }

    public String getSellChannels() {
        return this.sellChannels;
    }

    public void setSpuCodes(String spuCodes) {
        this.spuCodes = spuCodes;
    }

    public String getSpuCodes() {
        return this.spuCodes;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (createTimeEnd != null) {
            params.put("create_time_end", createTimeEnd);
        }
        if (createTimeStart != null) {
            params.put("create_time_start", createTimeStart);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (sellChannels != null) {
            params.put("sell_channels", sellChannels);
        }
        if (spuCodes != null) {
            params.put("spu_codes", spuCodes);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}