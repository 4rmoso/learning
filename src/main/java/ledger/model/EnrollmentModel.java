package ledger.model;

public class EnrollmentModel {

	private int emp_c_e_id;	
	private String  emp_c_e_dateofenrollment;
	private String   emp_c_e_dateofcompletion;
	private int emp_c_e_coursecompleted;
	private int emp_id;
	private String  emp_fname;
	private String  emp_mname;
	private String  emp_lname;
	private int  course_id;
	private String course_name;
	
	
	public int getEmp_c_e_id() {
		
		return emp_c_e_id;
	}
	public void setEmp_c_e_id(int emp_c_e_id) {
		this.emp_c_e_id = emp_c_e_id;
	}
	public String getEmp_c_e_dateofenrollment() {
		return emp_c_e_dateofenrollment;
	}
	public void setEmp_c_e_dateofenrollment(String emp_c_e_dateofenrollment) {
		this.emp_c_e_dateofenrollment = emp_c_e_dateofenrollment;
	}
	public String getEmp_c_e_dateofcompletion() {
		return emp_c_e_dateofcompletion;
	}
	public void setEmp_c_e_dateofcompletion(String emp_c_e_dateofcompletion) {
		this.emp_c_e_dateofcompletion = emp_c_e_dateofcompletion;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public int getEmp_c_e_coursecompleted() {
		return emp_c_e_coursecompleted;
	}
	public void setEmp_c_e_coursecompleted(int emp_c_e_coursecompleted) {
		this.emp_c_e_coursecompleted = emp_c_e_coursecompleted;
	}
	
	public String getEmp_mname() {
		return emp_mname;
	}
	public void setEmp_mname(String emp_mname) {
		this.emp_mname = emp_mname;
	}
	
	public String getEmp_lname() {
		return emp_lname;
	}
	public void setEmp_lname(String emp_lname) {
		this.emp_lname = emp_lname;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getEmp_fname() {
		return emp_fname;
	}
	public void setEmp_fname(String emp_fname) {
		this.emp_fname = emp_fname;
	}
	
	
}
