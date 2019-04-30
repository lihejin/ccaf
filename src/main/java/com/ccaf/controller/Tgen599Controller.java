package com.ccaf.controller;

import com.ccaf.domain.Tgen599DO;
import com.ccaf.service.Tgen599Service;
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
@RequestMapping("/ccaf/tgen599")
public class Tgen599Controller {
	@Autowired
	private Tgen599Service tgen599Service;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:tgen599:tgen599")
	String Tgen599(){
	    return "ccaf/tgen599/tgen599";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:tgen599:tgen599")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<Tgen599DO> tgen599List = tgen599Service.list(query);
		int total = tgen599Service.count(query);
		PageUtils pageUtils = new PageUtils(tgen599List, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:tgen599:add")
	String add(){
	    return "ccaf/tgen599/add";
	}

	@GetMapping("/edit/{appIdnSky}")
	//@RequiresPermissions("ccaf:tgen599:edit")
	String edit(@PathVariable("appIdnSky") String appIdnSky,Model model){
		Tgen599DO tgen599 = tgen599Service.get(appIdnSky);
		model.addAttribute("tgen599", tgen599);
	    return "ccaf/tgen599/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:tgen599:add")
	public R save(Tgen599DO tgen599){
		if(tgen599Service.save(tgen599)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:tgen599:edit")
	public R update( Tgen599DO tgen599){
		tgen599Service.update(tgen599);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen599:remove")
	public R remove( String appIdnSky){
		if(tgen599Service.remove(appIdnSky)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen599:batchRemove")
	public R remove(@RequestParam("ids[]") String[] appIdnSkys){
		tgen599Service.batchRemove(appIdnSkys);
		return R.ok();
	}
	
}
