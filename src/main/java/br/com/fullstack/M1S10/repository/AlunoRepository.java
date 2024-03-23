package br.com.fullstack.M1S10.repository;

import br.com.fullstack.M1S10.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
}
