package ledger.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ledger.model.EmployeeModel;
import ledger.controllers.EmployeeController;



public class EmployeeDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(EmployeeModel g) {
		String sql = "insert into TBL_EMPLOYEE (EMP_FNAME,EMP_MNAME,EMP_LNAME,EMP_AGE,EMP_CONTACTNUMBER,EMP_ADDRESS,EMP_EMAIL_ADDRESS) values('"+g.getEmp_fname()+"','"+g.getEmp_mname()+"','"+g.getEmp_lname()+"','"+g.getEmp_age()+"','"+g.getEmp_contact_number()+"','"+g.getEmp_address()+"','"+g.getEmp_email_address()+"')";
		return template.update(sql);
	}
	
	public int delete(int id) {
		String sql = "delete from TBL_EMPLOYEE where EMP_ID = "+id+"";
		return template.update(sql);
	}
	
	public int update(EmployeeModel g) {
		String sql = "Update TBL_EMPLOYEE SET EMP_FNAME = ('"+g.getEmp_fname()+"'), EMP_MNAME = ('"+g.getEmp_mname()+"'), EMP_LNAME = ('"+g.getEmp_lname()+"'), EMP_AGE = ('"+g.getEmp_age()+"'), EMP_CONTACTNUMBER = ('"+g.getEmp_contact_number()+"'), EMP_ADDRESS = ('"+g.getEmp_address()+"'), EMP_EMAIL_ADDRESS = ('"+g.getEmp_email_address()+"')  WHERE EMP_ID = ('"+g.getEmp_id()+"')";
		return template.update(sql);
	}
	
	
	

	public List<EmployeeModel> getEmployee() {
		return template.query("select * from TBL_EMPLOYEE ", new RowMapper<EmployeeModel>(){
			public EmployeeModel mapRow(ResultSet rs, int row)  throws SQLException{
				EmployeeModel e = new EmployeeModel();
				e.setEmp_id(rs.getInt(1));
				e.setEmp_fname(rs.getString(2));
				e.setEmp_mname(rs.getString(3));
				e.setEmp_lname(rs.getString(4));
				e.setEmp_age(rs.getInt(5));
				e.setEmp_contact_number(rs.getString(6));
				e.setEmp_address(rs.getString(7));
				e.setEmp_email_address(rs.getString(8));
				

				return e;
			}
		});
	}

	
	
	
}
