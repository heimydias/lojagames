package com.generation.lojagames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	List<Produto>findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
	List<Produto> findByPrecoGreaterThan(@Param("preco")BigDecimal preco);
	
	List<Produto> findByPrecoLessThanEqual(@Param("preco")BigDecimal preco);

}
