package com.gigvistas.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "q_assessment")
@Data
public class QAssessmentObj {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer aId;
    
    private Integer jobPostId;

    public QAssessmentObj(){

    }
}
