package com.gl.aop.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AuditLog {

	@Id
	@Column
	private Integer id;
	
	@Column(columnDefinition="Date default sysdate")
	private Date createDate;
	
	@Column
	private String description;
	
}
