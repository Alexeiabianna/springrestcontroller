package br.pucrs.engswii.controllers.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.user.User;
import br.pucrs.engswii.beans.user.UserRegistration;

@RestController
public class UserRetrieveController {

	//	@RequestMapping(method = RequestMethod.GET, value="/user/alluser")
	//
	//	@ResponseBody
	@GetMapping("/user/alluser")
	public List<User> getAllUsers() {
		return UserRegistration.getInstance().getUserRecords();
	}

}