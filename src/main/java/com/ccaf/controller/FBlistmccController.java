package com.ccaf.controller;

import com.ccaf.domain.FBlistmccDO;
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

import com.ccaf.service.FBlistmccService;
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
@RequestMapping("/ccaf/fBlistmcc")
public class FBlistmccController {
	@Autowired
	private FBlistmccService fBlistmccService;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:fBlistmcc:fBlistmcc")
	String FBlistmcc(){
	    return "ccaf/fBlistmcc/fBlistmcc";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:fBlistmcc:fBlistmcc")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<FBlistmccDO> fBlistmccList = fBlistmccService.list(query);
		int total = fBlistmccService.count(query);
		PageUtils pageUtils = new PageUtils(fBlistmccList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:fBlistmcc:add")
	String add(){
	    return "ccaf/fBlistmcc/add";
	}

	@GetMapping("/edit/{mcc}")
	//@RequiresPermissions("ccaf:fBlistmcc:edit")
	String edit(@PathVariable("mcc") String mcc,Model model){
		FBlistmccDO fBlistmcc = fBlistmccService.get(mcc);
		model.addAttribute("fBlistmcc", fBlistmcc);
	    return "ccaf/fBlistmcc/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:fBlistmcc:add")
	public R save( FBlistmccDO fBlistmcc){
		if(fBlistmccService.save(fBlistmcc)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:fBlistmcc:edit")
	public R update( FBlistmccDO fBlistmcc){
		fBlistmccService.update(fBlistmcc);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:fBlistmcc:remove")
	public R remove( String mcc){
		if(fBlistmccService.remove(mcc)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:fBlistmcc:batchRemove")
	public R remove(@RequestParam("ids[]") String[] mccs){
		fBlistmccService.batchRemove(mccs);
		return R.ok();
	}
	
}
