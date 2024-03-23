package br.com.fullstack.M1S10.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Table(name = "agendas")
@Entity
@Data
public class AgendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private AlunoEntity aluno;

    @ManyToOne
    @JoinColumn(name = "tutor_id", nullable = false)
    private TutorEntity tutor;

    @Column(nullable = false)
    private LocalDateTime data;

    @Column(nullable = false, length = 10)
    private String status;

    @Column(nullable = false, length = 150)
    private String tema;

    private String descricaoBreve;
}
