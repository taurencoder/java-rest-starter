package com.os.model.repository;

import com.os.model.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dqin on 02/03/2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findOneByUsername(String username);
}
