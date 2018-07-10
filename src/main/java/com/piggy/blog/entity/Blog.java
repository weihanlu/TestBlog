package com.piggy.blog.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Blog实体类
 * @author 韦函露
 */
@Data
@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue
    @Column(unique = true, name = "blog_id")
    private Integer blogId;

    @Column
    private String title;

    @Column(name = "abstract")
    private String abs;

    @Column
    private String content;

    @Column(name = "create_time")
    private Date createTime;

    @Column
    private String username;
}
