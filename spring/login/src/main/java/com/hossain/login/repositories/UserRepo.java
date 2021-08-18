package com.hossain.login.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossain.login.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long>{

	//option to return null or a user object this will the DB for an existing email
	Optional<User> findByEmail(String email);
}
