package com.example.max_demo1.carRepo;


import com.example.max_demo1.db.ent.CarEnt;
import com.example.max_demo1.dto.Car;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {



    public List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


    public Car getCar(int num) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getNum() == num) {
                return cars.get(i);
            }
        }
        return null;

    }




    public void addCar(Car car) {
        cars.add(car);
    }

    public void deleteCar(int num) {
        this.cars.remove(num);
    }



}
