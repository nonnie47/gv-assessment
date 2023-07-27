package com.gigvistas.assessment.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DtoAssessment {
    private Integer aId;
    private Integer jobPostId;
    private String status;
    private String label;
    private String description;
    private Date lastModified;
    private String modifiedBy;
    private ArrayList<DtoQuestion> questions;
   
}
