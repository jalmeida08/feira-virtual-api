package br.com.jsa.feiravirtual.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.jsa.feiravirtual.model.Permissao;

public interface PermissaoRepository extends MongoRepository<Permissao, String> {

}
