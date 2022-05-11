package br.pucrs.engswii.beans.discipline;

public class DisciplineRegistrationReply {
    String cod_disciplina;
    String nome_disciplina;
    String horario_disciplina;
    String registrationStatus;
    
    public String getRegistrationStatus() {
        return registrationStatus;
    }
    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
    public String getCod_disciplina() {
        return cod_disciplina;
    }
    public void setCod_disciplina(String cod_disciplina) {
        this.cod_disciplina = cod_disciplina;
    }
    public String getNome_disciplina() {
        return nome_disciplina;
    }
    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }
    public String getHorario_disciplina() {
        return horario_disciplina;
    }
    public void setHorario_disciplina(String horario_disciplina) {
        this.horario_disciplina = horario_disciplina;
    }    
}
