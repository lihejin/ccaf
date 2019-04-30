package com.ccaf.controller;

import com.ccaf.domain.Tgen065DO;
import com.ccaf.service.Tgen065Service;
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
@RequestMapping("/ccaf/tgen065")
public class Tgen065Controller {
	@Autowired
	private Tgen065Service tgen065Service;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:tgen065:tgen065")
	String Tgen065(){
	    return "ccaf/tgen065/tgen065";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:tgen065:tgen065")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<Tgen065DO> tgen065List = tgen065Service.list(query);
		int total = tgen065Service.count(query);
		PageUtils pageUtils = new PageUtils(tgen065List, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:tgen065:add")
	String add(){
	    return "ccaf/tgen065/add";
	}

	@GetMapping("/edit/{rfeTypIdnCde}")
	//@RequiresPermissions("ccaf:tgen065:edit")
	String edit(@PathVariable("rfeTypIdnCde") String rfeTypIdnCde,Model model){
		Tgen065DO tgen065 = tgen065Service.get(rfeTypIdnCde);
		model.addAttribute("tgen065", tgen065);
	    return "ccaf/tgen065/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:tgen065:add")
	public R save(Tgen065DO tgen065){
		if(tgen065Service.save(tgen065)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:tgen065:edit")
	public R update( Tgen065DO tgen065){
		tgen065Service.update(tgen065);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen065:remove")
	public R remove( String rfeTypIdnCde){
		if(tgen065Service.remove(rfeTypIdnCde)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:tgen065:batchRemove")
	public R remove(@RequestParam("ids[]") String[] rfeTypIdnCdes){
		tgen065Service.batchRemove(rfeTypIdnCdes);
		return R.ok();
	}
	
}
