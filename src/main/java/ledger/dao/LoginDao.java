package ledger.dao;
 
import java.sql.Connection;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;

import org.springframework.jdbc.core.JdbcTemplate;

import ledger.DBConnection;
import ledger.model.LoginModel;

 public class LoginDao {
	 JdbcTemplate template;
		
		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}
	 
 public String authenticateUser(LoginModel loginModel)
 {
 
String userName = loginModel.getUserName(); //Keeping user entered values in temporary variables.
 String password = loginModel.getPassword();
 
Connection con = null;
 Statement statement = null;
 ResultSet resultSet = null;
 
String userNameDB = "";
 String passwordDB = "";
 
try
 {
 con = DBConnection.createConnection(); //establishing connection
 statement = con.createStatement(); //Statement is used to write queries. Read more about it.
 resultSet = statement.executeQuery("select USERS_USERNAME,USERS_PASSWORD from TBL_USERS"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
 
while(resultSet.next()) // Until next row is present otherwise it return false
 {
  userNameDB = resultSet.getString("USERS_USERNAME"); //fetch the values present in database
  passwordDB = resultSet.getString("USERS_PASSWORD");
 
   if(userName.equals(userNameDB) && password.equals(passwordDB))
   {
      return "SUCCESS"; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
   }
 }}

 catch(SQLException e)
 {
 e.printStackTrace();
 }
 return "Invalid user credentials"; // Just returning appropriate message otherwise
 }
 }
 
 