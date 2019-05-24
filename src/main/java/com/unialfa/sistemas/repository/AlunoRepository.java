package com.unialfa.sistemas.repository;

import com.unialfa.sistemas.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel , Long> {
    AlunoModel findById(long id);
}
