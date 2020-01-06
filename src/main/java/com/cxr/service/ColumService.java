package com.cxr.service;

import java.util.List;
import java.util.Map;

import com.cxr.bean.Colum;

public interface ColumService {
	List<Colum> queryAllByItem(Map<String, Object> map);
	
	Colum show(Integer id);
}
