package com.gigvistas.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "res_mcq")
@Data
public class ResMcq {
   
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer resMcqId;

    private Integer q_id;

    private Integer qMcqId;
}
