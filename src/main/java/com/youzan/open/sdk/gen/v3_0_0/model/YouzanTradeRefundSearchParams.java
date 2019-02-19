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

public class YouzanTradeRefundSearchParams implements APIParams, FileParams  {

    /**
     * 时间范围查询 退款创建截止时间时间戳 (单位为秒) 例如:1513868400
     */
    private Long createTimeEnd;
    /**
     * 时间范围查询 退款创建起始时间时间戳 (单位为秒) 例如:1513785600
     */
    private Long createTimeStart;
    /**
     * 分页数
     */
    private Long pageNo;
    /**
     * 每页显示个数
     */
    private Long pageSize;
    /**
     * 退款号
     */
    private String refundId;
    /**
     * 退款状态:
WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意)，
WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货)，
WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货)，
SELLER_REFUSE_BUYER(卖家拒绝退款)，
CLOSED(退款关闭)，
SUCCESS(退款成功)。
     */
    private String status;
    /**
     * 订单号
     */
    private String tid;
    /**
     * 时间范围查询 退款更新截止时间时间戳 （单位为秒）例如:1513868400
     */
    private Long updateTimeEnd;
    /**
     * 时间范围查询 退款更新起始时间时间戳 （单位为秒）例如:1513785600
     */
    private Long updateTimeStart;

    public void setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public void setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public Long getCreateTimeStart() {
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

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getRefundId() {
        return this.refundId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }

    public void setUpdateTimeEnd(Long updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
    }

    public Long getUpdateTimeEnd() {
        return this.updateTimeEnd;
    }

    public void setUpdateTimeStart(Long updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
    }

    public Long getUpdateTimeStart() {
        return this.updateTimeStart;
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
        if (refundId != null) {
            params.put("refund_id", refundId);
        }
        if (status != null) {
            params.put("status", status);
        }
        if (tid != null) {
            params.put("tid", tid);
        }
        if (updateTimeEnd != null) {
            params.put("update_time_end", updateTimeEnd);
        }
        if (updateTimeStart != null) {
            params.put("update_time_start", updateTimeStart);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}