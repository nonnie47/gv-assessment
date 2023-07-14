package com.gigvistas.assessment.repository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;
import com.gigvistas.assessment.entity.QMcq;

//import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import com.gigvistas.assessment.entity.ResMcq;
import com.gigvistas.assessment.entity.ResQuestion;

import java.util.List;

@Repository
public interface ResMcqRepository extends CrudRepository <ResMcq,Integer> {
    public List<ResMcq> findAll();
    public List<ResMcq> findByqMcqId(QMcq qMcqId);
    public List <ResMcq> findByresMcqId(Integer resMcqId);
    public List<ResMcq> findByresId(ResQuestion resId);
}
