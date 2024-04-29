package com.kaisikk.java.starter.config;

import com.kaisikk.java.starter.service.WelcomeGreeting;
import com.kaisikk.java.starter.service.WelcomeGreetingImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(WelcomeGreeting.class)
public class WelcomeConfig {

    @Bean
    // бин создастся все равно, если нигде не прописан
    @ConditionalOnMissingBean
    public WelcomeGreeting welcomeGreeting(){
        return new WelcomeGreetingImpl();
    }

}
