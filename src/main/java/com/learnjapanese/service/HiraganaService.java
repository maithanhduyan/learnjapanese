package com.learnjapanese.service;

import java.util.List;

import com.learnjapanese.entity.Hiragana;

public interface HiraganaService {

	public List<Hiragana> findAll();
	
	public Hiragana findById(int id);
}
