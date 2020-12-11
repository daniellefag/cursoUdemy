package com.cursoudemy.cursomc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursoudemy.cursomc.domain.Categoria;

/**
 * @author daniellefag
 *
 */
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
