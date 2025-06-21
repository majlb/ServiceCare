package com.maj.servicecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maj.servicecare.entity.Person;

@Repository 
public interface UserRepository extends JpaRepository<Person, Long> {
}
