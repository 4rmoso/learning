package ledger.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ledger.model.CourseCategoryModel;
import ledger.model.EmployeeModel;

public class CourseCategoryDao {

	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int save(CourseCategoryModel g) {
		String sql = "insert into TBL_COURSE_CATEGORY (COURSE_CATEGORY_NAME) values('"+g.getCoursecategory_name()+"')";
		return template.update(sql);
	}
	
	public int delete(int id) {
		String sql = "delete from TBL_COURSE_CATEGORY where COURSE_CATEGORY_ID = "+id+"";
		return template.update(sql);
	}
	
	public int update(CourseCategoryModel g) {
		String sql = "Update TBL_COURSE_CATEGORY SET COURSE_CATEGORY_NAME = ('"+g.getCoursecategory_name()+"')  WHERE COURSE_CATEGORY_ID = ('"+g.getCoursecategory_id()+"')";
		return template.update(sql);
	}
	
	public List<CourseCategoryModel> getCoursecategory() {
		return template.query("select * from TBL_COURSE_CATEGORY ", new RowMapper<CourseCategoryModel>(){
			public CourseCategoryModel mapRow(ResultSet rs, int row)  throws SQLException{
				CourseCategoryModel x = new CourseCategoryModel();
				x.setCoursecategory_id(rs.getInt(1));
				x.setCoursecategory_name(rs.getString(2));
				
				

				return x;
			}
		});
	}
	
}
