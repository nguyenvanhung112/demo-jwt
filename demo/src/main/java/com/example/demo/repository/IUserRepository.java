package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUserRepository extends JpaRepository<User, Integer> {

    @Query(
            value = " select * from user where email = :email ", nativeQuery = true
    )
    User getUserByEmail(@Param("email") String email);

    boolean existsByEmail(String email);

}
