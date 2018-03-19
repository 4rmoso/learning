package ledger.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import ledger.model.UserModel;

public class UserDao {

	public JdbcTemplate jdbcTemplate;
	public PlatformTransactionManager platformTransactionManager;
	public TransactionTemplate transactionTemplate;

	String sql = "";

	public UserDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public boolean insert(UserModel user) {

		String sql = "Insert into Users(user_id,user_name,pass_word)" + "VALUES(?,?,?)";

		jdbcTemplate.update(sql, new Object[] { user.getUser_id(), user.getUser_name(), user.getPass_word() });

		return true;

		/*
		 * List<Object> params = new ArrayList<Object>();
		 * 
		 * StringBuilder sql = new
		 * StringBuilder("Insert into Users(user_id,user_name,pass_word)");
		 * sql.append(" VALUES ( "); sql.append(" ? "); params.add(user.getUser_id());
		 * sql.append(", ? "); params.add(user.getUser_name()); sql.append(", ? ");
		 * params.add(user.getPass_word()); params.add(" ) ");
		 * 
		 * boolean bool = false;
		 * 
		 * 
		 * try { jdbcTemplate.update(sql.toString(), params.toArray()); bool = true; }
		 * 
		 * catch (Exception e) { // TODO: handle exception bool = false;
		 * e.printStackTrace(); } return bool; }
		 */

	}

	public boolean update(UserModel user) {

		sql = "Update Users " + "Set user_name = ?, pass_word = ? " + "WHERE user_id = ?";

		jdbcTemplate.update(sql, new Object[] { user.getUser_name(), user.getPass_word(), user.getUser_id() });

		return true;
	}

	public boolean delete(UserModel user) {

		sql = "Delete from Users " + "WHERE user_id = ?";

		jdbcTemplate.update(sql, new Object[] { user.getUser_id() });

		return true;

	}

	public List<UserModel> getUsers() {

		sql = "Select * from USERS";

		return jdbcTemplate.query(sql, new RowMapper<UserModel>() {
			public UserModel mapRow(ResultSet rs, int row) throws SQLException {
				UserModel user = new UserModel();
				user.setUser_id(rs.getString("user_id"));
				user.setUser_name(rs.getString("user_name"));
				user.setPass_word(rs.getString("pass_word"));
				return user;
			}

		});
	}
	
	public List<UserModel> findByIDList(UserModel user) {

		sql = "Select * from USERS "
				+ "WHERE user_id = '"+user.getUser_id()+"'";

		return jdbcTemplate.query(sql, new RowMapper<UserModel>() {
			public UserModel mapRow(ResultSet rs, int row) throws SQLException {
				UserModel user = new UserModel();
				user.setUser_id(rs.getString("user_id"));
				user.setUser_name(rs.getString("user_name"));
				user.setPass_word(rs.getString("pass_word"));
				return user;
			}

		});
	}
	
	
	public List<UserModel> dropDownId() {

		sql = "Select user_id from Users";

		return jdbcTemplate.query(sql, new RowMapper<UserModel>() {
			public UserModel mapRow(ResultSet rs, int row) throws SQLException {
				UserModel user = new UserModel();
				user.setUser_id(rs.getString("user_id"));
				return user;
			}

		});
	}
}
