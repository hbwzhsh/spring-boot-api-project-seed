package com.company.project.web;
import com.company.project.core.Page;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.dto.LeanQueryLeanListReq;
import com.company.project.model.LearnResource;
import com.company.project.service.LearnResourceService;
import com.company.project.util.StringUtil;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* Created by CodeGenerator on 2018/04/08.
*/
@RestController
@RequestMapping("/learnResource")
public class LearnResourceController extends AbstractController {
    @Resource
    private LearnResourceService learnResourceService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/add")
    public Result add(LearnResource learnResource) {
        learnResourceService.save(learnResource);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        learnResourceService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(LearnResource learnResource) {
        learnResourceService.update(learnResource);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        LearnResource learnResource = learnResourceService.findById(id);
        return ResultGenerator.genSuccessResult(learnResource);
    }

    /**
     * 查询教程列表
     * @param page
     * @return
     */
    @RequestMapping(value = "/queryLeanList",method = RequestMethod.POST)
    @ResponseBody
    public Result queryLearnList(@RequestParam Integer currentPage,@RequestParam Integer rows,@RequestParam String author,@RequestParam String title){
        Page<LeanQueryLeanListReq> page = new Page<LeanQueryLeanListReq>();
        Map<String,Object> map = new HashMap<>();
        map.put("author",author);
        map.put("title",title);
        page.setPage(currentPage);
        page.setRows(rows);
        page.setCondition(map);
        List<LearnResource> learnList = learnResourceService.queryLearnResouceList(page);
        PageInfo<LearnResource> pageInfo = new PageInfo<LearnResource>(learnList);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    /**
     * 封装参数
     *
     * @param request
     * @param response
     * @return
     */
    public LearnResource getFormParameter(HttpServletRequest request, HttpServletResponse response) {
        LearnResource learnResouce = new LearnResource();
        // 封装参数
        String author = request.getParameter("author");
        String title = request.getParameter("title");
        String url = request.getParameter("url");
        if (!StringUtil.isNull(author)) {
            learnResouce.setAuthor(author);
        }
        if (!StringUtil.isNull(title)) {
            learnResouce.setTitle(title);
        }
        if (!StringUtil.isNull(url)) {
            learnResouce.setUrl(url);
        }
        return learnResouce;
    }
}
