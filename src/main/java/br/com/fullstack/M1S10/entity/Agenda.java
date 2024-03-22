package br.com.fullstack.M1S10.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "agenda")
@Entity
@Data
@NoArgsConstructor
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agendaId;

    @JoinColumn(name = "alunoId")
    private Long alunoId;

    @JoinColumn(name = "tutorId")
    private Long tutorId;

    private Date data;
    private String status;
    private String tema;
    private String descricaoBreve;
}
