package com.gigvistas.assessment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import com.gigvistas.assessment.entity.QAssessment;

import java.util.List;
import java.util.Date;


@Repository
public interface QAssessmentRepository extends CrudRepository<QAssessment,Integer> {
    public List<QAssessment> findAll();
    public List<QAssessment> findByaId(Integer aId);
    public List <QAssessment> findByjobPostId(Integer jobPostId);
    public List<QAssessment> findByaStatus(String aStatus);
    public List<QAssessment> findByaLabel(String aLabel);
    public List<QAssessment> findBylastModified(Date lastModified);
    public List<QAssessment> findBymodifiedBy(String modifiedBy);
}
