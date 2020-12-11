package com.cursoudemy.cursomc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursoudemy.cursomc.domain.Categoria;
import com.cursoudemy.cursomc.domain.Cidade;

/**
 * @author daniellefag
 *
 */
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}