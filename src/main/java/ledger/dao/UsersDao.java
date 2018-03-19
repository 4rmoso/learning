package ledger.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ledger.model.CourseCategoryModel;
import ledger.model.CourseModel;
import ledger.model.EmployeeModel;
import ledger.model.UsersModel;

public class UsersDao {
	
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int save(UsersModel g) {
		String sql = "insert into TBL_USERS(USERS_USERNAME,USERS_PASSWORD,EMP_ID) values('"+g.getUsers_username()+"','"+g.getUsers_password()+"','"+g.getEmp_id()+"')";
		return template.update(sql);
	}
	
	public int delete(int id) {
		String sql = "delete from TBL_USERS where USERS_ID = "+id+"";
		return template.update(sql);
	}
	
	public int update(UsersModel g) {
		String sql = "Update TBL_USERS SET USERS_USERNAME = ('"+g.getUsers_username()+"'),USERS_PASSWORD = ('"+g.getUsers_password()+"'),EMP_ID = ('"+g.getEmp_id()+"')  WHERE USERS_ID = ('"+g.getUsers_id()+"')";
		return template.update(sql);
	}

	
	public List<UsersModel> getUsers() {
		return template.query(" select TBL_USERS.USERS_ID, TBL_USERS.USERS_USERNAME, TBL_USERS.USERS_PASSWORD,TBL_EMPLOYEE.EMP_ID, TBL_EMPLOYEE.EMP_FNAME, TBL_EMPLOYEE.EMP_MNAME, TBL_EMPLOYEE.EMP_LNAME FROM TBL_USERS INNER JOIN TBL_EMPLOYEE ON TBL_USERS.EMP_ID = TBL_EMPLOYEE.EMP_ID", new RowMapper<UsersModel>(){
			public UsersModel mapRow(ResultSet rs, int row)  throws SQLException{
				UsersModel g = new UsersModel();
				g.setUsers_id(rs.getInt(1));
				g.setUsers_username(rs.getString(2));
				g.setUsers_password(rs.getString(3));
				g.setEmp_id(rs.getInt(4));
				g.setFname(rs.getString(5));
				g.setMname(rs.getString(6));
				g.setLname(rs.getString(7));
				
				

				return g;
			}
		});
	}

}
