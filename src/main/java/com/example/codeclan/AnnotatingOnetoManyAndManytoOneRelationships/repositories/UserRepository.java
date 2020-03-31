package com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.repositories;

import com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
