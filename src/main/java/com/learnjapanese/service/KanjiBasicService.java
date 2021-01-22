package com.learnjapanese.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.learnjapanese.entity.KanjiBasic;

public interface KanjiBasicService {

    public List<KanjiBasic> findAll();

    public Page<KanjiBasic> findAll(Pageable pageable);
}
