package com.dark.basics.Service;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    @Autowired
    ChatModel chatModel;

    public String getJoke(String topic) {
        return chatModel.call("act as a funny person and write a joke about the given {topic}?", topic);
    }
}
