package springTransaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import springTransaction.service.UserService;

@Controller
@Transactional //指定这个类可以受Spring事务管理了
public class UserController {
	@Autowired //类型
	private UserService userService;
	
	public void test() {
		String saveSql = "insert into user_info values(?,?,?,?,?)";
		String deleteSql = "delete from user_info";
		Object[] param = {"3","王五","789","m",30};
		
		//不能加try catch，加了之后异常被try{}捕捉到，那么事务管理器就无法再捕捉异常，所以就无法做出反应，事务不回滚
		//删除表中所有的数据
		userService.delete(deleteSql, null);
		//插入两条主键重复的数据
		userService.save(saveSql, param);
		userService.save(saveSql, param);
		
	}
}
