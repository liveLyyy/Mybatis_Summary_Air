package com.liyan.servlet;

import com.liyan.pojo.Airport;
import com.liyan.service.Impl.AirportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/showTackAirPort")
public class ShowTakeServlet extends HttpServlet {
    AirportServiceImpl airportService=new AirportServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Airport> list=airportService.showTakeAirPort();
        req.setAttribute("takeport",list);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
