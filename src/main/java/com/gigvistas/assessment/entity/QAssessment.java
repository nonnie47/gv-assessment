//ask about the .entity thing
package com.gigvistas.assessment.entity;


import java.util.Date;
import java.util.*;

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
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int aId;

    @OneToMany(mappedBy="aId")
    private Set <QQuestion> questions;


    // job_post_id --> jobPostId
    private Integer jobPostId;
    
    // a_status --> aStatus
    private String aStatus;
    
    // a_label --> aLabel
    private String aLabel;

    // a_description --> aDescription
    private String aDescription;

    //last_modified --> lastModified
    private Date lastModified;

    //modified_by --> modifiedBy
    private String modifiedBy;
   
    public QAssessment(){

    }

    public QAssessment(int aId,int jobPostId, String aLabel){
        //this.aId=aId;
        this.jobPostId=jobPostId;
        this.aLabel=aLabel;
    }
}
