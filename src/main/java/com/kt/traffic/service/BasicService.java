package com.kt.traffic.service;

import com.kt.traffic.domain.TrafficInfomation;

import java.util.List;
import java.util.Map;

public interface BasicService {

    public TrafficInfomation getTraffic(String id);
    public List<TrafficInfomation> getList();
    public void addTrafficInfo(Map<String, Object> map);
    public void updateTrafficInfo(String id, Map<String, Object> map);
    public void deleteTrafficInfo(String id);
}
