package cn.ayit.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import cn.ayit.bo.User;

public class RegistModel extends ActionSupport implements ModelDriven<User>,Preparable {
	private User user;

	@Override
	public User getModel() {
		return user;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return super.execute();
	}
	@Override
	public void prepare() throws Exception {
		System.out.println("prepare方法");
		user=new User();	
	}
	
	@Override
	public void validate() {
		if(user.getBirth()==null) addFieldError("birth", "出生日期不能为空");
	}
	
}
