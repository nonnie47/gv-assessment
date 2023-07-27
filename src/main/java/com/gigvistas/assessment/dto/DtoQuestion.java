package com.gigvistas.assessment.dto;
import lombok.Data;

import java.util.ArrayList;

import com.gigvistas.assessment.entity.QAssessment;
import com.gigvistas.assessment.entity.ResQuestion;

@Data
public class DtoQuestion {
    private Integer qId;
    private Integer aId;
    private String description;
    public String type;
    private boolean required;
    public ArrayList <McqDto> mcqOptions;

    
}
