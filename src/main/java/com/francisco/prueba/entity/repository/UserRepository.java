package com.francisco.prueba.entity.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.francisco.prueba.entity.User;

// iterface no se puede definir artibuto
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // name debe ser === name de User
    Optional<User> findByMail(String mail);

    List<User> findByName(String name);
}
