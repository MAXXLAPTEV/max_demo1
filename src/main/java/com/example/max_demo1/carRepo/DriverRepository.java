package com.example.max_demo1.carRepo;

import com.example.max_demo1.dto.Driver;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class DriverRepository {
    public List<Driver> drivers = new ArrayList<>();

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public Driver getDriver(int id) {
        for (int i = 0; i < drivers.size(); i++) {
            if (drivers.get(i).getId() == id) {
                return drivers.get(i);
            }
        }
        return null;


    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void deleteDriver(int id) {
        this.drivers.remove(id);
    }



}

