package com.ccaf.controller;

import com.ccaf.domain.CustDO;
import com.ccaf.service.CustService;
import com.ccaf.util.PageUtils;
import com.ccaf.util.Query;
import com.ccaf.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
 
@Controller
@RequestMapping("/ccaf/cust")
public class CustController {
	@Autowired
	private CustService custService;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:cust:cust")
	String Cust(){
	    return "ccaf/cust/cust";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:cust:cust")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CustDO> custList = custService.list(query);
		int total = custService.count(query);
		PageUtils pageUtils = new PageUtils(custList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:cust:add")
	String add(){
	    return "ccaf/cust/add";
	}

	@GetMapping("/edit/{lstUpdTtp}")
	//@RequiresPermissions("ccaf:cust:edit")
	String edit(@PathVariable("lstUpdTtp") Date lstUpdTtp, Model model){
		CustDO cust = custService.get(lstUpdTtp);
		model.addAttribute("cust", cust);
	    return "ccaf/cust/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:cust:add")
	public R save( CustDO cust){
		if(custService.save(cust)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:cust:edit")
	public R update( CustDO cust){
		custService.update(cust);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:cust:remove")
	public R remove( Date lstUpdTtp){
		if(custService.remove(lstUpdTtp)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:cust:batchRemove")
	public R remove(@RequestParam("ids[]") Date[] lstUpdTtps){
		custService.batchRemove(lstUpdTtps);
		return R.ok();
	}
	
}
