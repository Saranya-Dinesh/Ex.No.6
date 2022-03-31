package org.kiot.trainee;

public class Trainee {
	private int  traineeId, contactNo, age;
	private String traineeName, emailId, geneder;
	Trainee trainee = new Trainee();
	trainee.getName(trainee.getTraineeId());
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainee(int traineeId, int contactNo, int age, String traineeName, String emailId, String geneder) {
		super();
		this.traineeId = traineeId;
		this.contactNo = contactNo;
		this.age = age;
		this.traineeName = traineeName;
		this.emailId = emailId;
		this.geneder = geneder;
	}

	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGeneder() {
		return geneder;
	}
	public void setGeneder(String geneder) {
		this.geneder = geneder;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + traineeId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (traineeId != other.traineeId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", contactNo=" + contactNo + ", age=" + age + ", traineeName="
				+ traineeName + ", emailId=" + emailId + ", geneder=" + geneder + "]";
	}
	
	
}
