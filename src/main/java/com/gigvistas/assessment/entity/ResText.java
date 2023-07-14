package com.gigvistas.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.JoinColumn;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@Entity
@Table(name = "res_text")
@Data
public class ResText {
   
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer resTextId;
    
    @ManyToOne
    @JoinColumn(name="res_id",nullable=false)
    private ResQuestion resId;

    private String resDescription;
}
