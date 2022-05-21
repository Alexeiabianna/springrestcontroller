package br.pucrs.engswii.controllers.discipline;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.discipline.Discipline;
import br.pucrs.engswii.beans.discipline.DisciplineRegistration;
import br.pucrs.engswii.beans.discipline.DisciplineRegistrationReply;

@RestController
public class DisciplinesRegistrationController {

    @PostMapping("register/disciplines")
    public DisciplineRegistrationReply registerDisciplines(@RequestBody Discipline discipline) {
        System.out.println("In Registration Discipline");
        DisciplineRegistration.getInstance().add(discipline);
        DisciplineRegistrationReply discRegReply = new DisciplineRegistrationReply();
        discRegReply.setCod_disciplina(discipline.getCod_disciplina());
        discRegReply.setHorario_disciplina(discipline.getHorario_disciplina());
        discRegReply.setNome_disciplina(discipline.getNome_disciplina());
        discRegReply.setRegistrationStatus("Sucessful");

        return discRegReply;
        
    }

        
}
