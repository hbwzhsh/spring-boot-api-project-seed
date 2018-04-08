package com.company.project.service.impl;

import com.company.project.core.Page;
import com.company.project.dao.LearnResourceMapper;
import com.company.project.dto.LeanQueryLeanListReq;
import com.company.project.model.LearnResource;
import com.company.project.service.LearnResourceService;
import com.company.project.core.AbstractService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/04/08.
 */
@Service
@Transactional
public class LearnResourceServiceImpl extends AbstractService<LearnResource> implements LearnResourceService {
    @Resource
    private LearnResourceMapper learnResourceMapper;

    @Override
    public List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page) {
        PageHelper.startPage(page.getPage(), page.getRows());
        return learnResourceMapper.queryLearnResouceList(page.getCondition());
    }

    @Override
    public void deleteBatch(Long[] ids) {

    }

    @Override
    public void addBatch() {

    }
}
