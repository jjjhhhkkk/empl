package model;

import java.sql.Date;

public class EmployeeVO {
	int employee_id;
	String first_name;
	int department_id;
	String job_id;
	int salary;
	String last_name;
	Date hire_date;
	String email;
	
	public EmployeeVO(){
		
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeVO [employee_id=").append(employee_id).append(", first_name=").append(first_name)
				.append(", department_id=").append(department_id).append(", job_id=").append(job_id).append(", salary=")
				.append(salary).append(", last_name=").append(last_name).append(", hire_date=").append(hire_date)
				.append(", email=").append(email).append("]");
		return builder.toString();
	}

	public EmployeeVO(int employee_id, String first_name, int department_id, String job_id, int salary,
			String last_name, Date hire_date, String email) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.department_id = department_id;
		this.job_id = job_id;
		this.salary = salary;
		this.last_name = last_name;
		this.hire_date = hire_date;
		this.email = email;
	}
	
	
	
	
	
}
