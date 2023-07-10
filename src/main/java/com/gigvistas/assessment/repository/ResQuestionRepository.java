
package com.gigvistas.assessment.repository;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.gigvistas.assessment.entity.ResQuestion;
import java.util.List;

@Repository
public interface ResQuestionRepository extends CrudRepository <ResQuestion,Integer> {
    public List<ResQuestion> findAll();
}
