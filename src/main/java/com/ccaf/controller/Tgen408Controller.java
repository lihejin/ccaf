package com.ccaf.controller;

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

import com.ccaf.domain.Tgen408DO;
import com.ccaf.service.Tgen408Service;
import com.ccaf.util.PageUtils;
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
@RequestMapping("/ccaf/tgen408")
public class Tgen408Controller {
	@Autowired
	private Tgen408Service tgen408Service;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:tgen408:tgen408")
	String Tgen408(){
	    return "ccaf/tgen408/tgen408";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:tgen408:tgen408")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<Tgen408DO> tgen408List = tgen408Service.list(query);
		int total = tgen408Service.count(query);
		PageUtils pageUtils = new PageUtils(tgen408List, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:tgen408:add")
	String add(){
	    return "ccaf/tgen408/add";
	}

	@GetMapping("/edit/{binNbr}")
	//@RequiresPermissions("ccaf:tgen408:edit")
	String edit(@PathVariable("binNbr") String binNbr,Model model){
		Tgen408DO tgen408 = tgen408Service.get(binNbr);
		model.addAttribute("tgen408", tgen408);
	    return "ccaf/tgen408/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:tgen408:add")
	public R save( Tgen408DO tgen408){
		if(tgen408Service.save(tgen408)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:tgen408:edit")
	public R update( Tgen408DO tgen408){
		tgen408Service.update(tgen408);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen408:remove")
	public R remove( String binNbr){
		if(tgen408Service.remove(binNbr)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen408:batchRemove")
	public R remove(@RequestParam("ids[]") String[] binNbrs){
		tgen408Service.batchRemove(binNbrs);
		return R.ok();
	}
	
}
