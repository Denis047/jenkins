package com.demonstration.jenkins;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class JenkinsApplicationTests {

    private static final Logger log = Logger.getLogger(JenkinsApplicationTests.class.getName());

    @BeforeEach
    public void log() {
        log.info("Spring Test start...." + this.getClass().getName());
    }

    @Test
    void contextLoads() {
        assertThat(true).isTrue();
    }

}
