package com.gft.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.main.entidade.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {

	Usuario findByNome(String nome);
	
}
