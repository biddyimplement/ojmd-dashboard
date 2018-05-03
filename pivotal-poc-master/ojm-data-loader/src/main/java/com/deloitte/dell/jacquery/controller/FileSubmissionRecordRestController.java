package com.deloitte.dell.jacquery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.dell.jacquery.model.FileSubmissionRecord;
import com.deloitte.dell.jacquery.service.FileSubmissionRecordService;

@RestController
public class FileSubmissionRecordRestController {
	
	@Autowired
	private FileSubmissionRecordService fileSubmissionRecordService;
	
	@RequestMapping(path="/fileSubmissionRecords", method=RequestMethod.GET)
	public List<FileSubmissionRecord> getAllFileSubmissionRecords(){
		return fileSubmissionRecordService.getAllFileSubmissionRecords();
	}
    @RequestMapping(value = "/fileSubmissionRecord/{id}", method = RequestMethod.GET)
	public FileSubmissionRecord getFileSubmissionRecordById(@PathVariable("id") long id){
		return fileSubmissionRecordService.getFileSubmissionRecordById(id);
	}

}