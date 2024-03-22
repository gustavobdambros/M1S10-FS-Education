package br.com.fullstack.M1S10.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "material")
@Data
@Entity
@NoArgsConstructor
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long materialId;

    @JoinColumn(name = "agenda_id")
    private Long agendaId;

    private String descricao;
    private String caminhoArquivo;
}
