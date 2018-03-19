package ledger.model;

public class UserModel {
	
	private String user_id;
	private String user_name;
	private String pass_word;
	
	
	public UserModel() {

	}

	public UserModel(String user_id, String user_name, String pass_word) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.pass_word = pass_word;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPass_word() {
		return pass_word;
	}

	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}

}
