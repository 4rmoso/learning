package ledger.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ledger.model.CourseModel;

public class IndexEDao {
	
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
}
