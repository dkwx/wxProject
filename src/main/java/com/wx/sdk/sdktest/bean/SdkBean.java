package com.wx.sdk.sdktest.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "performance")
public class SdkBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String versionNum;
    private Double memory;
    private Double cpu;
    private Date firstFps;
    private Double failRate;

    public SdkBean(Integer id,String versionNum, Double memory, Double cpu, Date firstFps, Double failRate) {
        this.versionNum = versionNum;
        this.memory = memory;
        this.cpu = cpu;
        this.firstFps = firstFps;
        this.failRate = failRate;
    }

    public SdkBean() {
    }

    @Override
    public String toString() {
        return "SdkBean{" +
                "id=" + id +
                ", versionNum='" + versionNum + '\'' +
                ", memory=" + memory +
                ", cpu=" + cpu +
                ", firstFps=" + firstFps +
                ", failRate=" + failRate +
                '}';
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
}
