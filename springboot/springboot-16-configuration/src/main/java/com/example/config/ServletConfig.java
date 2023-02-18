package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/17 15:11
 */
@ConfigurationProperties(prefix = "servers")
@Component
public class ServletConfig {

    private String ipAdderss;
    private int port;
    private long timeout;

    public ServletConfig(String ipAdderss, int port, long timeout) {
        this.ipAdderss = ipAdderss;
        this.port = port;
        this.timeout = timeout;
    }

    public String getIpAdderss() {
        return ipAdderss;
    }

    public void setIpAdderss(String ipAdderss) {
        this.ipAdderss = ipAdderss;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public ServletConfig() {
    }
}
