package com.capgemini.model;

import java.util.Objects;

public class Laptops {

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	String companyName;
	String model;
	String operatingSystem;
	String processor;

	public Laptops() {
		super();
	}

	public Laptops(String companyName, String model, String operatingSystem, String processor) {
		super();
		this.companyName = companyName;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	@Override
	public int hashCode() {

		return Objects.hash(companyName, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Laptops))
			return false;
		Laptops l = (Laptops) obj;
		return (this.companyName == l.companyName && this.model == l.model);
	}

}
