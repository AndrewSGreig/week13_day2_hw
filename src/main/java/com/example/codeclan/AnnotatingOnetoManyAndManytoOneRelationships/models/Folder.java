package com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="folders")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @Column(name = "title")
    protected String title;

    @JsonIgnoreProperties(value = "folders")
    @ManyToOne
    @JoinColumn(name = "file_id", nullable = false)
    protected File file;

    /*
    @JsonIgnoreProperties(value = "pirates")
    @ManyToOne
    @JoinColumn(name = "ship_id", nullable = false)
    private Ship ship;
     */

    @Column(name="user")
    protected User user;

    public Folder(String title, File file, User user) {
        this.title = title;
        this.file = file;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
