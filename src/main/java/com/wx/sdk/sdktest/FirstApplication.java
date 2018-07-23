package com.wx.sdk.sdktest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wx.sdk.sdktest.bean.SdkBean;
import com.wx.sdk.sdktest.dto.SdkDto;
import com.wx.sdk.sdktest.service.SdkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@SpringBootApplication
public class FirstApplication {

    @Autowired
    SdkService service;

    Gson gson =  new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    @RequestMapping("/")
    String index() {
        return "Hello Spring Boot";
    }

    @RequestMapping("/getAllData1")
    String getAllData1() {
        Gson gson = new Gson();
        List<SdkBean> list = new ArrayList<>();
        SdkBean s1 = new SdkBean(1, "beta1.1", 12d, 3.20, new Date(), 0.2);
        SdkBean s2 = new SdkBean(2, "beta1.2", 8d, 3.20, new Date(), 0.4);
        list.add(s1);
        list.add(s2);
        return gson.toJson(list);
    }

    @RequestMapping("/getAllData")
    String getAllData() {
        List<SdkDto> list = service.findAll();
        return gson.toJson(list);
    }

    @RequestMapping("/insertData")
    String insertData(@RequestBody SdkBean bean) {
        String result = "";
        try {
            if (null != bean) {
                if (null == bean.getFirstFps()) {
                    bean.setFirstFps(new Date());
                }
            }
            result = gson.toJson(service.insert(bean));
        } catch (Exception e) {
            result = e.toString();
        }
        return result;
    }

    @RequestMapping("/deleteById")
    String deleteById(Integer id) {
        String result = "";
        try {
            service.deleteById(id);
        } catch (Exception e) {
            result = e.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);
    }
}