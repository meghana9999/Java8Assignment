package com.citiustech.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	private String empName;
	@Id
	private int empId;
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="assetId")
	private Assets asset;
	
	public Employee() {
		super();
	}

	public Employee(String empName, int empId, String password) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.password = password;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Assets getAsset() {
		return asset;
	}

	public void setAsset(Assets asset) {
		this.asset = asset;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", password=" + password + ", asset=" + asset
				+ "]";
	}
	
	
	
}
