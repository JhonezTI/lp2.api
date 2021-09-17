package br.edu.ifce.lp2.ecommercerbook.model.repository;

import br.edu.ifce.lp2.ecommercerbook.model.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
