package com.example.max_demo1.db.web;

import com.example.max_demo1.dto.Car;
import com.example.max_demo1.services.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    final  CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/{num}")
    public ResponseEntity<Car> getCarNum(@PathVariable int num){
        return ResponseEntity.ok().body(carService.getCar(num));
    }

    @PostMapping("/addCar")
    public void addCar(@RequestBody Car newCar){
       carService.addCar(newCar);
    }

    @GetMapping("/getAllCars")
    public List<Car> getCarsList() {
        return carService.getAllCars();
    }

    @DeleteMapping("/deleteCar")
    public void deleteCar(@PathVariable int num){
        carService.deleteCar(num);
    }







}
