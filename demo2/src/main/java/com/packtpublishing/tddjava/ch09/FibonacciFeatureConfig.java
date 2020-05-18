package com.packtpublishing.tddjava.ch09;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "features.fibonacci")
public class FibonacciFeatureConfig {
    private boolean restEnabled;
    public boolean isRestEnabled() {
        return restEnabled;
    }
    public void setRestEnabled(boolean restEnabled) {
        this.restEnabled = restEnabled;
    }
    private boolean webEnabled;
    public boolean isWebEnabled() {
        return webEnabled;
    }
    public void setWebEnabled(boolean webEnabled) {
        this.webEnabled = webEnabled;
    }
}