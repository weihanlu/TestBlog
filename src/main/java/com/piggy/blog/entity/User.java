package com.piggy.blog.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * User实体类
 *
 * @author 韦函露
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(unique = true)
    private String username;

    @Column
    private String password;

    public User(){}

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    /**
     * blog作者外键
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "username")
    private String getUsername(){
        return username;
    }
}
