package com.abreu.magalu_ms.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class MagaluTaskScheduler {

    private static final Logger log = LoggerFactory.getLogger(MagaluTaskScheduler.class);

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void runTasks() {
        var dateTime = LocalDateTime.now();
        log.info("Running at: {}", dateTime);
    }

}
