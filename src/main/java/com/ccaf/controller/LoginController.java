package com.ccaf.controller;

import com.ccaf.domain.MenuDO;
import com.ccaf.domain.Tree;
import com.ccaf.service.MenuService;
import com.ccaf.util.MD5Utils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/2/24.
 */
@Controller
public class LoginController extends BaseController {

    @Autowired
    MenuService menuService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public Map ajaxLogin(String username, String password){
        password = MD5Utils.encrypt(username, password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        HashMap map = new HashMap();
        try {
            subject.login(token);
            map.put("code", "0");
            map.put("msg", "操作成功");
            return map;
        }catch (Exception e){
            map.put("code", "1");
            return map;
        }
    }

    @GetMapping({"","/"})
    public String welcom(){
        System.out.println("====");
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index(Model model){
        List<Tree<MenuDO>> menus = menuService.listMenuTree(getUserId());
        model.addAttribute("name", getUser().getName());
        model.addAttribute("menus", menus);
        model.addAttribute("picUrl", "/img/photo_s.jpg");
        model.addAttribute("username", getUser().getUsername());
        return "index";
    }

    @GetMapping("main")
    private String main(){
        return "main";
    }

}
