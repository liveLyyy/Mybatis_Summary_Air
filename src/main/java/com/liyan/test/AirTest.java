package com.liyan.test;

import com.liyan.pojo.Airport;
import com.liyan.service.Impl.AirportServiceImpl;
import org.junit.Test;

import java.util.List;

public class AirTest {
    @Test
    public void Air(){
        AirportServiceImpl airportService=new AirportServiceImpl();
        List<Airport> list=airportService.showTakeAirPort();
        for (Airport airport:list){
            System.out.println(list);
        }
    }

}
