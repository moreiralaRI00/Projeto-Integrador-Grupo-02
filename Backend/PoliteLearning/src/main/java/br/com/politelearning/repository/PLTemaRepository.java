package br.com.politelearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.politelearning.model.PLTemaModel;
import br.com.politelearning.model.PLUsuarioModel;

public interface PLTemaRepository extends JpaRepository<PLUsuarioModel, Long> {
	
	public List<PLUsuarioModel> findAllByNome_CompletoContainingIgnoreCase(String nome_completo);

}