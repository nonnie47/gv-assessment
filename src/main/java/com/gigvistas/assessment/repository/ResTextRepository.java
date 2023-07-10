package com.gigvistas.assessment.repository;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.gigvistas.assessment.entity.ResText;
import com.gigvistas.assessment.entity.ResQuestion;

import java.util.List;
 
@Repository
public interface ResTextRepository extends CrudRepository <ResText,Integer> {
    public List<ResText> findAll();
    public List<ResText> findByresTextId(Integer resTextId);
    public List<ResText> findByresId(ResQuestion resId);
}

