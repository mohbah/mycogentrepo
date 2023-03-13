package com.Entity;


import javax.persistence.*;


@Entity
@Table(name= "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Column(unique=true)
    private String username;
    private String password;
    private String email;
    private Boolean usertype;

    public Account() {
    }

    public Account(Integer id, String name, String username, String password, String email, Boolean userType) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.usertype = userType;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getUserType() {
        return usertype;
    }

    public void setUserType(Boolean userType) {
        this.usertype = userType;
    }
}


