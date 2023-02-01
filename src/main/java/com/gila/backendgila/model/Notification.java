package com.gila.backendgila.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "notification")
public class Notification {

    @Id
    @Column(name = "NOTIFICACION_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_notification;
    private String description;


//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            },
//            mappedBy = "notifications")
//    @JsonIgnore
//    private Set<UserData> userData = new HashSet<>();

    @OneToMany(mappedBy = "notification")
    @JsonIgnore
    private Set<Submission> submission = new HashSet<Submission>();


    public Notification(Long id_notification, String description, Set<Submission> submission) {
        this.id_notification = id_notification;
        this.description = description;
        this.submission = submission;
    }

    public Notification() {
    }


    public Long getId_notification() {
        return id_notification;
    }

    public void setId_notification(Long id_notification) {
        this.id_notification = id_notification;
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
        return "Notification{" +
                "id_notification=" + id_notification +
                ", description='" + description + '\'' +
                ", submission=" + submission +
                '}';
    }
}
