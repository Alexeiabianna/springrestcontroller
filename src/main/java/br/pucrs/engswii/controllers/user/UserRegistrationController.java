package br.pucrs.engswii.controllers.user;

import java.util.List;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.*;
import br.pucrs.engswii.beans.user.User;
import br.pucrs.engswii.beans.user.UserRegistration;
import br.pucrs.engswii.beans.user.UserRegistrationReply;

@RestController
public class UserRegistrationController {

	//  @RequestMapping(method = RequestMethod.POST, value="/register/user")
	//
	//  @ResponseBody
	@PostMapping("/register/user")
	public UserRegistrationReply registerUser(@RequestBody User user) {
		System.out.println("In registerUser");
		UserRegistrationReply userRegreply = new UserRegistrationReply();
		String ret = UserRegistration.getInstance().add(user);
		userRegreply.setName(user.getName());
		userRegreply.setRegistrationStatus(ret);

		return userRegreply;
	}

}
