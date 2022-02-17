package com.example.max_demo1.services;


import com.example.max_demo1.carRepo.CarRepository;
import com.example.max_demo1.db.ent.CarEnt;
import com.example.max_demo1.db.ent.DriverEnt;
import com.example.max_demo1.db.repo.CarRepo;
import com.example.max_demo1.db.repo.DriverRepo;
import com.example.max_demo1.dto.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;




@Service
public class CarService {

    final private CarRepository carRepository;
    final private CarRepo carRepo;
    final private DriverRepo driverRepo;
    final private ObjectMapper objectMapper;


    @SneakyThrows
    @PostConstruct
    public void init() {
//        CarEnt carEnt = new CarEnt();
//        carRepo.save(carEnt);
//
//        List<CarEnt> all = carRepo.findAll();
//        System.out.println("all " + all);

        DriverEnt driverEnt = new DriverEnt();
        driverEnt.setSurname("max");

        CarEnt carEnt1 = new CarEnt();
        carEnt1.setName("lada");

        driverEnt.setCarEntList(Arrays.asList(carEnt1));

        driverRepo.save(driverEnt);

        List<DriverEnt> all = driverRepo.findAll();
        System.out.println("all " + all);


//        List<DriverEnt> oleg = driverRepo.findBySuperName("oleg");
//        System.out.println(oleg.size());

    }




    public CarService(CarRepository carRepository, CarRepo carRepo, DriverRepo driverRepo, ObjectMapper objectMapper) {
        this.carRepository = carRepository;
        this.carRepo = carRepo;
        this.driverRepo = driverRepo;
        this.objectMapper = objectMapper;
    }

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
