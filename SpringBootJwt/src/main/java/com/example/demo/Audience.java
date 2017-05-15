package com.example.demo;


/**
 * Created by Dade on 2017/5/13.
 */
//@Configuration
//@EnableConfigurationProperties(Audience.class)
public class Audience {
    private String clientId;
    private String base64Secret;
    private String name;
    private int expiresSecond;


    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getBase64Secret() {
        return base64Secret;
    }
    public void setBase64Secret(String base64Secret) {
        this.base64Secret = base64Secret;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getExpiresSecond() {
        return expiresSecond;
    }
    public void setExpiresSecond(int expiresSecond) {
        this.expiresSecond = expiresSecond;
    }
}