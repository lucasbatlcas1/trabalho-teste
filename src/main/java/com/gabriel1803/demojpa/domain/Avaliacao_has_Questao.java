package com.gabriel1803.demojpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "table_avaliacao_has_questao")
public class Avaliacao_has_Questao {
    @Embedded
    private Correcao correcao;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int numeroQuestao;

    @Column(nullable = false)
    private String respostaAluno;
}
