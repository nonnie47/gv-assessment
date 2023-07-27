package com.gigvistas.assessment.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gigvistas.assessment.entity.QQuestion;
import com.gigvistas.assessment.entity.QAssessment;
import java.util.List;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Repository
public interface QQuestionRepository extends CrudRepository<QQuestion,Integer> {
    public List<QQuestion> findAll();
    public List <QQuestion> findByqId(Integer qId);
    public List <QQuestion> findByType(String qType);
    public List <QQuestion> findByRequired(boolean qRequired);
    public List <QQuestion> findByaId(QAssessment aId);
}
