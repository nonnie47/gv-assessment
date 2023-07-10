package com.gigvistas.assessment.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gigvistas.assessment.entity.QQuestion;

import java.util.List;

@Repository
public interface QQuestionRepository extends CrudRepository<QQuestion,Integer> {
    public List<QQuestion> findAll();
    public List <QQuestion> findByqId(Integer qId);
}
