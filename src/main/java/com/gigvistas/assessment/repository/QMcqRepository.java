package com.gigvistas.assessment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;


import com.gigvistas.assessment.entity.QMcq;

import java.util.List;


@Repository
public interface QMcqRepository extends CrudRepository<QMcq,Integer> {
    public List<QMcq> findAll();
    public List<QMcq> findByqMcqId(Integer qMcqId);
    public List<QMcq> findByqOption (String qOption);
    public List<QMcq> findByisCorrect (boolean isCorrect);
}

