package br.com.glauber.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.glauber.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

	List<UsuarioEntity> findAll();
	
}
