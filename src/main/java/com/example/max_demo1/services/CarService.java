package com.example.max_demo1.services;


import com.example.max_demo1.carRepo.CarRepository;
import com.example.max_demo1.dto.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;


    //public List<Car> cars = new ArrayList<>();
    //public  Car currentCar = new Car();

    public void addCar(Car newCar) {
        carRepository.addCar(newCar);

    }
    public Car getCar(int num){
        return carRepository.getCar(num);
    }

    public List<Car> getAllCars(){
        return carRepository.getCars();
    }

    public void deleteCar(int num){
        carRepository.deleteCar(num);

    }



}
