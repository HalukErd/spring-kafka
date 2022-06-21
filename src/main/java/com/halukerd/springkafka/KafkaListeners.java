package com.halukerd.springkafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListeners {

    @KafkaListener(
            topics = "notification",
            groupId = "groupID"
    )
    void listeners(String data) {
        log.info("Notification listener: " + data+ "🎉");
    }
}
