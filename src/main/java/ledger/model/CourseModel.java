package ledger.model;

public class CourseModel {


	private int course_id;	
	private String  course_name;
	private String   course_description;
	private byte[] learningfile;
	private int coursecategory_id;
	private String  coursecategory_name;
	private String  course_outcome;
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	public byte[] getLearningfile() {
		return learningfile;
	}
	public void setLearningfile(byte[] learningfile) {
		this.learningfile = learningfile;
	}
	public int getCoursecategory_id() {
		return coursecategory_id;
	}
	public void setCoursecategory_id(int coursecategory_id) {
		this.coursecategory_id = coursecategory_id;
	}
	public String getCoursecategory_name() {
		return coursecategory_name;
	}
	public void setCoursecategory_name(String coursecategory_name) {
		this.coursecategory_name = coursecategory_name;
	}
	public String getCourse_outcome() {
		return course_outcome;
	}
	public void setCourse_outcome(String course_outcome) {
		this.course_outcome = course_outcome;
	}
	
}
