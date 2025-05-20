package com.mealdash.mealdash.repository;

import com.mealdash.mealdash.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
