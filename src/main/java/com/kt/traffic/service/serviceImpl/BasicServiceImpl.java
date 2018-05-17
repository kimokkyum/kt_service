package com.kt.traffic.service.serviceImpl;

import com.kt.traffic.domain.TrafficInfomation;
import com.kt.traffic.mapper.Mapper;
import com.kt.traffic.service.BasicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BasicServiceImpl implements BasicService{

    private Mapper mapper;

    public void setMapper(Mapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public TrafficInfomation getTraffic(String id) {
        return null;
    }

    @Override
    public List<TrafficInfomation> getList() {
        return null;
    }

    @Override
    public void addTrafficInfo(Map<String, Object> map) {

    }

    @Override
    public void updateTrafficInfo(String id, Map<String, Object> map) {

    }

    @Override
    public void deleteTrafficInfo(String id) {

    }
}
