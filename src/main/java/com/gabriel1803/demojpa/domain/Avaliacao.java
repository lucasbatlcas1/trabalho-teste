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

    @Column(name = "titulo", length = 64, nullable = false)
    private String titulo;

    private String subtitulo;

    @Column(nullable = false)
    private String nomeProfessor;

    @Column(nullable = false)
    private double valorTotal;

    @Column(nullable = false)
    private TimeUnit  tempo;

    @Column(nullable = false)
    private String instrucoes;

    @Column(nullable = false)
    private int numeroTentativas;
}
