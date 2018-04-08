package com.company.project.service;
import com.company.project.core.Page;
import com.company.project.dto.LeanQueryLeanListReq;
import com.company.project.model.LearnResource;
import com.company.project.core.Service;

import java.util.List;

/**
 * Created by CodeGenerator on 2018/04/08.
 */
public interface LearnResourceService extends Service<LearnResource> {
    public List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page);
    public void deleteBatch(Long[] ids);
    public void addBatch();
}
