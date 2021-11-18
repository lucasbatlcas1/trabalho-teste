package com.alessiojr.demojpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Avaliacao")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String instrucoes;
    @Column(name = "nome", length = 64)
    private String nome;
    @Column(name = "nomeProfessor", length = 64)
    private String nomeP;
    private Instant dataNascimento;
    private int questoes;
    private float valor;
    private int n_tentativas;
    private float tempodeduracao;
    private Boolean isActive;

    public static Pessoa parseNote(String line) {
        String[] text = line.split(",");
        Pessoa note = new Pessoa();
        note.setId(Long.parseLong(text[0]));
        note.setNome(text[1]);
        return note;
    }
}
