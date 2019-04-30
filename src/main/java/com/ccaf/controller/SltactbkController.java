package com.ccaf.controller;

import com.ccaf.domain.SltactbkDO;
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

import com.ccaf.service.SltactbkService;
import com.ccaf.util.Query;
import com.ccaf.util.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
 
@Controller
@RequestMapping("/ccaf/sltactbk")
public class SltactbkController {
	@Autowired
	private SltactbkService sltactbkService;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:sltactbk:sltactbk")
	String Sltactbk(){
	    return "ccaf/sltactbk/sltactbk";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:sltactbk:sltactbk")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SltactbkDO> sltactbkList = sltactbkService.list(query);
		int total = sltactbkService.count(query);
		PageUtils pageUtils = new PageUtils(sltactbkList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:sltactbk:add")
	String add(){
	    return "ccaf/sltactbk/add";
	}

	@GetMapping("/edit/{actIdnSky}")
	//@RequiresPermissions("ccaf:sltactbk:edit")
	String edit(@PathVariable("actIdnSky") String actIdnSky,Model model){
		SltactbkDO sltactbk = sltactbkService.get(actIdnSky);
		model.addAttribute("sltactbk", sltactbk);
	    return "ccaf/sltactbk/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:sltactbk:add")
	public R save( SltactbkDO sltactbk){
		if(sltactbkService.save(sltactbk)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:sltactbk:edit")
	public R update( SltactbkDO sltactbk){
		sltactbkService.update(sltactbk);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:sltactbk:remove")
	public R remove( String actIdnSky){
		if(sltactbkService.remove(actIdnSky)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:sltactbk:batchRemove")
	public R remove(@RequestParam("ids[]") String[] actIdnSkys){
		sltactbkService.batchRemove(actIdnSkys);
		return R.ok();
	}
	
}
