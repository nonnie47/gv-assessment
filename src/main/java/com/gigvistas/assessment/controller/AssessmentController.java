package com.gigvistas.assessment.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gigvistas.assessment.entity.QAssessment;
import com.gigvistas.assessment.repository.QAssessmentRepository;
import com.gigvistas.assessment.entity.QMcq;
import com.gigvistas.assessment.repository.QMcqRepository;
import com.gigvistas.assessment.entity.QQuestion;
import com.gigvistas.assessment.repository.QQuestionRepository;

import java.util.Date;


@RestController
public class AssessmentController {

	@Autowired
	QAssessmentRepository qaRepository;
	QMcqRepository mcqRepository;
	QQuestionRepository qRepository;


	

    @GetMapping("/")
	public List<QAssessment> findAll() {
		return qaRepository.findAll();
	}

	@GetMapping("/assessmentById")
	public List <QAssessment> findByAId (int index){
		return qaRepository.findByaId(index);
	}

	@GetMapping ("/assessmentByJobPostId")
	public List <QAssessment> findByJobPostId(int jobPostId){
		return qaRepository.findByjobPostId(jobPostId);
	}

	@GetMapping ("/assessmentByAStatus")
    public List <QAssessment> findByAStatus(String aStatus){
		return qaRepository.findByaStatus(aStatus);
	}

	@GetMapping ("/assessmentByALabel")
	public List <QAssessment> findByaLabel(String aLabel){
		return qaRepository.findByaLabel(aLabel);
	}

	@GetMapping ("/assessmentByLastModified")
	public List <QAssessment> findBylastModified(Date lastModified){
		return qaRepository.findBylastModified(lastModified);
	}

	@GetMapping ("/assessmentByModifiedBy")
	public List <QAssessment> findByModifiedBy(String modifiedBy){
		return qaRepository.findBymodifiedBy(modifiedBy);
	}

	@GetMapping("/mcqOptions")
	public List <QMcq> findByMcqId(int mcqId){
		return mcqRepository.findByqMcqId(mcqId);
	}

	@GetMapping("/questionsById")
	public List <QQuestion> findByQId (int qId){
		return qRepository.findByqId(qId);
	}


	
}
