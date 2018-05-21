package com.company.project.web.controller;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/04/08.
*/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public Result add(User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail1")
    public Result detail1(@RequestParam Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @RequestMapping("/detail")
    public ModelAndView detail(@RequestParam Integer id) {
        ModelAndView modelAndView = new ModelAndView("admin/user/user-view");
        User user = userService.findById(id);
        modelAndView.addObject("user",user);
        return modelAndView;
    }

    @RequestMapping("/list")
    public ModelAndView list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        ModelAndView modelAndView = new ModelAndView("admin/user/user-list");
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        modelAndView.addObject("rows",  pageInfo.getList());
        modelAndView.addObject("currentPage",  pageInfo.getPageNum());
        //modelAndView.addObject("total",  pageInfo.getTotal());
        modelAndView.addObject("records",  pageInfo.getTotal());
        return modelAndView;
    }
}
