package com.gigvistas.assessment.dto;
import lombok.Data;

@Data
public class McqDto {
    private Integer mcqId;
    private Integer qId;
    private String option;
    private boolean isCorrect;
}
