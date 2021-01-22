package com.learnjapanese.model.datatable;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 * @author Mai Thành Duy An
 *
 */

@Component
public class DatatableResponse extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    Map<String, Object> data;

    public DatatableResponse() {
	data = new HashMap<>();
    }

    public Map<String, Object> data() {
	return data;
    }

    public void setContent(Object content) {
	data.put("data", content);
    }

    public void setRecordsTotal(long recordsTotal) {
	data.put("recordsTotal", recordsTotal);
    }

    public void setRecordsFiltered(long recordsFiltered) {
	data.put("recordsFiltered", recordsFiltered);
    }

    public void setDraw(int draw) {
	data.put("draw", draw);
    }
}