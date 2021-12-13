package com.gabriel1803.demojpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "table_questao")
public class Questao {

    @OneToMany
    @JoinColumn(name="id_Questao")
    private List<Avaliacao_has_Questao> avaliacoesEmQueAparece;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( nullable = false)
    private String conteudo;

    @Column( nullable = false)
    private String sentidoIdentificacao;

    @Column(nullable = false)
    private String tipo;

}
