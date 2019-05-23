package springTransaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userDao")
public class UserDao {
	@Autowired //默认按照类型进行自动装配
	private JdbcTemplate jdbcTemplate;

//	@Override
	public int save(String sql, Object[] param) {
		return jdbcTemplate.update(sql, param);
	}

//	@Override
	public int delete(String sql, Object[] param) {
		return jdbcTemplate.update(sql, param);
	}
}
