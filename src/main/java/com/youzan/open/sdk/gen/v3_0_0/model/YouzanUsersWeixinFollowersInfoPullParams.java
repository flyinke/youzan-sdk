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

public class YouzanUsersWeixinFollowersInfoPullParams implements APIParams, FileParams  {

    /**
     * 用于拉取该粉丝编码之后的查询条件。第一次查询可传入0，之后每次查询可传入上次查询里返回的last_fans_id，直到返回结果里的has_next为false
     */
    private Long afterFansId;
    /**
     * 需要返回的除微信粉丝基础信息外的资产信息。枚举值：points，trade，level。points可获取“points”字段，trade可获取”traded_num,trade_money”两个字段，level可获取”level_info”字段信息。传多个枚举值需用“,”分隔，如果该字段为空则只返回粉丝基础信息。默认为空。(“fields”字段传入枚举值越多，查询数据耗费时间越长。）
     */
    private String fields;
    /**
     * 每页条数，最大值：50
     */
    private Long pageSize;

    public void setAfterFansId(Long afterFansId) {
        this.afterFansId = afterFansId;
    }

    public Long getAfterFansId() {
        return this.afterFansId;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (afterFansId != null) {
            params.put("after_fans_id", afterFansId);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}