package ledger.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ledger.dao.EmployeeDao;
import ledger.dao.IndexEDao;

@Controller
public class IndexEController {

	@Autowired
	IndexEDao indexeDao;

}
