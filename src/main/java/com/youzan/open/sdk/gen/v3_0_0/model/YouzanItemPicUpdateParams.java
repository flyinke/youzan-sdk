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

public class YouzanItemPicUpdateParams implements APIParams, FileParams  {

    /**
     * 图片id，图片上传经过有赞素材中心返回的id，可通过该图片id查得图片的详情，如下接口获取youzan.materials.storage.platform.img.upload
     */
    private Long imageId;
    /**
     * 商品ID，可以通过列表接口如youzan.items.onsale.get （查询出售中商品）和 youzan.items.inventory.get （查询仓库中商品）获取到
     */
    private Long itemId;

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getImageId() {
        return this.imageId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (imageId != null) {
            params.put("image_id", imageId);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}