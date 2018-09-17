package br.com.jsa.feiravirtual.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.jsa.feiravirtual.model.Permissao;

@Repository
public interface PermissaoRepository extends MongoRepository<Permissao, String> {

}
