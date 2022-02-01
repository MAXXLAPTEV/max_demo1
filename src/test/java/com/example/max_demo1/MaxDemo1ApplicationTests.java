package com.example.max_demo1;

import com.example.max_demo1.dto.Car;
import com.example.max_demo1.web.MyController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;


import java.util.List;

@AutoConfigureMockMvc
@SpringBootTest
class MaxDemo1ApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private MyController myController;

    @Autowired
    ObjectMapper objectMapper;


    @Test
    public void getTest() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = get("/car");
        ResultActions perform = this.mockMvc.perform(requestBuilder);
        MvcResult mvcResult = perform.andReturn();
        MockHttpServletResponse response = mvcResult.getResponse();
        String contentAsString = response.getContentAsString();
        Car car = objectMapper.readValue(contentAsString, Car.class);
        assertEquals(2000000 , car.getPrice());
        assertEquals("bmw", car.getName());
        System.out.println("car" + contentAsString);
    }

    @Test
    public void postTest() throws Exception {
        Car car1 = new Car();
        car1.setPrice(2000);
        car1.setName("lada");
        MockHttpServletRequestBuilder requestBuilder = post("/car/addCar")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(car1));
        ResultActions perform = this.mockMvc.perform(requestBuilder);
        MvcResult mvcResult = perform.andReturn();
        MockHttpServletResponse response = mvcResult.getResponse();
        String contentAsString = response.getContentAsString();
        System.out.println(contentAsString);
    }

    @Test
    public void CarDeleteTest() throws Exception {
        Car car2 = new Car();
        car2.setPrice(30000);
        car2.setName("mini");
        this.mockMvc.perform(delete("/car/deleteCar")
                .header("deleted", "car " + car2))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
    @Test
    public void AddAndDeleteCarTest() throws  Exception{
        Car car3 = new Car();
        car3.setPrice(40000);
        car3.setName("kia");
        MockHttpServletRequestBuilder requestBuilder = post("/car/addCar")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(car3));
        ResultActions perform = this.mockMvc.perform(requestBuilder);
        MvcResult mvcResult = perform.andReturn();
        MockHttpServletRequestBuilder requestBuilder1 = delete("/car/deleteCar")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(car3));
        ResultActions perform1 = this.mockMvc.perform(requestBuilder);
        MvcResult mvcResult1 = perform1.andReturn();
        MockHttpServletResponse response = mvcResult1.getResponse();
        String contentAsString = response.getContentAsString();
        System.out.println("car with price " + car3.getPrice() + " " + "and name " + car3.getName() + " is deleted ");

    }



}




