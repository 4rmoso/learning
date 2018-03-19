package ledger.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ledger.dao.CourseCategoryDao;
import ledger.dao.CourseDao;
import ledger.dao.EmployeeDao;
import ledger.model.CourseCategoryModel;
import ledger.model.CourseModel;
import ledger.model.EmployeeModel;

@Controller
public class CourseController {
	
	@Autowired
	CourseDao courseDao;
	
	
	@RequestMapping(value = "courses/save", method = RequestMethod.POST)
	public ModelAndView courseAdd(@ModelAttribute("courses")CourseModel course) {
		courseDao.save(course);
		return new ModelAndView("redirect:/courses");
	}
	
	@RequestMapping(value="courses/delete/{id}",method = RequestMethod.GET)
	public ModelAndView deleteCourses(@PathVariable int id) {
		courseDao.delete(id);
		return new ModelAndView("redirect:/courses");
	}
	
	@RequestMapping(value="courses/update",method = RequestMethod.POST)
	public ModelAndView updateCourses(@ModelAttribute("courses")CourseModel courses) {
		courseDao.update(courses);
		return new ModelAndView("redirect:/courses");
	}
	
}
