package dev.guviega.usercrud.model.repository;

import dev.guviega.usercrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByOrderByNameAsc();

}
