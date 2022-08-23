package com.citiustech.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DirectorEntity {
	@Id
	private String directorId;
	private String directorName;
	private int bornIn;
	
	
	
	public DirectorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DirectorEntity(String directorId, String directorName, int bornIn) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
		this.bornIn = bornIn;
	}
	public String getDirectorId() {
		return directorId;
	}
	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public int getBornIn() {
		return bornIn;
	}
	public void setBornIn(int bornIn) {
		this.bornIn = bornIn;
	}
	@Override
	public String toString() {
		return "DirectorEntity [directorId=" + directorId + ", directorName=" + directorName + ", bornIn=" + bornIn
				+ "]";
	}
	
	
}
