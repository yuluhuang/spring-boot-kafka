/**
 * @Title
 * @Project spring-boot-kafka
 * @Package com.yuluhuang.springbootkafka
 * @Description
 * @author yoshikouamari
 * @date 2019-04-08 10:16
 * @version
 */
package com.yuluhuang.springbootkafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author ylh
 * @Description
 * @date 2019-04-08 10:16
 */
@Service
public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) {
        logger.info(String.format("$$ -> Consumed Message -> %s", message));
    }
}
