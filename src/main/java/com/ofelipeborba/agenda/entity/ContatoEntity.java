package com.ofelipeborba.agenda.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "contato")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContatoEntity implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String nome;
    @Column
    private String email;
    @Column(name = "telefone_fixo")
    private String telefoneFixo;
    @Column(name = "telefone_trabalho")
    private String telefoneTrabalho;
    @Column
    private String celular;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_grupo")
    private GrupoEntity grupoEntity;

}
