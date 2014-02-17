/**
 * 
 */
package org.migue.learning.struts.service;

import org.migue.learning.struts.model.User;

/**
 * @author migue
 * alternative login service
 */
public class LoginService {
	
	public boolean verifyLogin (User user) {
		
		if (user.getUserId().equals("userId") && user.getPassword().equals("password")) 
			return true;
		else
			return false;
		
	}
}
