package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
//@EnableConfigurationProperties(Audience.class)
@ConfigurationProperties(prefix = "audience")
@RestController
public class SpringBootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		HTTPBasicAuthorizeAttribute httpBasicFilter = new HTTPBasicAuthorizeAttribute();
		registrationBean.setFilter(httpBasicFilter);
		List<String> urlPatterns = new ArrayList<String>();
		urlPatterns.add("/user/*");
		registrationBean.setUrlPatterns(urlPatterns);
		return registrationBean;
	}

    @Value("${audience.name}")
    String name;

    @Value("${audience.age}")
    String age;

    @RequestMapping("/api/audience")
    String audience(){
        return name + " is " + age + " now!";
    }


}
