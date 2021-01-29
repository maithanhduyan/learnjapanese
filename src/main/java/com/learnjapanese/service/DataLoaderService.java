package com.learnjapanese.service;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Priority;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.learnjapanese.entity.Hiragana;
import com.learnjapanese.entity.KanjiBasic;

/**
 * @author Mai Thành Duy An <br>
 *         <b> Get local json data file
 */
@Service
@Priority(0)
public class DataLoaderService {

	private static final Logger LOG = LoggerFactory.getLogger(DataLoaderService.class.getName());

	@Autowired
	ResourceLoader resourceLoader;

	Gson gson;
	List<Hiragana> hiraganaList;
	List<KanjiBasic> kanjiBasicList;

	/**
	 * HIRAGANA JSON FILE PATH
	 * */
	static final String HiraganaJsonPath = "data/hiragana.json";
	/**
	 * KANJIBASIC JSON FILE PATH
	 * */
	static final String KanjiBasicJsonPath = "data/kanjibasic.json";

	DataLoaderService() {
		gson = new Gson();
		hiraganaList = new ArrayList<Hiragana>();
		reloadHiraganaList();
		LOG.info("JSON Data File was loaded.");
		reloadKanjiBasicList();
		LOG.info("Loaded KanjiBasic");
	}

	private String loadHiraganaFile() {
		String text = "";
		File resource;
		try {
			resource = new ClassPathResource(HiraganaJsonPath).getFile();
			text = new String(Files.readAllBytes(resource.toPath()));
			LOG.info("File Path: " + resource.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}

	/**
	 * <b>Parse Hiragana to List from JSON Array</b>
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

	/**
	 * Load KanjiBasic json file
	 */
	private String loadKanjiBasicFile() {
		String text = "";
		File resource;
		try {
			resource = new ClassPathResource(KanjiBasicJsonPath).getFile();
			text = new String(Files.readAllBytes(resource.toPath()));
			LOG.info("File Path: " + resource.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}

	/**
	 * <b>Parse KanjiBasic to List from JSON Array</b>
	 */
	public List<KanjiBasic> reloadKanjiBasicList() {
		ArrayList<KanjiBasic> kanjiBasicArray = new ArrayList<KanjiBasic>();
		try {
			Type kanjiBasicListType = new TypeToken<ArrayList<KanjiBasic>>() {
			}.getType();
			kanjiBasicArray = gson.fromJson(loadKanjiBasicFile(), kanjiBasicListType);
			if (kanjiBasicArray.size() > 0) {
				kanjiBasicList = kanjiBasicArray;
			}
			LOG.info("List Hiragana: " + kanjiBasicList.size());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return kanjiBasicList;
	}
}
