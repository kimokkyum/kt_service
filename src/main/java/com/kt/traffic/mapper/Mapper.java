package com.kt.traffic.mapper;


import java.util.List;
import java.util.Map;

import com.kt.traffic.domain.TrafficInfomation;

public interface Mapper {

  public TrafficInfomation getTrafficInfo(String id);
  public List<TrafficInfomation> getTrafficList();
  public boolean insertTrafficInfo(Map<String, Object> map);
  public boolean updateTrafficInfo(String id, Map<String, Object> map);
  public boolean deleteTrafficInfo(String id);
}
