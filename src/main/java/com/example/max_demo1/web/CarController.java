package com.example.max_demo1.web;

import com.example.max_demo1.dto.Car;
import com.example.max_demo1.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/addCar")
    public void addCar(@RequestBody Car newCar){
        carService.addCar(newCar);
    }

    @GetMapping()
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @DeleteMapping("/deleteCar")
    public void deleteCar(@PathVariable int num){
        carService.deleteCar(num);
    }

    @GetMapping("/getCar/{num}")
    public Car getCar(@PathVariable int num){
        return carService.getCar(num);
    }







//    @PostMapping("/addCar")
//    public String addCar(@RequestBody Car car){
//        carService.cars.add(car);
//        return "added";
//    }
//
//    @DeleteMapping("/deleteCar")
//    public String deleteCar(){
//        carService.cars = null;
//        return "deleted";
//    }
//
//    @GetMapping
//    public Car getCar(){
//        return carService.cars.get(1);
//    }
//
//    @GetMapping("/allCars")
//    public List<Car> getAllCars(){
//        return carService.cars;
//    }
}
