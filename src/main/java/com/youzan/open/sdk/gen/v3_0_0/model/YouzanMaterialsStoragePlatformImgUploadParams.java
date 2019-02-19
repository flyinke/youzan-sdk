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

public class YouzanMaterialsStoragePlatformImgUploadParams implements APIParams, FileParams  {

    /**
     * 本地图片上传(http post)，仅支持单个文件上传，每个文件不超过1MB。
     */
    private ByteWrapper[] image;

    public void setImage(ByteWrapper[] image) {
        this.image = image;
    }

    public ByteWrapper[] getImage() {
        return this.image;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            if (image != null) {
            for (ByteWrapper wrapper : image) {
                params.put("image[]", wrapper);
            }
        }
            return params;
    }


}