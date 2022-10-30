package com.se250.store.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (ProdInfo)实体类
 *
 * @author makejava
 * @since 2022-10-25 18:59:36
 */
public class ProdInfo implements Serializable {
    private static final long serialVersionUID = -10865706445482899L;
    /**
     * 商品id
     */
    private Integer prodId;
    /**
     * 商品名称
     */
    private String prodName;
    /**
     * 商家名称
     */
    private String prodUser;
    /**
     * 商品单价
     */
    private Long prodPrice;
    
    private String prodPoint;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date modifiedTime;
    
    private String prodPicture;


    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdUser() {
        return prodUser;
    }

    public void setProdUser(String prodUser) {
        this.prodUser = prodUser;
    }

    public Long getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Long prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdPoint() {
        return prodPoint;
    }

    public void setProdPoint(String prodPoint) {
        this.prodPoint = prodPoint;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getProdPicture() {
        return prodPicture;
    }

    public void setProdPicture(String prodPicture) {
        this.prodPicture = prodPicture;
    }

}

