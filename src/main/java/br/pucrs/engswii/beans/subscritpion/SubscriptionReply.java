package br.pucrs.engswii.beans.subscritpion;

import br.pucrs.engswii.beans.discipline.Discipline;
import br.pucrs.engswii.beans.user.User;

public class SubscriptionReply {

  private User user;
  private Discipline discipline;
  private String registrationStatus;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Discipline getDiscipline() {
    return discipline;
  }

  public void setDiscipline(Discipline discipline) {
    this.discipline = discipline;
  }

  public String getRegistrationStatus() {
    return registrationStatus;
  }

  public void setRegistrationStatus(String registrationStatus) {
    this.registrationStatus = registrationStatus;
  }
  
}
