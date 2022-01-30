package com.example.max_demo1.services;


import com.example.max_demo1.dto.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {


    public List<Car> cars = new ArrayList<>();
    public  Car currentCar = new Car();
}
