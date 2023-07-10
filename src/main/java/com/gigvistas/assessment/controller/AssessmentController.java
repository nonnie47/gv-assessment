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


@RestController
public class AssessmentController {

	@Autowired
	QAssessmentRepository qaRepository;
	QMcqRepository mcqRepository;
	QQuestionRepository qRepository;


	

    @GetMapping("/")
	public List<QAssessment> index() {
		return qaRepository.findAll();
	}

	@GetMapping("/assessmentById")
	public List <QAssessment> assessmentIndex (int index){
		return qaRepository.findByaId(index);
	}

	@GetMapping("/mcqOptions")
	public List <QMcq> mcqIndex (int index){
		return mcqRepository.findByqMcqId(index);
	}

	@GetMapping("/questionsById")
	public List <QQuestion> questionIndex(int index){
		return qRepository.findByqId(index);
	}


	
}
