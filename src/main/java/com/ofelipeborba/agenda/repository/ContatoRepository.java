package com.ofelipeborba.agenda.repository;

import com.ofelipeborba.agenda.entity.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoEntity,Long> {
}
