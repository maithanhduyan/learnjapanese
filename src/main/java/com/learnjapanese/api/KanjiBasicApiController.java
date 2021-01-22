package com.learnjapanese.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.learnjapanese.entity.KanjiBasic;
import com.learnjapanese.model.datatable.DatatableRequest;
import com.learnjapanese.model.datatable.DatatableResponse;
import com.learnjapanese.service.KanjiBasicServiceImpl;

@RestController
@RequestMapping("/api/kanjibasic")
public class KanjiBasicApiController {

    private static final Logger LOG = LoggerFactory.getLogger(KanjiBasicApiController.class.getName());

    @Autowired
    private KanjiBasicServiceImpl kanjiBasicService;

    @Autowired
    private DatatableRequest datatableRequest;

    @Autowired
    private DatatableResponse datatableResponse;

    @RequestMapping(value = "/getAll", method = { RequestMethod.POST })
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins = { "http://localhost:8080", "http://192.168.100.151:8080" })
    public @ResponseBody Map<String, Object> getKanjiBasicList(@RequestParam Map<String, String> data) {
	LOG.info("Request:" + data);
	datatableRequest.setDataRequest(data);
	Page<KanjiBasic> page = kanjiBasicService
		.findAll(PageRequest.of(datatableRequest.getPage(), datatableRequest.getPageSize()));
	long recordsTotal = page.getTotalElements();
	datatableResponse.setDraw(datatableRequest.getDraw());
	datatableResponse.setRecordsTotal(recordsTotal);
	datatableResponse.setRecordsFiltered(recordsTotal);
	datatableResponse.setContent(page.getContent());
	LOG.info("Total :" + page.getTotalPages());
	return datatableResponse.data();
    }

}
