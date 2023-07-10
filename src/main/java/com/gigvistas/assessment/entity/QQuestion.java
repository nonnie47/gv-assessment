package com.gigvistas.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.*;



@Entity
@Table(name = "q_question")
@Data
public class QQuestion {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer qId;
    
    @ManyToOne
    @JoinColumn(name="a_id", nullable=false)
    private QAssessment assessment;

    @OneToMany(mappedBy="mcqQuestion")
    private Set <QMcq> mcqQuestion;

    //rename these
    private String qDescription;

    private String qType;

    private boolean qRequired;

}
