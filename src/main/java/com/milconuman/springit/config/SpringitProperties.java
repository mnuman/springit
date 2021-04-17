package com.milconuman.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "springit")
public class SpringitProperties {
    /**
     * This is a welcome message for the application
     */
    private String welcomeMessage = "Hello World";

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}
