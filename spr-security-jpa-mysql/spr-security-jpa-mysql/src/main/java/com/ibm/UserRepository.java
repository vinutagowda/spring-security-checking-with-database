package com.ibm;

import java.util.Optional;

import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//#3
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	Optional<User> findByUserName(String userName);
}
