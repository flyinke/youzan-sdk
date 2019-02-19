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

public class YouzanItemReviewsCountResult implements APIResult {

    @JsonProperty(value = "bad_num")
    /**
     * 差评数量
     */
    private Long badNum;
    @JsonProperty(value = "common_num")
    /**
     * 中评数量
     */
    private Long commonNum;
    @JsonProperty(value = "best_num")
    /**
     * 好评数量
     */
    private Long bestNum;

    public void setBadNum(Long badNum) {
        this.badNum = badNum;
    }

    public Long getBadNum() {
        return this.badNum;
    }
    public void setCommonNum(Long commonNum) {
        this.commonNum = commonNum;
    }

    public Long getCommonNum() {
        return this.commonNum;
    }
    public void setBestNum(Long bestNum) {
        this.bestNum = bestNum;
    }

    public Long getBestNum() {
        return this.bestNum;
    }


}