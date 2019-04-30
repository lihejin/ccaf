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

import com.ccaf.domain.Tgen056DO;
import com.ccaf.service.Tgen056Service;
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
@RequestMapping("/ccaf/tgen056")
public class Tgen056Controller {
	@Autowired
	private Tgen056Service tgen056Service;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:tgen056:tgen056")
	String Tgen056(){
	    return "ccaf/tgen056/tgen056";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:tgen056:tgen056")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<Tgen056DO> tgen056List = tgen056Service.list(query);
		int total = tgen056Service.count(query);
		PageUtils pageUtils = new PageUtils(tgen056List, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:tgen056:add")
	String add(){
	    return "ccaf/tgen056/add";
	}

	@GetMapping("/edit/{itnIdnCde}")
	//@RequiresPermissions("ccaf:tgen056:edit")
	String edit(@PathVariable("itnIdnCde") String itnIdnCde,Model model){
		Tgen056DO tgen056 = tgen056Service.get(itnIdnCde);
		model.addAttribute("tgen056", tgen056);
	    return "ccaf/tgen056/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:tgen056:add")
	public R save( Tgen056DO tgen056){
		if(tgen056Service.save(tgen056)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:tgen056:edit")
	public R update( Tgen056DO tgen056){
		tgen056Service.update(tgen056);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen056:remove")
	public R remove( String itnIdnCde){
		if(tgen056Service.remove(itnIdnCde)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen056:batchRemove")
	public R remove(@RequestParam("ids[]") String[] itnIdnCdes){
		tgen056Service.batchRemove(itnIdnCdes);
		return R.ok();
	}
	
}
