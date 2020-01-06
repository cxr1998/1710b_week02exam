package com.cxr.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cxr.bean.Colum;
import com.cxr.mapper.ColumMapper;

@Service
public class ColumServiceImpl implements ColumService{

	@Resource
	private ColumMapper cm;

	public List<Colum> queryAllByItem(Map<String, Object> map) {
		
		return cm.queryAllByItem(map);
	}

	public Colum show(Integer id) {
		
		return cm.show(id);
	}
	
	
	
}
