package br.pucrs.engswii.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.Discipline;
import br.pucrs.engswii.beans.DisciplineRegistrationReply;

@RestController("register")
public class DisciplinesRegistrationController {

    @PostMapping("/disciplines")
    public DisciplineRegistrationReply registerDisciplines(@RequestBody Discipline discipline) {
        System.out.println("In Registrater Discipline");
        DisciplineRegistrationReply discRegReply = new DisciplineRegistrationReply();

        //DisciplineRegistration
        
    }

        
}
