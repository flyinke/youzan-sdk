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

public class YouzanDatacenterPspagesourceCreateParams implements APIParams, FileParams  {

    /**
     * 推广花费，只能是正整数 单位为分
     */
    private Long psCost;
    /**
     * 推广位置
     */
    private String psLocation;
    /**
     * 推广分析名称
     */
    private String psName;
    /**
     * 渠道名称，系统中名称不存在的自动创建 ，存在的使用已有的
     */
    private String sourceName;
    /**
     * 该推广监控的标签。使用推广标签，商家可以便捷查找、导出及对比同一标签下的不同推广监控的数据。名称不存在的自动创建 ，存在的使用已有的
     */
    private String tagName;
    /**
     * 推广链接，目前支持 微页面，商品页面，商品分组页 ，店铺主页，优惠券，拼团，付费会员卡
     */
    private String url;
    /**
     * 访问客户打标签，给通过该推广链接访问页面的客户打上标签，可持续跟进该类客户与区分运营。该标签有上限1000，名称不存在的自动创建 ，存在的使用已有的
     */
    private String visitFansTagName;

    public void setPsCost(Long psCost) {
        this.psCost = psCost;
    }

    public Long getPsCost() {
        return this.psCost;
    }

    public void setPsLocation(String psLocation) {
        this.psLocation = psLocation;
    }

    public String getPsLocation() {
        return this.psLocation;
    }

    public void setPsName(String psName) {
        this.psName = psName;
    }

    public String getPsName() {
        return this.psName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public void setVisitFansTagName(String visitFansTagName) {
        this.visitFansTagName = visitFansTagName;
    }

    public String getVisitFansTagName() {
        return this.visitFansTagName;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (psCost != null) {
            params.put("ps_cost", psCost);
        }
        if (psLocation != null) {
            params.put("ps_location", psLocation);
        }
        if (psName != null) {
            params.put("ps_name", psName);
        }
        if (sourceName != null) {
            params.put("source_name", sourceName);
        }
        if (tagName != null) {
            params.put("tag_name", tagName);
        }
        if (url != null) {
            params.put("url", url);
        }
        if (visitFansTagName != null) {
            params.put("visit_fans_tag_name", visitFansTagName);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}