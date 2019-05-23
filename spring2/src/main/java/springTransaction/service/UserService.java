package springTransaction.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springTransaction.dao.UserDao;

@Service(value="userService")//受spring Ioc容器管理
public class UserService {
	@Resource //名称
	private UserDao userDao;
	
	public int save(String sql, Object[] param) {
		return userDao.save(sql, param);
	}
	
	public int delete(String sql, Object[] param) {
		return userDao.delete(sql, param);
	}
}
