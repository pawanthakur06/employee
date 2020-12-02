package employeedetails;

	import java.util.List;

	public class Employee {
		private String fullName;
		private String designation;
		private String dob;
		private String experience;
		private String role;
		private String dateOfJoining;
		private String reportingManager;
		private String fatherName;
		private String empId;
		private String maritalStatus;
		private List<Awards> awards;
		private List<Skills> skills;

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getExperience() {
			return experience;
		}

		public void setExperience(String experience) {
			this.experience = experience;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getDateOfJoining() {
			return dateOfJoining;
		}

		public void setDateOfJoining(String dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}

		public String getReportingManager() {
			return reportingManager;
		}

		public void setReportingManager(String reportingManager) {
			this.reportingManager = reportingManager;
		}

		public String getFatherName() {
			return fatherName;
		}

		public void setFatherName(String fatherName) {
			this.fatherName = fatherName;
		}

		public String getEmpId() {
			return empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		public String getMaritalStatus() {
			return maritalStatus;
		}

		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}

		public List<Awards> getAwards() {
			return awards;
		}

		public void setAwards(List<Awards> awards) {
			this.awards = awards;
		}

		public List<Skills> getSkills() {
			return skills;
		}

		public void setSkills(List<Skills> skills) {
			this.skills = skills;
		}

		@Override
		public String toString() {
			return "Employee{" +
					"fullName='" + fullName + '\'' +
					", designation='" + designation + '\'' +
					", dob='" + dob + '\'' +
					", experience='" + experience + '\'' +
					", role='" + role + '\'' +
					", dateOfJoining='" + dateOfJoining + '\'' +
					", reportingManager='" + reportingManager + '\'' +
					", fatherName='" + fatherName + '\'' +
					", empId='" + empId + '\'' +
					", maritalStatus='" + maritalStatus + '\'' +
					", awards=" + awards +
					", skills=" + skills +
					'}';
		}
	}


