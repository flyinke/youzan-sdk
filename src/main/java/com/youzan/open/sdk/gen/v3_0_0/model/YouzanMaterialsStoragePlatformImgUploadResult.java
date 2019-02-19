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

public class YouzanMaterialsStoragePlatformImgUploadResult implements APIResult {

    @JsonProperty(value = "image_url")
    /**
     * 图片链接
     */
    private String imageUrl;
    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "image_id")
    /**
     * 图片id
     */
    private Long imageId;

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getImageId() {
        return this.imageId;
    }


}