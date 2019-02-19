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

public class YouzanMeiReservationListParams implements APIParams, FileParams  {

    /**
     * 到店结束时间，按照预约时间搜索
     */
    private Long arriveAtEnd;
    /**
     * 到店开始时间，按照预约时间搜索
     */
    private Long arriveAtStart;
    /**
     * 分店id
     */
    private Long deptId;
    /**
     * 模糊搜索匹配关键字
     */
    private String keyWord;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 页码，要查询的页数
     */
    private Long page;
    /**
     * 每页数量，最大200
     */
    private Long pageSize;
    /**
     * 要查询的预约状态（该字段不传默认是10）
5 已创建
10 待服务
20 已开单
30 已完成
98 已取消
97 已取消（由外部业务取消）
     */
    private String reservationStatuses;
    /**
     * 搜索的关键字匹配的类型
1. 到店人姓名
2. 到店人手机
3. 会员姓名 
4. 会员手机号 
5. 会员编号 
6. 备注 
7. 服务名称搜索 
8.技师昵称搜索
     */
    private Long searchType;
    /**
     * 搜索的排序字段：
      100 - 创建时间排序（默认）
      101 - 到店时间排序
      102 - 取消时间排序
     */
    private Long sortField;
    /**
     * 排序方式：
1 正序（默认）
2 逆序
     */
    private Long sortRule;

    public void setArriveAtEnd(Long arriveAtEnd) {
        this.arriveAtEnd = arriveAtEnd;
    }

    public Long getArriveAtEnd() {
        return this.arriveAtEnd;
    }

    public void setArriveAtStart(Long arriveAtStart) {
        this.arriveAtStart = arriveAtStart;
    }

    public Long getArriveAtStart() {
        return this.arriveAtStart;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptId() {
        return this.deptId;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getKeyWord() {
        return this.keyWord;
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

    public void setReservationStatuses(String reservationStatuses) {
        this.reservationStatuses = reservationStatuses;
    }

    public String getReservationStatuses() {
        return this.reservationStatuses;
    }

    public void setSearchType(Long searchType) {
        this.searchType = searchType;
    }

    public Long getSearchType() {
        return this.searchType;
    }

    public void setSortField(Long sortField) {
        this.sortField = sortField;
    }

    public Long getSortField() {
        return this.sortField;
    }

    public void setSortRule(Long sortRule) {
        this.sortRule = sortRule;
    }

    public Long getSortRule() {
        return this.sortRule;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (arriveAtEnd != null) {
            params.put("arrive_at_end", arriveAtEnd);
        }
        if (arriveAtStart != null) {
            params.put("arrive_at_start", arriveAtStart);
        }
        if (deptId != null) {
            params.put("dept_id", deptId);
        }
        if (keyWord != null) {
            params.put("key_word", keyWord);
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
        if (reservationStatuses != null) {
            params.put("reservation_statuses", reservationStatuses);
        }
        if (searchType != null) {
            params.put("search_type", searchType);
        }
        if (sortField != null) {
            params.put("sort_field", sortField);
        }
        if (sortRule != null) {
            params.put("sort_rule", sortRule);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}