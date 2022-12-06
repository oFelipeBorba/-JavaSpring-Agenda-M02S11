package com.ofelipeborba.agenda.repository;

import com.ofelipeborba.agenda.entity.GrupoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository<GrupoEntity,Long> {
}
