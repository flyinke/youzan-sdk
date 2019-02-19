package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMaterialsStoragePlatformImgUploadResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMaterialsStoragePlatformImgUploadParams;

public class YouzanMaterialsStoragePlatformImgUpload extends AbstractAPI {

    public YouzanMaterialsStoragePlatformImgUpload() {
    }

    public YouzanMaterialsStoragePlatformImgUpload(YouzanMaterialsStoragePlatformImgUploadParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.materials.storage.platform.img.upload";
    }

    public Class getResultModelClass() {
        return YouzanMaterialsStoragePlatformImgUploadResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMaterialsStoragePlatformImgUploadParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}