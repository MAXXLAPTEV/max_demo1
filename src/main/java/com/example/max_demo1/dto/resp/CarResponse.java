package com.example.max_demo1.dto.resp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarResponse{

    private int num;
    private String name;
    private int price;


    public CarResponse(String name, int price) {
        this.name = name;
        this.price = price;

    }
}

