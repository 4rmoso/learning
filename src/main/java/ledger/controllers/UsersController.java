package ledger.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ledger.dao.UsersDao;
import ledger.model.CourseModel;
import ledger.model.UsersModel;

@Controller
public class UsersController {
	
	@Autowired
	UsersDao  usersDao;
	
	@RequestMapping(value = "usermanagement/save", method = RequestMethod.POST)
	public ModelAndView courseAdd(@ModelAttribute("user management")UsersModel usermanagement) {
		usersDao.save(usermanagement);
		return new ModelAndView("redirect:/user management");
	}
	
	@RequestMapping(value="usermanagement/delete/{id}",method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable int id) {
		usersDao.delete(id);
		return new ModelAndView("redirect:/user management");
	}
	
	@RequestMapping(value="usermanagement/update",method = RequestMethod.POST)
	public ModelAndView updateCourses(@ModelAttribute("user management")UsersModel users) {
		usersDao.update(users);
		return new ModelAndView("redirect:/user management");
	}
	
	

}
