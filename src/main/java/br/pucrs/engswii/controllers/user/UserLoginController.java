package br.pucrs.engswii.controllers.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import br.pucrs.engswii.beans.*;
import br.pucrs.engswii.beans.user.User;
import br.pucrs.engswii.beans.user.UserRegistration;

@RestController
public class UserLoginController {

	//  @RequestMapping(method = RequestMethod.POST, value="/login")
	//
	//  @ResponseBody
	@PostMapping("/login")
	public Boolean loginUser(@RequestBody User user) {
		System.out.println("In loginUser");
		if(UserRegistration.getInstance().login(user).equals("Login successful")){
			return true;
		}		
		return false;
	}

}