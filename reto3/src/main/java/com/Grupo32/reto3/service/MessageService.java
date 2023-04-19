package com.Grupo32.reto3.service;


import com.Grupo32.reto3.model.MessageModel;
import com.Grupo32.reto3.repository.MessageRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MessageService {
    @Autowired
    MessageRpository messageRpository;
    public List<MessageModel> obtener(){
       return messageRpository.findAll();
    }
    public void crear(MessageModel message){
        messageRpository.save(message);
    }
}