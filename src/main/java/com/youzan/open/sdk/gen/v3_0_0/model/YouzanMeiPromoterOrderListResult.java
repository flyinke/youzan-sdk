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

public class YouzanMeiPromoterOrderListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 推广原产的订单列表
     */
    private MeiPromoterOrder[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiPromoterOrder[] items) {
        this.items = items;
    }

    public MeiPromoterOrder[] getItems() {
        return this.items;
    }

    public static class MeiPromoter {
            @JsonProperty(value = "phone")
        /**
        * 联系电话
        */
        private String phone;
            @JsonProperty(value = "nickname")
        /**
        * 昵称
        */
        private String nickname;
            @JsonProperty(value = "pid")
        /**
        * 推广员id
        */
        private Long pid;
            @JsonProperty(value = "profit")
        /**
        * 获得的利润
        */
        private Long profit;
    
            public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return this.phone;
        }

            public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getNickname() {
            return this.nickname;
        }

            public void setPid(Long pid) {
            this.pid = pid;
        }

        public Long getPid() {
            return this.pid;
        }

            public void setProfit(Long profit) {
            this.profit = profit;
        }

        public Long getProfit() {
            return this.profit;
        }

        }

    public static class MeiPromoterOrderItem {
            @JsonProperty(value = "goods_name")
        /**
        * 商品名称，例如剪发服务
        */
        private String goodsName;
            @JsonProperty(value = "promoter_profit")
        /**
        * 推广收益
        */
        private Long promoterProfit;
            @JsonProperty(value = "parent_profit")
        /**
        * 上线获得的收益
        */
        private Long parentProfit;
            @JsonProperty(value = "goods_pic")
        /**
        * 商品图片
        */
        private String goodsPic;
            @JsonProperty(value = "num")
        /**
        * 购买的商品数量
        */
        private Long num;
            @JsonProperty(value = "effective_pay")
        /**
        * 实际支付的金额
        */
        private Long effectivePay;
            @JsonProperty(value = "promotion_ratio")
        /**
        * 推广提成比例
        */
        private Long promotionRatio;
            @JsonProperty(value = "origin_price")
        /**
        * 商品价格
        */
        private Long originPrice;
            @JsonProperty(value = "goods_type")
        /**
        * 商品类型。（当商品不是卡时存在）
1  服务
2  实物商品
        */
        private Long goodsType;
            @JsonProperty(value = "parent_ratio")
        /**
        * 上线的推广提成比例
        */
        private Long parentRatio;
            @JsonProperty(value = "card_type")
        /**
        * 卡类型（当商品是卡时存在）
1 次卡
2 折扣卡
3 充值卡
        */
        private Long cardType;
    
            public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public String getGoodsName() {
            return this.goodsName;
        }

            public void setPromoterProfit(Long promoterProfit) {
            this.promoterProfit = promoterProfit;
        }

        public Long getPromoterProfit() {
            return this.promoterProfit;
        }

            public void setParentProfit(Long parentProfit) {
            this.parentProfit = parentProfit;
        }

        public Long getParentProfit() {
            return this.parentProfit;
        }

            public void setGoodsPic(String goodsPic) {
            this.goodsPic = goodsPic;
        }

        public String getGoodsPic() {
            return this.goodsPic;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setEffectivePay(Long effectivePay) {
            this.effectivePay = effectivePay;
        }

        public Long getEffectivePay() {
            return this.effectivePay;
        }

            public void setPromotionRatio(Long promotionRatio) {
            this.promotionRatio = promotionRatio;
        }

        public Long getPromotionRatio() {
            return this.promotionRatio;
        }

            public void setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
        }

        public Long getOriginPrice() {
            return this.originPrice;
        }

            public void setGoodsType(Long goodsType) {
            this.goodsType = goodsType;
        }

        public Long getGoodsType() {
            return this.goodsType;
        }

            public void setParentRatio(Long parentRatio) {
            this.parentRatio = parentRatio;
        }

        public Long getParentRatio() {
            return this.parentRatio;
        }

            public void setCardType(Long cardType) {
            this.cardType = cardType;
        }

        public Long getCardType() {
            return this.cardType;
        }

        }

    public static class MeiPaginator {
            @JsonProperty(value = "total_count")
        /**
        * 总记录数
        */
        private Long totalCount;
            @JsonProperty(value = "page")
        /**
        * 第几页
        */
        private Long page;
            @JsonProperty(value = "page_size")
        /**
        * 每页显示的记录数
        */
        private Long pageSize;
    
            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
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

        }

    public static class MeiPromoterOrder {
            @JsonProperty(value = "order_no")
        /**
        * 交易订单号
        */
        private String orderNo;
            @JsonProperty(value = "settle_no")
        /**
        * 分润支付单号
        */
        private String settleNo;
            @JsonProperty(value = "total_pay")
        /**
        * 订单总付款金额
        */
        private Long totalPay;
            @JsonProperty(value = "order_finished_at")
        /**
        * 订单完成时间
        */
        private Long orderFinishedAt;
            @JsonProperty(value = "guest_name")
        /**
        * 顾客名
        */
        private String guestName;
            @JsonProperty(value = "err_msg")
        /**
        * 错误信息，当分润支付失败的时候会出现，例如“余额不足无法分润”
        */
        private String errMsg;
            @JsonProperty(value = "dept_name")
        /**
        * 订单所处的部门的名称
        */
        private String deptName;
            @JsonProperty(value = "promoter")
        /**
        * 推广员简要信息
        */
        private MeiPromoter promoter;
            @JsonProperty(value = "parent_promoter")
        /**
        * 推广员简要信息
        */
        private MeiPromoter parentPromoter;
            @JsonProperty(value = "settle_status")
        /**
        * 分润状态
5  人工结算
10 待结算
40 已结算
95 结算失败
        */
        private Long settleStatus;
            @JsonProperty(value = "items")
        /**
        * 推广员订单条目信息
        */
        private MeiPromoterOrderItem items;
            @JsonProperty(value = "settlement_type")
        /**
        * 结算类型
1 人工结算
2 自动结算
        */
        private Long settlementType;
    
            public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderNo() {
            return this.orderNo;
        }

            public void setSettleNo(String settleNo) {
            this.settleNo = settleNo;
        }

        public String getSettleNo() {
            return this.settleNo;
        }

            public void setTotalPay(Long totalPay) {
            this.totalPay = totalPay;
        }

        public Long getTotalPay() {
            return this.totalPay;
        }

            public void setOrderFinishedAt(Long orderFinishedAt) {
            this.orderFinishedAt = orderFinishedAt;
        }

        public Long getOrderFinishedAt() {
            return this.orderFinishedAt;
        }

            public void setGuestName(String guestName) {
            this.guestName = guestName;
        }

        public String getGuestName() {
            return this.guestName;
        }

            public void setErrMsg(String errMsg) {
            this.errMsg = errMsg;
        }

        public String getErrMsg() {
            return this.errMsg;
        }

            public void setDeptName(String deptName) {
            this.deptName = deptName;
        }

        public String getDeptName() {
            return this.deptName;
        }

            public void setPromoter(MeiPromoter promoter) {
            this.promoter = promoter;
        }

        public MeiPromoter getPromoter() {
            return this.promoter;
        }

            public void setParentPromoter(MeiPromoter parentPromoter) {
            this.parentPromoter = parentPromoter;
        }

        public MeiPromoter getParentPromoter() {
            return this.parentPromoter;
        }

            public void setSettleStatus(Long settleStatus) {
            this.settleStatus = settleStatus;
        }

        public Long getSettleStatus() {
            return this.settleStatus;
        }

            public void setItems(MeiPromoterOrderItem items) {
            this.items = items;
        }

        public MeiPromoterOrderItem getItems() {
            return this.items;
        }

            public void setSettlementType(Long settlementType) {
            this.settlementType = settlementType;
        }

        public Long getSettlementType() {
            return this.settlementType;
        }

        }


}