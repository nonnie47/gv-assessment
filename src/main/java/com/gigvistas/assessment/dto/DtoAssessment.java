package com.gigvistas.assessment.dto;

import java.util.Date;

import lombok.Data;

@Data
public class DtoAssessment {
    private Integer aId;
    private Integer jobPostId;
    private String aStatus;
    private String aLabel;
    private String aDescription;
    private Date lastModified;
    private String modifiedBy;
   
}
