package com.gigvistas.assessment.repository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.gigvistas.assessment.entity.ResMcq;

import java.util.List;

@Repository
public interface ResMcqRepository extends CrudRepository <ResMcq,Integer> {
    public List<ResMcq> findAll();
}
