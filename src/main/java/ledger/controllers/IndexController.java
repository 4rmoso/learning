package ledger.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import ledger.dao.IndexDao;

@Controller
public class IndexController {
	
	@Autowired
	IndexDao indexDao;
}
