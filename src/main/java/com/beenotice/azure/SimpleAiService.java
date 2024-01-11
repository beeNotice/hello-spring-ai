package com.beenotice.azure;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.prompt.Prompt;
import org.springframework.ai.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SimpleAiService {

    private final ChatClient chatClient;

    @Value("classpath:/prompts/prompt.st")
    private Resource promptResource;

    @Value("classpath:/prompts/prompt-with-context.st")
    private Resource promptWithContextResource;

    @Value("classpath:/docs/custom-data.md")
    private Resource docsToStuffResource;

    public SimpleAiService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public void run(){
        System.out.println("Running chatClient with implementation - " + chatClient.getClass());
        String question = "What is BlahJioKah?";
        helloPrompt(question);
        //templatedPrompt(question);
        //stuffedPrompt(question);
    }

    public void helloPrompt(String question){
        String response = chatClient.generate(question);
        System.out.println(response);
    }

    public void templatedPrompt(String question){
        PromptTemplate promptTemplate = new PromptTemplate(promptResource);
        Prompt prompt = promptTemplate.create(Map.of("question", question));
        String response = chatClient.generate(prompt).getGeneration().getContent();
        System.out.println(response);
    }

    public void stuffedPrompt(String question){
        PromptTemplate promptTemplate = new PromptTemplate(promptWithContextResource);
        Prompt prompt = promptTemplate.create(Map.of("context", docsToStuffResource, "question", question));
        String response = chatClient.generate(prompt).getGeneration().getContent();
        System.out.println(response);
    }

}
