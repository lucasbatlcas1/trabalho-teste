package com.gabriel1803.demojpa.service;

import com.gabriel1803.demojpa.domain.Avaliacao;
import com.gabriel1803.demojpa.repository.AvaliacaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoService {

    private final Logger log = LoggerFactory.getLogger(AvaliacaoService.class);

    private final AvaliacaoRepository avaliacaoRepository;

    public AvaliacaoService(AvaliacaoRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

    public List<Avaliacao> findAllList(){
        log.debug("Request to get All Avaliacao");
        return avaliacaoRepository.findAll();
    }

    public Optional<Avaliacao> findOne(Long id) {
        log.debug("Request to get Avaliacao : {}", id);
        return avaliacaoRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete Avaliacao : {}", id);
        avaliacaoRepository.deleteById(id);
    }

    public Avaliacao save(Avaliacao avaliacao) {
        log.debug("Request to save Avaliacao : {}", avaliacao);
        avaliacao = avaliacaoRepository.save(avaliacao);
        return avaliacao;
    }

    public List<Avaliacao> saveAll(List<Avaliacao> avaliacoes) {
        log.debug("Request to save Avaliacao : {}", avaliacoes);
        avaliacoes = avaliacaoRepository.saveAll(avaliacoes);
        return avaliacoes;
    }
}
