package com.halukerd.springkafka;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/notification/")
@AllArgsConstructor
public class NotificationController {

    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void sendNotify(@RequestBody NotificationRequest notificationRequest) {
        kafkaTemplate.send("notification", notificationRequest.message());
    }
}
