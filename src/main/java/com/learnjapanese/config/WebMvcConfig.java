package com.learnjapanese.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	// Access Bootstrap static resource:
	// http://somedomain/SomeContextPath/js/
	registry.addResourceHandler("/js/**") //
		.addResourceLocations("classpath:/static/js/");

	// http://somedomain/SomeContextPath/jquery/jquery.min.css
	registry.addResourceHandler("/jquery/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/jquery/3.5.1/");

	// http://somedomain/SomeContextPath/bootstrap/css/bootstrap.min.css
	// http://somedomain/SomeContextPath/bootstrap/js/bootstrap.min.js
	registry.addResourceHandler("/bootstrap/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/bootstrap/4.5.3/");

	// http://somedomain/SomeContextPath/popper/popper.min.js
	registry.addResourceHandler("/popper.js/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/popper.js/1.16.0/");
	
	// http://somedomain/SomeContextPath/popper/popper.min.js
	registry.addResourceHandler("/datatables/**") //
	.addResourceLocations("classpath:/META-INF/resources/webjars/datatables/1.10.23/");

	// css
	registry.addResourceHandler("/css/**") //
		.addResourceLocations("classpath:/static/css/");

	// img
	registry.addResourceHandler("/img/**") //
		.addResourceLocations("classpath:/static/img/");

	// websocket
	registry.addResourceHandler("/stomp-websocket/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/stomp-websocket/2.3.3-1/");

	registry.addResourceHandler("/sockjs-client/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/sockjs-client/1.1.2/");

    }
}
