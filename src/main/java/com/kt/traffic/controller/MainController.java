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
    public TrafficInfomation getTraffic(@PathVariable int id){
        return basicService.getTraffic(id);
    }

    @RequestMapping(value = "/trafficList", method = RequestMethod.GET)
    public List<TrafficInfomation> getList(){
        return basicService.getList();
    }

    @RequestMapping(value = "/addInfo", method = RequestMethod.POST)
    public String addInfo(@RequestBody Map<String, Object> map){
        boolean addSuccess = basicService.addTrafficInfo(map);

        if (!addSuccess){
            return "ADD FAIL!!";
        }

        return "ADD SUCCESS";
    }

    @RequestMapping(value = "/updateInfo", method = RequestMethod.PUT)
    public String updateInfo(@RequestBody Map<String, Object> map){
        boolean updateSuccess = basicService.updateTrafficInfo(map);

        if (!updateSuccess){
            return "UPDATE FAIL!!";
        }

        return "UPDATE SUCCESS";
    }

    @RequestMapping(value = "/deleteInfo/{id}", method = RequestMethod.DELETE)
    public String deleteInfo(@PathVariable int id){
        boolean deleteSuccess = basicService.deleteTrafficInfo(id);

        if (!deleteSuccess){
            return "DELETE FAIL!!";
        }

        return "DELETE SUCCESS";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String logIn(@RequestBody String id, String pw) {
    	
    	
    	
    	return "";
    }

}
