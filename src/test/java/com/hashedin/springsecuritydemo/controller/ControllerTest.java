package com.hashedin.springsecuritydemo.controller;

import static org.assertj.core.api.Assertions.assertThat;

import com.hashedin.springsecuritydemo.HomeController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// https://spring.io/guides/gs/testing-web/

@SpringBootTest
public class ControllerTest {

    @Autowired
    private HomeController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}
