package com.example.max_demo1;

import com.example.max_demo1.carRepo.CarRepository;
import com.example.max_demo1.db.web.CarController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@AutoConfigureMockMvc
@SpringBootTest
class MaxDemo1ApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    private CarController carController;


    @Test
    public void test() throws Exception{
        assertThat(carController).isNotNull();
    }

//    @Test
//    public void getCarTest() throws Exception {
//
//        carRepository.cars.add(new Car(1, 29999, "kdjfgh"));
//
//        MockHttpServletRequestBuilder requestBuilder = get("/car/getCar/1");
//        ResultActions perform = this.mockMvc.perform(requestBuilder);
//        MvcResult mvcResult = perform.andReturn();
//        MockHttpServletResponse response = mvcResult.getResponse();
//        String contentAsString = response.getContentAsString();
//        System.out.println("car " + contentAsString);
//    }

//    @Test
//    public void AddAndDeleteCarTest() throws  Exception{
//
//        Car car3 = new Car(1,22222,"fdgfg");
//
//        MockHttpServletRequestBuilder requestBuilder = post("/car/addCar/1")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(car3));
//        ResultActions perform = this.mockMvc.perform(requestBuilder);
//        MvcResult mvcResult = perform.andReturn();
//        MockHttpServletRequestBuilder requestBuilder1 = delete("/car/deleteCar")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(car3));
//        ResultActions perform1 = this.mockMvc.perform(requestBuilder);
//        MvcResult mvcResult1 = perform1.andReturn();
//        MockHttpServletResponse response = mvcResult1.getResponse();
//        String contentAsString = response.getContentAsString();
//        System.out.println("car with price " + car3.getPrice() + " " + "and name " + car3.getName() + " is deleted ");
//
//    }

}


















