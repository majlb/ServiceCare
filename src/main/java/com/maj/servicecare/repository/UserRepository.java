package com.maj.servicecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maj.servicecare.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
