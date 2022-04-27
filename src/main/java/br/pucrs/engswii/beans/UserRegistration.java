package br.pucrs.engswii.beans;

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

  public Boolean add(User user) {
		for (User user_list : userRecords) {
			if(user_list.getName() == user.getName()) {
				return false;
			}
		}
		return true;
	}

  public List<User> getUserRecords() {
      return userRecords;
  }

  public Boolean login(User user) {
      for (User user_list : userRecords) {
				if(user_list.getName() == user.getName() && user_list.getPassword() == user.getPassword()) {
					return true;
				}
			}
    return false;
  }

	public Boolean logout(User user) {
		for (User user_list : userRecords) {
			if(user_list.getName().equals(user.getName())){
				user_list.setStatus();
				return true;
			}			
		}
		return true;
	}



}
