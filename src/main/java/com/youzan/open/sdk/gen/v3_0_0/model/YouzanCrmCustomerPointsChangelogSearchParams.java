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

public class YouzanCrmCustomerPointsChangelogSearchParams implements APIParams, FileParams  {

    /**
     * 帐户ID
     */
    private String accountId;
    /**
     * 与帐户ID配合使用: 2=粉丝(原fansId),3:手机号,4:三方帐号(原open_user_id)
     */
    private Long accountType;
    /**
     * 结束时间（以start_date开始7天内的某个时刻）例如2015-02-23 02:03:00
     */
    private String endDate;
    /**
     * 页码
     */
    private Long page;
    /**
     * 分页大小
     */
    private Long pageSize;
    /**
     * 起始时间（30天内的某个时刻, 默认取最近7天内的记录）例如2015-02-03 02:03:00
     */
    private String startDate;

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountType(Long accountType) {
        this.accountType = accountType;
    }

    public Long getAccountType() {
        return this.accountType;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return this.endDate;
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

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return this.startDate;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (accountId != null) {
            params.put("account_id", accountId);
        }
        if (accountType != null) {
            params.put("account_type", accountType);
        }
        if (endDate != null) {
            params.put("end_date", endDate);
        }
        if (page != null) {
            params.put("page", page);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (startDate != null) {
            params.put("start_date", startDate);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}