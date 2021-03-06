package br.pucrs.engswii.beans.user;

public class User {
    String name;
    String password;
    String registrationNumber;
    Boolean status;
    
	public User() {} // Construtor vazio

	public User(String name, String password, String registrationNumber, Boolean status) { // Construtor com parâmetros
		super();
		this.name = name;
		this.password = password;
		this.registrationNumber = registrationNumber;
        this.status = status;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
