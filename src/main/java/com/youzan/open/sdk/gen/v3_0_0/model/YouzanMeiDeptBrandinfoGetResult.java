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

public class YouzanMeiDeptBrandinfoGetResult implements APIResult {

    @JsonProperty(value = "contact_name")
    /**
     * 联系人
     */
    private String contactName;
    @JsonProperty(value = "principal_cert_status")
    /**
     * 主体认证状态。
10:"成功",
 20:"未认证",
 30:"认证中",
 40:"认证失败"
     */
    private Long principalCertStatus;
    @JsonProperty(value = "pre_code")
    /**
     * 客服电话区号
     */
    private String preCode;
    @JsonProperty(value = "brand_cert_status")
    /**
     * 品牌认证状态 10:"成功", 
20:"未认证", 
30:"认证中", 
40:"认证失败"
     */
    private Long brandCertStatus;
    @JsonProperty(value = "principal_cert_type")
    /**
     * 主体认证类型。
2: 企业
 3:个人 
4:个人快捷
 10:社会团体 
12:个体工商户
     */
    private Long principalCertType;
    @JsonProperty(value = "telephone_number")
    /**
     * 客服电话
     */
    private String telephoneNumber;
    @JsonProperty(value = "contact_qq")
    /**
     * 联系qq
     */
    private String contactQq;
    @JsonProperty(value = "principal_cert_name")
    /**
     * 主体认证名称
     */
    private String principalCertName;
    @JsonProperty(value = "cate_id")
    /**
     * 类目id
     */
    private Long cateId;
    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "shop_short_url")
    /**
     * 店铺短连接
     */
    private String shopShortUrl;
    @JsonProperty(value = "shop_url")
    /**
     * 店铺链接
     */
    private String shopUrl;
    @JsonProperty(value = "cate_name")
    /**
     * 类目名称
     */
    private String cateName;
    @JsonProperty(value = "name")
    /**
     * 店铺名称
     */
    private String name;
    @JsonProperty(value = "contact_mobile")
    /**
     * 联系人电话
     */
    private String contactMobile;
    @JsonProperty(value = "logo")
    /**
     * 店铺logo
     */
    private String logo;

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return this.contactName;
    }
    public void setPrincipalCertStatus(Long principalCertStatus) {
        this.principalCertStatus = principalCertStatus;
    }

    public Long getPrincipalCertStatus() {
        return this.principalCertStatus;
    }
    public void setPreCode(String preCode) {
        this.preCode = preCode;
    }

    public String getPreCode() {
        return this.preCode;
    }
    public void setBrandCertStatus(Long brandCertStatus) {
        this.brandCertStatus = brandCertStatus;
    }

    public Long getBrandCertStatus() {
        return this.brandCertStatus;
    }
    public void setPrincipalCertType(Long principalCertType) {
        this.principalCertType = principalCertType;
    }

    public Long getPrincipalCertType() {
        return this.principalCertType;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }
    public void setContactQq(String contactQq) {
        this.contactQq = contactQq;
    }

    public String getContactQq() {
        return this.contactQq;
    }
    public void setPrincipalCertName(String principalCertName) {
        this.principalCertName = principalCertName;
    }

    public String getPrincipalCertName() {
        return this.principalCertName;
    }
    public void setCateId(Long cateId) {
        this.cateId = cateId;
    }

    public Long getCateId() {
        return this.cateId;
    }
    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setShopShortUrl(String shopShortUrl) {
        this.shopShortUrl = shopShortUrl;
    }

    public String getShopShortUrl() {
        return this.shopShortUrl;
    }
    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public String getShopUrl() {
        return this.shopUrl;
    }
    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getCateName() {
        return this.cateName;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactMobile() {
        return this.contactMobile;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return this.logo;
    }


}