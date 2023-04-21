package com.example.quartscheduler;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class QuartSchedulerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(QuartSchedulerApplication.class).bannerMode(Banner.Mode.OFF).run(args);
    }
}
