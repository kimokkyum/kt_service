package com.kt.traffic.mapper.mapperImpl;

import com.kt.traffic.domain.TrafficInfomation;
import com.kt.traffic.mapper.Mapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapperImpl extends SqlSessionDaoSupport implements Mapper {

    @Override
    public TrafficInfomation getTrafficInfo(int id) {
        return getSqlSession().selectOne("Mapper.selectTraffic", id);
    }

    @Override
    public List<TrafficInfomation> getTrafficList() {
        return getSqlSession().selectList("Mapper.selectTrafficList");
    }

    @Override
    public boolean insertTrafficInfo(Map<String, Object> map) {

        int rows = getSqlSession().insert("Mapper.insertTrafficInfo", map);

        return rows > 0 ;
    }

    @Override
    public boolean updateTrafficInfo( Map<String, Object> map) {

        int rows = getSqlSession().update("Mapper.updateTrafficInfo", map);

        return rows > 0 ;
    }

    @Override
    public boolean deleteTrafficInfo(int id) {

        int rows = getSqlSession().delete("Mapper.deleteTrafficInfo", id);

        return rows > 0 ;
    }

	@Override
	public String logIn(String id, String pw) {
		
		Map<String,Object> user = new HashMap<>();
		
		user.put("user_id", id);
		user.put("user_pw", pw);
		
		return getSqlSession().selectOne("Mapper.login", user);
	}
}
