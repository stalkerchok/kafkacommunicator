package com.reunico.controller;

import com.reunico.domain.Message;
import com.reunico.kafka.MessageSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommunicatorController {

    private final MessageSender messageSender;

    public CommunicatorController(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @PostMapping("/send/email")
    public void sendEmail(@RequestBody Message message) {
        messageSender.send(message);
    }
}
