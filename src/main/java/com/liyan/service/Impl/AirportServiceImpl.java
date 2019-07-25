package com.liyan.service.Impl;

import com.liyan.mapper.AirportMapper;
import com.liyan.pojo.Airport;
import com.liyan.service.AirportService;
import com.liyan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AirportServiceImpl implements AirportService {
    @Override
    public List<Airport> showTakeAirPort() {
        SqlSession sqlSession = MybatisUtil.getSession();
        AirportMapper airportMapper = sqlSession.getMapper(AirportMapper.class);
        List<Airport> list = airportMapper.findTakePort();
        return list;
    }
}
