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
    public TrafficInfomation getTraffic(int id) {
        return mapper.getTrafficInfo(id);
    }

    @Override
    public List<TrafficInfomation> getList() {
        return mapper.getTrafficList();
    }

    @Override
    public boolean addTrafficInfo(Map<String, Object> map) {
         return mapper.insertTrafficInfo(map);
    }

    @Override
    public boolean updateTrafficInfo( Map<String, Object> map) {
        return mapper.updateTrafficInfo(map);
    }

    @Override
    public boolean deleteTrafficInfo(int id) {
        return mapper.deleteTrafficInfo(id);
    }

	@Override
	public String getLogin(String id, String pw) {
		
		return null;
	}
}
