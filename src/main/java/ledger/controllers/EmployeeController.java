package ledger.controllers;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ledger.dao.EmployeeDao;
import ledger.model.EmployeeModel;



@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping(value = "employee/save", method = RequestMethod.POST)
	public ModelAndView employeeAdd(@ModelAttribute("employee")EmployeeModel employee) {
		employeeDao.save(employee);
		return new ModelAndView("redirect:/employee");
	}
	
	@RequestMapping(value="employee/delete/{id}",method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable int id) {
		employeeDao.delete(id);
		return new ModelAndView("redirect:/employee");
	}
	
	@RequestMapping(value="employee/update",method = RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute("employee")EmployeeModel employee) {
		employeeDao.update(employee);
		return new ModelAndView("redirect:/employee");
	}
	

	
}
