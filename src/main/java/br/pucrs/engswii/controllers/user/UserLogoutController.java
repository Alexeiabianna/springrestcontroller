package br.pucrs.engswii.controllers.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import br.pucrs.engswii.beans.*;
import br.pucrs.engswii.beans.user.User;
import br.pucrs.engswii.beans.user.UserRegistration;

@RestController
public class UserLogoutController {

	//  @RequestMapping(method = RequestMethod.POST, value="/user/logout")
	//
	//  @ResponseBody
	@PostMapping("/logout")
	public String logoutUser(@RequestBody User user) {
		System.out.println("In logoutUser");
		return UserRegistration.getInstance().logout(user);
	}

}