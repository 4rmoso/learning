package ledger.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ledger.model.CourseModel;
import ledger.model.EnrollmentModel;

public class EnrollmentDao {
	
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<EnrollmentModel> getEnrollment() {
		return template.query("select TBL_EMPLOYEE_COURSE_ENROLMENT.EMP_C_E_ID,TBL_EMPLOYEE_COURSE_ENROLMENT.EMP_C_E_DATEOFENROLMENT,TBL_EMPLOYEE_COURSE_ENROLMENT.EMP_C_E_DATEOFCOMPLETION,TBL_EMPLOYEE_COURSE_ENROLMENT.EMP_C_E_COURSECOMPLETED,(TBL_EMPLOYEE.EMP_FNAME),TBL_EMPLOYEE.EMP_MNAME,TBL_EMPLOYEE.EMP_LNAME,TBL_COURSE.COURSE_NAME FROM TBL_EMPLOYEE_COURSE_ENROLMENT INNER JOIN TBL_EMPLOYEE ON TBL_EMPLOYEE_COURSE_ENROLMENT.EMP_ID = TBL_EMPLOYEE.EMP_ID INNER JOIN TBL_COURSE ON TBL_EMPLOYEE_COURSE_ENROLMENT.COURSE_ID= TBL_COURSE.COURSE_ID", new RowMapper<EnrollmentModel>(){
			public EnrollmentModel mapRow(ResultSet rs, int row)  throws SQLException{
				EnrollmentModel q = new EnrollmentModel();
				q.setEmp_c_e_id(rs.getInt(1));
				q.setEmp_c_e_dateofenrollment(rs.getString(2));
				q.setEmp_c_e_dateofcompletion(rs.getString(3));
				q.setEmp_c_e_coursecompleted(rs.getInt(4));
			
				q.setEmp_fname(rs.getString(5));
				q.setEmp_mname(rs.getString(6));
				q.setEmp_lname(rs.getString(7));
				
				q.setCourse_name(rs.getString(8));
				
				
				

				return q;
			}
		});
	}
}
