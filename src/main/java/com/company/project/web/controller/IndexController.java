package com.company.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 主页
 * @RestController是Spring4之后加入的注解，
 * 原来在@Controller中返回json需要@ResponseBody来配合，
 * 如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，默认返回json格式。
 * Create By Jenvi Sue On 2017年10月25日
 */
@Controller
public class IndexController {

    @RequestMapping("/main")
    public ModelAndView main(){
        ModelAndView modelAndView = new ModelAndView("/admin/main");
        return modelAndView;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("admin/index");
        return modelAndView;
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "admin/welcome";
    }

    @RequestMapping("/test")
    public String test(){
        return "admin/test";
    }
}
