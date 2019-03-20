package com.capgemini.model;

import java.util.Objects;

public class School {

	private String name;
	private String city;
	private String district;
	private int schoolRanking;
	
	
	public School(String name, String city, String district, int schoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.schoolRanking = schoolRanking;
	}
	
	public School() {
		super();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getSchoolRanking() {
		return schoolRanking;
	}

	public void setSchoolRanking(int schoolRanking) {
		this.schoolRanking = schoolRanking;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city,district,name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
