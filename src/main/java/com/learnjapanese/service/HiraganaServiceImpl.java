package com.learnjapanese.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnjapanese.entity.Hiragana;

@Service
public class HiraganaServiceImpl implements HiraganaService {

	@Autowired
	private DataLoaderService dataLoaderService;

	private static final Logger LOG = LoggerFactory.getLogger(HiraganaServiceImpl.class.getName());

	public HiraganaServiceImpl() {
		LOG.info("Hiragana list was loaded.");
	}

	@Override
	public List<Hiragana> findAll() {
		return dataLoaderService.hiraganaList;
	}

	@Override
	public Hiragana findById(int id) {
		Hiragana hiragana = null;

		if (id < 0 || id > dataLoaderService.hiraganaList.size()) {
			hiragana = new Hiragana(-1, null, null, null, null);
		} else {
			hiragana = dataLoaderService.hiraganaList.get(id);
		}
		return hiragana;
	}

}
