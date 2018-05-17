package com.kt.traffic.controller;

import com.kt.traffic.domain.TrafficInfomation;
import com.kt.traffic.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class MainController {

    @Autowired
    private BasicService basicService;


    @RequestMapping(value = "/trafficInfo/{id}", method = RequestMethod.GET)
    public TrafficInfomation getTraffic(@PathVariable String id){
        return null;
    }

    @RequestMapping(value = "/trafficList", method = RequestMethod.GET)
    public List<TrafficInfomation> getList(){
        return null;
    }

    @RequestMapping(value = "/addInfo", method = RequestMethod.POST)
    public void addInfo(@RequestBody Map<String, Object> map){

    }

    @RequestMapping(value = "/updateInfo/{id}", method = RequestMethod.PUT)
    public void updateInfo(@PathVariable String id ,@RequestBody Map<String, Object> map){

    }

    @RequestMapping(value = "/deleteInfo/{id}", method = RequestMethod.DELETE)
    public void deleteInfo(@PathVariable String id){

    }

}
