package com.gl.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.aop.entity.AuditLog;

@Repository
public interface AuditRepository extends JpaRepository<AuditLog, Integer> {
	
}
