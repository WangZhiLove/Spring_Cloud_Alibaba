package com.wangzhi.domain;

import java.util.Date;

import lombok.*;

public class Video {
    private Integer id;

    /**
    * 视频标题
    */
    private String title;

    /**
    * 概述
    */
    private String summary;

    /**
    * 封面图
    */
    private String coverImg;

    /**
    * 价格,分
    */
    private Integer price;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 默认8.7，最高10分
    */
    private Double point;

    public Video() {
    }

    public Video(Integer id, String title, String summary, String coverImg, Integer price, Date createTime, Double point) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.coverImg = coverImg;
        this.price = price;
        this.createTime = createTime;
        this.point = point;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", point=" + point +
                '}';
    }
}