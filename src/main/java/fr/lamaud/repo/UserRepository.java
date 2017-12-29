package fr.lamaud.repo;

import org.springframework.data.repository.CrudRepository;

import fr.lamaud.pojo.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
