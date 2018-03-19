package ledger.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import ledger.dao.EnrollmentDao;

@Controller
public class EnrollmentController {
	
	@Autowired
	EnrollmentDao enrollmentDao;
}
