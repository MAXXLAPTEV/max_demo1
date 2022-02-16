package com.example.max_demo1.web;

import com.example.max_demo1.dto.Car;
import com.example.max_demo1.dto.Driver;
import com.example.max_demo1.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {

    final
    DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Driver> getDriverId(@PathVariable int id){
        return ResponseEntity.ok().body(driverService.getDriver(id));
    }

    @PostMapping("/addDriver/{id}")
    public void addDriver(@RequestBody Driver newDriver){
        driverService.addDriver(newDriver);
    }

    @GetMapping("/gettAllDrivers")
    public  List<Driver> getAllDrivers(){
        return driverService.getAllDrivers();
    }

    @DeleteMapping("/deleteDriver")
    public void deleteDriver(@PathVariable int id){
        driverService.deleteDriver(id);
    }


}
