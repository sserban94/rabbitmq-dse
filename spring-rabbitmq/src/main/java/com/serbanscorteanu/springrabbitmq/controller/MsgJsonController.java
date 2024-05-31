package com.serbanscorteanu.springrabbitmq.controller;

import com.serbanscorteanu.springrabbitmq.dto.Person;
import com.serbanscorteanu.springrabbitmq.producer.RabbitMQJsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MsgJsonController {
    private RabbitMQJsonProducer rabbitMQJsonProducer;

    public MsgJsonController(RabbitMQJsonProducer rabbitMQJsonProducer) {
        this.rabbitMQJsonProducer = rabbitMQJsonProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publishJsonMessage(@RequestBody Person person) {
        rabbitMQJsonProducer.sendJsonMessage(person);
        return ResponseEntity.ok("Json message published successfully");
    }
}
