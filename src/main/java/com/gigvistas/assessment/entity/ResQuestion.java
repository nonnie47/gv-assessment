package com.gigvistas.assessment.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "res_question")
@Data
public class ResQuestion {
   
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer resId;

    private Integer q_id;

    private String resType;

    private Date lastModified;

    private String userCode;
}
