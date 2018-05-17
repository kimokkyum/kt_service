package com.kt.traffic.mapper.mapperImpl;

import com.kt.traffic.domain.TrafficInfomation;
import com.kt.traffic.mapper.Mapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;


public class MapperImpl extends SqlSessionDaoSupport implements Mapper {

    @Override
    public TrafficInfomation getTrafficInfo(String id) {
        return null;
    }

    @Override
    public List<TrafficInfomation> getTrafficList() {
        return null;
    }

    @Override
    public boolean insertTrafficInfo(Map<String, Object> map) {
        return false;
    }

    @Override
    public boolean updateTrafficInfo(String id, Map<String, Object> map) {
        return false;
    }

    @Override
    public boolean deleteTrafficInfo(String id) {
        return false;
    }
}
