package com.liyan.mapper;

import com.liyan.pojo.Airport;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AirportMapper {
    @Select("select * from airport where id in(select distinct takeid from airplane)")
    List<Airport> findTakePort();//查询起飞机场

}
