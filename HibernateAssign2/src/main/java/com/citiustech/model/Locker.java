package com.citiustech.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Locker {
	@Id
	private String lockerId;
	private String lockerType;
	private int rent;
	
	public Locker() {
		super();
	}

	public Locker(String lockerId, String lockerType, int rent) {
		super();
		this.lockerId = lockerId;
		this.lockerType = lockerType;
		this.rent = rent;
	}

	public String getLockerId() {
		return lockerId;
	}

	public void setLockerId(String lockerId) {
		this.lockerId = lockerId;
	}

	public String getLockerType() {
		return lockerType;
	}

	public void setLockerType(String lockerType) {
		this.lockerType = lockerType;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "Locker [lockerId=" + lockerId + ", lockerType=" + lockerType + ", rent=" + rent + "]";
	}
	
	
	
}
