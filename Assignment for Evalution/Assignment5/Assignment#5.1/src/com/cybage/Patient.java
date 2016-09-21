package com.cybage;

public class Patient extends Person{
	int patientNumber;
	String hospital;
	String yearOfJoining;
	String patientAddress;
	int medicalFees;
	
	public Patient() {
		
		this.patientNumber = 1;
		this.hospital = "APOLLO";
		this.yearOfJoining = "16 AUG 2016";
		this.patientAddress = "PUNE";
		this.medicalFees = 10000;
	}
	
	public Patient(int patientNumber, String hospital, String yearOfJoining,
			String patientAddress, int medicalFees) {
	
		this.patientNumber = patientNumber;
		this.hospital = hospital;
		this.yearOfJoining = yearOfJoining;
		this.patientAddress = patientAddress;
		this.medicalFees = medicalFees;
	}

	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public void setYearOfJoining(String yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public int getPatientNumber() {
		return patientNumber;
	}
	public String getHospital() {
		return hospital;
	}
	public String getYearOfJoining() {
		return yearOfJoining;
	}
	public void calcMedicalFees(Money m)
	{
		System.out.println("Pateint fees:"+m.getFee());
		
		
	}
	@Override
	public String toString() {
		return String
				.format("Patient [patientNumber=%s, hospital=%s, yearOfJoining=%s, patientAddress=%s, medicalFees=%s]",
						patientNumber, hospital, yearOfJoining, patientAddress,
						medicalFees);
	}
	
	
	
}
