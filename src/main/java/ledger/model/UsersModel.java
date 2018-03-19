package ledger.model;

public class UsersModel {
	
	private int users_id;
	private String users_username;
	private String users_password;
	private int emp_id;
	private String fname;
	private String mname;
	private String lname;
	
	public int getUsers_id() {
		return users_id;
	}
	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}
	public String getUsers_username() {
		return users_username;
	}
	public void setUsers_username(String users_username) {
		this.users_username = users_username;
	}
	public String getUsers_password() {
		return users_password;
	}
	public void setUsers_password(String users_password) {
		this.users_password = users_password;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

}
