package com.xworkz.collection;

public class ApplicationDTO implements comparable<ApplicationDTO> { 
	private String name;
	private double version;
	String developedBy;
	
	@Override
	public int hashCode() {
		
		return 3;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		if (developedBy == null) {
			if (other.developedBy != null)
				return false;
		} else if (!developedBy.equals(other.developedBy))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(version) != Double.doubleToLongBits(other.version))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", developedBy=" + developedBy + ", getName()="
				+ getName() + ", getVersion()=" + getVersion() + ", getDevelopedBy()=" + getDevelopedBy()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	@Override
	public int compareTo(ApplicationDTO o) {
		
		if(this.version == o.version) {
			return 0;
		}
		if(this.version > o.version) {
			return 100;
		}
		if(this.version < o.version) {
			return -3;
		}
		throw new IllegalArgumentException("Not goint to work");
		
	
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public boolean isFree() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
