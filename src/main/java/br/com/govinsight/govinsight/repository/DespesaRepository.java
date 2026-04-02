package br.com.govinsight.govinsight.repository;

import br.com.govinsight.govinsight.entity.DespesaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<DespesaEntity, Long> {
}