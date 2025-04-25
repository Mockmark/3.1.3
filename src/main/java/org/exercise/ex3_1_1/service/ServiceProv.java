package org.exercise.ex3_1_1.service;

import org.exercise.ex3_1_1.model.User;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ServiceProv {
    void addUser(User user);

    List<User> index();

    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(long id);

    boolean existsByUsername(@Param("username") String username);

    Optional<User> findByUsername(String username);

    void roleRehydrate(User user);

    void ensurePassword(User user);

    void ensurePasswordExtra(User user);
}
