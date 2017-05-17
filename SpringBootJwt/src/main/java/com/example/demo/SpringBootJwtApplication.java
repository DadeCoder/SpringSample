package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
//@RestController
public class SpringBootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);
	}

//	@Bean
//	public FilterRegistrationBean filterRegistrationBean() {
//		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//		HTTPBasicAuthorizeAttribute httpBasicFilter = new HTTPBasicAuthorizeAttribute();
//		registrationBean.setFilter(httpBasicFilter);
//		List<String> urlPatterns = new ArrayList<String>();
//		urlPatterns.add("/user/*");
//		registrationBean.setUrlPatterns(urlPatterns);
//		return registrationBean;
//	}

//    @Value("${audience.name}")
//    String name;
//
//    @Value("${audience.age}")
//    String age;
//
//	@Autowired
//	Audience audience;
//
//    @RequestMapping("/api/audience")
//    String audience(){
//        return name + " is " + age + " now!";
//    }

//	@RequestMapping("/api/prefix")
//	String prefix(){
//		return audience.getName() + " is " + audience.getAge() + " now!";
//	}
//	@RequestMapping("/getaudience")
//	public Object getAudience() {
//		ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), audience);
//		return resultMsg;
//	}

	@Bean
	public FilterRegistrationBean jwtFilterRegistrationBean(){
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		HTTPBearerAuthorizeAttribute httpBearerFilter = new HTTPBearerAuthorizeAttribute();
		registrationBean.setFilter(httpBearerFilter);
		List<String> urlPatterns = new ArrayList<String>();
		urlPatterns.add("/user/getusers");
		registrationBean.setUrlPatterns(urlPatterns);
		return registrationBean;
	}





}
