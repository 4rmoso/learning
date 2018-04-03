package ledger.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import ledger.dao.LoginDao;

@Controller
public class LoginController {

	@Autowired
	LoginDao loginDao;

}
