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

		// css
		registry.addResourceHandler("/css/**") //
				.addResourceLocations("classpath:/static/css/");

		// img
		registry.addResourceHandler("/img/**") //
				.addResourceLocations("classpath:/static/img/");

		// lib
		registry.addResourceHandler("/lib/**") //
				.addResourceLocations("classpath:/static/lib/");

	}
}
