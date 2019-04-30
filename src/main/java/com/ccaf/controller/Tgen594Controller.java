package com.ccaf.controller;

import com.ccaf.util.PageUtils;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccaf.domain.Tgen594DO;
import com.ccaf.service.Tgen594Service;
import com.ccaf.util.Query;
import com.ccaf.util.R;
/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:10
 */
 
@Controller
@RequestMapping("/ccaf/tgen594")
public class Tgen594Controller {
	@Autowired
	private Tgen594Service tgen594Service;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:tgen594:tgen594")
	String Tgen594(){
	    return "ccaf/tgen594/tgen594";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:tgen594:tgen594")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<Tgen594DO> tgen594List = tgen594Service.list(query);
		int total = tgen594Service.count(query);
		PageUtils pageUtils = new PageUtils(tgen594List, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:tgen594:add")
	String add(){
	    return "ccaf/tgen594/add";
	}

	@GetMapping("/edit/{payTypCde}")
	//@RequiresPermissions("ccaf:tgen594:edit")
	String edit(@PathVariable("payTypCde") String payTypCde,Model model){
		Tgen594DO tgen594 = tgen594Service.get(payTypCde);
		model.addAttribute("tgen594", tgen594);
	    return "ccaf/tgen594/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:tgen594:add")
	public R save( Tgen594DO tgen594){
		if(tgen594Service.save(tgen594)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:tgen594:edit")
	public R update( Tgen594DO tgen594){
		tgen594Service.update(tgen594);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen594:remove")
	public R remove( String payTypCde){
		if(tgen594Service.remove(payTypCde)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen594:batchRemove")
	public R remove(@RequestParam("ids[]") String[] payTypCdes){
		tgen594Service.batchRemove(payTypCdes);
		return R.ok();
	}
	
}
