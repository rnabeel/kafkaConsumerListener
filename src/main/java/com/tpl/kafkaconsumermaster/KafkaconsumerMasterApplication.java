package com.tpl.kafkaconsumermaster;

import com.tpl.kafkaconsumermaster.controller.KafkaRestController;
//import com.tpl.kafkaconsumermaster.teltonika.TeltonikaConsumerThreadPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
//@ComponentScan(basePackageClasses= KafkaRestController.class)
//@ComponentScan(basePackages={"com.tpl.kafkaconsumermaster"})
//@EnableKafka
//@ComponentScan("com.mongotest") //to scan packages mentioned
//@EnableMongoRepositories("com.mongotest") //to activate MongoDB repositories

public class KafkaconsumerMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaconsumerMasterApplication.class, args);
		System.out.println("Hello");

	}

}
