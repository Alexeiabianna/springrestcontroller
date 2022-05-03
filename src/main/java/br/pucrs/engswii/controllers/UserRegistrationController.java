package br.pucrs.engswii.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.*;

@RestController
public class UserRegistrationController {

	//  @RequestMapping(method = RequestMethod.POST, value="/register/user")
	//
	//  @ResponseBody
	@PostMapping("/register/user")
	public UserRegistrationReply registerUser(@RequestBody User user) {
		System.out.println("In registerUser");
		UserRegistrationReply stdregreply = new UserRegistrationReply();           
		String reply = UserRegistration.getInstance().add(user);
		//We are setting the below value just to reply a message back to the caller
		stdregreply.setName(user.getName());
		stdregreply.setPassword(user.getPassword());
		stdregreply.setRegistrationStatus(reply);

		return stdregreply;
	}

}
