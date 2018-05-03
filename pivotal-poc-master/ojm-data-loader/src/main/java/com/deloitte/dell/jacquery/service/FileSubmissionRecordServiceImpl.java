package com.deloitte.dell.jacquery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.dell.jacquery.model.FileSubmissionRecord;
import com.deloitte.dell.jacquery.repository.FileSubmissionRecordRepository;

@Service("fileSubmissionRecordService")
public class FileSubmissionRecordServiceImpl implements FileSubmissionRecordService {

	@Autowired
	private FileSubmissionRecordRepository fileSubmissionRecordRepository;

	@Override
	public List<FileSubmissionRecord> getAllFileSubmissionRecords() {
		return fileSubmissionRecordRepository.findAll();
	}

	@Override
	public FileSubmissionRecord getFileSubmissionRecordById(long id) {
		return fileSubmissionRecordRepository.findOne(id);
	}

}