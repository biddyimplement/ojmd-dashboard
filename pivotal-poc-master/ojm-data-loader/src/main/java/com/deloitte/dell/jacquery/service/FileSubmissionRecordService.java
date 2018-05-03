/**
 * 
 */
package com.deloitte.dell.jacquery.service;

import java.util.List;

import com.deloitte.dell.jacquery.model.FileSubmissionRecord;

/**
 * @author abadami
 *
 */
public interface FileSubmissionRecordService {
	
	public List<FileSubmissionRecord> getAllFileSubmissionRecords();
	public FileSubmissionRecord getFileSubmissionRecordById(long id);
	
}