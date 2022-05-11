package br.pucrs.engswii.beans;

import java.util.ArrayList;
import java.util.List;

public class DisciplineRegistration {

    private List<Discipline> disciplineRecords;

    private static DisciplineRegistration discplineReg = null;

    private DisciplineRegistration() {
        disciplineRecords = new ArrayList<Discipline>();
    }

    public static DisciplineRegistration getInstance() {
        if(discplineReg == null) {
            discplineReg = new DisciplineRegistration();
            return discplineReg;
        }
        else {
            return discplineReg;
        }
    }

    public void add(Discipline discipline) {
        disciplineRecords.add(discipline);
    }   
    
}
