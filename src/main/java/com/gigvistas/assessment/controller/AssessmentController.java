package com.gigvistas.assessment.controller;
import java.util.List;
import java.lang.Integer;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gigvistas.assessment.dto.DtoAssessment;
import com.gigvistas.assessment.dto.DtoQuestion;
import com.gigvistas.assessment.dto.McqDto;
import com.gigvistas.assessment.entity.QAssessment;
import com.gigvistas.assessment.repository.QAssessmentRepository;
import com.gigvistas.assessment.entity.QMcq;
import com.gigvistas.assessment.repository.QMcqRepository;
import com.gigvistas.assessment.entity.QQuestion;
import com.gigvistas.assessment.repository.QQuestionRepository;
import com.gigvistas.assessment.repository.ResQuestionRepository;
import com.gigvistas.assessment.entity.ResQuestion;
import com.gigvistas.assessment.repository.ResMcqRepository;
import com.gigvistas.assessment.entity.ResMcq;
import com.gigvistas.assessment.repository.ResTextRepository;
import com.gigvistas.assessment.entity.ResText;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;



@RestController
public class AssessmentController {

	

	@Autowired
	QAssessmentRepository qaRepository;
	
	@Autowired
	QQuestionRepository qRepository;
	QMcqRepository mcqRepository;
	ResQuestionRepository rqRepository;
	ResMcqRepository rmcqRepository;
	ResTextRepository rtRepository;

	@Autowired
	private ModelMapper modelMapper;
	


	

    @GetMapping("/")
	public List<QAssessment> findAll() {
		return qaRepository.findAll();
	}

	@GetMapping("/assessmentById")
	public List <QAssessment> findByAId (Integer index){
		return qaRepository.findByaId(index);
	}

	@GetMapping ("/assessmentByJobPostId")
	public List <QAssessment> findByJobPostId(Integer jobPostId){
		return qaRepository.findByjobPostId(jobPostId);
	}

	@GetMapping ("/assessmentByAStatus")
    public List <QAssessment> findByAStatus(String aStatus){
		return qaRepository.findBystatus(aStatus);
	}

	@GetMapping ("/assessmentByALabel")
	public List <QAssessment> findByaLabel(String aLabel){
		return qaRepository.findBylabel(aLabel);
	}

	@GetMapping ("/assessmentByLastModified")
	public List <QAssessment> findBylastModified(Date lastModified){
		return qaRepository.findBylastModified(lastModified);
	}

	@GetMapping ("/assessmentByModifiedBy")
	public List <QAssessment> findByModifiedBy(String modifiedBy){
		return qaRepository.findBymodifiedBy(modifiedBy);
	}

    @GetMapping ("/allQuestions")
	public List <QQuestion> findAllQuestions (){
		return qRepository.findAll();
	}

	//question methods
	@GetMapping("/questionsByQId")
	public List <QQuestion> findByQId (Integer qId){
		return qRepository.findByqId(qId);
	}

	@GetMapping("/questionsByQType")
	public List <QQuestion> findByQType(String qType){
		return qRepository.findByType(qType);
	}

	@GetMapping ("/questionsByQRequired")
	public List <QQuestion> findByQRequired(boolean qRequired){
		return qRepository.findByRequired(qRequired);
	}

	//Mcq methods
    @GetMapping("/allMcqs")
	public List<QMcq> findAllMcqs(){
		return mcqRepository.findAll();
	}

	@GetMapping("/mcqBymcqId")
	public List <QMcq> findByMcqId(Integer mcqId){
		return mcqRepository.findByqMcqId(mcqId);
	}

	@GetMapping("/mcqByqOption")
	public List <QMcq> findByMcqOption(String qOption){
		return mcqRepository.findByqOption(qOption);
	}

	@GetMapping("/mcqByIsCorrect")
    public List <QMcq> findByisCorrect (boolean isCorrect){
		return mcqRepository.findByisCorrect(isCorrect);
	}	

	//ResQuestion methods
	@GetMapping("/AllRes")
    public List <ResQuestion> findAllResponses(){
		return rqRepository.findAll();
	}

	@GetMapping("/resByResId")
	public List <ResQuestion> findByResId(Integer resId){
		return rqRepository.findByresId(resId);
	}

	@GetMapping("/resByQId")
	public List <ResQuestion> findResByQId(QQuestion qId){
		return rqRepository.findByqId(qId);
	}

	@GetMapping("/resByResType")
	public List <ResQuestion> findByResType(String resType){
		return rqRepository.findByresType(resType);
	}

	@GetMapping("/resByLastModified")
	public List <ResQuestion> findResByLastModified(Date lastModified){
		return rqRepository.findBylastModified(lastModified);
	}

	@GetMapping("/resByUserCode")
    public List <ResQuestion> findResByUserCode(String userCode){
		return rqRepository.findByuserCode(userCode);
	}	

	//resMcq methods
	@GetMapping("/AllResMcq")
	public List <ResMcq> findAllResMcq(){
		return rmcqRepository.findAll();
	}

	@GetMapping("/resMcqByResMcqId")
	public List <ResMcq> findByResMcqId(Integer resMcqId){
		return rmcqRepository.findByresMcqId(resMcqId);
	}

	@GetMapping("/resMcqByQMcqId")
	public List <ResMcq> findByQMcqId(QMcq qMcqId){
		return rmcqRepository.findByqMcqId(qMcqId);
	}

	@GetMapping("resMcqByresId")
	public List <ResMcq> findByResId(ResQuestion resId){
		return rmcqRepository.findByresId(resId);
	}

	//resText methods
	@GetMapping("/AllResTexts")
	public List <ResText> findAllResText(){
		return rtRepository.findAll();
	}

	@GetMapping("/resTextbyResTextId")
	public List <ResText> findByResTextId(Integer resTextId){
		return rtRepository.findByresTextId(resTextId);
	}

	@GetMapping("/resTextByresId")
	public List <ResText> findByResTextByResId(ResQuestion resId){
		return rtRepository.findByresId(resId);
	}

	//finding questions in an assessment
	@GetMapping("/questionsInAnAssessment")
	public List <QQuestion> findQuestionsByAssessment(QAssessment aId){
		return qRepository.findByaId(aId);
	}

	//added from article
	@RequestMapping(value = RestURIConstants.CREATE_ASSESSMENT, method = RequestMethod.POST)
	public @ResponseBody QAssessment createAssessment(@RequestBody DtoAssessment dtoAssessment){
		//DTO to Entity
		QAssessment qAssessmentRequest = modelMapper.map(dtoAssessment,QAssessment.class);
        QAssessment qAssessment = qaRepository.save(qAssessmentRequest);
        
		return qAssessment;
	}

	@RequestMapping(value= RestURIConstants.CREATE_QUESTIONS, method=RequestMethod.POST)
	public @ResponseBody QAssessment addQuestions(@RequestBody DtoAssessment dtoAssessment){
		if (qaRepository.findByaId(dtoAssessment.getAId())==null){
			qaRepository.save(createAssessment(dtoAssessment));
		}
		ArrayList <DtoQuestion> questionList= dtoAssessment.getQuestions();
		for ( DtoQuestion question: questionList){
             qRepository.save(modelMapper.map(question, QQuestion.class));
			 if (question.getType().equalsIgnoreCase("mcq")){
				ArrayList <McqDto> mcqList= question.getMcqOptions();
				for (McqDto option:mcqList){
					mcqRepository.save(modelMapper.map(option, QMcq.class));
				}
			 }
		}
		
		
		return  modelMapper.map(dtoAssessment,QAssessment.class);

	}
}
