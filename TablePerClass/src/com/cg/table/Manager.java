package com.cg.table;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manager1")
public class Manager extends Employee {
	private static final long serialVersionUID=1L;
	private String deptName;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

}
