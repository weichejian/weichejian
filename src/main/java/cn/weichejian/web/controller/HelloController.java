package cn.weichejian.web.controller;

import java.util.List;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class HelloController extends Controller {
	public void index() {
		this.setAttr("test", new String[]{"ji"});
		this.render("a.jsp");
		List<User> users = User.dao.find("select * from t_mem_member where id=?", 10);
//		User user1 = User.dao.findById(105);
//		System.out.println(user1.get("email"));
//		System.out.println(users.size());
		
//		Page<User> userPage = User.dao.paginate(1, 10, "select * ", "from t_mem_member where 1=1");
//		System.out.println(userPage.getTotalPage());
//		for(User user : users) {
//			System.out.println(user.get("email"));
//		}
	}
}
