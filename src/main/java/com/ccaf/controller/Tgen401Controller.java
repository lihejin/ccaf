package com.ccaf.controller;

import com.ccaf.domain.Tgen401DO;
import com.ccaf.service.Tgen401Service;
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
 * @date 2019-04-28 16:00:10
 */
 
@Controller
@RequestMapping("/ccaf/tgen401")
public class Tgen401Controller {
	@Autowired
	private Tgen401Service tgen401Service;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:tgen401:tgen401")
	String Tgen401(){
	    return "ccaf/tgen401/tgen401";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:tgen401:tgen401")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<Tgen401DO> tgen401List = tgen401Service.list(query);
		int total = tgen401Service.count(query);
		PageUtils pageUtils = new PageUtils(tgen401List, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:tgen401:add")
	String add(){
	    return "ccaf/tgen401/add";
	}

	@GetMapping("/edit/{bchCde}")
	//@RequiresPermissions("ccaf:tgen401:edit")
	String edit(@PathVariable("bchCde") String bchCde,Model model){
		Tgen401DO tgen401 = tgen401Service.get(bchCde);
		model.addAttribute("tgen401", tgen401);
	    return "ccaf/tgen401/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:tgen401:add")
	public R save(Tgen401DO tgen401){
		if(tgen401Service.save(tgen401)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:tgen401:edit")
	public R update( Tgen401DO tgen401){
		tgen401Service.update(tgen401);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen401:remove")
	public R remove( String bchCde){
		if(tgen401Service.remove(bchCde)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen401:batchRemove")
	public R remove(@RequestParam("ids[]") String[] bchCdes){
		tgen401Service.batchRemove(bchCdes);
		return R.ok();
	}
	
}
