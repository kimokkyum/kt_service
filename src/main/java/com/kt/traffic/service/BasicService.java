package com.kt.traffic.service;

import com.kt.traffic.domain.TrafficInfomation;

import java.util.List;
import java.util.Map;

public interface BasicService {

    public TrafficInfomation getTraffic(int id);
    public List<TrafficInfomation> getList();
    public boolean addTrafficInfo(Map<String, Object> map);
    public boolean updateTrafficInfo(Map<String, Object> map);
    public boolean deleteTrafficInfo(int id);
}
