package com.serbanscorteanu.springrabbitmq.consumer;

import com.serbanscorteanu.springrabbitmq.dto.Person;
import org.slf4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {
    public static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = "${rabbitmq.json.queue.name}")
    public void consumeMessage(Person person) {
        LOGGER.info("Json message received: {}", person.toString());
    }

}
