package com.unialfa.sistemas.repository;

import com.unialfa.sistemas.models.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<CursoModel, Long> {
        CursoModel findById(long id);

}
