package com.gabriel1803.demojpa.web;

import com.gabriel1803.demojpa.domain.Avaliacao;
import com.gabriel1803.demojpa.repository.AvaliacaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoResource {
    private final Logger log = LoggerFactory.getLogger(AvaliacaoResource.class);

    private final AvaliacaoRepository AvaliacaoRepository;

    public AvaliacaoResource(AvaliacaoRepository AvaliacaoRepository) {
        this.AvaliacaoRepository = AvaliacaoRepository;
    }

    @GetMapping(path = "/criar/{name}")
    public String helloApp(@PathVariable String name) {
        Avaliacao p = new Avaliacao();
        p.setNome(name);
        AvaliacaoRepository.save(p);
        return "criou";
    }

    @GetMapping(path = "/listar/{id}")
    public Avaliacao helloApp(@PathVariable Long id) {
        return AvaliacaoRepository.findById(id).get();
    }
}
