package com.gila.backendgila.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Categories {

    @Id
    @Column(name = "CATEGORY_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categories;
    private String description;


//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            },
//            mappedBy = "categories")
//    @JsonIgnore
//    private Set<UserData> userData = new HashSet<>();

    @OneToMany(mappedBy = "categories")
    @JsonIgnore
    private Set<Submission> submission = new HashSet<Submission>();


    public Categories(Long id_categories, String description, Set<Submission> submission) {
        this.id_categories = id_categories;
        this.description = description;
        this.submission = submission;
    }

    public Categories() {

    }

    public Long getId_categories() {
        return id_categories;
    }

    public void setId_categories(Long id_categories) {
        this.id_categories = id_categories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Submission> getSubmission() {
        return submission;
    }

    public void setSubmission(Set<Submission> submission) {
        this.submission = submission;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id_categories=" + id_categories +
                ", description='" + description + '\'' +
                ", submission=" + submission +
                '}';
    }
}
