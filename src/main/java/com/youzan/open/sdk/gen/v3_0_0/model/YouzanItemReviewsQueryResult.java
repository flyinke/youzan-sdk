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

public class YouzanItemReviewsQueryResult implements APIResult {

    @JsonProperty(value = "itemReviewsModels")
    /**
     * data里包含的是list对象，即多条商品评价记录，可以参考正确结果里面的例子，里面有评价模型的各个字段
     */
    private ItemReviewsOpenVOPaginatorResult itemReviewsModels;
    @JsonProperty(value = "withAvatarList")
    /**
     * 评价用户头像url
     */
    private withAvatarList withAvatarList;

    public void setItemReviewsModels(ItemReviewsOpenVOPaginatorResult itemReviewsModels) {
        this.itemReviewsModels = itemReviewsModels;
    }

    public ItemReviewsOpenVOPaginatorResult getItemReviewsModels() {
        return this.itemReviewsModels;
    }
    public void setWithAvatarList(withAvatarList withAvatarList) {
        this.withAvatarList = withAvatarList;
    }

    public withAvatarList getWithAvatarList() {
        return this.withAvatarList;
    }

    public static class ItemReviewsModelExtListWithPaginatorVOPaginator {
            @JsonProperty(value = "page")
        /**
        * 页数
        */
        private Long page;
            @JsonProperty(value = "success")
        /**
        * 是否成功
        */
        private Boolean success;
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

            public void setSuccess(Boolean success) {
            this.success = success;
        }

        public Boolean getSuccess() {
            return this.success;
        }

            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
        }

        }

    public static class withAvatarList {
            @JsonProperty(value = "fans_picture")
        /**
        * 评价用户的头像url
        */
        private String fansPicture;
    
            public void setFansPicture(String fansPicture) {
            this.fansPicture = fansPicture;
        }

        public String getFansPicture() {
            return this.fansPicture;
        }

        }

    public static class ItemReviewsOpenVOPaginatorResult {
            @JsonProperty(value = "code")
        /**
        * code
        */
        private Long code;
            @JsonProperty(value = "success")
        /**
        * 是否成功
        */
        private Boolean success;
            @JsonProperty(value = "message")
        /**
        * 错误msg
        */
        private String message;
            @JsonProperty(value = "data")
        /**
        * 
        */
        private ItemReviewsModelExtListWithPaginatorVOPaginator data;
    
            public void setCode(Long code) {
            this.code = code;
        }

        public Long getCode() {
            return this.code;
        }

            public void setSuccess(Boolean success) {
            this.success = success;
        }

        public Boolean getSuccess() {
            return this.success;
        }

            public void setMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }

            public void setData(ItemReviewsModelExtListWithPaginatorVOPaginator data) {
            this.data = data;
        }

        public ItemReviewsModelExtListWithPaginatorVOPaginator getData() {
            return this.data;
        }

        }


}