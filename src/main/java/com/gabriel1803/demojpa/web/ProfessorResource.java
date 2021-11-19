package com.gabriel1803.demojpa.web;

import com.gabriel1803.demojpa.domain.Professor;
import com.gabriel1803.demojpa.repository.ProfessorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professores")
public class ProfessorResource {
    private final Logger log = LoggerFactory.getLogger(ProfessorResource.class);

    private final ProfessorRepository profesorRepository;

    public ProfessorResource(ProfessorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @GetMapping(path = "/criar/{name}")
    public String helloApp(@PathVariable String name) {
        Professor p = new Professor();
        p.setNome(name);
        profesorRepository.save(p);
        return "criou";
    }

    @GetMapping(path = "/listar/{id}")
    public Professor helloApp(@PathVariable Long id) {
        return profesorRepository.findById(id).get();
    }
}
