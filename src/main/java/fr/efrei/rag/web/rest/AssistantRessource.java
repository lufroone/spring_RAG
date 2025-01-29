package fr.efrei.rag.web.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.efrei.rag.service.AssistantAiService;

@RestController
public class AssistantRessource {
    
    private final AssistantAiService assistantService;

    AssistantRessource(AssistantAiService assistantService) {
        this.assistantService = assistantService;
    }

    @PostMapping("/assistant/chat")
    public String chat(@RequestBody String question) {
        return assistantService.chat(question);
    }
}
