
package com.gigvistas.assessment.repository;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;


import com.gigvistas.assessment.entity.ResQuestion;
import com.gigvistas.assessment.entity.QQuestion;
import java.util.List;
import java.util.Date;


@Repository
public interface ResQuestionRepository extends CrudRepository <ResQuestion,Integer> {
    public List<ResQuestion> findAll();
    public List <ResQuestion> findByresId(Integer resId);
    public List<ResQuestion> findByqId(QQuestion qId);
    public List<ResQuestion> findByresType(String resType);
    public List<ResQuestion> findBylastModified(Date lastModified);
    public List<ResQuestion> findByuserCode(String userCode);
}
