package com.ccaf.controller;

import com.ccaf.domain.TxndefineDO;
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

import com.ccaf.service.TxndefineService;
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
@RequestMapping("/ccaf/txndefine")
public class TxndefineController {
	@Autowired
	private TxndefineService txndefineService;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:txndefine:txndefine")
	String Txndefine(){
	    return "ccaf/txndefine/txndefine";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:txndefine:txndefine")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TxndefineDO> txndefineList = txndefineService.list(query);
		int total = txndefineService.count(query);
		PageUtils pageUtils = new PageUtils(txndefineList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:txndefine:add")
	String add(){
	    return "ccaf/txndefine/add";
	}

	@GetMapping("/edit/{txnCde}")
	//@RequiresPermissions("ccaf:txndefine:edit")
	String edit(@PathVariable("txnCde") String txnCde,Model model){
		TxndefineDO txndefine = txndefineService.get(txnCde);
		model.addAttribute("txndefine", txndefine);
	    return "ccaf/txndefine/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:txndefine:add")
	public R save( TxndefineDO txndefine){
		if(txndefineService.save(txndefine)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:txndefine:edit")
	public R update( TxndefineDO txndefine){
		txndefineService.update(txndefine);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:txndefine:remove")
	public R remove( String txnCde){
		if(txndefineService.remove(txnCde)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:txndefine:batchRemove")
	public R remove(@RequestParam("ids[]") String[] txnCdes){
		txndefineService.batchRemove(txnCdes);
		return R.ok();
	}
	
}
