package com.example.markmanagementbe.repository;

import com.example.markmanagementbe.model.ExamDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamDetailRepository extends JpaRepository<ExamDetail,Long> {
}
