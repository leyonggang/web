package cn.ayit.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.ayit.bo.User;

public class Regist extends ActionSupport {
	private User user;

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

	public String test() throws Exception {
		System.out.println("test:"+user);
		return super.execute();
	}

}
