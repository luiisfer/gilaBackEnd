package com.gila.backendgila.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "submission")
public class Submission {

    @Id
    @Column(name = "submissionId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long submissionID;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_DATA_ID")
    private UserData userData;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CATEGORY_ID")
    private Categories categories;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NOTIFICACION_ID")
    private Notification notification;

    @Column(name = "message")
    private String message;

    @Column(name = "publishedDate")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishedDate;

    public Submission() {
    }

    public Submission(long submissionID, UserData userData, Categories categories, Notification notification, String message, Date publishedDate) {
        this.submissionID = submissionID;
        this.userData = userData;
        this.categories = categories;
        this.notification = notification;
        this.message = message;
        this.publishedDate = publishedDate;
    }

    public long getSubmissionID() {
        return submissionID;
    }

    public void setSubmissionID(long submissionID) {
        this.submissionID = submissionID;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Submission{" +
                "submissionID=" + submissionID +
                ", userData=" + userData +
                ", categories=" + categories +
                ", notification=" + notification +
                ", message='" + message + '\'' +
                ", publishedDate=" + publishedDate +
                '}';
    }
}
