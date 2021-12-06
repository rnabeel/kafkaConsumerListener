package com.tpl.kafkaconsumermaster.Repository;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MessageRepository {
    private List<String> list = new ArrayList<>();

    public void addMessage(String message){
        list.add(message);
        System.out.println(list.toString());
    }

    public String getAllMessage(){
        System.out.println("all messages");
        return list.toString();

    }

}

