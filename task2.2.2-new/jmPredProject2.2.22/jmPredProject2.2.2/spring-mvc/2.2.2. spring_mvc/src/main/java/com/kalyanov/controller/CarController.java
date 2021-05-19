package com.kalyanov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.kalyanov.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarService service;

    @Autowired
    public void setService (CarService service) {
        this.service = service;
    }

    @GetMapping(value = "/Car")
    public String loopListExample(@RequestParam(value = "Cars", required = false) Integer Cars, Model model) {
        if (Cars == null || Cars >= 5) {
            model.addAttribute("people", service.getListCar());
            return "indexcar";
        } else {
            model.addAttribute("people", service.getCarCount(Cars));
            return "indexcar";
        }
    }
}