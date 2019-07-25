package com.liyan.service.Impl;

import com.liyan.mapper.AirplaneMapper;
import com.liyan.pojo.Airplane;
import com.liyan.service.AirplaneService;
import com.liyan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AirplaneServiceImpl implements AirplaneService {
    @Override
    public List<Airplane> showTakeLan(Integer takeid, Integer landid) {
        SqlSession sqlSession = MybatisUtil.getSession();
        AirplaneMapper airplaneMapper = sqlSession.getMapper(AirplaneMapper.class);
        List<Airplane> list = airplaneMapper.findTakeLandById(takeid, landid);
        return list;
    }
}
