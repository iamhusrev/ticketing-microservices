package com.iamhusrev.repository;

import com.iamhusrev.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String username);

    @Transactional
    void deleteByUserName(String username);

    List<User> findAllByRoleDescriptionIgnoreCase(String description);
}
