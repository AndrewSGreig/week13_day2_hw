package com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "name")
    protected String name;
    @Column(name="extension")
    protected String extension;
    @Column(name="Size")
    protected int size;

//    @Column(name="folder")
//    private Folder folder;
    @JsonIgnoreProperties(value = "folders")
    @OneToMany(mappedBy = "file")
    private List<Folder> folders;


    public File(String name, String extension, int size){//}, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folders = new ArrayList<>();;
    }

    public File(){

    }

    public List<Folder> getFolder() {
        return folders;
    }

    public void setFolder(List<Folder> folder) {
        this.folders = folder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
