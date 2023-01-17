package com.produtos.API.REST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.produtos.API.REST.models.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
  
}
