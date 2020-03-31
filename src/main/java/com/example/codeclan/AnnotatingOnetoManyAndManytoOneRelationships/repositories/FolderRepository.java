package com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.repositories;

import com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
