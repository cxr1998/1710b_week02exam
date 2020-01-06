package com.cxr.mapper;

import java.util.List;
import java.util.Map;

import com.cxr.bean.Colum;

public interface ColumMapper {
	void addco(Colum colum);
	//模糊分页查询
	List<Colum> queryAllByItem(Map<String, Object> map);
	//回显
	Colum show(Integer id);
}
