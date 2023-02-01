package com.gila.backendgila.model;


import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "userData")
public class UserData {

    @Id
    @Column(name = "USER_DATA_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;

//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            })
//    @JoinTable(name = "category_userdata",
//            joinColumns = { @JoinColumn(name = "userDataCat_id") },
//            inverseJoinColumns = { @JoinColumn(name = "category_id") })
//    @JsonIgnore
//    private Set<Categories> categories = new HashSet<>();
//
//
//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            })
//    @JoinTable(name = "notification_userdata",
//            joinColumns = { @JoinColumn(name = "userDataNot_id") },
//            inverseJoinColumns = { @JoinColumn(name = "notification_id") })
//    @JsonIgnore
//    private Set<Notification> notifications = new HashSet<>();


    @OneToMany(mappedBy = "userData")
    @JsonIgnore
    private Set<Submission> submission = new HashSet<Submission>();

    public UserData() {
    }

    public UserData(Long id, String name, String email, String phoneNumber, Set<Submission> submission) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.submission = submission;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Submission> getSubmission() {
        return submission;
    }

    public void setSubmission(Set<Submission> submission) {
        this.submission = submission;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", submission=" + submission +
                '}';
    }
}
