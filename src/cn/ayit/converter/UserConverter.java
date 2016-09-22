package cn.ayit.converter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import cn.ayit.bo.User;

public class UserConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		User user=new User();
		user.setUsername(values[0]);
		user.setPassword(values[1]);
		user.setAge(Integer.valueOf(values[2]));
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		user.setBirth(dateFormat.parse(values[4],null));*/
		user.setBirth(new Date());
		return user;
	}

	@Override
	public String convertToString(Map context, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
