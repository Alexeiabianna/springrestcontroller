package br.pucrs.engswii.beans.user;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration {

  private List<User> userRecords;

  private static UserRegistration usrRegd = null;

	private UserRegistration(){
		userRecords = new ArrayList<User>();        
	}

	public static UserRegistration getInstance() {

		if(usrRegd == null) {
			usrRegd = new UserRegistration();
			return usrRegd;
		}
		else {
			return usrRegd;
		}
	}

  public String add(User user) {
		for (User user_list : userRecords) {
			if(user_list.getName().equals(user.getName())) {
				return "Registration un-successful";
			}
		}
		user.setStatus(false);
		userRecords.add(user);
		return "Registration successful";
	}

  public List<User> getUserRecords() {
      return userRecords;
  }

  public String login(User user) {
      for (User user_list : userRecords) {
			if(user_list.getName().equals(user.getName()) && user_list.getPassword().equals(user.getPassword())) {
				user_list.setStatus(true);
				return "Login successful";
			}
		}
		return "Login un-successful";
	}

	public String logout(User user) {
		for (User user_list : userRecords) {
			if(user_list.getName().equals(user.getName())){
				user_list.setStatus(false);
				return "Logout successful";
				}
		}
		return "Logout un-successful";
	}
	
	public String isLogged() {
		for (User user_list : userRecords) {
			if(user_list.getStatus()){
				return "Validation successful";
			}
		}
		return "Validation un-successful";
	}
}
