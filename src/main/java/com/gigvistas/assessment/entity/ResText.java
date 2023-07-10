package com.gigvistas.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "res_text")
@Data
public class ResText {
   
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer resTextId;

    private Integer qId;

    private String resDescription;
}
