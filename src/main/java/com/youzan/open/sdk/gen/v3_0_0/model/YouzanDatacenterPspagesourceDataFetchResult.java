package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.api.FileParams;
import com.youzan.open.sdk.api.APIResult;
import com.youzan.open.sdk.model.ByteWrapper;
import java.util.List;
import java.util.Map;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class YouzanDatacenterPspagesourceDataFetchResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 推广效果数据分页信息
     */
    private Paginator paginator;
    @JsonProperty(value = "items")
    /**
     * 推广效果数据详细信息列表
     */
    private YunPsMonitorDataModel[] items;

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }
    public void setItems(YunPsMonitorDataModel[] items) {
        this.items = items;
    }

    public YunPsMonitorDataModel[] getItems() {
        return this.items;
    }

    public static class YunPsMonitorDataModel {
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "dcps")
        /**
        * 追踪ID
        */
        private String dcps;
            @JsonProperty(value = "pv")
        /**
        * 浏览量，筛选时间内，通过推广链接带来的浏览量
        */
        private Long pv;
            @JsonProperty(value = "uv")
        /**
        * 访客数，筛选时间内，通过本次推广带来的访客数
        */
        private Long uv;
            @JsonProperty(value = "landing_pv")
        /**
        * 到达浏览量，筛选时间内，通过推广链接访问推广页面的浏览量
        */
        private Long landingPv;
            @JsonProperty(value = "landing_uv")
        /**
        * 到达访客数，筛选时间内，通过推广链接访问推广页面的访客数
        */
        private Long landingUv;
            @JsonProperty(value = "new_uv")
        /**
        * 新访客数，最近1年内没有访问过店铺，筛选时间内，通过推广访问推广页面的新访客数
        */
        private Long newUv;
            @JsonProperty(value = "share_pv")
        /**
        * 分享浏览量，筛选时间内，通过该推广的分享进入店铺的浏览量
        */
        private Long sharePv;
            @JsonProperty(value = "share_uv")
        /**
        * 分享访客数，筛选时间内，通过该推广的分享进入店铺的访客数
        */
        private Long shareUv;
            @JsonProperty(value = "click_pv")
        /**
        * 二跳浏览量，筛选时间内用户访问推广页面后，在页面中发生点击行为进入更多店铺内页面的点击次数
        */
        private Long clickPv;
            @JsonProperty(value = "click_uv")
        /**
        * 二跳访客数，筛选时间内用户访问推广页面后，在页面中发生点击行为进入更多店铺内页面的用户数
        */
        private Long clickUv;
            @JsonProperty(value = "add_fans")
        /**
        * 粉丝增加量，筛选时间内，访问了推广链接，且在当天成为公众号粉丝的客户数
        */
        private Long addFans;
            @JsonProperty(value = "to_order_count")
        /**
        * 转化下单数，筛选时间内用户访问落地页面后，24小时内在店铺中进行下单（包括本页面商品订单和连带销售商品订单）的数量
        */
        private Long toOrderCount;
            @JsonProperty(value = "to_order_uv")
        /**
        * 转化下单人数，筛选时间内，用户访问落地页面后，24小时内在店铺中进行下单（包括本页面商品订单和连带销售商品订单）的用户数
        */
        private Long toOrderUv;
            @JsonProperty(value = "to_order_amount")
        /**
        * 转化下单金额，筛选时间内用户访问落地页面后，24小时内在店铺中进行下单（包括本页面商品订单和连带销售商品订单）的订单金额
        */
        private Long toOrderAmount;
            @JsonProperty(value = "to_pay_count")
        /**
        * 转化付款单数，筛选时间内用户访问落地页面后，24小时内在店铺中进行下单（包括本页面商品订单和连带销售商品订单）并且付款成功的订单数量
        */
        private Long toPayCount;
            @JsonProperty(value = "to_pay_uv")
        /**
        * 转化付款人数，筛选时间内，用户访问落地页面后，24小时内在店铺中进行下单（包括本页面商品订单和连带销售商品订单）并且付款成功的用户数
        */
        private Long toPayUv;
            @JsonProperty(value = "to_pay_amount")
        /**
        * 转化付款金额，筛选时间内用户访问落地页面后，24小时内在店铺中进行下单（包括本页面商品订单和连带销售商品订单）并且付款成功的订单金额
        */
        private Long toPayAmount;
            @JsonProperty(value = "new_customer_order_uv")
        /**
        * 新成交客户数，筛选时间内，用户访问落地页面后，24小时内在店铺中进行下单（包括本页面商品订单和连带销售商品订单）并且付款成功的在店铺首次购买的客户数
        */
        private Long newCustomerOrderUv;
            @JsonProperty(value = "old_customer_order_uv")
        /**
        * 老成交客户数，筛选时间内，用户访问落地页面后，24小时内在店铺中进行下单（包括本页面商品订单和连带销售商品订单）并且付款成功的老客户数
        */
        private Long oldCustomerOrderUv;
            @JsonProperty(value = "in7_order_count")
        /**
        * 7日下单数，统计流量发生日期的后续7天内，产生下单的订单数。
        */
        private Long in7OrderCount;
            @JsonProperty(value = "in7_order_uv")
        /**
        * 7日下单人数，统计流量发生日期的后续7天内，产生下单的客户数。同一时段，同一客户多次下单记为1人。
        */
        private Long in7OrderUv;
            @JsonProperty(value = "in7_order_amount")
        /**
        * 7日下单金额，统计流量发生日期的后续7天内，产生下单的订单金额
        */
        private Long in7OrderAmount;
            @JsonProperty(value = "in7_pay_count")
        /**
        * 7日付款单数，统计流量发生日期的后续7天内，产生下单且付款成功的订单数。
        */
        private Long in7PayCount;
            @JsonProperty(value = "in7_pay_uv")
        /**
        * 7日付款人数，统计流量发生日期的后续7天内，产生下单且付款成功的客户数。同一时段，同一客户多次下单记为1人。
        */
        private Long in7PayUv;
            @JsonProperty(value = "in7_pay_amount")
        /**
        * 7日付款金额，统计流量发生日期的后续7天内，产生下单且付款成功的订单金额
        */
        private Long in7PayAmount;
            @JsonProperty(value = "in15_order_count")
        /**
        * 15日下单数，同7天定义
        */
        private Long in15OrderCount;
            @JsonProperty(value = "in15_order_uv")
        /**
        * 15日下单人数，同7天定义
        */
        private Long in15OrderUv;
            @JsonProperty(value = "in15_order_amount")
        /**
        * 15日下单金额，同7天定义
        */
        private Long in15OrderAmount;
            @JsonProperty(value = "in15_pay_count")
        /**
        * 15日付款单数，同7天定义
        */
        private Long in15PayCount;
            @JsonProperty(value = "in15_pay_uv")
        /**
        * 15日付款人数，同7天定义
        */
        private Long in15PayUv;
            @JsonProperty(value = "in15_pay_amount")
        /**
        * 15日付款金额，同7天定义
        */
        private Long in15PayAmount;
            @JsonProperty(value = "in30_order_count")
        /**
        * 30日下单数，同7天定义
        */
        private Long in30OrderCount;
            @JsonProperty(value = "in30_order_uv")
        /**
        * 30日下单人数，同7天定义
        */
        private Long in30OrderUv;
            @JsonProperty(value = "in30_order_amount")
        /**
        * 30日下单金额，同7天定义
        */
        private Long in30OrderAmount;
            @JsonProperty(value = "in30_pay_count")
        /**
        * 30日付款单数，同7天定义
        */
        private Long in30PayCount;
            @JsonProperty(value = "in30_pay_uv")
        /**
        * 30日付款人数，同7天定义
        */
        private Long in30PayUv;
            @JsonProperty(value = "in30_pay_amount")
        /**
        * 30日付款金额，同7天定义
        */
        private Long in30PayAmount;
    
            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setDcps(String dcps) {
            this.dcps = dcps;
        }

        public String getDcps() {
            return this.dcps;
        }

            public void setPv(Long pv) {
            this.pv = pv;
        }

        public Long getPv() {
            return this.pv;
        }

            public void setUv(Long uv) {
            this.uv = uv;
        }

        public Long getUv() {
            return this.uv;
        }

            public void setLandingPv(Long landingPv) {
            this.landingPv = landingPv;
        }

        public Long getLandingPv() {
            return this.landingPv;
        }

            public void setLandingUv(Long landingUv) {
            this.landingUv = landingUv;
        }

        public Long getLandingUv() {
            return this.landingUv;
        }

            public void setNewUv(Long newUv) {
            this.newUv = newUv;
        }

        public Long getNewUv() {
            return this.newUv;
        }

            public void setSharePv(Long sharePv) {
            this.sharePv = sharePv;
        }

        public Long getSharePv() {
            return this.sharePv;
        }

            public void setShareUv(Long shareUv) {
            this.shareUv = shareUv;
        }

        public Long getShareUv() {
            return this.shareUv;
        }

            public void setClickPv(Long clickPv) {
            this.clickPv = clickPv;
        }

        public Long getClickPv() {
            return this.clickPv;
        }

            public void setClickUv(Long clickUv) {
            this.clickUv = clickUv;
        }

        public Long getClickUv() {
            return this.clickUv;
        }

            public void setAddFans(Long addFans) {
            this.addFans = addFans;
        }

        public Long getAddFans() {
            return this.addFans;
        }

            public void setToOrderCount(Long toOrderCount) {
            this.toOrderCount = toOrderCount;
        }

        public Long getToOrderCount() {
            return this.toOrderCount;
        }

            public void setToOrderUv(Long toOrderUv) {
            this.toOrderUv = toOrderUv;
        }

        public Long getToOrderUv() {
            return this.toOrderUv;
        }

            public void setToOrderAmount(Long toOrderAmount) {
            this.toOrderAmount = toOrderAmount;
        }

        public Long getToOrderAmount() {
            return this.toOrderAmount;
        }

            public void setToPayCount(Long toPayCount) {
            this.toPayCount = toPayCount;
        }

        public Long getToPayCount() {
            return this.toPayCount;
        }

            public void setToPayUv(Long toPayUv) {
            this.toPayUv = toPayUv;
        }

        public Long getToPayUv() {
            return this.toPayUv;
        }

            public void setToPayAmount(Long toPayAmount) {
            this.toPayAmount = toPayAmount;
        }

        public Long getToPayAmount() {
            return this.toPayAmount;
        }

            public void setNewCustomerOrderUv(Long newCustomerOrderUv) {
            this.newCustomerOrderUv = newCustomerOrderUv;
        }

        public Long getNewCustomerOrderUv() {
            return this.newCustomerOrderUv;
        }

            public void setOldCustomerOrderUv(Long oldCustomerOrderUv) {
            this.oldCustomerOrderUv = oldCustomerOrderUv;
        }

        public Long getOldCustomerOrderUv() {
            return this.oldCustomerOrderUv;
        }

            public void setIn7OrderCount(Long in7OrderCount) {
            this.in7OrderCount = in7OrderCount;
        }

        public Long getIn7OrderCount() {
            return this.in7OrderCount;
        }

            public void setIn7OrderUv(Long in7OrderUv) {
            this.in7OrderUv = in7OrderUv;
        }

        public Long getIn7OrderUv() {
            return this.in7OrderUv;
        }

            public void setIn7OrderAmount(Long in7OrderAmount) {
            this.in7OrderAmount = in7OrderAmount;
        }

        public Long getIn7OrderAmount() {
            return this.in7OrderAmount;
        }

            public void setIn7PayCount(Long in7PayCount) {
            this.in7PayCount = in7PayCount;
        }

        public Long getIn7PayCount() {
            return this.in7PayCount;
        }

            public void setIn7PayUv(Long in7PayUv) {
            this.in7PayUv = in7PayUv;
        }

        public Long getIn7PayUv() {
            return this.in7PayUv;
        }

            public void setIn7PayAmount(Long in7PayAmount) {
            this.in7PayAmount = in7PayAmount;
        }

        public Long getIn7PayAmount() {
            return this.in7PayAmount;
        }

            public void setIn15OrderCount(Long in15OrderCount) {
            this.in15OrderCount = in15OrderCount;
        }

        public Long getIn15OrderCount() {
            return this.in15OrderCount;
        }

            public void setIn15OrderUv(Long in15OrderUv) {
            this.in15OrderUv = in15OrderUv;
        }

        public Long getIn15OrderUv() {
            return this.in15OrderUv;
        }

            public void setIn15OrderAmount(Long in15OrderAmount) {
            this.in15OrderAmount = in15OrderAmount;
        }

        public Long getIn15OrderAmount() {
            return this.in15OrderAmount;
        }

            public void setIn15PayCount(Long in15PayCount) {
            this.in15PayCount = in15PayCount;
        }

        public Long getIn15PayCount() {
            return this.in15PayCount;
        }

            public void setIn15PayUv(Long in15PayUv) {
            this.in15PayUv = in15PayUv;
        }

        public Long getIn15PayUv() {
            return this.in15PayUv;
        }

            public void setIn15PayAmount(Long in15PayAmount) {
            this.in15PayAmount = in15PayAmount;
        }

        public Long getIn15PayAmount() {
            return this.in15PayAmount;
        }

            public void setIn30OrderCount(Long in30OrderCount) {
            this.in30OrderCount = in30OrderCount;
        }

        public Long getIn30OrderCount() {
            return this.in30OrderCount;
        }

            public void setIn30OrderUv(Long in30OrderUv) {
            this.in30OrderUv = in30OrderUv;
        }

        public Long getIn30OrderUv() {
            return this.in30OrderUv;
        }

            public void setIn30OrderAmount(Long in30OrderAmount) {
            this.in30OrderAmount = in30OrderAmount;
        }

        public Long getIn30OrderAmount() {
            return this.in30OrderAmount;
        }

            public void setIn30PayCount(Long in30PayCount) {
            this.in30PayCount = in30PayCount;
        }

        public Long getIn30PayCount() {
            return this.in30PayCount;
        }

            public void setIn30PayUv(Long in30PayUv) {
            this.in30PayUv = in30PayUv;
        }

        public Long getIn30PayUv() {
            return this.in30PayUv;
        }

            public void setIn30PayAmount(Long in30PayAmount) {
            this.in30PayAmount = in30PayAmount;
        }

        public Long getIn30PayAmount() {
            return this.in30PayAmount;
        }

        }

    public static class Paginator {
            @JsonProperty(value = "page")
        /**
        * 当前页码
        */
        private Long page;
            @JsonProperty(value = "pageSize")
        /**
        * 每页数量
        */
        private Long pageSize;
            @JsonProperty(value = "totalCount")
        /**
        * 总数
        */
        private Long totalCount;
    
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

            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
        }

        }


}