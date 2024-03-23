package br.com.fullstack.M1S10.repository;

import br.com.fullstack.M1S10.entity.AgendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

public interface AgendaRepository extends JpaRepository<AgendaEntity, Long> {

    List<AgendaEntity> findByAlunoIdOrderByData(Long alunoId);

    List<AgendaEntity> findByAlunoIdAndDataGreaterThanOrderByData(Long alunoId, LocalDateTime data);

    List<AgendaEntity> findByTutorIdOrderByData(Long tutorId);

    List<AgendaEntity> findByTutorIdAndDataGreaterThanOrderByData(Long tutorId, LocalDateTime data);

}
