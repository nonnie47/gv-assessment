package com.gigvistas.assessment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.gigvistas.assessment.entity.QMcq;

import java.util.List;


@Repository
public interface QMcqRepository extends CrudRepository<QMcq,Integer> {
    public List<QMcq> findAll();
    public List<QMcq> findByqMcqId(Integer qMcqId);
}
