package com.wx.sdk.sdktest.dto;

import java.util.Date;

public class SdkDto {
    private Integer id;
    private String versionNum;
    private Double memory;
    private Double cpu;
    private Date firstFps;
    private Double failRate;
    private String failRateStr;

    public SdkDto(Integer id, String versionNum, Double memory, Double cpu, Date firstFps, Double failRate, String failRateStr) {
        this.id = id;
        this.versionNum = versionNum;
        this.memory = memory;
        this.cpu = cpu;
        this.firstFps = firstFps;
        this.failRate = failRate;
        this.failRateStr = failRateStr;
    }

    public SdkDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public Double getMemory() {
        return memory;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }

    public Double getCpu() {
        return cpu;
    }

    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    public Date getFirstFps() {
        return firstFps;
    }

    public void setFirstFps(Date firstFps) {
        this.firstFps = firstFps;
    }

    public Double getFailRate() {
        return failRate;
    }

    public void setFailRate(Double failRate) {
        this.failRate = failRate;
    }

    public String getFailRateStr() {
        return failRateStr;
    }

    public void setFailRateStr(String failRateStr) {
        this.failRateStr = failRateStr;
    }

    @Override
    public String toString() {
        return "SdkDto{" +
                "id=" + id +
                ", versionNum='" + versionNum + '\'' +
                ", memory=" + memory +
                ", cpu=" + cpu +
                ", firstFps=" + firstFps +
                ", failRate=" + failRate +
                ", failRateStr='" + failRateStr + '\'' +
                '}';
    }
}
