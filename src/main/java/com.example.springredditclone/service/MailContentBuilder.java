package com.example.springredditclone.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
/**
 * This class contains the logic to create our email message using the HTML template we provide.
 */
@Service
@AllArgsConstructor
public class MailContentBuilder {

    private final TemplateEngine templateEngine;

    /**
     * This method takes our email message as input. It uses the Thymeleaf‘s TemplateEngine to generate the email message.
     */
    String build (String message){
        Context context = new Context();
        context.setVariable("message", message);
        return templateEngine.process("mailTemplate", context);
    }
}
