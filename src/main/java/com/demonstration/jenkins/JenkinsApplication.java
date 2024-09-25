package com.demonstration.jenkins;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsApplication implements CommandLineRunner {

    private static final Logger log = Logger.getLogger(JenkinsApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Spring boot Application started");
    }

}
