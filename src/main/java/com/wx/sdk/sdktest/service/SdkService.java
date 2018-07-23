package com.wx.sdk.sdktest.service;

import com.wx.sdk.sdktest.bean.SdkBean;
import com.wx.sdk.sdktest.dao.SdkDao;
import com.wx.sdk.sdktest.dto.SdkDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SdkService {
    @Autowired
    SdkDao dao;

    public List<SdkDto> findAll() {
        return beanList2DtoList(dao.findAll());
    }

    public SdkBean insert(SdkBean bean) {
        return dao.save(bean);
    }

    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

    List<SdkDto> beanList2DtoList(List<SdkBean> beanList) {
        List<SdkDto> list = new ArrayList<>();
        for (SdkBean bean : beanList) {
            SdkDto dto = bean2Dto(bean);
            if (null != dto) {
                list.add(dto);
            }
        }
        return list;
    }

    SdkDto bean2Dto(SdkBean bean) {
        if (null == bean) {
            return null;
        }
        SdkDto dto = new SdkDto();
        BeanUtils.copyProperties(bean, dto);
        dto.setFailRateStr(bean.getFailRate() * 100 + "%");
        return dto;
    }
}
