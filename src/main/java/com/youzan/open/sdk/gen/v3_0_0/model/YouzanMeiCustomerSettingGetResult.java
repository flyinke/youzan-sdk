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

public class YouzanMeiCustomerSettingGetResult implements APIResult {

    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "type")
    /**
     * 配置类型。
1 会员可见范围
     */
    private Long type;
    @JsonProperty(value = "settings")
    /**
     * 具体设置内容。
当type=1时，key值为dept，value：
0 可以查看店铺中所有会员
1 可以不能查看其它分店会员
2 仅可以查看本店铺创建的会员
     */
    private Map settings;

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }
    public void setSettings(Map settings) {
        this.settings = settings;
    }

    public Map getSettings() {
        return this.settings;
    }

    public static class Map {
            @JsonProperty(value = "skuId")
        /**
        * 待更新商品id
        */
        private Long skuId;
            @JsonProperty(value = "result")
        /**
        * 是否更新成功
        */
        private Boolean result;
    
            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setResult(Boolean result) {
            this.result = result;
        }

        public Boolean getResult() {
            return this.result;
        }

        }


}