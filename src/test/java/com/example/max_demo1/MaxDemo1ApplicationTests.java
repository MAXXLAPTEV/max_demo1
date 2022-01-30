package com.example.max_demo1;

import com.example.max_demo1.dto.Car;
import com.example.max_demo1.web.MyController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

@AutoConfigureMockMvc
@SpringBootTest
class MaxDemo1ApplicationTests {

//    @Test
//    void contextLoads() {
//        System.out.println("test");
//        MyController myController = new MyController();
//        List<Car> s = myController.getAllCars();
//        assertTrue(s.contains("test"));
//
//
//    }

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private MyController myController;

    @Autowired
    ObjectMapper objectMapper;
//
//    @Test
//    public void postTest1() throws Exception{
//        Car car1 = new Car();
//        car1.setName("lada");
//        car1.setPrice(37777);
//        this.mockMvc.perform((RequestBuilder) post("/addCar"))
//                .andDo(print())
//                .andExpect(content().string(containsString("added")));
//    }




    @Test
    public void getTest() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = get("/car");
        ResultActions perform = this.mockMvc.perform(requestBuilder);
        MvcResult mvcResult = perform.andReturn();
        MockHttpServletResponse response = mvcResult.getResponse();
        String contentAsString = response.getContentAsString();
        Car car = objectMapper.readValue(contentAsString, Car.class);
        assertTrue(car.getPrice() < 3000000);
        assertEquals("bmw", car.getName());
        System.out.println("car" + contentAsString);
    }
//
//    @Test
//    public void postTest() throws Exception {
//        Car car1 = new Car();
//        car1.setPrice(2000);
//        car1.setName("lada");
//        MockHttpServletRequestBuilder requestBuilder = post("/addCar")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(car1));
//        ResultActions perform = this.mockMvc.perform(requestBuilder);
//        MvcResult mvcResult = perform.andReturn();
//        MockHttpServletResponse response = mvcResult.getResponse();
//        String contentAsString = response.getContentAsString();
//        assertEquals("added", contentAsString);

//		ResultActions perform = this.mockMvc.perform(MockMvcRequestBuilders
//						.post("/addCar")
//						.contentType(MediaType.APPLICATION_JSON))
//				        .andExpect(content().string(containsString("added")));


        //}

//    @Test
//    public void deleteTest() throws Exception {
//        ResultActions perform = this.mockMvc.perform(MockMvcRequestBuilders
//						.delete("/deleteCar")
//                        .contentType(MediaType.APPLICATION_JSON))
//						.andExpect(content().string(containsString("deleted")));
//
//    }

    }

