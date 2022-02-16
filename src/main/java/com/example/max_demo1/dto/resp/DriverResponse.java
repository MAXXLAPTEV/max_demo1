package com.example.max_demo1.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverResponse {

    private int id;
    private String name;
    private String surname;
    private List<CarResponse> carList;

    public DriverResponse(String name, String surname, List<CarResponse> carList) {
        this.name = name;
        this.surname = surname;
        this.carList = carList;
    }
}
