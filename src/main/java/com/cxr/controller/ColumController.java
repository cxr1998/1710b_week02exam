package com.cxr.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cxr.bean.Colum;
import com.cxr.service.ColumService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ColumController {
	
	@Resource
	private ColumService cs;
	/**
	 *  a. id编号模糊查询（2分） id
		b. keywords模糊查询（2分）ckey
		c. description模糊查询（2分）cdesc
		d. 公司名称模糊查询（2分）cname
		e. 主营产品模糊查询（2分）cproduce
		f. 地址模糊查询（2分）location
		g. 注册资本范围查询（2分）cprice
		h. 成立时间范围查询（2分）ctime
		j. 年检状态选择查询，手工输入计0（2分）cbuff

	 * @param model
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("query")
	public String queryAllByItem(Model model,@RequestParam(defaultValue="1")Integer pageNum,Integer id,String ckey,
			String cdesc,String cname,String cproduce,String location,Double s1,Double e1,String s2,String e2,String cbuff){
		//利用map模糊查询
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("id",id );
		map.put("ckey",ckey );
		map.put("cdesc",cdesc );
		map.put("cname",cname );
		map.put("cproduce",cproduce );
		map.put("location",location );
		map.put("s1",s1 );
		map.put("s2",s2 );
		map.put("e1",e1 );
		map.put("e2",e2 );
		map.put("cbuff",cbuff );
		//分页查询
		int pageSize=5;
		PageHelper.startPage(pageNum, pageSize);
		List<Colum> list = cs.queryAllByItem(map);
		
		PageInfo<Colum> plist = new PageInfo<Colum>(list);
		//存储数据
		model.addAttribute("plist", plist);
		model.addAttribute("map", map);
		return "list";
	}
	
	@RequestMapping("show")
	public String show(Integer id,Model model){
		Colum colum = cs.show(id);
		model.addAttribute("colum", colum);
		return "buff";
	}
	
}
