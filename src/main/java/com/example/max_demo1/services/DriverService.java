package com.example.max_demo1.services;

import com.example.max_demo1.carRepo.DriverRepository;
import com.example.max_demo1.dto.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {


        final
        DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }


    public void addDriver(Driver newDriver) {
            driverRepository.addDriver(newDriver);

        }

        public Driver getDriver(int id) {
            return driverRepository.getDriver(id);
        }

        public List<Driver> getAllDrivers() {
            return driverRepository.getDrivers();
        }

        public void deleteDriver(int id) {
            driverRepository.deleteDriver(id);

        }
    }





