package com.ccaf.controller;

import com.ccaf.domain.Tgen025DO;
import com.ccaf.service.Tgen025Service;
import com.ccaf.util.PageUtils;
import com.ccaf.util.Query;
import com.ccaf.util.R;
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

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
 
@Controller
@RequestMapping("/ccaf/tgen025")
public class Tgen025Controller {
	@Autowired
	private Tgen025Service tgen025Service;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:tgen025:tgen025")
	String Tgen025(){
	    return "ccaf/tgen025/tgen025";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:tgen025:tgen025")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<Tgen025DO> tgen025List = tgen025Service.list(query);
		int total = tgen025Service.count(query);
		PageUtils pageUtils = new PageUtils(tgen025List, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:tgen025:add")
	String add(){
	    return "ccaf/tgen025/add";
	}

	@GetMapping("/edit/{itnIdnCde}")
	//@RequiresPermissions("ccaf:tgen025:edit")
	String edit(@PathVariable("itnIdnCde") String itnIdnCde,Model model){
		Tgen025DO tgen025 = tgen025Service.get(itnIdnCde);
		model.addAttribute("tgen025", tgen025);
	    return "ccaf/tgen025/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:tgen025:add")
	public R save(Tgen025DO tgen025){
		if(tgen025Service.save(tgen025)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:tgen025:edit")
	public R update( Tgen025DO tgen025){
		tgen025Service.update(tgen025);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen025:remove")
	public R remove( String itnIdnCde){
		if(tgen025Service.remove(itnIdnCde)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen025:batchRemove")
	public R remove(@RequestParam("ids[]") String[] itnIdnCdes){
		tgen025Service.batchRemove(itnIdnCdes);
		return R.ok();
	}
	
}
