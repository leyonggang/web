package cn.ayit.action;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
	
	private String username;
	private String password;
	
	
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


	@Override
	public String execute() throws Exception {
		System.out.println(username);
		System.out.println(password);
		if(password.equals("11")){
			return super.execute();
		}else{
			return ERROR;
		}
		
	}

}
