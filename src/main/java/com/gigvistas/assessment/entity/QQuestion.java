package com.gigvistas.assessment.entity;

import jakarta.persistence.Column;
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
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;



@Entity
@Table(name = "q_question")
@Data
public class QQuestion {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(insertable=false, updatable=false)
    private Integer qId;
    
    @ManyToOne
    @JoinColumn(name="a_id", nullable=false)
    private QAssessment aId;

    @OneToMany(mappedBy="qId")
    private Set <QMcq> mcqOptions;

    @OneToMany (mappedBy="qId")
    private Set <ResQuestion> responses;
   
    private String description;

    private String type;

    private boolean required;
    
     
}
