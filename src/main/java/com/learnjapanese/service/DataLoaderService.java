package com.learnjapanese.service;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.learnjapanese.entity.Hiragana;

/**
 * @author Mai Thành Duy An <br>
 *         <b> Get local json data file
 */
@Service
public class DataLoaderService {

	private static final Logger LOG = LoggerFactory.getLogger(DataLoaderService.class.getName());

	@Autowired
	ResourceLoader resourceLoader;

	Gson gson;
	List<Hiragana> hiraganaList;

	DataLoaderService() {
		gson = new Gson();
		hiraganaList = new ArrayList<Hiragana>();
		reloadHiraganaList();
		LOG.info("JSON Data File was loaded.");
	}

	private String loadHiraganaFile() {
		String text = "";
		File resource;
		try {
			resource = new ClassPathResource("hiragana.json").getFile();
			text = new String(Files.readAllBytes(resource.toPath()));
			LOG.info("File Path: " + resource.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}

	/**
	 * <b>Get Hiragana List from JSON File</b>
	 */
	public List<Hiragana> reloadHiraganaList() {
		ArrayList<Hiragana> hiraganaArray = new ArrayList<Hiragana>();
		try {
			Type hiraganaListType = new TypeToken<ArrayList<Hiragana>>() {
			}.getType();
			hiraganaArray = gson.fromJson(loadHiraganaFile(), hiraganaListType);
			if (hiraganaArray.size() > 0) {
				hiraganaList = hiraganaArray;
			}
			LOG.info("List Hiragana: " + hiraganaArray.size());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return hiraganaArray;
	}

	public List<Hiragana> getHiraganaList() {
		return hiraganaList;
	}
}
