/**
 * 
 */
package org.migue.learning.struts.action;


import org.apache.commons.lang3.StringUtils;
import org.migue.learning.struts.model.User;
import org.migue.learning.struts.service.LoginService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author migue
 *
 */
public class LoginAction extends ActionSupport implements ModelDriven<User> {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 109531327026997082L;
	
	private User user = new User();
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}



	
	@Override
    public void validate() {
		
		if (StringUtils.isEmpty(user.getUserId())) {
			// User ID blank
			addFieldError("userId", "User ID can't be blank");
		}
		
		if (StringUtils.isEmpty(user.getPassword()) ) {
			// Password blank
			addFieldError("password", "Password can't be blank");
		}
    }
	
	
	public String execute() {
		LoginService loginService = new LoginService();


		
		if (loginService.verifyLogin(user))
			return SUCCESS;
		else
			return LOGIN;

		
	}


	@Override
	public User getModel() {
		
		return user;
	}


	
}
