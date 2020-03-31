package com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="files")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @Column(name = "name")
    protected String name;

    @Column(name = "folders")
    protected List folders;

    public User(String name, List folders) {
        this.name = name;
        this.folders = folders;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getFolders() {
        return folders;
    }

    public void setFolders(List folders) {
        this.folders = folders;
    }
}
