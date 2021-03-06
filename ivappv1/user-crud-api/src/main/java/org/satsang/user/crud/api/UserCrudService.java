package org.satsang.user.crud.api;

import org.satsang.user.entity.User;
import org.satsang.user.entity.User;

import java.util.Optional;

/**
 * User security operations like login and logout, and CRUD operations on {@link User}.
 * 
 * @author jerome
 *
 */
public interface UserCrudService {

  User save(User user);

  Optional<User> find(String id);

  Optional<User> findByUsername(String username);
}
