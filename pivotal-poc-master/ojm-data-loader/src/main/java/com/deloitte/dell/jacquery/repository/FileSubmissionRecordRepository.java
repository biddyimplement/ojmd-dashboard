package com.deloitte.dell.jacquery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.dell.jacquery.model.FileSubmissionRecord;

@Repository("fileSubmissionRecordRepository")
public interface FileSubmissionRecordRepository extends JpaRepository<FileSubmissionRecord, Long>{

}