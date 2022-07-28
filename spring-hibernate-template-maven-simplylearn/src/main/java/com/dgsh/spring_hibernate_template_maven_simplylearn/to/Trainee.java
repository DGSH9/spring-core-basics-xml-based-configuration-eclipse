package com.dgsh.spring_hibernate_template_maven_simplylearn.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trainee_Details")
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int traineeId;
	private String traineeName;
	private int marksScored;
	private long contactNumber;
	
	
	public int getTraineeId() {
		return traineeId;
	}
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainee(String traineeName, int marksScored, long contactNumber) {
		super();
		this.traineeName = traineeName;
		this.marksScored = marksScored;
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", marksScored=" + marksScored
				+ ", contactNumber=" + contactNumber + "]";
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public int getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(int marksScored) {
		this.marksScored = marksScored;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	
}
