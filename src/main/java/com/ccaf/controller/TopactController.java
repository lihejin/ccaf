package com.ccaf.controller;

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

import com.ccaf.domain.TopactDO;
import com.ccaf.service.TopactService;
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
@RequestMapping("/ccaf/topact")
public class TopactController {
	@Autowired
	private TopactService topactService;
	
	@GetMapping()
	//@RequiresPermissions("ccaf:topact:topact")
	String Topact(){
	    return "ccaf/topact/topact";
	}
	
	@ResponseBody
	@GetMapping("/list")
	//@RequiresPermissions("ccaf:topact:topact")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TopactDO> topactList = topactService.list(query);
		int total = topactService.count(query);
		PageUtils pageUtils = new PageUtils(topactList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ccaf:topact:add")
	String add(){
	    return "ccaf/topact/add";
	}

	@GetMapping("/edit/{actIdnSky}")
	//@RequiresPermissions("ccaf:topact:edit")
	String edit(@PathVariable("actIdnSky") String actIdnSky,Model model){
		TopactDO topact = topactService.get(actIdnSky);
		model.addAttribute("topact", topact);
	    return "ccaf/topact/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	//@RequiresPermissions("ccaf:topact:add")
	public R save( TopactDO topact){
		if(topactService.save(topact)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	//@RequiresPermissions("ccaf:topact:edit")
	public R update( TopactDO topact){
		topactService.update(topact);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	//@RequiresPermissions("ccaf:topact:remove")
	public R remove( String actIdnSky){
		if(topactService.remove(actIdnSky)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	//@RequiresPermissions("ccaf:topact:batchRemove")
	public R remove(@RequestParam("ids[]") String[] actIdnSkys){
		topactService.batchRemove(actIdnSkys);
		return R.ok();
	}
	
}
