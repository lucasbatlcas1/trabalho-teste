package com.gabriel1803.demojpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.concurrent.TimeUnit;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "table_avaliacao")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 64)
    private String nome;

    private String subtitulo;
    private String assunto;
    private String nomeProfessor;
    private String questoes;
    private float valor;
    private TimeUnit  tempo;
    private String instrucoes;
    private int numeroTentativas;
}
