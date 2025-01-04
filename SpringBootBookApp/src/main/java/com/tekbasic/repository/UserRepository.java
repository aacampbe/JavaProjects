package com.tekbasic.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tekbasic.Username.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}