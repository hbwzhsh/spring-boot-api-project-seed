package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.LearnResource;

import java.util.List;
import java.util.Map;

public interface LearnResourceMapper extends Mapper<LearnResource> {
    List<LearnResource> queryLearnResouceList(Map<String, Object> page);
}