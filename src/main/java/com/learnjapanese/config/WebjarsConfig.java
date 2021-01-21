package com.learnjapanese.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "webjars")
@Data
public class WebjarsConfig {

	String bootstrap;
	String jquery;
	String popper;

}