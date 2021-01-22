package com.learnjapanese.model.datatable;

import java.util.Map;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

/**
 * @author Mai Thành Duy An
 *
 */
@Component
public class DatatableRequest {

    private static final int NOT_AVALABLE = -1;

    private static final int DEFAULT_VALUE = 0;

    private static final String BLANK = "";

    private Map<String, String> dataRequest;

    public DatatableRequest() {

    }

    public DatatableRequest(Map<String, String> dataRequest) {
	this.dataRequest = dataRequest;
    }

    /**
     * @return the dataRequest
     */
    public Map<String, String> getDataRequest() {
	return dataRequest;
    }

    /**
     * @param dataRequest the dataRequest to set
     */
    public void setDataRequest(Map<String, String> dataRequest) {
	this.dataRequest = dataRequest;
    }

    /**
     * @return the draw
     */
    public int getDraw() {
	int _draw = DEFAULT_VALUE;
	try {
	    _draw = Integer.parseInt(dataRequest.get("draw"));
	} catch (Exception e) {
	}
	return _draw;
    }

    /**
     * @return the size
     */
    public int getPageSize() {
	int _size = DEFAULT_VALUE;
	try {
	    _size = Integer.parseInt(dataRequest.get("length"));
	} catch (Exception e) {
	    _size = NOT_AVALABLE;
	}
	return _size;
    }

    /**
     * @return the page
     */
    public int getPage() {
	int _page = DEFAULT_VALUE;
	try {
	    String _page_req = dataRequest.get("start");
	    if (_page_req.isEmpty() || _page_req.equals(null)) {
		return 0;
	    }
	    _page = Integer.parseInt(_page_req);
	} catch (Exception e) {
	    _page = NOT_AVALABLE;
	}
	return _page;
    }

    /**
     * @return the search
     */
    public String getSearch() {
	String _search = BLANK;
	try {
	    _search = dataRequest.get("search[value]").trim();
	} catch (Exception e) {
	}
	return _search;
    }

    /**
     * @return the colum
     */
    public String getColumn() {
	String _column = BLANK;
	try {
	    String _column_index_req = dataRequest.get("order[0][column]");
	    String _column_req = dataRequest.get("columns[" + _column_index_req + "][data]");
	    if (_column_req.length() == 0) {
		_column_req = dataRequest.get("columns[" + DEFAULT_VALUE + "][data]");
	    }
	    _column = _column_req;
	} catch (Exception e) {
	}
	return _column;
    }

    /**
     * @return the direction
     */
    public Sort.Direction getDirection() {
	Sort.Direction _direction = Sort.Direction.ASC;
	try {
	    String _direction_req = dataRequest.get("order[0][dir]");
	    _direction = _direction_req.equals("asc") ? Sort.Direction.ASC : Sort.Direction.DESC;
	} catch (Exception e) {
	}
	return _direction;
    }

}
