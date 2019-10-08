package com.qst.core.dao;
import com.qst.core.po.User;
import org.apache.ibatis.annotations.Param;
/**
 * 用户DAO层接口
 */
public interface UserDao {
	/**
	 * 通过账号和密码查询用户
	 */
	public User findUser(@Param("user_code") String user_code, @Param("user_password") String password);
}
