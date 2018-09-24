package br.com.jsa.feiravirtual.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.jsa.feiravirtual.model.Categoria;

@Repository
public interface CategoriaRepository extends MongoRepository<Categoria, String>  {

}
