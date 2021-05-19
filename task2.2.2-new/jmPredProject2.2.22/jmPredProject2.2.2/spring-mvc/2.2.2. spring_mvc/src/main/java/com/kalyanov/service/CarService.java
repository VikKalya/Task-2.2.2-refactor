package com.kalyanov.service;

import com.kalyanov.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {
    List<Car> getCarCount(int count);
    List<Car> getListCar();
}
