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

public class YouzanUsersWeixinFollowersGetParams implements APIParams, FileParams  {

    /**
     * 关注的结束时间。查询在该时间之前关注的粉丝，不能为空，查询时间间隔不能超过一天，格式同start_follow
     */
    private Date endFollow;
    /**
     * 需要返回的微信粉丝对象字段，如nick,avatar等。可选值：CrmWeixinFans微信粉丝结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
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
     * 每页条数，最大值：50
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