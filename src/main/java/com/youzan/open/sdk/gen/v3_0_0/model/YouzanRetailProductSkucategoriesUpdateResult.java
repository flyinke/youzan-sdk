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

public class YouzanRetailProductSkucategoriesUpdateResult implements APIResult {

    @JsonProperty(value = "batch_update_result")
    /**
     * 批量更新商品库商品，各个商品是否更新成功
     */
    private Map<Long,Boolean> batchUpdateResult;

    public void setBatchUpdateResult(Map<Long,Boolean> batchUpdateResult) {
        this.batchUpdateResult = batchUpdateResult;
    }

    public Map<Long,Boolean> getBatchUpdateResult() {
        return this.batchUpdateResult;
    }


}