package com.example.max_demo1.web;

import com.example.max_demo1.dto.Car;
import com.example.max_demo1.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class MyController {

    @Autowired
    CarService carService;


    @PostMapping("/addCar")
    public String addCar(@RequestBody Car car){
        carService.cars.add(car);
        return "added";
    }

    @DeleteMapping("/deleteCar")
    public String deleteCar(){
        carService.currentCar = null;
        return "deleted";
    }

    @GetMapping
    public Car getCar(){
        return carService.currentCar;
    }

    @GetMapping("/allCars")
    public List<Car> getAllCars(){
        return carService.cars;
    }
}
