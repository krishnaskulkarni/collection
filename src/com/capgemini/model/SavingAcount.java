package com.capgemini.model;

import java.util.Objects;

public class SavingAcount implements Comparable<SavingAcount> {
	
	private String acountHolderName;
	private double acountId;
	private double acountBalance;
	private boolean isSalaryAcount;
	
	public SavingAcount() {
		super();
	}

	public SavingAcount(String acountHolderName, double acountId, double acountBalance, boolean isSalaryAcount) {
		super();
		this.acountHolderName = acountHolderName;
		this.acountId = acountId;
		this.acountBalance = acountBalance;
		this.isSalaryAcount = isSalaryAcount;
	}

	public String getAcountHolderName() {
		return acountHolderName;
	}

	public void setAcountHolderName(String acountHolderName) {
		this.acountHolderName = acountHolderName;
	}

	public double getAcountId() {
		return acountId;
	}

	public void setAcountId(double acountId) {
		this.acountId = acountId;
	}

	public double getAcountBalance() {
		return acountBalance;
	}

	public void setAcountBalance(double acountBalance) {
		this.acountBalance = acountBalance;
	}

	public boolean isSalaryAcount() {
		return isSalaryAcount;
	}

	public void setSalaryAcount(boolean isSalaryAcount) {
		this.isSalaryAcount = isSalaryAcount;
	}

	@Override
	public int hashCode() {
	
		return Objects.hash(acountHolderName,acountId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SavingAcount))
			return false;
		SavingAcount other = (SavingAcount) obj;
		if (acountHolderName == null) {
			if (other.acountHolderName != null)
				return false;
		} else if (!acountHolderName.equals(other.acountHolderName))
			return false;
		if (Double.doubleToLongBits(acountId) != Double.doubleToLongBits(other.acountId))
			return false;
		return true;
	}

	@Override
	public int compareTo(SavingAcount o) {
		
		return this.acountHolderName.compareTo(o.acountHolderName);
	}
	
	
	
	

}
