package br.com.fullstack.M1S10.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "alunos")
@Entity
@Data
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
}
