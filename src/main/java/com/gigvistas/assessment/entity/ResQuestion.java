package com.gigvistas.assessment.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.*;

@Entity
@Table(name = "res_question")
@Data
public class ResQuestion {
   
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer resId;

    @ManyToOne
    @JoinColumn(name="q_id", nullable=false)
    private QQuestion qId;

    @OneToMany (mappedBy="resId")
    private Set <ResText> responseTexts;

    @OneToMany (mappedBy="resId")
    private Set <ResMcq> responseMcqs;

    private String resType;

    private Date lastModified;

    private String userCode;
}
