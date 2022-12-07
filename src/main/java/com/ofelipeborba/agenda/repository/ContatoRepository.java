package com.ofelipeborba.agenda.repository;

import com.ofelipeborba.agenda.entity.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoEntity,Long> {

    @Query("from ContatoEntity c where upper(c.nome) like %?1%")
    List<ContatoEntity> getContatosByName(String nome);
}
