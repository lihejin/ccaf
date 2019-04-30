package com.ccaf.controller;

import com.ccaf.domain.AuthhistPartDO;
import com.ccaf.service.AuthhistPartService;
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
@RequestMapping("/ccaf/authhistPart")
public class AuthhistPartController {
	@Autowired
	private AuthhistPartService authhistPartService;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:authhistPart:authhistPart")
	String AuthhistPart(){
	    return "ccaf/authhistPart/authhistPart";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:authhistPart:authhistPart")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AuthhistPartDO> authhistPartList = authhistPartService.list(query);
		int total = authhistPartService.count(query);
		PageUtils pageUtils = new PageUtils(authhistPartList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:authhistPart:add")
	String add(){
	    return "ccaf/authhistPart/add";
	}

	@GetMapping("/edit/{panTxt}")
	//@RequiresPermissions("ccaf:authhistPart:edit")
	String edit(@PathVariable("panTxt") String panTxt,Model model){
		AuthhistPartDO authhistPart = authhistPartService.get(panTxt);
		model.addAttribute("authhistPart", authhistPart);
	    return "ccaf/authhistPart/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:authhistPart:add")
	public R save(AuthhistPartDO authhistPart){
		if(authhistPartService.save(authhistPart)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:authhistPart:edit")
	public R update( AuthhistPartDO authhistPart){
		authhistPartService.update(authhistPart);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:authhistPart:remove")
	public R remove( String panTxt){
		if(authhistPartService.remove(panTxt)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:authhistPart:batchRemove")
	public R remove(@RequestParam("ids[]") String[] panTxts){
		authhistPartService.batchRemove(panTxts);
		return R.ok();
	}
	
}
