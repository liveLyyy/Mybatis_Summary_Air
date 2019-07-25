package com.liyan.service;

import com.liyan.pojo.Airplane;

import java.util.List;

public interface AirplaneService {
    List<Airplane> showTakeLan(Integer takeid,Integer landid);
}
