package br.pucrs.engswii.controllers.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.user.User;
import br.pucrs.engswii.beans.user.UserRegistration;
import br.pucrs.engswii.beans.user.UserRegistrationReply;

@RestController
public class UserRegistrationController {

	@PostMapping("/register/user")
	public UserRegistrationReply registerUser(@RequestBody User user) {
		System.out.println("In Register User");		           
		UserRegistrationReply userRegreply = new UserRegistrationReply();

		userRegreply.setName(user.getName());
		userRegreply.setPassword("**********");
		userRegreply.setRegistrationNumber(user.getRegistrationNumber());
		userRegreply.setRegistrationStatus(UserRegistration.getInstance().add(user));

		return userRegreply;
		
	}

}
