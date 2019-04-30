package com.ccaf.controller;

import com.ccaf.domain.PWlistmctDO;
import com.ccaf.service.PWlistmctService;
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
@RequestMapping("/ccaf/pWlistmct")
public class PWlistmctController {
	@Autowired
	private PWlistmctService pWlistmctService;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:pWlistmct:pWlistmct")
	String PWlistmct(){
	    return "ccaf/pWlistmct/pWlistmct";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:pWlistmct:pWlistmct")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PWlistmctDO> pWlistmctList = pWlistmctService.list(query);
		int total = pWlistmctService.count(query);
		PageUtils pageUtils = new PageUtils(pWlistmctList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:pWlistmct:add")
	String add(){
	    return "ccaf/pWlistmct/add";
	}

	@GetMapping("/edit/{mctId}")
	//@RequiresPermissions("ccaf:pWlistmct:edit")
	String edit(@PathVariable("mctId") String mctId,Model model){
		PWlistmctDO pWlistmct = pWlistmctService.get(mctId);
		model.addAttribute("pWlistmct", pWlistmct);
	    return "ccaf/pWlistmct/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:pWlistmct:add")
	public R save(PWlistmctDO pWlistmct){
		if(pWlistmctService.save(pWlistmct)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:pWlistmct:edit")
	public R update( PWlistmctDO pWlistmct){
		pWlistmctService.update(pWlistmct);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:pWlistmct:remove")
	public R remove( String mctId){
		if(pWlistmctService.remove(mctId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:pWlistmct:batchRemove")
	public R remove(@RequestParam("ids[]") String[] mctIds){
		pWlistmctService.batchRemove(mctIds);
		return R.ok();
	}
	
}
