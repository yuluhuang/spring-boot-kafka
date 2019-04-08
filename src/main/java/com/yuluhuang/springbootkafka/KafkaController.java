/**
 * @Title
 * @Project spring-boot-kafka
 * @Package com.yuluhuang.springbootkafka
 * @Description
 * @author yoshikouamari
 * @date 2019-04-08 10:10
 * @version
 */
package com.yuluhuang.springbootkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ylh
 * @Description
 * @date 2019-04-08 10:10
 */
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final Producer producer;

    @Autowired
    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }
}
