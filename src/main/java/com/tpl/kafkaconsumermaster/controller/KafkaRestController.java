package com.tpl.kafkaconsumermaster.controller;

import com.tpl.kafkaconsumermaster.Repository.MessageRepository;
import org.springframework.web.bind.annotation.*;
import com.tpl.kafkaconsumermaster.sender.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class KafkaRestController  {

    @Autowired
    private MessageProducer producer;

    @Autowired
    private MessageRepository messageRepository;

    //send message to kafka
    @GetMapping("/send")
      public String sendMessage(
            @RequestParam("msg") String message){
//        messageRepository.addMessage(message);
        producer.sendMessage(message);
        return "" + message +"" + " sent successfully";
    }

    @GetMapping("/all")
    public String getAllMessages(){
        return messageRepository.getAllMessage();
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String hello(){
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers() {
        System.out.println("Users");
        return "User";    }
}
