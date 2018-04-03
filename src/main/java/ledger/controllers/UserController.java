package ledger.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ledger.dao.CourseCategoryDao;
import ledger.dao.CourseDao;
import ledger.dao.EmployeeDao;
import ledger.dao.EnrollmentDao;
import ledger.dao.IndexDao;
import ledger.dao.IndexEDao;
import ledger.dao.LoginDao;
import ledger.dao.UsersDao;
import ledger.model.CourseCategoryModel;
import ledger.model.CourseModel;
import ledger.model.EmployeeModel;
import ledger.model.EnrollmentModel;
import ledger.model.UsersModel;


@Controller
public class UserController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private CourseCategoryDao coursecategoryDao;

	@Autowired
	private CourseDao courseDao;
	
	@Autowired
	private EnrollmentDao enrollmentDao;
	
	@Autowired
	private IndexDao indexDao;
	

	@Autowired
	private UsersDao usersDao;
	
	@Autowired
	private IndexEDao indexeDao;
	
	@Autowired
	private LoginDao loginDao;
	
	@RequestMapping("/indexE")
	public ModelAndView indexE() {
		List<CourseModel> list = indexeDao.getCourse();
		ModelAndView mav = new ModelAndView("indexE");
		mav.addObject("list",list);
		mav.addObject("index", new CourseModel());
		mav.setViewName("indexE");
		return mav;
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		List<CourseModel> list = indexDao.getCourse();
		List<CourseCategoryModel> list2 = indexDao.getCoursecategory();
		List<EmployeeModel> list3 = indexDao.getEmployee();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("list",list);
		mav.addObject("list2",list2);
		mav.addObject("list3",list3);
		mav.addObject("index", new CourseModel());
		mav.addObject("index", new CourseCategoryModel());
		mav.addObject("index", new EmployeeModel());
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/coursesE")
	public ModelAndView coursesE() {
		List<CourseModel> list = courseDao.getCourse();
		List<CourseCategoryModel> list2 = coursecategoryDao.getCoursecategory();
		ModelAndView mav = new ModelAndView("coursesE");
		mav.addObject("list",list);
		mav.addObject("list2",list2);
		mav.addObject("coursesE", new CourseModel());
		mav.setViewName("coursesE");
		return mav;
	}
	
	@RequestMapping("/progressE")
	public ModelAndView progressE() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("progressE");
		mav.addObject("progressE", "Watanays Attribute!");

		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		mav.addObject("login", "Watanays Attribute!");

		return mav;
	}
	
	@RequestMapping("/enrollment")
	public ModelAndView enrollment() {
		List<EnrollmentModel> list = enrollmentDao.getEnrollment();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.addObject("enrollment",new EnrollmentModel());
		mav.setViewName("enrollment");
		return mav;
	}
	
	
	@RequestMapping("/employee")
	public ModelAndView employee() {
		List<EmployeeModel> list = employeeDao.getEmployee();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.addObject("employee",new EmployeeModel());
		mav.setViewName("employee");
		return mav;
	}
	
	
	@RequestMapping("/user management")
	public ModelAndView usermanagement() {
		List<UsersModel> list = usersDao.getUsers();
		List<EmployeeModel> list2 = employeeDao.getEmployee();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.addObject("list2",list2);
		mav.addObject("user management",new UsersModel());
		mav.setViewName("user management");
		return mav;
	}

	

	
	@RequestMapping("/courses category")
	public ModelAndView coursecategory() {
		List<CourseCategoryModel> list = coursecategoryDao.getCoursecategory();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.addObject("courses category",new CourseCategoryModel());
		mav.setViewName("courses category");
		return mav;
	}
	


	
	@RequestMapping("courses")
	public ModelAndView courses() {
		List<CourseModel> list = courseDao.getCourse();
		List<CourseCategoryModel> list2 = coursecategoryDao.getCoursecategory();
		ModelAndView mav = new ModelAndView("courses");
		mav.addObject("list",list);
		mav.addObject("list2",list2);
		mav.addObject("courses", new CourseModel());
		mav.setViewName("courses");
		return mav;
	}
	
	
	

	
	@RequestMapping("/list courses category")
	public ModelAndView listcoursescategory() {
		List<CourseCategoryModel> list = coursecategoryDao.getCoursecategory();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.addObject("list courses category",new CourseCategoryModel());
		mav.setViewName("list courses category");

		return mav;
	}
	
	@RequestMapping("/list course")
	public ModelAndView listcourse() {
		List<CourseModel> list = courseDao.getCourse();
		List<CourseCategoryModel> list2 = coursecategoryDao.getCoursecategory();
		ModelAndView mav = new ModelAndView("list course");
		mav.addObject("list",list);
		mav.addObject("list2",list2);
		mav.addObject("list course", new CourseModel());
		mav.setViewName("list course");
		return mav;

		
	}
	
	
	@RequestMapping("/list employee")
	public ModelAndView listemployee() {
		List<EmployeeModel> list = employeeDao.getEmployee();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.addObject("list employee",new EmployeeModel());
		mav.setViewName("list employee");
		return mav;
	}
	
	@RequestMapping("/list user")
	public ModelAndView listuser() {
		List<UsersModel> list = usersDao.getUsers();
		List<EmployeeModel> list2 = employeeDao.getEmployee();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.addObject("list2",list2);
		mav.addObject("list user",new UsersModel());
		mav.setViewName("list user");
		return mav;
	}
	
	
	
	

	
}
