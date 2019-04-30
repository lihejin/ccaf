package com.ccaf.controller;

import com.ccaf.domain.Tgen597DO;
import com.ccaf.service.Tgen597Service;
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
@RequestMapping("/ccaf/tgen597")
public class Tgen597Controller {
	@Autowired
	private Tgen597Service tgen597Service;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:tgen597:tgen597")
	String Tgen597(){
	    return "ccaf/tgen597/tgen597";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:tgen597:tgen597")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<Tgen597DO> tgen597List = tgen597Service.list(query);
		int total = tgen597Service.count(query);
		PageUtils pageUtils = new PageUtils(tgen597List, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:tgen597:add")
	String add(){
	    return "ccaf/tgen597/add";
	}

	@GetMapping("/edit/{idCode}")
	//@RequiresPermissions("ccaf:tgen597:edit")
	String edit(@PathVariable("idCode") String idCode,Model model){
		Tgen597DO tgen597 = tgen597Service.get(idCode);
		model.addAttribute("tgen597", tgen597);
	    return "ccaf/tgen597/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:tgen597:add")
	public R save(Tgen597DO tgen597){
		if(tgen597Service.save(tgen597)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:tgen597:edit")
	public R update( Tgen597DO tgen597){
		tgen597Service.update(tgen597);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen597:remove")
	public R remove( String idCode){
		if(tgen597Service.remove(idCode)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen597:batchRemove")
	public R remove(@RequestParam("ids[]") String[] idCodes){
		tgen597Service.batchRemove(idCodes);
		return R.ok();
	}
	
}
