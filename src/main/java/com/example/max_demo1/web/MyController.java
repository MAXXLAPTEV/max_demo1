package com.example.max_demo1.web;

import com.example.max_demo1.Car.Car;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class MyController {
    List<Car> cars = new ArrayList<>();

    Car car1 = new Car();

    @PostMapping
    public String addCar(@RequestBody Car car){
        cars.add(car);
        return "added";
    }


    @DeleteMapping
    public String deleteCar(){
        car1 = null;
        return "deleted";
    }

    @GetMapping
    public Car getCar(){
        return car1;
    }

    @GetMapping("/allCars")
    public List<Car> getAllCars(){
        return cars;
    }
}
