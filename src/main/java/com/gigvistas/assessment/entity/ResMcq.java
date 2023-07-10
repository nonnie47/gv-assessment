package com.gigvistas.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "res_mcq")
@Data
public class ResMcq {
   
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer resMcqId;

    @ManyToOne
    @JoinColumn(name="res_id",nullable=true)
    private ResQuestion resId;

    @ManyToOne
    @JoinColumn(name="q_mcq_id", nullable=true)
    private QMcq qMcqId;

    
}
