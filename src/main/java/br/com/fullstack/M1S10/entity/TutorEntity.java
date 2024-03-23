package br.com.fullstack.M1S10.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "tutores")
@Entity
@Data
public class TutorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String especialidade;
}
