package com.example.max_demo1.services;


import com.example.max_demo1.carRepo.CarRepository;
import com.example.max_demo1.carRepo.DriverRepository;
import com.example.max_demo1.db.ent.CarEnt;
import com.example.max_demo1.db.ent.DriverEnt;
import com.example.max_demo1.db.repo.CarRepo;
import com.example.max_demo1.db.repo.DriverRepo;
import com.example.max_demo1.dto.Car;
import com.example.max_demo1.dto.resp.CarResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Arrays;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    public CarRepository carRepository;
    private ObjectMapper objectMapper;

    public void addCar(Car newCar) {carRepository.addCar(newCar);
    }
    public Car getCar(int num){
        return carRepository.getCar(num);
    }

    public List<Car> getAllCars(){
        return carRepository.getCars();
    }

    public void deleteCar(int num){carRepository.deleteCar(num);

    }





}
