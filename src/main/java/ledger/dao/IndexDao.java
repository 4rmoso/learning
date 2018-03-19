package ledger.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ledger.model.CourseCategoryModel;
import ledger.model.CourseModel;
import ledger.model.EmployeeModel;


public class IndexDao {
	
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<CourseModel> getCourse() {
		return template.query("select top 3 * from TBL_COURSE  order by COURSE_ID desc ", new RowMapper<CourseModel>(){
			public CourseModel mapRow(ResultSet rs, int row)  throws SQLException{
				CourseModel g = new CourseModel();
				g.setCourse_id(rs.getInt(1));
				g.setCourse_name(rs.getString(2));
				
			
				return g;
			}
		});
	}
	
	public List<CourseCategoryModel> getCoursecategory() {
		return template.query("select top 3 * from TBL_COURSE_CATEGORY  order by COURSE_CATEGORY_ID desc", new RowMapper<CourseCategoryModel>(){
			public CourseCategoryModel mapRow(ResultSet rs, int row)  throws SQLException{
				CourseCategoryModel x = new CourseCategoryModel();
				x.setCoursecategory_id(rs.getInt(1));
				x.setCoursecategory_name(rs.getString(2));
				
				

				return x;
			}
		});
	}
	
	public List<EmployeeModel> getEmployee() {
		return template.query("select top 3 * from TBL_EMPLOYEE order by EMP_ID desc", new RowMapper<EmployeeModel>(){
			public EmployeeModel mapRow(ResultSet rs, int row)  throws SQLException{
				EmployeeModel e = new EmployeeModel();
				e.setEmp_id(rs.getInt(1));
				e.setEmp_fname(rs.getString(2));
				e.setEmp_mname(rs.getString(3));
				e.setEmp_lname(rs.getString(4));
			

				return e;
			}
		});
	}

}
