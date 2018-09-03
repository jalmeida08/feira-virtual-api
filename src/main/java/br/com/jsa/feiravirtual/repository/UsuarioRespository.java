package br.com.jsa.feiravirtual.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.jsa.feiravirtual.model.Usuario;

@Repository
public interface UsuarioRespository extends MongoRepository<Usuario, String>{

	public Usuario findByEmailAndSenha(String email, String senha);
}
