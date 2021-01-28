package com.learnjapanese.api;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.learnjapanese.entity.Hiragana;
import com.learnjapanese.service.DataLoaderService;
import com.learnjapanese.service.HiraganaServiceImpl;

@RestController
@RequestMapping("/api/hiragana")
public class HiraganaApiController {
	private static final Logger LOG = LoggerFactory.getLogger(HiraganaApiController.class.getName());

	@Autowired
	private HiraganaServiceImpl hiraganaService;

	@Autowired
	private DataLoaderService dataLoaderService;

	// For Testing
	@CrossOrigin(origins = { "http://localhost:8080", "http://192.168.100.151:8080" }) //
	@RequestMapping(value = "findAll", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody List<Hiragana> findAll(@RequestParam Map<String, String> data) {
		List<Hiragana> hiraganaList = null;
		try {
			if (data.containsKey("Req")) {
				String req = data.get("Req");
				if (req.equalsIgnoreCase("HiraganaList")) {
					if (true) {
						hiraganaList = dataLoaderService.getHiraganaList();
					} else {
						hiraganaList = hiraganaService.findAll();
					}
				}
			} else {
				LOG.info("Request fail. data");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			LOG.error(ex.getMessage());
		}
		return hiraganaList;
	}
	
}
