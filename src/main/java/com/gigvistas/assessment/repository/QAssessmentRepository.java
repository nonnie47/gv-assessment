package com.gigvistas.assessment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gigvistas.assessment.entity.QAssessment;

import java.util.List;

@Repository
public interface QAssessmentRepository extends CrudRepository<QAssessment,Integer> {
    public List<QAssessment> findAll();
    public List<QAssessment> findByaId(int aId);
}
