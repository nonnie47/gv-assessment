//ask about the .entity thing
package com.gigvistas.assessment.entity;


import java.util.Date;
import java.util.*;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


//q_assessment -->QAssessment
@Entity
@Table(name = "q_assessment")
@Data
public class QAssessment {

    // a_id --> aId
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer aId;

    @OneToMany(mappedBy="aId")
    public Set <QQuestion> questions;


    // job_post_id --> jobPostId
    private Integer jobPostId;
    
    // a_status --> aStatus
    @Column(name = "a_status")
    private String status;
    
    // a_label --> aLabel
    @Column(name = "a_label")
    private String label;

    // a_description --> aDescription
    @Column(name = "a_description")
    private String description;

    //last_modified --> lastModified
    private Date lastModified;

    //modified_by --> modifiedBy
    private String modifiedBy;
   
    public QAssessment(){

    }

    public QAssessment(int aId,int jobPostId, String aLabel){
        this.aId=aId;
        this.jobPostId=jobPostId;
        this.label=aLabel;
    }

    public void setaId(int aId){
        this.aId=aId;
    }

    public Integer getaId(){
        return aId;
    }

    
}
