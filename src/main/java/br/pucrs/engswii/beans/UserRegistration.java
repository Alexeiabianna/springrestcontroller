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

    public void add(User user) {
		userRecords.add(user);
	}

    public List<User> getUserRecords() {
        return userRecords;
    }

    public Boolean login(User user) {
        //implementar
        return false;
    }

}
