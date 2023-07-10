package com.gigvistas.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "q_mcq")
@Data
public class QMcq {
  
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer qMcqId;

    
    @ManyToOne
    @JoinColumn(name="q_id", nullable=false)
    private QQuestion mcqQuestion;

    private String qOption;

    private boolean isCorrect;

    public QMcq(){

    }
    
}


