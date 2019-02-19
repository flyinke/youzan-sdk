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

public class YouzanUsersWeixinFollowersInfoSearchParams implements APIParams, FileParams  {

    /**
     * 关注的结束时间。查询在该时间之前关注的粉丝，不能为空，查询时间间隔不能超过一天，格式同start_follow
     */
    private Date endFollow;
    /**
     * 需要返回的除微信粉丝基础信息外的资产信息。枚举值：points，trade，level。points可获取“points”字段，trade可获取”traded_num,trade_money”两个字段，level可获取”level_info”字段信息。传多个枚举值需用“,”分隔，如果该字段为空则只返回粉丝基础信息。默认为空。(“fields”字段传入枚举值越多，查询数据耗费时间越长。）
     */
    private String fields;
    /**
     * 是否仅拉取关注的粉丝。1:仅拉取已关注的粉丝 0:拉取已关注和已跑路粉丝
     */
    private Long onlyFollow;
    /**
     * 页码，page_no * page_size参数不超过10000。若备选数据多于10000条，请通过调整start_follow/end_follow来缩小时间范围。
     */
    private Long pageNo;
    /**
     * 每页条数，最大值：50。默认为10。
     */
    private Long pageSize;
    /**
     * 关注的起始时间。查询在该时间之后（包含该时间）关注的粉丝，不能为空。格式可为“20170101”或“2017-01-01 12:00:00"
     */
    private Date startFollow;

    public void setEndFollow(Date endFollow) {
        this.endFollow = endFollow;
    }

    public Date getEndFollow() {
        return this.endFollow;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setOnlyFollow(Long onlyFollow) {
        this.onlyFollow = onlyFollow;
    }

    public Long getOnlyFollow() {
        return this.onlyFollow;
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

    public void setStartFollow(Date startFollow) {
        this.startFollow = startFollow;
    }

    public Date getStartFollow() {
        return this.startFollow;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (endFollow != null) {
            params.put("end_follow", endFollow);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        if (onlyFollow != null) {
            params.put("only_follow", onlyFollow);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (startFollow != null) {
            params.put("start_follow", startFollow);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}