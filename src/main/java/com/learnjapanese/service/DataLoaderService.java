package com.learnjapanese.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

@Service
public class DataLoaderService {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(DataLoaderService.class.getName());

	@Autowired
	ResourceLoader resourceLoader;

	DataLoaderService() {
		loadHiraganaFile();
		LOG.info("File was loaded.");
	}

	public String loadHiraganaFile() {
		File resource;
		try {
			resource = new ClassPathResource("hiragana.json").getFile();
			String text = new String(Files.readAllBytes(resource.toPath()));
			LOG.info("File Path: "+ resource.toPath());
			System.out.println(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
