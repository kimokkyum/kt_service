package com.kt.traffic.domain;

import java.util.Date;

public class TrafficInfomation {

    private String trafficTitle;
    private String trafficLocation;
    private Date trafficUpdateDate;
    private String trafficFullAddress;
    private String trafficCountry;
    private String trafficCity;
    private String trafficState;
    private String trafficStreet;
    private int trafficPost;
    private String trafficInfo;


    public String getTrafficTitle() {
        return trafficTitle;
    }

    public void setTrafficTitle(String trafficTitle) {
        this.trafficTitle = trafficTitle;
    }

    public String getTrafficLocation() {
        return trafficLocation;
    }

    public void setTrafficLocation(String trafficLocation) {
        this.trafficLocation = trafficLocation;
    }

    public Date getTrafficUpdateDate() {
        return trafficUpdateDate;
    }

    public void setTrafficUpdateDate(Date trafficUpdateDate) {
        this.trafficUpdateDate = trafficUpdateDate;
    }

    public String getTrafficFullAddress() {
        return trafficFullAddress;
    }

    public void setTrafficFullAddress(String trafficFullAddress) {
        this.trafficFullAddress = trafficFullAddress;
    }

    public String getTrafficCountry() {
        return trafficCountry;
    }

    public void setTrafficCountry(String trafficCountry) {
        this.trafficCountry = trafficCountry;
    }

    public String getTrafficCity() {
        return trafficCity;
    }

    public void setTrafficCity(String trafficCity) {
        this.trafficCity = trafficCity;
    }

    public String getTrafficState() {
        return trafficState;
    }

    public void setTrafficState(String trafficState) {
        this.trafficState = trafficState;
    }

    public String getTrafficStreet() {
        return trafficStreet;
    }

    public void setTrafficStreet(String trafficStreet) {
        this.trafficStreet = trafficStreet;
    }

    public int getTrafficPost() {
        return trafficPost;
    }

    public void setTrafficPost(int trafficPost) {
        this.trafficPost = trafficPost;
    }

    public String getTrafficInfo() {
        return trafficInfo;
    }

    public void setTrafficInfo(String trafficInfo) {
        this.trafficInfo = trafficInfo;
    }

    @Override
    public String toString() {
        return "TrafficInfomation{" +
                "trafficTitle='" + trafficTitle + '\'' +
                ", trafficLocation='" + trafficLocation + '\'' +
                ", trafficUpdateDate=" + trafficUpdateDate +
                ", trafficFullAddress='" + trafficFullAddress + '\'' +
                ", trafficCountry='" + trafficCountry + '\'' +
                ", trafficCity='" + trafficCity + '\'' +
                ", trafficState='" + trafficState + '\'' +
                ", trafficStreet='" + trafficStreet + '\'' +
                ", trafficPost=" + trafficPost +
                ", trafficInfo='" + trafficInfo + '\'' +
                '}';
    }
}
