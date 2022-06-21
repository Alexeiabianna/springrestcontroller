package br.pucrs.engswii.beans.subscritpion;

import br.pucrs.engswii.beans.discipline.Discipline;
import br.pucrs.engswii.beans.user.User;

public class Subscription {

  private User user;
  private Discipline discipline;
  private String dicipline_time;

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

  public String getDicipline_time() {
    return dicipline_time;
  }

  public void setDicipline_time(String dicipline_time) {
    this.dicipline_time = dicipline_time;
  }

}
