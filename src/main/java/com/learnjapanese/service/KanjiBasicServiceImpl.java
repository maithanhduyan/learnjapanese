package com.learnjapanese.service;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.learnjapanese.entity.KanjiBasic;

@Service
public class KanjiBasicServiceImpl implements KanjiBasicService {

	@Autowired
	DataLoaderService dataLoaderService;

	private static final Logger LOG = LoggerFactory.getLogger(KanjiBasic.class.getName());

	public KanjiBasicServiceImpl() {
		LOG.info("KanjiBasic list was loaded.");
	}

	@Override
	public List<KanjiBasic> findAll() {
		return dataLoaderService.kanjiBasicList;
	}

	@Override
	public Page<KanjiBasic> findAll(Pageable pageable) {
		int pageSize = pageable.getPageSize();
		int startPage = pageable.getPageNumber();
		int currentPage = startPage / pageSize;
		List<KanjiBasic> list;

		if (dataLoaderService.kanjiBasicList.size() < startPage) {
			list = Collections.emptyList();
		} else {
			int toEndPage = Math.min(startPage + pageSize, dataLoaderService.kanjiBasicList.size());
			list = dataLoaderService.kanjiBasicList.subList(startPage, toEndPage);
		}

		Page<KanjiBasic> page = new PageImpl<KanjiBasic>(list, PageRequest.of(currentPage, pageSize),
				dataLoaderService.kanjiBasicList.size());
		return page;
	}

}
