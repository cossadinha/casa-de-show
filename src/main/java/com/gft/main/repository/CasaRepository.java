package com.gft.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.main.entidade.Casa;

@Repository
public interface CasaRepository extends JpaRepository<Casa, Long>{
	
}
