package ledger.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ledger.model.CourseModel;

public class CourseDao {
	
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int save(CourseModel g) {
		String sql = "insert into TBL_COURSE (COURSE_NAME,COURSE_DESCRIPTION,COURSE_LEARNINGFILE,COURSE_CATEGORY_ID,COURSE_OUTCOME) values ( '"+g.getCourse_name()+"','"+g.getCourse_description()+"',CONVERT(VARBINARY(MAX),'"+g.getLearningfile()+"'),'"+g.getCoursecategory_id()+"','"+g.getCourse_outcome()+"')";
		return template.update(sql);
	}
	
	
	public int delete(int id) {
		String sql = "delete from TBL_COURSE where COURSE_ID = "+id+"";
		return template.update(sql);
	}
	
	public int update(CourseModel g) {
		String sql = "Update TBL_COURSE SET COURSE_NAME = ('"+g.getCourse_name()+"'),COURSE_DESCRIPTION = ('"+g.getCourse_description()+"'),COURSE_LEARNINGFILE = (CONVERT(VARBINARY(MAX),'"+g.getLearningfile()+"')),COURSE_CATEGORY_ID = ('"+g.getCoursecategory_id()+"'),COURSE_OUTCOME= ('"+g.getCourse_outcome()+"')  WHERE COURSE_ID = ('"+g.getCourse_id()+"')";
		return template.update(sql);
	}

	public List<CourseModel> getCourse() {
		return template.query("select TBL_COURSE.COURSE_ID,TBL_COURSE.COURSE_NAME,TBL_COURSE.COURSE_DESCRIPTION,TBL_COURSE.COURSE_OUTCOME,TBL_COURSE.COURSE_LEARNINGFILE ,TBL_COURSE_CATEGORY.COURSE_CATEGORY_ID, TBL_COURSE_CATEGORY.COURSE_CATEGORY_NAME FROM TBL_COURSE INNER JOIN TBL_COURSE_CATEGORY ON TBL_COURSE.COURSE_CATEGORY_ID = TBL_COURSE_CATEGORY.COURSE_CATEGORY_ID ", new RowMapper<CourseModel>(){
			public CourseModel mapRow(ResultSet rs, int row)  throws SQLException{
				CourseModel g = new CourseModel();
				g.setCourse_id(rs.getInt(1));
				g.setCourse_name(rs.getString(2));
				g.setCourse_description(rs.getString(3));
				g.setCourse_outcome(rs.getString(4));
				g.setLearningfile(rs.getBytes(5));
				g.setCoursecategory_id(rs.getInt(6));
				g.setCoursecategory_name(rs.getString(7));
			
				return g;
			}
		});
	}
}


