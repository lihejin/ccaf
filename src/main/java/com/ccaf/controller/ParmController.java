package com.ccaf.controller;

import com.ccaf.domain.ParmDO;
import com.ccaf.service.ParmService;
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
@RequestMapping("/ccaf/parm")
public class ParmController {
	@Autowired
	private ParmService parmService;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:parm:parm")
	String Parm(){
	    return "ccaf/parm/parm";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:parm:parm")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ParmDO> parmList = parmService.list(query);
		int total = parmService.count(query);
		PageUtils pageUtils = new PageUtils(parmList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:parm:add")
	String add(){
	    return "ccaf/parm/add";
	}

	@GetMapping("/edit/{prmTypCde}")
	//@RequiresPermissions("ccaf:parm:edit")
	String edit(@PathVariable("prmTypCde") String prmTypCde,Model model){
		ParmDO parm = parmService.get(prmTypCde);
		model.addAttribute("parm", parm);
	    return "ccaf/parm/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:parm:add")
	public R save(ParmDO parm){
		if(parmService.save(parm)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:parm:edit")
	public R update( ParmDO parm){
		parmService.update(parm);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:parm:remove")
	public R remove( String prmTypCde){
		if(parmService.remove(prmTypCde)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:parm:batchRemove")
	public R remove(@RequestParam("ids[]") String[] prmTypCdes){
		parmService.batchRemove(prmTypCdes);
		return R.ok();
	}
	
}
