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
import ledger.model.CourseCategoryModel;
import ledger.model.EmployeeModel;

@Controller
public class CourseCategoryController {
	
	@Autowired
	CourseCategoryDao coursecategoryDao;
	
	@RequestMapping(value = "coursecategory/save", method = RequestMethod.POST)
	public ModelAndView coursecategoryAdd(@ModelAttribute("coursescategory")CourseCategoryModel coursecategory) {
		coursecategoryDao.save(coursecategory);
		return new ModelAndView("redirect:/courses category");
	}
	
	@RequestMapping(value="coursecategory/delete/{id}",method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable int id) {
		coursecategoryDao.delete(id);
		return new ModelAndView("redirect:/courses category");
	}
	
	@RequestMapping(value="coursecategory/update",method = RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute("coursescategory")CourseCategoryModel coursecategory) {
		coursecategoryDao.update(coursecategory);
		return new ModelAndView("redirect:/courses category");
	}
	

}
