package com.wx.sdk.sdktest.dao;

import com.wx.sdk.sdktest.bean.SdkBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SdkDao extends JpaRepository<SdkBean,Integer> {

}