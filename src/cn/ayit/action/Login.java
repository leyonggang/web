package cn.ayit.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import cn.ayit.bo.User;

public class Login extends ActionSupport {
	
	private String username;
	private String password;
	private int age;
	private Date birth;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}


	@Override
	public String execute() throws Exception {
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(age);
		System.out.println(birth);
		
		if(password.equals("11")){
			return super.execute();
		}else{
			return ERROR;
		}
	}

}
